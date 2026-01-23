package com.robinhood.android.optionschain.sbschain.contracttype;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePicker;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionContractType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionSideBySideChainContractTypePicker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a3\u0010\b\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainContractTypePicker", "", "callPutSwitcherState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "onContractTypeClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/db/OptionContractType;", "(Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OptionContractTypeCard", "optionContractType", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/db/OptionContractType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "invisibleWeight", "", "visibleWeight", "feature-options-chain_externalDebug", "callWeight", "putWeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainContractTypePicker {
    private static final float invisibleWeight = 0.001f;
    private static final float visibleWeight = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionContractTypeCard$lambda$4(Function1 function1, OptionContractType optionContractType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionContractTypeCard(function1, optionContractType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainContractTypePicker$lambda$3(OptionSideBySideChainDataState2 optionSideBySideChainDataState2, Function1 function1, int i, Composer composer, int i2) {
        OptionSideBySideChainContractTypePicker(optionSideBySideChainDataState2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionSideBySideChainContractTypePicker(final OptionSideBySideChainDataState2 callPutSwitcherState, Function1<? super OptionContractType, Unit> function1, Composer composer, final int i) {
        int i2;
        boolean z;
        float f;
        int i3;
        Row6 row6;
        final Function1<? super OptionContractType, Unit> onContractTypeClicked = function1;
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(onContractTypeClicked, "onContractTypeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(483780482);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(callPutSwitcherState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContractTypeClicked) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483780482, i2, -1, "com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePicker (OptionSideBySideChainContractTypePicker.kt:34)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM());
            Arrangement arrangement = Arrangement.INSTANCE;
            float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(fM21590getDefaultD9Ej5fM, companion2.getCenterHorizontally()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            if (callPutSwitcherState.isCallSideVisible()) {
                z = 48;
                f = 1.0f;
            } else {
                z = 48;
                f = 0.001f;
            }
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, null, 0.0f, "call switcher weight", null, composerStartRestartGroup, 3072, 22);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(callPutSwitcherState.isPutSideVisible() ? 1.0f : 0.001f, null, 0.0f, "put switcher weight", null, composerStartRestartGroup, 3072, 22);
            composerStartRestartGroup.startReplaceGroup(902531922);
            if (OptionSideBySideChainContractTypePicker$lambda$2$lambda$0(snapshotState4AnimateFloatAsState) > invisibleWeight) {
                row6 = row62;
                i3 = i2;
                OptionContractTypeCard(onContractTypeClicked, OptionContractType.CALL, Row5.weight$default(row6, companion, OptionSideBySideChainContractTypePicker$lambda$2$lambda$0(snapshotState4AnimateFloatAsState), false, 2, null), composerStartRestartGroup, ((i2 >> 3) & 14) | 48, 0);
            } else {
                i3 = i2;
                row6 = row62;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(902541039);
            if (OptionSideBySideChainContractTypePicker$lambda$2$lambda$1(snapshotState4AnimateFloatAsState2) > invisibleWeight) {
                onContractTypeClicked = function1;
                OptionContractTypeCard(onContractTypeClicked, OptionContractType.PUT, Row5.weight$default(row6, companion, OptionSideBySideChainContractTypePicker$lambda$2$lambda$1(snapshotState4AnimateFloatAsState2), false, 2, null), composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 0);
            } else {
                onContractTypeClicked = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainContractTypePicker.OptionSideBySideChainContractTypePicker$lambda$3(callPutSwitcherState, onContractTypeClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OptionContractTypeCard(final Function1<? super OptionContractType, Unit> function1, OptionContractType optionContractType, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final OptionContractType optionContractType2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(166089831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(optionContractType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(166089831, i3, -1, "com.robinhood.android.optionschain.sbschain.contracttype.OptionContractTypeCard (OptionSideBySideChainContractTypePicker.kt:72)");
                }
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                int i6 = i3;
                CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
                optionContractType2 = optionContractType;
                modifier2 = modifier3;
                CardKt.Card(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), cardColorsM5729cardColorsro_MJ88, null, null, ComposableLambda3.rememberComposableLambda(-138480331, true, new C244691(function1, optionContractType2), composer2, 54), composer2, ((i6 >> 6) & 14) | 196608, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                optionContractType2 = optionContractType;
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionSideBySideChainContractTypePicker.OptionContractTypeCard$lambda$4(function1, optionContractType2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            int i62 = i3;
            CardColors cardColorsM5729cardColorsro_MJ882 = cardDefaults2.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
            optionContractType2 = optionContractType;
            modifier2 = modifier3;
            CardKt.Card(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM()), cardColorsM5729cardColorsro_MJ882, null, null, ComposableLambda3.rememberComposableLambda(-138480331, true, new C244691(function1, optionContractType2), composer2, 54), composer2, ((i62 >> 6) & 14) | 196608, 24);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: OptionSideBySideChainContractTypePicker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt$OptionContractTypeCard$1 */
    static final class C244691 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<OptionContractType, Unit> $onContractTypeClicked;
        final /* synthetic */ OptionContractType $optionContractType;

        /* compiled from: OptionSideBySideChainContractTypePicker.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt$OptionContractTypeCard$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionContractType.values().length];
                try {
                    iArr[OptionContractType.CALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionContractType.PUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C244691(Function1<? super OptionContractType, Unit> function1, OptionContractType optionContractType) {
            this.$onContractTypeClicked = function1;
            this.$optionContractType = optionContractType;
        }

        public final void invoke(Column5 Card, Composer composer, int i) {
            String strStringResource;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-138480331, i, -1, "com.robinhood.android.optionschain.sbschain.contracttype.OptionContractTypeCard.<anonymous> (OptionSideBySideChainContractTypePicker.kt:80)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(64396550);
            float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
            composer.endReplaceGroup();
            IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, fMo5013toDpu2uoSUM, 0L, 5, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onContractTypeClicked) | composer.changed(this.$optionContractType.ordinal());
            final Function1<OptionContractType, Unit> function1 = this.$onContractTypeClicked;
            final OptionContractType optionContractType = this.$optionContractType;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePickerKt$OptionContractTypeCard$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainContractTypePicker.C244691.invoke$lambda$3$lambda$2(function1, optionContractType);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4891clickableO2vRcR0$default, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
            Alignment center = Alignment.INSTANCE.getCenter();
            OptionContractType optionContractType2 = this.$optionContractType;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[optionContractType2.ordinal()];
            if (i3 == 1) {
                composer.startReplaceGroup(-1210562485);
                strStringResource = StringResources_androidKt.stringResource(C11048R.string.option_contract_type_calls, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composer.startReplaceGroup(-1210564686);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1210559062);
                strStringResource = StringResources_androidKt.stringResource(C11048R.string.option_contract_type_puts, composer, 0);
                composer.endReplaceGroup();
            }
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 805306368, 0, 7610);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, OptionContractType optionContractType) {
            function1.invoke(optionContractType);
            return Unit.INSTANCE;
        }
    }

    private static final float OptionSideBySideChainContractTypePicker$lambda$2$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float OptionSideBySideChainContractTypePicker$lambda$2$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}

package com.robinhood.shared.crypto.movers;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.CornerSize2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: InstrumentPreviewCard.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\"\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018*\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m3636d2 = {"InstrumentPreviewCard", "", "state", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DefaultInstrumentPreviewCard", "(Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompactInstrumentPreviewCard", "InstrumentPreviewCardSemanticKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getInstrumentPreviewCardSemanticKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "instrumentPreviewCard", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getInstrumentPreviewCard$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getInstrumentPreviewCard", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "setInstrumentPreviewCard", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;)V", "InstrumentPreviewCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-movers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InstrumentPreviewCard3 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(InstrumentPreviewCard3.class, "instrumentPreviewCard", "getInstrumentPreviewCard(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", 1))};
    private static final SemanticsPropertyKey<InstrumentPreviewCard4> InstrumentPreviewCardSemanticKey = new SemanticsPropertyKey<>("cardKey", null, 2, null);

    /* compiled from: InstrumentPreviewCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompactInstrumentPreviewCard$lambda$10(InstrumentPreviewCard4 instrumentPreviewCard4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompactInstrumentPreviewCard(instrumentPreviewCard4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultInstrumentPreviewCard$lambda$7(InstrumentPreviewCard4 instrumentPreviewCard4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DefaultInstrumentPreviewCard(instrumentPreviewCard4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentPreviewCard$lambda$4(InstrumentPreviewCard4 instrumentPreviewCard4, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        InstrumentPreviewCard(instrumentPreviewCard4, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentPreviewCardPreview$lambda$11(int i, Composer composer, int i2) {
        InstrumentPreviewCardPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentPreviewCard(final InstrumentPreviewCard4 state, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        Object[] objArr;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2099539552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    function03 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2099539552, i3, -1, "com.robinhood.shared.crypto.movers.InstrumentPreviewCard (InstrumentPreviewCard.kt:48)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    RoundedCornerShape RoundedCornerShape = RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()));
                    Modifier modifierClip = Clip.clip(modifier4, RoundedCornerShape);
                    boolean z3 = false;
                    if (function03 != null || (state instanceof InstrumentPreviewCard4.Loading)) {
                        z = false;
                    } else {
                        z = false;
                        z3 = true;
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z2 = (i3 & 896) != 256 ? true : z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstrumentPreviewCard3.InstrumentPreviewCard$lambda$1$lambda$0(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z4 = z;
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, z3, null, null, (Function0) objRememberedValue, 6, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objArr = (i3 & 14) != 4 ? true : z4 ? 1 : 0;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objArr == false || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentPreviewCard3.InstrumentPreviewCard$lambda$3$lambda$2(state, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default, z4, (Function1) objRememberedValue2, 1, null);
                    Modifier modifier5 = modifier4;
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    ApiCryptoTradingOptions3 style = state.getStyle();
                    composerStartRestartGroup.startReplaceGroup(977140539);
                    long jM6725getTransparent0d7_KjU = style != ApiCryptoTradingOptions3.COMPACT_CARD ? Color.INSTANCE.m6725getTransparent0d7_KjU() : bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = CardDefaults.$stable;
                    Function0<Unit> function05 = function03;
                    composer2 = composerStartRestartGroup;
                    CardKt.Card(modifierSemantics$default, RoundedCornerShape, cardDefaults.m5729cardColorsro_MJ88(jM6725getTransparent0d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i7 << 12, 14), cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(z4 ? 1.0f : 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i7 << 18) | 6, 62), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i6).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1051125522, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt.InstrumentPreviewCard.3

                        /* compiled from: InstrumentPreviewCard.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$InstrumentPreviewCard$3$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ApiCryptoTradingOptions3.values().length];
                                try {
                                    iArr[ApiCryptoTradingOptions3.COMPACT_CARD.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer3, int i8) {
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1051125522, i8, -1, "com.robinhood.shared.crypto.movers.InstrumentPreviewCard.<anonymous> (InstrumentPreviewCard.kt:68)");
                            }
                            ApiCryptoTradingOptions3 style2 = state.getStyle();
                            if ((style2 != null ? WhenMappings.$EnumSwitchMapping$0[style2.ordinal()] : -1) == 1) {
                                composer3.startReplaceGroup(814314813);
                                InstrumentPreviewCard3.CompactInstrumentPreviewCard(state, null, composer3, 0, 2);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(814316861);
                                InstrumentPreviewCard3.DefaultInstrumentPreviewCard(state, null, composer3, 0, 2);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function04 = function05;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentPreviewCard3.InstrumentPreviewCard$lambda$4(state, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                RoundedCornerShape RoundedCornerShape2 = RoundedCornerShape2.RoundedCornerShape(CornerSize2.m5326CornerSize0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()));
                Modifier modifierClip2 = Clip.clip(modifier4, RoundedCornerShape2);
                boolean z32 = false;
                if (function03 != null) {
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 896) != 256) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstrumentPreviewCard3.InstrumentPreviewCard$lambda$1$lambda$0(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        boolean z42 = z;
                        Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, z32, null, null, (Function0) objRememberedValue, 6, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 14) != 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objArr == false) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentPreviewCard3.InstrumentPreviewCard$lambda$3$lambda$2(state, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default2, z42, (Function1) objRememberedValue2, 1, null);
                            Modifier modifier52 = modifier4;
                            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                            ApiCryptoTradingOptions3 style2 = state.getStyle();
                            composerStartRestartGroup.startReplaceGroup(977140539);
                            if (style2 != ApiCryptoTradingOptions3.COMPACT_CARD) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i72 = CardDefaults.$stable;
                            Function0<Unit> function052 = function03;
                            composer2 = composerStartRestartGroup;
                            CardKt.Card(modifierSemantics$default2, RoundedCornerShape2, cardDefaults2.m5729cardColorsro_MJ88(jM6725getTransparent0d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i72 << 12, 14), cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(z42 ? 1.0f : 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i72 << 18) | 6, 62), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer2, i62).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1051125522, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt.InstrumentPreviewCard.3

                                /* compiled from: InstrumentPreviewCard.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$InstrumentPreviewCard$3$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[ApiCryptoTradingOptions3.values().length];
                                        try {
                                            iArr[ApiCryptoTradingOptions3.COMPACT_CARD.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 Card, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1051125522, i8, -1, "com.robinhood.shared.crypto.movers.InstrumentPreviewCard.<anonymous> (InstrumentPreviewCard.kt:68)");
                                    }
                                    ApiCryptoTradingOptions3 style22 = state.getStyle();
                                    if ((style22 != null ? WhenMappings.$EnumSwitchMapping$0[style22.ordinal()] : -1) == 1) {
                                        composer3.startReplaceGroup(814314813);
                                        InstrumentPreviewCard3.CompactInstrumentPreviewCard(state, null, composer3, 0, 2);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(814316861);
                                        InstrumentPreviewCard3.DefaultInstrumentPreviewCard(state, null, composer3, 0, 2);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 196608, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            function04 = function052;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentPreviewCard$lambda$1$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentPreviewCard$lambda$3$lambda$2(InstrumentPreviewCard4 instrumentPreviewCard4, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        setInstrumentPreviewCard(semantics, instrumentPreviewCard4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultInstrumentPreviewCard(InstrumentPreviewCard4 instrumentPreviewCard4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        InstrumentPreviewCard4.Loaded loaded;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        long jM21427getFg30d7_KjU;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        long jM21456getPositive0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final InstrumentPreviewCard4 instrumentPreviewCard42 = instrumentPreviewCard4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2064941521);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(instrumentPreviewCard42) ? 4 : 2);
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
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2064941521, i3, -1, "com.robinhood.shared.crypto.movers.DefaultInstrumentPreviewCard (InstrumentPreviewCard.kt:79)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion3, instrumentPreviewCard42 instanceof InstrumentPreviewCard4.Loading, null, 2, null);
                String title = instrumentPreviewCard42.getTitle();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                FontWeight bold = companion4.getBold();
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(title, modifierBentoPlaceholder$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composerStartRestartGroup, 817913856, 0, 7528);
                BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getSubtitle(), modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 817889280, 0, 7544);
                float f = 20;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                float f2 = 28;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierBentoPlaceholder$default, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f2), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2));
                z = instrumentPreviewCard4 instanceof InstrumentPreviewCard4.Loaded;
                loaded = z ? (InstrumentPreviewCard4.Loaded) instrumentPreviewCard4 : null;
                if (loaded != null || (listEmptyList = loaded.getChartLines()) == null) {
                    List<ChartLine> listEmptyList = CollectionsKt.emptyList();
                }
                SegmentedLineChart.SegmentedLineChart(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(listEmptyList, 0.0f, null, composerStartRestartGroup, 0, 6), modifierM5156height3ABfNKs, null, null, null, null, null, null, ScrubLineType.SCRUBBING_DISABLED, false, null, composerStartRestartGroup, SegmentedLine.$stable | 100663296, 0, 1788);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getPrice(), modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, companion4.getBold(), null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 817913856, 0, 7528);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-548504101);
                if (!z) {
                    InstrumentPreviewCard4.Loaded loaded2 = (InstrumentPreviewCard4.Loaded) instrumentPreviewCard4;
                    if (loaded2.getDirection() != null) {
                        Direction direction = loaded2.getDirection();
                        if (direction == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        int i7 = iArr[direction.ordinal()];
                        i4 = 1;
                        if (i7 == 1) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_12;
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_12;
                        }
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                        Direction direction2 = loaded2.getDirection();
                        if (direction2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        int i8 = iArr[direction2.ordinal()];
                        if (i8 == 1) {
                            composerStartRestartGroup.startReplaceGroup(-548486307);
                            jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i8 != 2) {
                                composerStartRestartGroup.startReplaceGroup(-548489223);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-548484099);
                            jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21452getNegative0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21456getPositive0d7_KjU, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                    } else {
                        i4 = 1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    String deltaText = instrumentPreviewCard4.getDeltaText();
                    instrumentPreviewCard42 = instrumentPreviewCard4;
                    if (instrumentPreviewCard42 instanceof InstrumentPreviewCard4.Loading) {
                        composerStartRestartGroup.startReplaceGroup(-548474856);
                        jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!z) {
                            composerStartRestartGroup.startReplaceGroup(-548477455);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(177219361);
                        Direction direction3 = ((InstrumentPreviewCard4.Loaded) instrumentPreviewCard42).getDirection();
                        int i9 = direction3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction3.ordinal()];
                        if (i9 == -1) {
                            composerStartRestartGroup.startReplaceGroup(-548466056);
                            jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (i9 == i4) {
                            composerStartRestartGroup.startReplaceGroup(-548470147);
                            jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i9 != 2) {
                                composerStartRestartGroup.startReplaceGroup(-548472575);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-548467939);
                            jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21452getNegative0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(deltaText, modifierBentoPlaceholder$default, Color.m6701boximpl(jM21427getFg30d7_KjU), null, companion4.getBold(), null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 805330944, 0, 7656);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentPreviewCard3.DefaultInstrumentPreviewCard$lambda$7(instrumentPreviewCard42, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion32, instrumentPreviewCard42 instanceof InstrumentPreviewCard4.Loading, null, 2, null);
                String title2 = instrumentPreviewCard42.getTitle();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
                FontWeight.Companion companion42 = FontWeight.INSTANCE;
                FontWeight bold2 = companion42.getBold();
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                TextOverflow.Companion companion52 = TextOverflow.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(title2, modifierBentoPlaceholder$default2, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, bold2, null, null, companion52.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composerStartRestartGroup, 817913856, 0, 7528);
                BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getSubtitle(), modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, companion52.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, 817889280, 0, 7544);
                float f3 = 20;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, C2002Dp.m7995constructorimpl(f3)), composerStartRestartGroup, 6);
                float f22 = 28;
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierBentoPlaceholder$default2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f22), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f22));
                z = instrumentPreviewCard4 instanceof InstrumentPreviewCard4.Loaded;
                if (z) {
                }
                if (loaded != null) {
                    List<ChartLine> listEmptyList2 = CollectionsKt.emptyList();
                    SegmentedLineChart.SegmentedLineChart(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(listEmptyList2, 0.0f, null, composerStartRestartGroup, 0, 6), modifierM5156height3ABfNKs2, null, null, null, null, null, null, ScrubLineType.SCRUBBING_DISABLED, false, null, composerStartRestartGroup, SegmentedLine.$stable | 100663296, 0, 1788);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, C2002Dp.m7995constructorimpl(f3)), composerStartRestartGroup, 6);
                    BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getPrice(), modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, companion42.getBold(), null, null, companion52.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 817913856, 0, 7528);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM()), companion6.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-548504101);
                        if (!z) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompactInstrumentPreviewCard(final InstrumentPreviewCard4 instrumentPreviewCard4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zContains$default;
        long jM21452getNegative0d7_KjU;
        long jM21452getNegative0d7_KjU2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2072480243);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(instrumentPreviewCard4) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2072480243, i3, -1, "com.robinhood.shared.crypto.movers.CompactInstrumentPreviewCard (InstrumentPreviewCard.kt:165)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion3, instrumentPreviewCard4 instanceof InstrumentPreviewCard4.Loading, null, 2, null);
                String subtitle = instrumentPreviewCard4.getSubtitle();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(subtitle, modifierBentoPlaceholder$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composerStartRestartGroup, 817889280, 0, 7544);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getPrice(), modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 817889280, 0, 7544);
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                zContains$default = StringsKt.contains$default((CharSequence) instrumentPreviewCard4.getDeltaText(), (CharSequence) "+", false, 2, (Object) null);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null);
                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(!zContains$default ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                if (zContains$default) {
                    composerStartRestartGroup.startReplaceGroup(796739899);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(796738875);
                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21452getNegative0d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 3120, 48);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                String strRemovePrefix = StringsKt.removePrefix(StringsKt.removePrefix(instrumentPreviewCard4.getDeltaText(), "-"), "+");
                if (zContains$default) {
                    composerStartRestartGroup.startReplaceGroup(796752411);
                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(796751387);
                    jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strRemovePrefix, modifierBentoPlaceholder$default, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, FontWeight.INSTANCE.getBold(), null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 817913856, 0, 7528);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentPreviewCard3.CompactInstrumentPreviewCard$lambda$10(instrumentPreviewCard4, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion32, instrumentPreviewCard4 instanceof InstrumentPreviewCard4.Loading, null, 2, null);
                String subtitle2 = instrumentPreviewCard4.getSubtitle();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(subtitle2, modifierBentoPlaceholder$default2, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS2, composerStartRestartGroup, 817889280, 0, 7544);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion5.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(instrumentPreviewCard4.getPrice(), modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 817889280, 0, 7544);
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    zContains$default = StringsKt.contains$default((CharSequence) instrumentPreviewCard4.getDeltaText(), (CharSequence) "+", false, 2, (Object) null);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, C2002Dp.m7995constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null);
                    BentoIcon4.Size12 size122 = new BentoIcon4.Size12(!zContains$default ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                    if (zContains$default) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size122, null, jM21452getNegative0d7_KjU, modifierM5146paddingqDBjuR0$default2, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 3120, 48);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    String strRemovePrefix2 = StringsKt.removePrefix(StringsKt.removePrefix(instrumentPreviewCard4.getDeltaText(), "-"), "+");
                    if (zContains$default) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(strRemovePrefix2, modifierBentoPlaceholder$default2, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, FontWeight.INSTANCE.getBold(), null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composer2, 817913856, 0, 7528);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final SemanticsPropertyKey<InstrumentPreviewCard4> getInstrumentPreviewCardSemanticKey() {
        return InstrumentPreviewCardSemanticKey;
    }

    private static final InstrumentPreviewCard4 getInstrumentPreviewCard(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return InstrumentPreviewCardSemanticKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    private static final void setInstrumentPreviewCard(SemanticsPropertyReceiver semanticsPropertyReceiver, InstrumentPreviewCard4 instrumentPreviewCard4) {
        InstrumentPreviewCardSemanticKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], instrumentPreviewCard4);
    }

    private static final void InstrumentPreviewCardPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1446436857);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1446436857, i, -1, "com.robinhood.shared.crypto.movers.InstrumentPreviewCardPreview (InstrumentPreviewCard.kt:268)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InstrumentPreviewCard.INSTANCE.m24924getLambda$2119234127$lib_crypto_movers_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.movers.InstrumentPreviewCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentPreviewCard3.InstrumentPreviewCardPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

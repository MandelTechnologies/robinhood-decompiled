package com.robinhood.android.feature.day.trade.sdui;

import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.CellBackgroundStyle;
import com.robinhood.models.serverdriven.experimental.api.ColoredBackground;
import com.robinhood.models.serverdriven.experimental.api.DayTradeCell;
import com.robinhood.models.serverdriven.experimental.api.DayTradeCounter;
import com.robinhood.models.serverdriven.experimental.api.ShadedBackground;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiDayTradeCounter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"SduiDayTradeCounter", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/DayTradeCounter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/DayTradeCounter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shadedBackground", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "shadedBackground-4WTKRHQ", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "feature-day-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.day.trade.sdui.SduiDayTradeCounterKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SduiDayTradeCounter2 {
    @SduiComposable
    public static final /* synthetic */ <ActionT extends Parcelable> void SduiDayTradeCounter(DayTradeCounter<? extends ActionT> component, Modifier modifier, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(component, "component");
        composer2.startReplaceGroup(977219344);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM());
        int i4 = 1;
        Object obj = null;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        float f = 1;
        Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(Intrinsic3.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Intrinsic4.Max), roundedCornerShapeM5327RoundedCornerShape0680j_4), C2002Dp.m7995constructorimpl(f), bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4876borderxT4_qwU);
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        composer2.startReplaceGroup(836119804);
        Iterator it = component.getCells().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DayTradeCell dayTradeCell = (DayTradeCell) next;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, i4, obj);
            composer2.startReplaceGroup(836127006);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Iterator it2 = it;
            long jM21427getFg30d7_KjU = bentoTheme2.getColors(composer2, i7).m21427getFg30d7_KjU();
            CellBackgroundStyle background = dayTradeCell.getBackground();
            ColoredBackground coloredBackground = background instanceof ColoredBackground ? (ColoredBackground) background : null;
            ThemedColor background_color = coloredBackground != null ? coloredBackground.getBackground_color() : null;
            composer2.startReplaceGroup(836137446);
            Color composeColor = background_color == null ? null : SduiColors2.toComposeColor(background_color, composer2, 0);
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(836135681);
            long jM21371getBg0d7_KjU = composeColor == null ? bentoTheme2.getColors(composer2, i7).m21371getBg0d7_KjU() : composeColor.getValue();
            composer2.endReplaceGroup();
            Modifier modifierM14448shadedBackground4WTKRHQ = Intrinsics.areEqual(dayTradeCell.getBackground(), ShadedBackground.INSTANCE) ? m14448shadedBackground4WTKRHQ(companion3, jM21427getFg30d7_KjU) : Background3.m4872backgroundbw27NRU$default(companion3, jM21371getBg0d7_KjU, null, 2, null);
            composer2.endReplaceGroup();
            Modifier modifierThen = modifierFillMaxHeight$default.then(modifierM14448shadedBackground4WTKRHQ);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically, composer2, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierThen);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
            int i8 = i5;
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            composer2.startReplaceGroup(-812111852);
            if (i8 != 0) {
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), 0.0f, 1, null), bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU(), null, 2, null), composer2, 0);
            }
            composer2.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m5157heightInVpY3zN4(companion3, C2002Dp.m7995constructorimpl(80), C2002Dp.m7995constructorimpl(110)), 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5091spacedByD5KLDUw(bentoTheme2.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), companion4.getCenterVertically()), companion4.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
            Column6 column62 = Column6.INSTANCE;
            composer2.startReplaceGroup(1157553195);
            Iterator<T> it3 = dayTradeCell.getContent().iterator();
            while (it3.hasNext()) {
                SduiComponent3.SduiComponent((UIComponent) it3.next(), null, HorizontalPadding.None, composer2, 384, 2);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            i5 = i6;
            it = it2;
            obj = null;
            i4 = 1;
        }
        composer2.endReplaceGroup();
        composer2.endNode();
        Modifier.Companion companion6 = Modifier.INSTANCE;
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default2);
        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor5);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
        Row6 row63 = Row6.INSTANCE;
        composer2.startReplaceGroup(720313821);
        Iterator<T> it4 = component.getCells().iterator();
        while (it4.hasNext()) {
            DayTradeCell dayTradeCell2 = (DayTradeCell) it4.next();
            Modifier.Companion companion8 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row63, companion8, 1.0f, false, 2, null);
            Row6 row64 = row63;
            Arrangement arrangement3 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement3.getCenter();
            Alignment.Companion companion9 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(center, companion9.getTop(), composer2, 6);
            int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy4, companion10.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion10.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion10.getSetCompositeKeyHash();
            if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion10.getSetModifier());
            Row6 row65 = Row6.INSTANCE;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(dayTradeCell2.getTitle());
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer2.startReplaceGroup(-1772220517);
            Arrangement.Vertical top2 = arrangement3.getTop();
            Alignment.Horizontal start = companion9.getStart();
            Intrinsics.reifiedOperationMarker(4, "ActionT");
            SduiColumns.SduiColumn(immutableList3PersistentListOf, Parcelable.class, companion8, null, null, horizontalPadding, top2, start, false, composer, 100859904, 0);
            composer.endReplaceGroup();
            composer.endNode();
            composer2 = composer;
            row63 = row64;
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        composer.endReplaceGroup();
    }

    /* renamed from: shadedBackground-4WTKRHQ, reason: not valid java name */
    public static final Modifier m14448shadedBackground4WTKRHQ(Modifier shadedBackground, final long j) {
        Intrinsics.checkNotNullParameter(shadedBackground, "$this$shadedBackground");
        return DrawModifierKt.drawBehind(shadedBackground, new Function1() { // from class: com.robinhood.android.feature.day.trade.sdui.SduiDayTradeCounterKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiDayTradeCounter2.shadedBackground_4WTKRHQ$lambda$10(j, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shadedBackground_4WTKRHQ$lambda$10(long j, DrawScope drawScope) {
        DrawScope drawBehind = drawScope;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        for (int i = 1; i < 17; i++) {
            float f = 16;
            float f2 = i;
            float f3 = (fIntBitsToFloat / f) * f2;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits((fIntBitsToFloat2 / f) * f2) << 32)), 2.0f, 0, null, 0.0f, null, 0, 496, null);
            drawBehind = drawScope;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(r21) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 2.0f, 0, null, 0.0f, null, 0, 496, null);
        }
        return Unit.INSTANCE;
    }
}

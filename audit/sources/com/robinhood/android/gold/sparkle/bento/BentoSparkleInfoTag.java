package com.robinhood.android.gold.sparkle.bento;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.component.TagColorStates;
import com.robinhood.compose.bento.component.TagColors;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSparkleInfoTag.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001aO\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m3636d2 = {AnalyticsStrings.TAB_NAV_TAB_BAR_GOLD_UPGRADE, "Lcom/robinhood/compose/bento/component/TagColorStates;", "Lcom/robinhood/compose/bento/component/TagColorStates$Companion;", "(Lcom/robinhood/compose/bento/component/TagColorStates$Companion;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/TagColorStates;", "sparkleBackground", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "BentoSparkleInfoTag", "", "text", "", "icon", "", "contentDescription", "modifier", "enabled", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoSparkleInfoTagPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-gold-sparkle-bento_externalDebug", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class BentoSparkleInfoTag {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSparkleInfoTag$lambda$3(String str, Integer num, String str2, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoSparkleInfoTag(str, num, str2, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSparkleInfoTagPreview$lambda$4(int i, Composer composer, int i2) {
        BentoSparkleInfoTagPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final TagColorStates gold(TagColorStates.Companion companion, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        composer.startReplaceGroup(339116421);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(339116421, i, -1, "com.robinhood.android.gold.sparkle.bento.gold (BentoSparkleInfoTag.kt:45)");
        }
        BentoColors colors = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable);
        TagColorStates tagColorStates = new TagColorStates(new TagColors(colors.getJet(), colors.getSolLight(), 0L, 4, null), new TagColors(colors.m21371getBg0d7_KjU(), colors.m21373getBg30d7_KjU(), 0L, 4, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tagColorStates;
    }

    /* compiled from: BentoSparkleInfoTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagKt$sparkleBackground$1 */
    static final class C179151 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Shape $shape;

        C179151(Shape shape) {
            this.$shape = shape;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        private static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
            snapshotState.setValue(Offset.m6534boximpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
            Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
            invoke$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
            return Unit.INSTANCE;
        }

        private static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-476116387);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476116387, i, -1, "com.robinhood.android.gold.sparkle.bento.sparkleBackground.<anonymous> (BentoSparkleInfoTag.kt:61)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagKt$sparkleBackground$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoSparkleInfoTag.C179151.invoke$lambda$4$lambda$3(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierBackground$default = Background3.background$default(OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue2), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, invoke$lambda$1(snapshotState), null, composer, 6, 2), this.$shape, 0.0f, 4, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierBackground$default;
        }
    }

    public static /* synthetic */ Modifier sparkleBackground$default(Modifier modifier, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = RectangleShape2.getRectangleShape();
        }
        return sparkleBackground(modifier, shape);
    }

    public static final Modifier sparkleBackground(Modifier modifier, Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifier2.composed$default(modifier, null, new C179151(shape), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSparkleInfoTag(final String text, final Integer num, final String str, Modifier modifier, boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        TagColors disabled;
        Modifier modifierM4872backgroundbw27NRU$default;
        Modifier modifier3;
        Modifier modifierM4893clickableXHw0xAI$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i6;
        Modifier modifier4;
        int i7;
        Composer composer2;
        Composer composer3;
        final boolean z4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(451633968);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                i5 = i3;
                if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(451633968, i5, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag (BentoSparkleInfoTag.kt:79)");
                    }
                    if (z3) {
                        composerStartRestartGroup.startReplaceGroup(228555960);
                        disabled = gold(TagColorStates.INSTANCE, composerStartRestartGroup, 6).getDisabled();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(228554839);
                        disabled = gold(TagColorStates.INSTANCE, composerStartRestartGroup, 6).getDefault();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    TagColors tagColors = disabled;
                    if (!z3) {
                        modifierM4872backgroundbw27NRU$default = sparkleBackground$default(Modifier.INSTANCE, null, 1, null);
                    } else {
                        modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, tagColors.m20845getBackground0d7_KjU(), null, 2, null);
                    }
                    if (z3 || function0 == null) {
                        modifier3 = modifierM4872backgroundbw27NRU$default;
                        modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifierM4872backgroundbw27NRU$default;
                        modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null);
                    }
                    InfoTagDefaults infoTagDefaults = InfoTagDefaults.INSTANCE;
                    Modifier modifierThen = Clip.clip(modifier6, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults.m20818getShapeRadiusD9Ej5fM())).then(modifier3).then(modifierM4893clickableXHw0xAI$default);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion3, infoTagDefaults.m20817getInternalPaddingStartD9Ej5fM(), 0.0f, infoTagDefaults.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null), infoTagDefaults.m20815getHeightD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
                    composerStartRestartGroup.startReplaceGroup(-1456580252);
                    if (num == null) {
                        int i9 = i5 >> 3;
                        i6 = i5;
                        Modifier modifier7 = modifier6;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier7;
                        i7 = 4;
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, i9 & 14), str2, SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(16)), tagColors.m20846getForeground0d7_KjU(), composer2, (i9 & 112) | 384, 0);
                    } else {
                        i6 = i5;
                        modifier4 = modifier6;
                        i7 = 4;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(i7)), composer2, 6);
                    Composer composer4 = composer2;
                    BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(tagColors.m20846getForeground0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer4, (i6 & 14) | 24576, 0, 8170);
                    composer3 = composer4;
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z3;
                    modifier5 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    z4 = z2;
                    composer3 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoSparkleInfoTag.BentoSparkleInfoTag$lambda$3(text, num, str, modifier5, z4, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            if ((74899 & i5) != 74898) {
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z3) {
                }
                composerStartRestartGroup.endReplaceGroup();
                TagColors tagColors2 = disabled;
                if (!z3) {
                }
                if (z3) {
                    modifier3 = modifierM4872backgroundbw27NRU$default;
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                    InfoTagDefaults infoTagDefaults2 = InfoTagDefaults.INSTANCE;
                    Modifier modifierThen2 = Clip.clip(modifier6, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(infoTagDefaults2.m20818getShapeRadiusD9Ej5fM())).then(modifier3).then(modifierM4893clickableXHw0xAI$default);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion32, infoTagDefaults2.m20817getInternalPaddingStartD9Ej5fM(), 0.0f, infoTagDefaults2.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null), infoTagDefaults2.m20815getHeightD9Ej5fM());
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
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
                            composerStartRestartGroup.startReplaceGroup(-1456580252);
                            if (num == null) {
                            }
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, C2002Dp.m7995constructorimpl(i7)), composer2, 6);
                            Composer composer42 = composer2;
                            BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(tagColors2.m20846getForeground0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer42, (i6 & 14) | 24576, 0, 8170);
                            composer3 = composer42;
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z4 = z3;
                            modifier5 = modifier4;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        if ((74899 & i5) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoSparkleInfoTagPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700769854);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1700769854, i, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagPreview (BentoSparkleInfoTag.kt:123)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoSparkleInfoTag2.INSTANCE.m15093getLambda$926683270$lib_gold_sparkle_bento_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTagKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSparkleInfoTag.BentoSparkleInfoTagPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

package com.robinhood.android.eventcontracts.sharedeventui.navbar;

import androidx.compose.animation.ColorVectorConverter;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.compose.extensions.Colors8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CategoryItem.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\t0\u0013H\u0003¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"SimpleCategoryItem", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "selected", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "FancyCategoryItem", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewFancyCategoryItem", "(Landroidx/compose/runtime/Composer;I)V", "categoryItemColorTransitionSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/Transition$Segment;", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;", "CategoryItemCornerRadiusDp", "Landroidx/compose/ui/unit/Dp;", "F", "categoryItemShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "lib-shared-event-ui_externalDebug", "indicatorColor", "indicatorShapeScale", "", "textColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CategoryItem2 {
    private static final float CategoryItemCornerRadiusDp;
    private static final RoundedCornerShape categoryItemShape;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FancyCategoryItem$lambda$12(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FancyCategoryItem(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFancyCategoryItem$lambda$13(int i, Composer composer, int i2) {
        PreviewFancyCategoryItem(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleCategoryItem$lambda$10(String str, Function0 function0, Modifier modifier, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        SimpleCategoryItem(str, function0, modifier, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult SimpleCategoryItem$lambda$9$lambda$8(SnapshotState4 snapshotState4, final SnapshotState4 snapshotState42, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        long jM6590getCenteruvyYCjk = SizeKt.m6590getCenteruvyYCjk(drawWithCache.m6459getSizeNHjbRc());
        final long jM6591lerpVgWVRYQ = SizeKt.m6591lerpVgWVRYQ(Size.INSTANCE.m6589getZeroNHjbRc(), drawWithCache.m6459getSizeNHjbRc(), SimpleCategoryItem$lambda$3(snapshotState4));
        final long jM6548timestuRUvjQ = Offset.m6548timestuRUvjQ(jM6590getCenteruvyYCjk, 1 - SimpleCategoryItem$lambda$3(snapshotState4));
        float fMo5016toPx0680j_4 = drawWithCache.mo5016toPx0680j_4(CategoryItemCornerRadiusDp);
        final long jM6528constructorimpl = CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L));
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryItem2.SimpleCategoryItem$lambda$9$lambda$8$lambda$7(jM6548timestuRUvjQ, jM6591lerpVgWVRYQ, jM6528constructorimpl, snapshotState42, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleCategoryItem$lambda$9$lambda$8$lambda$7(long j, long j2, long j3, SnapshotState4 snapshotState4, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6960drawRoundRectuAw5IA$default(onDrawBehind, SimpleCategoryItem$lambda$1(snapshotState4), j, j2, j3, null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final long SimpleCategoryItem$lambda$1(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float SimpleCategoryItem$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final long SimpleCategoryItem$lambda$5(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FancyCategoryItem(String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String text = str;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-113036843);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(text) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-113036843, i4, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.FancyCategoryItem (CategoryItem.kt:97)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM());
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                Brush brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).getBiome()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).getPrime())}), 0.0f, 0.0f, 0, 14, (Object) null);
                RoundedCornerShape roundedCornerShape = categoryItemShape;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(BorderKt.m4878borderziNgDLE(modifier3, fM7995constructorimpl, brushM6676horizontalGradient8A3gB4$default, roundedCornerShape), Colors8.m26601blendWithjxsXWHM(bentoTheme.getColors(composerStartRestartGroup, i6).getPrimeLight(), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0.95f), roundedCornerShape), C2002Dp.m7995constructorimpl(6), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 10, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.FEATURED_16), str, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | ((i4 << 3) & 112), 56);
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                Modifier modifier4 = modifier3;
                text = str;
                BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, textM, composerStartRestartGroup, (i4 & 14) | 805330944, 0, 7658);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CategoryItem2.FancyCategoryItem$lambda$12(text, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM());
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            Brush brushM6676horizontalGradient8A3gB4$default2 = Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).getBiome()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).getPrime())}), 0.0f, 0.0f, 0, 14, (Object) null);
            RoundedCornerShape roundedCornerShape2 = categoryItemShape;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(Background3.m4871backgroundbw27NRU(BorderKt.m4878borderziNgDLE(modifier3, fM7995constructorimpl2, brushM6676horizontalGradient8A3gB4$default2, roundedCornerShape2), Colors8.m26601blendWithjxsXWHM(bentoTheme2.getColors(composerStartRestartGroup, i62).getPrimeLight(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0.95f), roundedCornerShape2), C2002Dp.m7995constructorimpl(6), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 10, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.FEATURED_16), str, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | ((i4 << 3) & 112), 56);
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                Modifier modifier42 = modifier3;
                text = str;
                BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, textM2, composerStartRestartGroup, (i4 & 14) | 805330944, 0, 7658);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
        CategoryItemCornerRadiusDp = fM7995constructorimpl;
        categoryItemShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl);
    }

    private static final void PreviewFancyCategoryItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1874251015);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874251015, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.PreviewFancyCategoryItem (CategoryItem.kt:133)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, CategoryItem6.INSTANCE.m14410getLambda$587516737$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CategoryItem2.PreviewFancyCategoryItem$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec<Color> categoryItemColorTransitionSpec(Transition.Segment<Boolean> segment, Composer composer, int i) {
        composer.startReplaceGroup(2100184822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2100184822, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.categoryItemColorTransitionSpec (CategoryItem.kt:143)");
        }
        FiniteAnimationSpec<Color> finiteAnimationSpecSpring$default = segment.getTargetState().booleanValue() ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : AnimationSpecKt.tween$default(0, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpecSpring$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SimpleCategoryItem(final String text, final Function0<Unit> onClick, Modifier modifier, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        ColorSpace colorSpaceM6710getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4CreateTransitionAnimation;
        final SnapshotState4 snapshotState4CreateTransitionAnimation2;
        boolean zBooleanValue;
        long jM21426getFg20d7_KjU;
        ColorSpace colorSpaceM6710getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zBooleanValue2;
        long jM21426getFg20d7_KjU2;
        boolean zBooleanValue3;
        long jM21426getFg20d7_KjU3;
        Object objRememberedValue3;
        Composer.Companion companion;
        boolean zChanged3;
        Object objRememberedValue4;
        final boolean z5;
        final Modifier modifier3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2094944262);
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
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z7 = i4 == 0 ? true : z3;
                        boolean z8 = i5 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2094944262, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem (CategoryItem.kt:46)");
                        }
                        Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z8), (String) null, composerStartRestartGroup, (i3 >> 12) & 14, 2);
                        CategoryItem3 categoryItem3 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$indicatorColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceGroup(1777837106);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1777837106, i7, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:49)");
                                }
                                FiniteAnimationSpec<Color> finiteAnimationSpecCategoryItemColorTransitionSpec = CategoryItem2.categoryItemColorTransitionSpec(animateColor, composer2, i7 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceGroup();
                                return finiteAnimationSpecCategoryItemColorTransitionSpec;
                            }
                        };
                        boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(1749543110);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1749543110, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:51)");
                        }
                        long jM21425getFg0d7_KjU = !zBooleanValue4 ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(jM21425getFg0d7_KjU);
                        zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                        boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(1749543110);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1749543110, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:51)");
                        }
                        long jM21425getFg0d7_KjU2 = !zBooleanValue5 ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU2);
                        boolean zBooleanValue6 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(1749543110);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1749543110, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:51)");
                        }
                        long jM21425getFg0d7_KjU3 = !zBooleanValue6 ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM6701boximpl, Color.m6701boximpl(jM21425getFg0d7_KjU3), categoryItem3.invoke((CategoryItem3) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0);
                        CategoryItem4 categoryItem4 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$indicatorShapeScale$2
                            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                composer2.startReplaceGroup(1226834251);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1226834251, i7, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:53)");
                                }
                                SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceGroup();
                                return springSpecSpring$default;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }
                        };
                        TwoWayConverter<Float, AnimationVectors2> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        boolean zBooleanValue7 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(662317040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(662317040, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:54)");
                        }
                        float f = !zBooleanValue7 ? 1.0f : 0.5f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf = Float.valueOf(f);
                        boolean zBooleanValue8 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(662317040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(662317040, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:54)");
                        }
                        float f2 = !zBooleanValue8 ? 1.0f : 0.5f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), categoryItem4.invoke((CategoryItem4) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
                        CategoryItem5 categoryItem5 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$textColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceGroup(29855280);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(29855280, i7, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:57)");
                                }
                                FiniteAnimationSpec<Color> finiteAnimationSpecCategoryItemColorTransitionSpec = CategoryItem2.categoryItemColorTransitionSpec(animateColor, composer2, i7 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceGroup();
                                return finiteAnimationSpecCategoryItemColorTransitionSpec;
                            }
                        };
                        zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(-644104932);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644104932, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:59)");
                        }
                        if (zBooleanValue) {
                            composerStartRestartGroup.startReplaceGroup(-509547041);
                            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-509547874);
                            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorSpaceM6710getColorSpaceimpl2 = Color.m6710getColorSpaceimpl(jM21426getFg20d7_KjU);
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue2;
                        zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(-644104932);
                        Modifier modifier5 = modifier4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644104932, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:59)");
                        }
                        if (zBooleanValue2) {
                            composerStartRestartGroup.startReplaceGroup(-509547041);
                            jM21426getFg20d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-509547874);
                            jM21426getFg20d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Color colorM6701boximpl2 = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                        zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(-644104932);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-644104932, 0, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:59)");
                        }
                        if (zBooleanValue3) {
                            composerStartRestartGroup.startReplaceGroup(-509547041);
                            jM21426getFg20d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-509547874);
                            jM21426getFg20d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState4 snapshotState4CreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM6701boximpl2, Color.m6701boximpl(jM21426getFg20d7_KjU3), categoryItem5.invoke((CategoryItem5) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "ColorAnimation", composerStartRestartGroup, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        long jSimpleCategoryItem$lambda$5 = SimpleCategoryItem$lambda$5(snapshotState4CreateTransitionAnimation3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i8 = i3;
                        boolean z9 = z7;
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier5, (InteractionSource3) objRememberedValue3, null, z9, null, null, onClick, 24, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged3 = composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation2) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CategoryItem2.SimpleCategoryItem$lambda$9$lambda$8(snapshotState4CreateTransitionAnimation2, snapshotState4CreateTransitionAnimation, (CacheDrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5143paddingVpY3zN4(DrawModifierKt.drawWithCache(modifierM4891clickableO2vRcR0$default, (Function1) objRememberedValue4), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21597getXxsmallD9Ej5fM()), Color.m6701boximpl(jSimpleCategoryItem$lambda$5), null, bold, null, null, 0, false, 1, 0, null, 0, textM, composerStartRestartGroup, 805330944 | (i8 & 14), 0, 7656);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z8;
                        modifier3 = modifier5;
                        z6 = z9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z6 = z3;
                        z5 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CategoryItem2.SimpleCategoryItem$lambda$10(text, onClick, modifier3, z6, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z4 = z2;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Transition transitionUpdateTransition2 = TransitionKt.updateTransition(Boolean.valueOf(z8), (String) null, composerStartRestartGroup, (i3 >> 12) & 14, 2);
                    CategoryItem3 categoryItem32 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$indicatorColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i72) {
                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceGroup(1777837106);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1777837106, i72, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:49)");
                            }
                            FiniteAnimationSpec<Color> finiteAnimationSpecCategoryItemColorTransitionSpec = CategoryItem2.categoryItemColorTransitionSpec(animateColor, composer2, i72 & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return finiteAnimationSpecCategoryItemColorTransitionSpec;
                        }
                    };
                    boolean zBooleanValue42 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1749543110);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!zBooleanValue42) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    colorSpaceM6710getColorSpaceimpl = Color.m6710getColorSpaceimpl(jM21425getFg0d7_KjU);
                    zChanged = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue;
                        boolean zBooleanValue52 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(1749543110);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!zBooleanValue52) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Color colorM6701boximpl3 = Color.m6701boximpl(jM21425getFg0d7_KjU2);
                        boolean zBooleanValue62 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(1749543110);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!zBooleanValue62) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM6701boximpl3, Color.m6701boximpl(jM21425getFg0d7_KjU3), categoryItem32.invoke((CategoryItem3) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter3, "ColorAnimation", composerStartRestartGroup, 0);
                        CategoryItem4 categoryItem42 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$indicatorShapeScale$2
                            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> animateFloat, Composer composer2, int i72) {
                                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                composer2.startReplaceGroup(1226834251);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1226834251, i72, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:53)");
                                }
                                SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceGroup();
                                return springSpecSpring$default;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }
                        };
                        TwoWayConverter<Float, AnimationVectors2> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        boolean zBooleanValue72 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(662317040);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!zBooleanValue72) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Float fValueOf2 = Float.valueOf(f);
                        boolean zBooleanValue82 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(662317040);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!zBooleanValue82) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4CreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, fValueOf2, Float.valueOf(f2), categoryItem42.invoke((CategoryItem4) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
                        CategoryItem5 categoryItem52 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$SimpleCategoryItem$textColor$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i72) {
                                Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                composer2.startReplaceGroup(29855280);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(29855280, i72, -1, "com.robinhood.android.eventcontracts.sharedeventui.navbar.SimpleCategoryItem.<anonymous> (CategoryItem.kt:57)");
                                }
                                FiniteAnimationSpec<Color> finiteAnimationSpecCategoryItemColorTransitionSpec = CategoryItem2.categoryItemColorTransitionSpec(animateColor, composer2, i72 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceGroup();
                                return finiteAnimationSpecCategoryItemColorTransitionSpec;
                            }
                        };
                        zBooleanValue = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                        composerStartRestartGroup.startReplaceGroup(-644104932);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (zBooleanValue) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        colorSpaceM6710getColorSpaceimpl2 = Color.m6710getColorSpaceimpl(jM21426getFg20d7_KjU);
                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM6710getColorSpaceimpl2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverter.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM6710getColorSpaceimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            TwoWayConverter twoWayConverter22 = (TwoWayConverter) objRememberedValue2;
                            zBooleanValue2 = ((Boolean) transitionUpdateTransition2.getCurrentState()).booleanValue();
                            composerStartRestartGroup.startReplaceGroup(-644104932);
                            Modifier modifier52 = modifier4;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (zBooleanValue2) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Color colorM6701boximpl22 = Color.m6701boximpl(jM21426getFg20d7_KjU2);
                            zBooleanValue3 = ((Boolean) transitionUpdateTransition2.getTargetState()).booleanValue();
                            composerStartRestartGroup.startReplaceGroup(-644104932);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (zBooleanValue3) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SnapshotState4 snapshotState4CreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transitionUpdateTransition2, colorM6701boximpl22, Color.m6701boximpl(jM21426getFg20d7_KjU3), categoryItem52.invoke((CategoryItem5) transitionUpdateTransition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter22, "ColorAnimation", composerStartRestartGroup, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i72 = BentoTheme.$stable;
                            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM();
                            FontWeight bold2 = FontWeight.INSTANCE.getBold();
                            long jSimpleCategoryItem$lambda$52 = SimpleCategoryItem$lambda$5(snapshotState4CreateTransitionAnimation32);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i82 = i3;
                            boolean z92 = z7;
                            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier52, (InteractionSource3) objRememberedValue3, null, z92, null, null, onClick, 24, null);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged3 = composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation2) | composerStartRestartGroup.changed(snapshotState4CreateTransitionAnimation);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItemKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CategoryItem2.SimpleCategoryItem$lambda$9$lambda$8(snapshotState4CreateTransitionAnimation2, snapshotState4CreateTransitionAnimation, (CacheDrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5143paddingVpY3zN4(DrawModifierKt.drawWithCache(modifierM4891clickableO2vRcR0$default2, (Function1) objRememberedValue4), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21597getXxsmallD9Ej5fM()), Color.m6701boximpl(jSimpleCategoryItem$lambda$52), null, bold2, null, null, 0, false, 1, 0, null, 0, textM2, composerStartRestartGroup, 805330944 | (i82 & 14), 0, 7656);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z8;
                                modifier3 = modifier52;
                                z6 = z92;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

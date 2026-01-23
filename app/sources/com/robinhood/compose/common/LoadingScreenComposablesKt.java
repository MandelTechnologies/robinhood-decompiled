package com.robinhood.compose.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: LoadingScreenComposables.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a5\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010!\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\"\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a!\u0010#\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a+\u0010'\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010(\u001a)\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b-\u0010.\u001a\r\u0010/\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u00100\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u00101\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {LoadingScreenComposablesKt.GenericLoadingScreenTestTag, "", "ShimmerLoadingComposable", "", "type", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/compose/common/ShimmerLoaderType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ListLoadingScreenComposable", "includeHeader", "", "includeBottomButton", "numberOfRows", "", "(Landroidx/compose/ui/Modifier;ZZILandroidx/compose/runtime/Composer;II)V", "PreviewListLoadingScreenComposable", "(Landroidx/compose/runtime/Composer;I)V", "PreviewListLoadingScreenWithHeaderComposable", "PreviewListLoadingScreenWithHeaderAndButtonComposable", "GenericLoadingScreenComposable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "PreviewGenericLoadingScreenComposable", "PreviewGenericLoadingScreenWithButtonComposable", "GenericBoxesLoadingScreenComposable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewGenericBoxesLoadingScreenComposable", "GenericHeroLoadingScreenComposable", "heroSize", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "includeRows", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;ZZLandroidx/compose/runtime/Composer;II)V", "PreviewGenericHeroLoadingScreenComposable", "PreviewGenericHeroLoadingScreenWithRows", "PreviewGenericHeroLoadingScreenLargeWithRowsAndButtonComposable", "PromoLoadingScreenComposable", "numberOfButtons", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "PreviewPromoLoadingScreenComposable", "GenericTextLoadingScreenComposable", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "PlaceholderBox", "height", "Landroidx/compose/ui/unit/Dp;", "verticalPadding", "PlaceholderBox-if577FI", "(FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewGenericTextLoadingScreenComposable", "PreviewGenericTextLoadingScreenWithHeaderComposable", "PreviewGenericTextLoadingScreenWithHeaderAndButtonComposable", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class LoadingScreenComposablesKt {
    public static final String GenericLoadingScreenTestTag = "GenericLoadingScreenTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericBoxesLoadingScreenComposable$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        GenericBoxesLoadingScreenComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericHeroLoadingScreenComposable$lambda$10(Modifier modifier, ShimmerLoaderType.Hero.Size size, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        GenericHeroLoadingScreenComposable(modifier, size, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericLoadingScreenComposable$lambda$5(Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        GenericLoadingScreenComposable(modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericTextLoadingScreenComposable$lambda$16(Modifier modifier, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        GenericTextLoadingScreenComposable(modifier, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListLoadingScreenComposable$lambda$1(Modifier modifier, boolean z, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        ListLoadingScreenComposable(modifier, z, z2, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderBox_if577FI$lambda$17(float f, float f2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m21654PlaceholderBoxif577FI(f, f2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericBoxesLoadingScreenComposable$lambda$9(int i, Composer composer, int i2) {
        PreviewGenericBoxesLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericHeroLoadingScreenComposable$lambda$11(int i, Composer composer, int i2) {
        PreviewGenericHeroLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewGenericHeroLoadingScreenLargeWithRowsAndButtonComposable$lambda$13 */
    public static final Unit m2577x293c33d6(int i, Composer composer, int i2) {
        PreviewGenericHeroLoadingScreenLargeWithRowsAndButtonComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericHeroLoadingScreenWithRows$lambda$12(int i, Composer composer, int i2) {
        PreviewGenericHeroLoadingScreenWithRows(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericLoadingScreenComposable$lambda$6(int i, Composer composer, int i2) {
        PreviewGenericLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericLoadingScreenWithButtonComposable$lambda$7(int i, Composer composer, int i2) {
        PreviewGenericLoadingScreenWithButtonComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericTextLoadingScreenComposable$lambda$18(int i, Composer composer, int i2) {
        PreviewGenericTextLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewGenericTextLoadingScreenWithHeaderAndButtonComposable$lambda$20 */
    public static final Unit m2578xe77f27ce(int i, Composer composer, int i2) {
        PreviewGenericTextLoadingScreenWithHeaderAndButtonComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewGenericTextLoadingScreenWithHeaderComposable$lambda$19(int i, Composer composer, int i2) {
        PreviewGenericTextLoadingScreenWithHeaderComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewListLoadingScreenComposable$lambda$2(int i, Composer composer, int i2) {
        PreviewListLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewListLoadingScreenWithHeaderAndButtonComposable$lambda$4(int i, Composer composer, int i2) {
        PreviewListLoadingScreenWithHeaderAndButtonComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewListLoadingScreenWithHeaderComposable$lambda$3(int i, Composer composer, int i2) {
        PreviewListLoadingScreenWithHeaderComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPromoLoadingScreenComposable$lambda$15(int i, Composer composer, int i2) {
        PreviewPromoLoadingScreenComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoLoadingScreenComposable$lambda$14(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        PromoLoadingScreenComposable(modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShimmerLoadingComposable$lambda$0(ShimmerLoaderType shimmerLoaderType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShimmerLoadingComposable(shimmerLoaderType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ShimmerLoadingComposable(final ShimmerLoaderType type2, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(type2, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-185868463);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185868463, i3, -1, "com.robinhood.compose.common.ShimmerLoadingComposable (LoadingScreenComposables.kt:45)");
            }
            if (type2 instanceof ShimmerLoaderType.Generic) {
                composerStartRestartGroup.startReplaceGroup(1769038999);
                GenericLoadingScreenComposable(modifier2, ((ShimmerLoaderType.Generic) type2).getIncludeBottomButton(), composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (type2 instanceof ShimmerLoaderType.List) {
                composerStartRestartGroup.startReplaceGroup(1769044626);
                ShimmerLoaderType.List list = (ShimmerLoaderType.List) type2;
                ListLoadingScreenComposable(modifier2, list.getIncludeHeader(), list.getIncludeBottomButton(), list.getNumberOfRows(), composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (type2 instanceof ShimmerLoaderType.Boxes) {
                composerStartRestartGroup.startReplaceGroup(1769052937);
                GenericBoxesLoadingScreenComposable(modifier2, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (type2 instanceof ShimmerLoaderType.Hero) {
                composerStartRestartGroup.startReplaceGroup(1769056137);
                ShimmerLoaderType.Hero hero = (ShimmerLoaderType.Hero) type2;
                GenericHeroLoadingScreenComposable(modifier2, hero.getSize(), hero.getIncludeRows(), hero.getIncludeBottomButton(), composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (type2 instanceof ShimmerLoaderType.Text) {
                composerStartRestartGroup.startReplaceGroup(1769064267);
                ShimmerLoaderType.Text text = (ShimmerLoaderType.Text) type2;
                GenericTextLoadingScreenComposable(modifier2, text.getIncludeHeader(), text.getIncludeBottomButton(), composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (type2 instanceof ShimmerLoaderType.Promo) {
                composerStartRestartGroup.startReplaceGroup(1769071437);
                PromoLoadingScreenComposable(modifier2, ((ShimmerLoaderType.Promo) type2).getNumberOfButtons(), composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(type2 instanceof ShimmerLoaderType.Empty)) {
                    composerStartRestartGroup.startReplaceGroup(1769038379);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1769076565);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.ShimmerLoadingComposable$lambda$0(type2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LoadingScreenComposables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericHeroLoadingScreenComposable$1 */
    static final class C327011 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ShimmerLoaderType.Hero.Size $heroSize;
        final /* synthetic */ boolean $includeBottomButton;
        final /* synthetic */ boolean $includeRows;

        C327011(ShimmerLoaderType.Hero.Size size, boolean z, boolean z2) {
            this.$heroSize = size;
            this.$includeRows = z;
            this.$includeBottomButton = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            Modifier modifierFillMaxHeight;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-215620848, i, -1, "com.robinhood.compose.common.GenericHeroLoadingScreenComposable.<anonymous> (LoadingScreenComposables.kt:313)");
            }
            ShimmerLoaderType.Hero.Size size = this.$heroSize;
            boolean z = this.$includeRows;
            boolean z2 = this.$includeBottomButton;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            if (size instanceof ShimmerLoaderType.Hero.Size.Fixed) {
                modifierFillMaxHeight = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, C2002Dp.m7995constructorimpl(((ShimmerLoaderType.Hero.Size.Fixed) size).getHeightDp()));
            } else {
                if (!(size instanceof ShimmerLoaderType.Hero.Size.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierFillMaxHeight = SizeKt.fillMaxHeight(modifierFillMaxWidth$default, ((ShimmerLoaderType.Hero.Size.Relative) size).getFraction());
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder(modifierFillMaxHeight, true, RectangleShape2.getRectangleShape()), composer, 0);
            float f = 16;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 13, null), 0.0f, composer, 0, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw("- ------- -------- -------- ---- -- --- -------- ------ -------- -----", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            Composer composer2 = composer;
            composer2.startReplaceGroup(-910434465);
            if (z) {
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_24;
                Color.Companion companion4 = Color.INSTANCE;
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), 2, null), "- ------- ----- ---", StringsKt.repeat("------- ", 15), null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
                int i2 = BentoBaseRowState.$stable;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, true, 0L, null, composer2, (i2 << 3) | 24960, 105);
                composer2 = composer;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(companion4.m6716getBlack0d7_KjU()), 2, null), "---- -- - ------ ---- ----- ----", StringsKt.repeat("------- ", 12), null, (BentoBaseRowState.Meta) (0 == true ? 1 : 0), null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer2, (i2 << 3) | 24960, 105);
            }
            Composer composer3 = composer2;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-910395759);
            if (z2) {
                Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null);
                composer3.startReplaceGroup(1849434622);
                Object objRememberedValue = composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericHeroLoadingScreenComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer3, 438, 0, 8184);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LoadingScreenComposables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericLoadingScreenComposable$1 */
    static final class C327021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $includeBottomButton;

        C327021(boolean z) {
            this.$includeBottomButton = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008050073, i, -1, "com.robinhood.compose.common.GenericLoadingScreenComposable.<anonymous> (LoadingScreenComposables.kt:181)");
            }
            boolean z = this.$includeBottomButton;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("---- -- - -----", null, null, null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer.consume(Styles2.getLocalStyles())).getLoadingPlaceholderStyle(composer, 0).getHeaderTextStyle(), composer, 6, 0, 8190);
            float f = 16;
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(200), C2002Dp.m7995constructorimpl(f), null, composer, 54, 4);
            BentoText2.m20747BentoText38GnDrw("- ------- -------- -------- ---- -- ---", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_24;
            Color.Companion companion3 = Color.INSTANCE;
            BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(companion3.m6716getBlack0d7_KjU()), 2, null);
            BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine("-------");
            Object[] objArr = 0 == true ? 1 : 0;
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) icon, "- ------- ----- ---", (String) (0 == true ? 1 : 0), (String) null, (BentoBaseRowState.Meta) singleLine, (BentoBaseRowState.End) objArr, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null);
            int i2 = BentoBaseRowState.$stable;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, true, 0L, null, composer, (i2 << 3) | 24576, 109);
            String str = null;
            BentoBaseRowState.End end = null;
            boolean z2 = false;
            boolean z3 = false;
            String str2 = "---- -- - ------ ---- ----- ----";
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(companion3.m6716getBlack0d7_KjU()), 2, null), str2, str, (String) (0 == true ? 1 : 0), (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), end, z2, z3, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (i2 << 3) | 24576, 109);
            String str3 = null;
            BentoBaseRowState.End end2 = null;
            boolean z4 = false;
            boolean z5 = false;
            String str4 = "- ------- ----- ----- --";
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, Color.m6701boximpl(companion3.m6716getBlack0d7_KjU()), 2, null), str4, str3, (String) (0 == true ? 1 : 0), (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), end2, z4, z5, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (i2 << 3) | 24576, 109);
            BentoText2.m20747BentoText38GnDrw("- ------- -------- -------- --- -------- --- ------", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, C2002Dp.m7995constructorimpl(24), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            composer.startReplaceGroup(-1833296044);
            if (z) {
                Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericLoadingScreenComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 438, 0, 8184);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LoadingScreenComposables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericTextLoadingScreenComposable$1 */
    static final class C327031 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $includeBottomButton;
        final /* synthetic */ boolean $includeHeader;

        C327031(boolean z, boolean z2) {
            this.$includeHeader = z;
            this.$includeBottomButton = z2;
        }

        public final void invoke(Composer composer, int i) {
            Modifier.Companion companion;
            boolean z;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-25678000, i, -1, "com.robinhood.compose.common.GenericTextLoadingScreenComposable.<anonymous> (LoadingScreenComposables.kt:488)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, 1);
            boolean z2 = this.$includeHeader;
            boolean z3 = this.$includeBottomButton;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(1160066598);
            if (z2) {
                z = z3;
                BentoText2.m20747BentoText38GnDrw("---- -- - -----", androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer2.consume(Styles2.getLocalStyles())).getLoadingPlaceholderStyle(composer2, 0).getHeaderTextStyle(), composer, 54, 0, 8188);
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw("- ------- -------- -------- ---- --- --", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(8), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
                composer2 = composer;
            } else {
                companion = companion2;
                z = z3;
            }
            composer2.endReplaceGroup();
            float f = 16;
            float f2 = 8;
            float f3 = 25;
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f2), 5, null), C2002Dp.m7995constructorimpl(f3)), true, null, 2, null), composer2, 0);
            float f4 = 60;
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f2), null, composer2, 54, 4);
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f2), null, composer, 54, 4);
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f2), null, composer, 54, 4);
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(95), C2002Dp.m7995constructorimpl(f2), null, composer, 54, 4);
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f2), null, composer, 54, 4);
            LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f2), null, composer, 54, 4);
            composer.startReplaceGroup(1160111179);
            if (z) {
                Modifier.Companion companion4 = companion;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$GenericTextLoadingScreenComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 438, 0, 8184);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LoadingScreenComposables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.LoadingScreenComposablesKt$ListLoadingScreenComposable$1 */
    static final class C327041 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $includeBottomButton;
        final /* synthetic */ boolean $includeHeader;
        final /* synthetic */ int $numberOfRows;

        C327041(boolean z, int i, boolean z2) {
            this.$includeHeader = z;
            this.$numberOfRows = i;
            this.$includeBottomButton = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            int i2;
            boolean z;
            int i3;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-178402025, i, -1, "com.robinhood.compose.common.ListLoadingScreenComposable.<anonymous> (LoadingScreenComposables.kt:99)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer2, 6, 1);
            boolean z2 = this.$includeHeader;
            int i4 = this.$numberOfRows;
            boolean z3 = this.$includeBottomButton;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            composer2.startReplaceGroup(248095706);
            if (z2) {
                float f = 16;
                z = z3;
                i2 = i4;
                i3 = 0;
                BentoText2.m20747BentoText38GnDrw("---- -- - -----", androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer2.consume(Styles2.getLocalStyles())).getLoadingPlaceholderStyle(composer2, 0).getHeaderTextStyle(), composer2, 54, 0, 8188);
                composer2 = composer;
                BentoText2.m20747BentoText38GnDrw("- ------- -------- -------- ---- --- --", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(f), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 54, 0, 16380);
            } else {
                i2 = i4;
                z = z3;
                i3 = 0;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(248110991);
            int iCoerceIn = RangesKt.coerceIn(i2, i3, 15);
            for (int i5 = i3; i5 < iCoerceIn; i5++) {
                Composer composer3 = composer2;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.INFO_24, null, Color.m6701boximpl(Color.INSTANCE.m6716getBlack0d7_KjU()), 2, null), "---- -- ---- ------- ----", "---- -- --- ------- --------- ---- ---- ---- ----", null, null, (BentoBaseRowState.End) (0 == true ? 1 : 0), false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer3, (BentoBaseRowState.$stable << 3) | 24576, 109);
            }
            Composer composer4 = composer2;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(248129662);
            if (z) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer4, i3);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(16), 7, null);
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue = composer4.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$ListLoadingScreenComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                }
                composer4.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 438, 0, 8184);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LoadingScreenComposables.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.LoadingScreenComposablesKt$PromoLoadingScreenComposable$1 */
    static final class C327051 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $numberOfButtons;

        C327051(int i) {
            this.$numberOfButtons = i;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349688902, i, -1, "com.robinhood.compose.common.PromoLoadingScreenComposable.<anonymous> (LoadingScreenComposables.kt:422)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            int i2 = this.$numberOfButtons;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, centerHorizontally, composer2, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, C2002Dp.m7995constructorimpl(16), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, centerHorizontally2, composer2, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Alignment center = companion.getCenter();
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion2, 0.7f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxHeight);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxSize(companion2, 0.75f), true, null, 2, null), composer2, 0);
            composer2.endNode();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i3).m21594getXlargeD9Ej5fM()), composer2, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("------- ---- ---- -------", null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 6, 0, 8126);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), composer2, 0);
            BentoText2.m20747BentoText38GnDrw("------- ---- ---- ------- ---- ----", SizeKt.wrapContentHeight$default(companion2, null, false, 3, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 54, 0, 8124);
            composer2.endNode();
            composer2.startReplaceGroup(2003448569);
            int i4 = 0;
            for (int i5 = i2; i4 < i5; i5 = i5) {
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$PromoLoadingScreenComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 54, 0, 8184);
                i4++;
                composer2 = composer;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListLoadingScreenComposable(Modifier modifier, boolean z, boolean z2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        final int i6;
        final boolean z3;
        final boolean z4;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1325294471);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i8 != 0) {
                    z = false;
                }
                boolean z5 = i9 == 0 ? z2 : false;
                int i11 = i10 == 0 ? 5 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1325294471, i4, -1, "com.robinhood.compose.common.ListLoadingScreenComposable (LoadingScreenComposables.kt:92)");
                }
                LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-178402025, true, new C327041(z, i11, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i11;
                z3 = z5;
                z4 = z;
                modifier2 = modifier;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
                i6 = i5;
                modifier2 = modifier;
                z4 = z;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoadingScreenComposablesKt.ListLoadingScreenComposable$lambda$1(modifier2, z4, z3, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 1171) == 1170) {
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-178402025, true, new C327041(z, i11, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = i11;
            z3 = z5;
            z4 = z;
            modifier2 = modifier;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PreviewListLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1974219597);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974219597, i, -1, "com.robinhood.compose.common.PreviewListLoadingScreenComposable (LoadingScreenComposables.kt:140)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$201099925$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewListLoadingScreenComposable$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewListLoadingScreenWithHeaderComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2076694432);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2076694432, i, -1, "com.robinhood.compose.common.PreviewListLoadingScreenWithHeaderComposable (LoadingScreenComposables.kt:148)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$120173800$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewListLoadingScreenWithHeaderComposable$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewListLoadingScreenWithHeaderAndButtonComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1873021123);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873021123, i, -1, "com.robinhood.compose.common.PreviewListLoadingScreenWithHeaderAndButtonComposable (LoadingScreenComposables.kt:156)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$1018338427$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewListLoadingScreenWithHeaderAndButtonComposable$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericLoadingScreenComposable(final Modifier modifier, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1685596887);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1685596887, i3, -1, "com.robinhood.compose.common.GenericLoadingScreenComposable (LoadingScreenComposables.kt:173)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), C2002Dp.m7995constructorimpl(24), 0.0f, composerStartRestartGroup, 48, 2), null, ComposableLambda3.rememberComposableLambda(2008050073, true, new C327021(z), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.GenericLoadingScreenComposable$lambda$5(modifier, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(174159016);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(174159016, i, -1, "com.robinhood.compose.common.PreviewGenericLoadingScreenComposable (LoadingScreenComposables.kt:248)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$968783968$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericLoadingScreenComposable$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericLoadingScreenWithButtonComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-419233632);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-419233632, i, -1, "com.robinhood.compose.common.PreviewGenericLoadingScreenWithButtonComposable (LoadingScreenComposables.kt:256)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21637getLambda$124207528$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericLoadingScreenWithButtonComposable$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericBoxesLoadingScreenComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2069530558);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2069530558, i3, -1, "com.robinhood.compose.common.GenericBoxesLoadingScreenComposable (LoadingScreenComposables.kt:268)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), GenericLoadingScreenTestTag), 0.0f, C2002Dp.m7995constructorimpl(32), 0.0f, 0.0f, 13, null), 0.0f, composerStartRestartGroup, 0, 1), null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21641getLambda$757085874$lib_compose_common_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable$lambda$8(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericBoxesLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-257256119);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-257256119, i, -1, "com.robinhood.compose.common.PreviewGenericBoxesLoadingScreenComposable (LoadingScreenComposables.kt:290)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$737354897$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericBoxesLoadingScreenComposable$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericHeroLoadingScreenComposable(Modifier modifier, ShimmerLoaderType.Hero.Size size, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        ShimmerLoaderType.Hero.Size fixed;
        int i5;
        boolean z5;
        boolean z6;
        final boolean z7;
        final boolean z8;
        final ShimmerLoaderType.Hero.Size size2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1547630208);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) != 0) {
                i6 = 16;
                i3 |= i6;
            } else {
                if ((i & 64) == 0 ? composerStartRestartGroup.changed(size) : composerStartRestartGroup.changedInstance(size)) {
                    i6 = 32;
                }
                i3 |= i6;
            }
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) == 0) {
                            fixed = new ShimmerLoaderType.Hero.Size.Fixed(0.0f, 1, null);
                            i3 &= -113;
                        } else {
                            fixed = size;
                        }
                        if (i8 != 0) {
                            z3 = false;
                        }
                        i5 = i3;
                        if (i4 == 0) {
                            z5 = false;
                            z6 = z3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1547630208, i5, -1, "com.robinhood.compose.common.GenericHeroLoadingScreenComposable (LoadingScreenComposables.kt:306)");
                        }
                        LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-215620848, true, new C327011(fixed, z6, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z5;
                        z8 = z6;
                        size2 = fixed;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        fixed = size;
                        i5 = i3;
                    }
                    z6 = z3;
                    z5 = z4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-215620848, true, new C327011(fixed, z6, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z7 = z5;
                    z8 = z6;
                    size2 = fixed;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    size2 = size;
                    z8 = z3;
                    z7 = z4;
                }
                final Modifier modifier2 = modifier;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable$lambda$10(modifier2, size2, z8, z7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z4 = z2;
            if ((i3 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if (i8 != 0) {
                    }
                    i5 = i3;
                    if (i4 == 0) {
                        z6 = z3;
                        z5 = z4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-215620848, true, new C327011(fixed, z6, z5), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z7 = z5;
                    z8 = z6;
                    size2 = fixed;
                }
            }
            final Modifier modifier22 = modifier;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z4 = z2;
        if ((i3 & 1171) != 1170) {
        }
        final Modifier modifier222 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewGenericHeroLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1953455154);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953455154, i, -1, "com.robinhood.compose.common.PreviewGenericHeroLoadingScreenComposable (LoadingScreenComposables.kt:381)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21636getLambda$120255610$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericHeroLoadingScreenComposable$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericHeroLoadingScreenWithRows(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(128201920);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(128201920, i, -1, "com.robinhood.compose.common.PreviewGenericHeroLoadingScreenWithRows (LoadingScreenComposables.kt:389)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21640getLambda$741397896$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericHeroLoadingScreenWithRows$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericHeroLoadingScreenLargeWithRowsAndButtonComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1425841059);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1425841059, i, -1, "com.robinhood.compose.common.PreviewGenericHeroLoadingScreenLargeWithRowsAndButtonComposable (LoadingScreenComposables.kt:397)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$1435939349$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.m2577x293c33d6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PromoLoadingScreenComposable(final Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1241466550);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                i = 2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1241466550, i4, -1, "com.robinhood.compose.common.PromoLoadingScreenComposable (LoadingScreenComposables.kt:414)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), C2002Dp.m7995constructorimpl(24), 0.0f, composerStartRestartGroup, 48, 2), null, ComposableLambda3.rememberComposableLambda(-1349688902, true, new C327051(i), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PromoLoadingScreenComposable$lambda$14(modifier, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewPromoLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1509178128);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1509178128, i, -1, "com.robinhood.compose.common.PreviewPromoLoadingScreenComposable (LoadingScreenComposables.kt:470)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21639getLambda$641313112$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewPromoLoadingScreenComposable$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericTextLoadingScreenComposable(Modifier modifier, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(87737056);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                z = false;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(87737056, i3, -1, "com.robinhood.compose.common.GenericTextLoadingScreenComposable (LoadingScreenComposables.kt:481)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), GenericLoadingScreenTestTag), null, ComposableLambda3.rememberComposableLambda(-25678000, true, new C327031(z, z2), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final boolean z3 = z;
        final boolean z4 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.GenericTextLoadingScreenComposable$lambda$16(modifier2, z3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PlaceholderBox-if577FI, reason: not valid java name */
    public static final void m21654PlaceholderBoxif577FI(final float f, final float f2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(46052543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(46052543, i3, -1, "com.robinhood.compose.common.PlaceholderBox (LoadingScreenComposables.kt:550)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, f2, 1, null), f), true, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PlaceholderBox_if577FI$lambda$17(f, f2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericTextLoadingScreenComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2099208251);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2099208251, i, -1, "com.robinhood.compose.common.PreviewGenericTextLoadingScreenComposable (LoadingScreenComposables.kt:562)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.m21638getLambda$362559501$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericTextLoadingScreenComposable$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericTextLoadingScreenWithHeaderComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-892194034);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-892194034, i, -1, "com.robinhood.compose.common.PreviewGenericTextLoadingScreenWithHeaderComposable (LoadingScreenComposables.kt:570)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$2070041798$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.PreviewGenericTextLoadingScreenWithHeaderComposable$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewGenericTextLoadingScreenWithHeaderAndButtonComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2124327189);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2124327189, i, -1, "com.robinhood.compose.common.PreviewGenericTextLoadingScreenWithHeaderAndButtonComposable (LoadingScreenComposables.kt:578)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$LoadingScreenComposablesKt.INSTANCE.getLambda$2087515741$lib_compose_common_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.LoadingScreenComposablesKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingScreenComposablesKt.m2578xe77f27ce(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

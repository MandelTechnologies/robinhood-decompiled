package com.robinhood.android.rothconversion;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import com.robinhood.android.retirement.lib.hero.RetirementGradientHeroImage;
import com.robinhood.android.rothconversion.RothConversionInfoEvent;
import com.robinhood.android.rothconversion.RothConversionInfoPager4;
import com.robinhood.android.rothconversion.RothConversionInfoViewState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RothConversionInfoPager.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a?\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"RothConversionInfoPageHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "headerImageUrl", "", "topBarHeight", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ILandroidx/compose/runtime/Composer;II)V", "RothConversionInfoPageFooter", "disclaimerText", "ctaText", "showDivider", "", "onCtaClicked", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RothConversionInfoPageTopBar", "useImageHeader", "showHeaderDivider", "onBackClicked", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RothConversionInfoPage", "page", "Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel$Page;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel$Page;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RothConversionInfoPager", "state", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loaded;", "callbacks", "Lcom/robinhood/android/rothconversion/RothConversionInfoPageCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/rothconversion/RothConversionInfoViewState$Loaded;Lcom/robinhood/android/rothconversion/RothConversionInfoPageCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-roth-conversion_externalDebug", "headerBackgroundAlpha", "", "showFooterDivider", "currentPageIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rothconversion.RothConversionInfoPagerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RothConversionInfoPager4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPage$lambda$22(Modifier modifier, RothConversionInfoViewModel.Page page, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        RothConversionInfoPage(modifier, page, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPageFooter$lambda$3(Modifier modifier, String str, String str2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        RothConversionInfoPageFooter(modifier, str, str2, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPageHeader$lambda$1(Modifier modifier, String str, int i, int i2, int i3, Composer composer, int i4) {
        RothConversionInfoPageHeader(modifier, str, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPageTopBar$lambda$6(Modifier modifier, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        RothConversionInfoPageTopBar(modifier, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RothConversionInfoPager$lambda$33$lambda$32$lambda$28(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RothConversionInfoPager$lambda$33$lambda$32$lambda$29(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RothConversionInfoPager$lambda$33$lambda$32$lambda$30(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RothConversionInfoPager$lambda$33$lambda$32$lambda$31(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPager$lambda$37(Modifier modifier, RothConversionInfoViewState.Loaded loaded, RothConversionInfoPager3 rothConversionInfoPager3, int i, int i2, Composer composer, int i3) {
        RothConversionInfoPager(modifier, loaded, rothConversionInfoPager3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RothConversionInfoPageHeader(Modifier modifier, final String str, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-490506743);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490506743, i4, -1, "com.robinhood.android.rothconversion.RothConversionInfoPageHeader (RothConversionInfoPager.kt:73)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(-1207460229);
                RetirementGradientHeroImage.RetirementGradientHeroImage(modifier, str, composerStartRestartGroup, i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1207327022);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(modifier, ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i)), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RothConversionInfoPager4.RothConversionInfoPageHeader$lambda$1(modifier2, str, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RothConversionInfoPager$lambda$24(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    private static final boolean RothConversionInfoPage$lambda$12(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean RothConversionInfoPage$lambda$15(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float RothConversionInfoPageTopBar$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final void RothConversionInfoPageFooter(Modifier modifier, final String str, final String str2, final boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoTheme bentoTheme;
        int i4;
        int i5;
        Modifier modifier3;
        final Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1246238979);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i7 = i3;
        if ((i7 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier5 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1246238979, i7, -1, "com.robinhood.android.rothconversion.RothConversionInfoPageFooter (RothConversionInfoPager.kt:97)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), z ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
            composerStartRestartGroup.startReplaceGroup(-2062757266);
            if (str != null) {
                i5 = i7;
                bentoTheme = bentoTheme2;
                i4 = i8;
                modifier3 = modifier5;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, (i7 >> 3) & 14, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                bentoTheme = bentoTheme2;
                i4 = i8;
                i5 = i7;
                modifier3 = modifier5;
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str2, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 2, null), null, null, false, false, null, null, null, null, false, null, composer2, ((i5 >> 12) & 14) | ((i5 >> 3) & 112), 0, 8184);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RothConversionInfoPager4.RothConversionInfoPageFooter$lambda$3(modifier4, str, str2, z, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RothConversionInfoPager$lambda$25(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    private static final void RothConversionInfoPageTopBar(Modifier modifier, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        long jM21373getBg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1609234180);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1609234180, i5, -1, "com.robinhood.android.rothconversion.RothConversionInfoPageTopBar (RothConversionInfoPager.kt:139)");
            }
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState((z2 && z) ? 1.0f : 0.0f, null, 0.0f, "roth_conversion_info_page_top_bar_alpha", null, composerStartRestartGroup, 3072, 22);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier5 = modifier4;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(RothConversionInfoPager.INSTANCE.m18465getLambda$1399239441$feature_roth_conversion_externalDebug(), Background3.m4872backgroundbw27NRU$default(companion3, Color.m6705copywmQWz5c$default(BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU(), RothConversionInfoPageTopBar$lambda$4(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), ComposableLambda3.rememberComposableLambda(408227907, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPageTopBar$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                    long jM21425getFg0d7_KjU;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i6 & 6) == 0) {
                        i6 |= (i6 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(408227907, i6, -1, "com.robinhood.android.rothconversion.RothConversionInfoPageTopBar.<anonymous>.<anonymous> (RothConversionInfoPager.kt:156)");
                    }
                    if (z) {
                        composer3.startReplaceGroup(1464997190);
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getJet();
                    } else {
                        composer3.startReplaceGroup(1464998053);
                        jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                    }
                    composer3.endReplaceGroup();
                    ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(jM21425getFg0d7_KjU));
                    final Function0<Unit> function02 = function0;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1215407363, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPageTopBar$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i7) {
                            if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1215407363, i7, -1, "com.robinhood.android.rothconversion.RothConversionInfoPageTopBar.<anonymous>.<anonymous>.<anonymous> (RothConversionInfoPager.kt:158)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, Identifier.BackButton), false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | 6, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, z, false, null, null, 0L, null, composerStartRestartGroup, ((i5 << 12) & 458752) | 390, 0, 2008);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1726865322);
            if (z2) {
                Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getBottomCenter());
                if (z) {
                    composer2.startReplaceGroup(-1726859484);
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                } else {
                    composer2.startReplaceGroup(-1726858651);
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU();
                }
                composer2.endReplaceGroup();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierAlign, jM21373getBg30d7_KjU, 0.0f, composer2, 0, 4);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RothConversionInfoPager4.RothConversionInfoPageTopBar$lambda$6(modifier3, z, z2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RothConversionInfoPage(Modifier modifier, final RothConversionInfoViewModel.Page page, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        final boolean z;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2131228687);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(page) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2131228687, i3, -1, "com.robinhood.android.rothconversion.RothConversionInfoPage (RothConversionInfoPager.kt:180)");
                    }
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    z = page.getHeaderImageUrl() == null;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(page);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(RothConversionInfoPager4.RothConversionInfoPage$lambda$11$lambda$10(lazyListStateRememberLazyListState));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(page);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(RothConversionInfoPager4.RothConversionInfoPage$lambda$14$lambda$13(z, lazyListStateRememberLazyListState, snapshotIntState2));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    Modifier modifier5 = modifier4;
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion4, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(page);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RothConversionInfoPager4.RothConversionInfoPage$lambda$21$lambda$18$lambda$17$lambda$16(page, snapshotIntState2, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z2 = z;
                    LazyDslKt.LazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, function1, composerStartRestartGroup, 0, 508);
                    RothConversionInfoPageFooter(null, page.getDisclaimerText(), page.getCtaText(), RothConversionInfoPage$lambda$12(snapshotState4), function0, composerStartRestartGroup, (i3 << 6) & 57344, 1);
                    composerStartRestartGroup.endNode();
                    Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getTopCenter());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RothConversionInfoPager4.RothConversionInfoPage$lambda$21$lambda$20$lambda$19(snapshotIntState2, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    RothConversionInfoPageTopBar(OnRemeasuredModifier2.onSizeChanged(modifierAlign, (Function1) objRememberedValue5), z2, RothConversionInfoPage$lambda$15(snapshotState42), function02, composerStartRestartGroup, i3 & 7168, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RothConversionInfoPager4.RothConversionInfoPage$lambda$22(modifier3, page, function0, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (page.getHeaderImageUrl() == null) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(page);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(RothConversionInfoPager4.RothConversionInfoPage$lambda$11$lambda$10(lazyListStateRememberLazyListState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(page);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(RothConversionInfoPager4.RothConversionInfoPage$lambda$14$lambda$13(z, lazyListStateRememberLazyListState, snapshotIntState2));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier52 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Modifier modifierWeight$default2 = Column5.weight$default(Column6.INSTANCE, companion42, 1.0f, false, 2, null);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChangedInstance = composerStartRestartGroup.changedInstance(page);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RothConversionInfoPager4.RothConversionInfoPage$lambda$21$lambda$18$lambda$17$lambda$16(page, snapshotIntState2, (LazyListScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    Function1 function12 = (Function1) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    boolean z22 = z;
                                    LazyDslKt.LazyColumn(modifierWeight$default2, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, function12, composerStartRestartGroup, 0, 508);
                                    RothConversionInfoPageFooter(null, page.getDisclaimerText(), page.getCtaText(), RothConversionInfoPage$lambda$12(snapshotState43), function0, composerStartRestartGroup, (i3 << 6) & 57344, 1);
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierAlign2 = boxScopeInstance2.align(companion42, companion22.getTopCenter());
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    RothConversionInfoPageTopBar(OnRemeasuredModifier2.onSizeChanged(modifierAlign2, (Function1) objRememberedValue5), z22, RothConversionInfoPage$lambda$15(snapshotState422), function02, composerStartRestartGroup, i3 & 7168, 0);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RothConversionInfoPage$lambda$11$lambda$10(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean RothConversionInfoPage$lambda$14$lambda$13(boolean z, LazyListState lazyListState, SnapshotIntState2 snapshotIntState2) {
        boolean z2;
        if (z) {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
            z2 = lazyListState.getFirstVisibleItemScrollOffset() + snapshotIntState2.getIntValue() >= (lazyListItemInfo != null ? lazyListItemInfo.getSize() : 0);
        } else if (lazyListState.getFirstVisibleItemScrollOffset() > 0) {
        }
        return lazyListState.getFirstVisibleItemIndex() > 0 || z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPage$lambda$21$lambda$18$lambda$17$lambda$16(final RothConversionInfoViewModel.Page page, final SnapshotIntState2 snapshotIntState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, Identifier.Header, null, ComposableLambda3.composableLambdaInstance(-5495266, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPage$1$1$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-5495266, i, -1, "com.robinhood.android.rothconversion.RothConversionInfoPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RothConversionInfoPager.kt:213)");
                }
                RothConversionInfoPager4.RothConversionInfoPageHeader(null, page.getHeaderImageUrl(), snapshotIntState2.getIntValue(), composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        SduiColumns.sduiItems(LazyColumn, extensions2.toPersistentList(page.getContent()), GenericAction.class, null, null, HorizontalPadding.Default);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPage$lambda$21$lambda$20$lambda$19(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    public static final void RothConversionInfoPager(Modifier modifier, final RothConversionInfoViewState.Loaded state, final RothConversionInfoPager3 callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(385081913);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385081913, i3, -1, "com.robinhood.android.rothconversion.RothConversionInfoPager (RothConversionInfoPager.kt:257)");
            }
            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = (i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RothConversionInfoPager4.RothConversionInfoPager$lambda$27$lambda$26(callbacks, snapshotIntState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(snapshotIntState2.getIntValue() != 0, function0, composerStartRestartGroup, 0, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Integer numValueOf = Integer.valueOf(snapshotIntState2.getIntValue());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RothConversionInfoPager4.RothConversionInfoPager$lambda$33$lambda$32((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1519361789, true, new C278022(state, sduiActionHandlerCurrentActionHandler, callbacks, function0, snapshotIntState2), composerStartRestartGroup, 54);
            Modifier modifier5 = modifier4;
            AnimatedContentKt.AnimatedContent(numValueOf, modifierFillMaxSize$default, function1, null, "roth_conversion_info_page", null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 1597824, 40);
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            final long jM21255getDayXrayLight0d7_KjU = state.getPages().get(snapshotIntState2.getIntValue()).getHeaderImageUrl() != null ? BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU() : jM21371getBg0d7_KjU;
            Color colorM6701boximpl = Color.m6701boximpl(jM21255getDayXrayLight0d7_KjU);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21255getDayXrayLight0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RothConversionInfoPager4.RothConversionInfoPager$lambda$36$lambda$35(systemUiControllerRememberSystemUiController, jM21255getDayXrayLight0d7_KjU, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue4 = function12;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RothConversionInfoPager4.RothConversionInfoPager$lambda$37(modifier3, state, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RothConversionInfoPager$lambda$27$lambda$26(RothConversionInfoPager3 rothConversionInfoPager3, SnapshotIntState2 snapshotIntState2) {
        if (snapshotIntState2.getIntValue() != 0) {
            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() - 1);
        } else {
            rothConversionInfoPager3.onExitInfoPagesClicked();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform RothConversionInfoPager$lambda$33$lambda$32(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(RothConversionInfoPager4.RothConversionInfoPager$lambda$33$lambda$32$lambda$28(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(RothConversionInfoPager4.RothConversionInfoPager$lambda$33$lambda$32$lambda$29(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RothConversionInfoPager4.RothConversionInfoPager$lambda$33$lambda$32$lambda$30(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RothConversionInfoPager4.RothConversionInfoPager$lambda$33$lambda$32$lambda$31(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* compiled from: RothConversionInfoPager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPager$2 */
    static final class C278022 implements Function4<AnimatedContentScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
        final /* synthetic */ Function0<Unit> $backClickedCallback;
        final /* synthetic */ RothConversionInfoPager3 $callbacks;
        final /* synthetic */ SnapshotIntState2 $currentPageIndex$delegate;
        final /* synthetic */ RothConversionInfoViewState.Loaded $state;

        /* JADX WARN: Multi-variable type inference failed */
        C278022(RothConversionInfoViewState.Loaded loaded, SduiActionHandler<? super GenericAction> sduiActionHandler, RothConversionInfoPager3 rothConversionInfoPager3, Function0<Unit> function0, SnapshotIntState2 snapshotIntState2) {
            this.$state = loaded;
            this.$actionHandler = sduiActionHandler;
            this.$callbacks = rothConversionInfoPager3;
            this.$backClickedCallback = function0;
            this.$currentPageIndex$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer, Integer num2) {
            invoke(animatedContentScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1519361789, i2, -1, "com.robinhood.android.rothconversion.RothConversionInfoPager.<anonymous> (RothConversionInfoPager.kt:286)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            RothConversionInfoViewModel.Page page = this.$state.getPages().get(i);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(this.$actionHandler) | composer.changedInstance(this.$callbacks);
            final RothConversionInfoViewState.Loaded loaded = this.$state;
            final SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
            final RothConversionInfoPager3 rothConversionInfoPager3 = this.$callbacks;
            final SnapshotIntState2 snapshotIntState2 = this.$currentPageIndex$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPager$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RothConversionInfoPager4.C278022.invoke$lambda$1$lambda$0(loaded, sduiActionHandler, rothConversionInfoPager3, snapshotIntState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RothConversionInfoPager4.RothConversionInfoPage(modifierFillMaxSize$default, page, Haptics.hapticClick((Function0) objRememberedValue, composer, 0), Haptics.hapticClick(this.$backClickedCallback, composer, 0), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RothConversionInfoViewState.Loaded loaded, SduiActionHandler sduiActionHandler, RothConversionInfoPager3 rothConversionInfoPager3, SnapshotIntState2 snapshotIntState2) {
            if (RothConversionInfoPager4.RothConversionInfoPager$lambda$24(snapshotIntState2) != loaded.getPages().size() - 1) {
                RothConversionInfoPager4.RothConversionInfoPager$lambda$25(snapshotIntState2, RothConversionInfoPager4.RothConversionInfoPager$lambda$24(snapshotIntState2) + 1);
            } else {
                RothConversionInfoEvent navigationEvent = loaded.getNavigationEvent();
                if (navigationEvent instanceof RothConversionInfoEvent.Alert) {
                    GenericActionHandlerKt.handleAlert(sduiActionHandler, ((RothConversionInfoEvent.Alert) loaded.getNavigationEvent()).getContent(), GenericAlertMobilePresentationStyle.BOTTOM_SHEET);
                } else {
                    if (!(navigationEvent instanceof RothConversionInfoEvent.Transfer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rothConversionInfoPager3.onInfoPagesCtaClicked();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult RothConversionInfoPager$lambda$36$lambda$35(final SystemUiController systemUiController, long j, final long j2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.rothconversion.RothConversionInfoPagerKt$RothConversionInfoPager$lambda$36$lambda$35$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j2, false, null, 6, null);
            }
        };
    }
}

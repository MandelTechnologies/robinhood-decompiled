package com.robinhood.android.common.portfolio.assetHomes;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderState;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libs.tabs.TooltipTags;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.compose.LocalityStringResources2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AssetHomeHeaderRowComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0014*\u00020\u0005H\u0002\"\u0010\u0010\u0019\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u001a\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"AssetHomeHeaderRowComposable", "", "accountNumber", "", "assetType", "Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;", "portfolioAccountType", "Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onAssetHomeEntered", "Lkotlin/Function1;", "tooltipType", "Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;", "modifier", "Landroidx/compose/ui/Modifier;", "onTooltipAppear", "Lcom/robinhood/rosetta/eventlogging/PositionsInstrumentType;", "onTooltipClicked", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "rosettaPositionsInstrumentType", "AssetHomeHeaderTooltipId", "HeaderIdentifier", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetHomeHeaderRowComposable {
    public static final String AssetHomeHeaderTooltipId = "asset_home_header_tooltip";
    public static final String HeaderIdentifier = "asset-home-header";

    /* compiled from: AssetHomeHeaderRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ExtendedAssetType.values().length];
            try {
                iArr[ExtendedAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtendedAssetType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExtendedAssetType.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExtendedAssetType.FUTURES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AssetHomeHeaderState.TooltipType.values().length];
            try {
                iArr2[AssetHomeHeaderState.TooltipType.ASSET_HOME_ENTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AssetHomeHeaderState.TooltipType.OPTIONS_MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LayoutDirection.values().length];
            try {
                iArr3[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeHeaderRowComposable$lambda$12(String str, ExtendedAssetType extendedAssetType, PortfolioAccountType portfolioAccountType, UIComponent uIComponent, Screen screen, Function1 function1, AssetHomeHeaderState.TooltipType tooltipType, Modifier modifier, Function1 function12, Function0 function0, int i, int i2, Composer composer, int i3) {
        AssetHomeHeaderRowComposable(str, extendedAssetType, portfolioAccountType, uIComponent, screen, function1, tooltipType, modifier, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeHeaderRowComposable$lambda$1$lambda$0(PositionsInstrumentType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v46, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r2v50, types: [androidx.compose.ui.Modifier] */
    public static final void AssetHomeHeaderRowComposable(final String accountNumber, final ExtendedAssetType assetType, final PortfolioAccountType portfolioAccountType, final UIComponent<? extends AccountPositionAction> uIComponent, final Screen sourceScreen, final Function1<? super ExtendedAssetType, Unit> onAssetHomeEntered, final AssetHomeHeaderState.TooltipType tooltipType, Modifier modifier, Function1<? super PositionsInstrumentType, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super PositionsInstrumentType, Unit> function12;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final ExtendedAssetType extendedAssetType;
        final Function0<Unit> function03;
        int i5;
        String str;
        Modifier.Companion companion;
        int i6;
        Modifier.Companion companion2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        String strRegionGateStringResource;
        String str2;
        String strStringResource;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(onAssetHomeEntered, "onAssetHomeEntered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1587238883);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(assetType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(portfolioAccountType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uIComponent) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sourceScreen) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAssetHomeEntered) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(tooltipType == null ? -1 : tooltipType.ordinal()) ? 1048576 : 524288;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        int i8 = i2 & 256;
        if (i8 != 0) {
            i3 |= 100663296;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
            }
        }
        int i9 = i2 & 512;
        if (i9 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function03 = function0;
            extendedAssetType = assetType;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
            if (i8 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetHomeHeaderRowComposable.AssetHomeHeaderRowComposable$lambda$1$lambda$0((PositionsInstrumentType) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function12 = (Function1) objRememberedValue;
            }
            if (i9 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                function02 = (Function0) objRememberedValue2;
            } else {
                function02 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587238883, i3, -1, "com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposable (AssetHomeHeaderRowComposable.kt:62)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i10 = i3 & 112;
            boolean zChangedInstance = (i10 == 32) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) == 4) | ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(sourceScreen) | ((458752 & i3) == 131072);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i4 = i3;
                Function0 function04 = new Function0() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetHomeHeaderRowComposable.AssetHomeHeaderRowComposable$lambda$5$lambda$4(assetType, navigator, context, accountNumber, portfolioAccountType, sourceScreen, onAssetHomeEntered);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function04);
                objRememberedValue3 = function04;
            } else {
                i4 = i3;
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            Function1<? super PositionsInstrumentType, Unit> function13 = function12;
            composer2 = composerStartRestartGroup;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier3, false, null, null, (Function0) objRememberedValue3, 7, null), new UserInteractionEventDescriptor(null, sourceScreen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rosettaPositionsInstrumentType(assetType), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -8193, -1, 16383, null), new Component(Component.ComponentType.SECTION_HEADER, HeaderIdentifier, null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (uIComponent == null) {
                composer2.startReplaceGroup(582370556);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                function12 = function13;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion5, bentoTheme.getSpacing(composer2, i11).m21591getLargeD9Ej5fM(), 0.0f, composer2, 6, 2);
                composer2 = composer2;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g0);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i12 = iArr[assetType.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        composer2.startReplaceGroup(1675177764);
                        strStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_options_title, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (i12 == 3) {
                        composer2.startReplaceGroup(1675180867);
                        strStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_crypto_title, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (i12 != 4) {
                            composer2.startReplaceGroup(1675165580);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1675183972);
                        strStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_futures_title, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    extendedAssetType = assetType;
                    str = strStringResource;
                    i5 = -1;
                } else {
                    composer2.startReplaceGroup(1675167466);
                    extendedAssetType = assetType;
                    i5 = -1;
                    String strRegionGateStringResource2 = LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C11511R.string.asset_equities_title, C11511R.string.asset_equities_title_without_etf, null, composer2, 0, 8);
                    composer2.endReplaceGroup();
                    str = strRegionGateStringResource2;
                }
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i11).getDisplayCapsuleMedium();
                int i13 = tooltipType == null ? i5 : WhenMappings.$EnumSwitchMapping$1[tooltipType.ordinal()];
                if (i13 == i5) {
                    function03 = function02;
                    companion = companion5;
                    i6 = 0;
                    composer2.startReplaceGroup(1675258592);
                    composer2.endReplaceGroup();
                    companion2 = companion;
                } else if (i13 == 1) {
                    Function0<Unit> function05 = function02;
                    i6 = 0;
                    composer2.startReplaceGroup(1675194079);
                    String strStringResource2 = StringResources_androidKt.stringResource(C11511R.string.asset_header_tooltip, composer2, 0);
                    TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, SetsKt.setOf(TooltipTags.tabBarTooltipTag), null, 10, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean z = ((i4 & 234881024) == 67108864) | (i10 == 32);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AssetHomeHeaderRowComposable.m1844xb82f059b(function12, extendedAssetType, (View) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    function03 = function05;
                    ?? r2 = com.robinhood.tooltips.ModifiersKt.tooltip$default(companion5, strStringResource2, layout, new TooltipData.Behavior(null, null, (Function1) objRememberedValue4, function05, 3, null), "asset_home_header_tooltip_" + extendedAssetType.name(), false, 16, null);
                    companion = companion5;
                    composer2.endReplaceGroup();
                    companion2 = r2;
                } else {
                    if (i13 != 2) {
                        composer2.startReplaceGroup(1675191592);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(1675236416);
                    i6 = 0;
                    String strStringResource3 = StringResources_androidKt.stringResource(C11511R.string.options_market_tooltip, composer2, 0);
                    TooltipData.Layout layout2 = new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, SetsKt.setOf(TooltipTags.tabBarTooltipTag), null, 10, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean z2 = ((i4 & 234881024) == 67108864) | (i10 == 32);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (z2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AssetHomeHeaderRowComposable.m1845xa0c1e7db(function12, extendedAssetType, (View) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Function0<Unit> function06 = function02;
                    ?? r22 = com.robinhood.tooltips.ModifiersKt.tooltip$default(companion5, strStringResource3, layout2, new TooltipData.Behavior(null, null, (Function1) objRememberedValue5, function06, 3, null), "options_market_tooltip", false, 16, null);
                    composer2.endReplaceGroup();
                    companion2 = r22;
                    function03 = function06;
                    companion = companion5;
                }
                BentoText2.m20747BentoText38GnDrw(str, companion2, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8188);
                int i14 = WhenMappings.$EnumSwitchMapping$2[((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection())).ordinal()];
                if (i14 == 1) {
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_RIGHT_16;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CARET_LEFT_16;
                }
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(serverToBentoAssetMapper2);
                long jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i11).m21427getFg30d7_KjU();
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                int i15 = iArr[extendedAssetType.ordinal()];
                if (i15 == 1) {
                    composer2.startReplaceGroup(1675282214);
                    strRegionGateStringResource = LocalityStringResources2.regionGateStringResource(EtfRegionGate.INSTANCE, C11511R.string.asset_equities_content_description, C11511R.string.asset_equities_content_description_without_etf, null, composer2, 0, 8);
                    composer2.endReplaceGroup();
                } else if (i15 == 2) {
                    composer2.startReplaceGroup(1675293394);
                    strRegionGateStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_options_content_description, composer2, i6);
                    composer2.endReplaceGroup();
                } else if (i15 == 3) {
                    composer2.startReplaceGroup(1675296945);
                    strRegionGateStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_crypto_content_description, composer2, i6);
                    composer2.endReplaceGroup();
                } else {
                    if (i15 != 4) {
                        composer2.startReplaceGroup(1675280463);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(394710771);
                    composer2.endReplaceGroup();
                    str2 = null;
                    BentoIcon2.m20644BentoIconFU0evQE(size16, str2, jM21427getFg30d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer2, BentoIcon4.Size16.$stable, 48);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                str2 = strRegionGateStringResource;
                BentoIcon2.m20644BentoIconFU0evQE(size16, str2, jM21427getFg30d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer2, BentoIcon4.Size16.$stable, 48);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                extendedAssetType = assetType;
                function12 = function13;
                function03 = function02;
                composer2.startReplaceGroup(586914691);
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent);
                composer2.startReplaceGroup(-1772220517);
                SduiColumns.SduiColumn(immutableList3PersistentListOf, AccountPositionAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), companion3.getStart(), false, composer2, 0, 0);
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Function1<? super PositionsInstrumentType, Unit> function14 = function12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final ExtendedAssetType extendedAssetType2 = extendedAssetType;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.assetHomes.AssetHomeHeaderRowComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetHomeHeaderRowComposable.AssetHomeHeaderRowComposable$lambda$12(accountNumber, extendedAssetType2, portfolioAccountType, uIComponent, sourceScreen, onAssetHomeEntered, tooltipType, modifier4, function14, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeHeaderRowComposable$lambda$5$lambda$4(ExtendedAssetType extendedAssetType, Navigator navigator, Context context, String str, PortfolioAccountType portfolioAccountType, Screen screen, Function1 function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[extendedAssetType.ordinal()];
        if (i == 1) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new AssetHomeContract.Key(str, portfolioAccountType, AssetType.EQUITY, screen, (FragmentTab) null, 16, (DefaultConstructorMarker) null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (i == 2) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new AssetHomeContract.Key(str, portfolioAccountType, AssetType.OPTIONS, screen, (FragmentTab) null, 16, (DefaultConstructorMarker) null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (i == 3) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, TabLinkIntentKey.Crypto.INSTANCE, null, false, null, null, 60, null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.showFragment$default(navigator, context, new FuturesAssetHomeFragmentKey(str, screen), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        function1.invoke(extendedAssetType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AssetHomeHeaderRowComposable$lambda$11$lambda$10$lambda$7$lambda$6 */
    public static final Unit m1844xb82f059b(Function1 function1, ExtendedAssetType extendedAssetType, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(rosettaPositionsInstrumentType(extendedAssetType));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AssetHomeHeaderRowComposable$lambda$11$lambda$10$lambda$9$lambda$8 */
    public static final Unit m1845xa0c1e7db(Function1 function1, ExtendedAssetType extendedAssetType, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(rosettaPositionsInstrumentType(extendedAssetType));
        return Unit.INSTANCE;
    }

    private static final PositionsInstrumentType rosettaPositionsInstrumentType(ExtendedAssetType extendedAssetType) {
        int i = WhenMappings.$EnumSwitchMapping$0[extendedAssetType.ordinal()];
        if (i == 1) {
            return PositionsInstrumentType.EQUITY;
        }
        if (i == 2) {
            return PositionsInstrumentType.OPTIONS;
        }
        if (i == 3) {
            return PositionsInstrumentType.CRYPTO;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return PositionsInstrumentType.FUTURES;
    }
}

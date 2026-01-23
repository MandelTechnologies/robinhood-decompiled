package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.contracts.PnlHubContract;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomePositionListSections.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$assetHomePnlHubEntryPoint$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AssetHomePositionListSections3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ AssetHomeState $assetHomeState;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function0<Unit> $onNavigate;
    final /* synthetic */ boolean $pnlUpdatesEnabled;
    final /* synthetic */ boolean $showNewTag;

    AssetHomePositionListSections3(Function0<Unit> function0, AssetHomeState assetHomeState, Navigator navigator, boolean z, boolean z2) {
        this.$onNavigate = function0;
        this.$assetHomeState = assetHomeState;
        this.$navigator = navigator;
        this.$pnlUpdatesEnabled = z;
        this.$showNewTag = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, AssetHomeState assetHomeState, Navigator navigator, Context context) {
        String str;
        String str2;
        function0.invoke();
        Screen screen = userInteractionEventDescriptor.getScreen();
        Component.ComponentType componentType = Component.ComponentType.ROW;
        AssetType assetType = assetHomeState.getAssetType();
        AssetType assetType2 = AssetType.EQUITY;
        if (assetType == assetType2) {
            str = "equities_pnl_entry_point";
        } else {
            str = "options_pnl_entry_point";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, str, null, 4, null), null, null, false, 57, null);
        if (assetHomeState.getAssetType() == assetType2) {
            str2 = AssetHomePositionListSections.EQUITIES_PNL_ENTRY_POINT_SOURCE;
        } else {
            str2 = AssetHomePositionListSections.OPTIONS_PNL_ENTRY_POINT_SOURCE;
        }
        Navigator.DefaultImpls.showFragment$default(navigator, context, new PnlHubContract.Key.AccountNumberKey(assetHomeState.getAccountNumber(), str2, CollectionsKt.listOf(AssetHomePositionListSections.toAssetClass(assetHomeState.getAssetType())), null, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        Object obj;
        float f;
        Composer composer2;
        int i2;
        boolean z;
        String strStringResource;
        Modifier.Companion companion;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(400515858, i, -1, "com.robinhood.android.assethomes.assetHomePnlHubEntryPoint.<anonymous>.<anonymous>.<anonymous> (AssetHomePositionListSections.kt:69)");
        }
        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i5 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$onNavigate) | composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor2) | composer.changedInstance(this.$assetHomeState) | composer.changedInstance(this.$navigator) | composer.changedInstance(context);
        final Function0<Unit> function0 = this.$onNavigate;
        final AssetHomeState assetHomeState = this.$assetHomeState;
        final Navigator navigator = this.$navigator;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomePositionListSectionsKt$assetHomePnlHubEntryPoint$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetHomePositionListSections3.invoke$lambda$1$lambda$0(function0, current, userInteractionEventDescriptor2, assetHomeState, navigator, context);
                }
            };
            userInteractionEventDescriptor = userInteractionEventDescriptor2;
            composer.updateRememberedValue(objRememberedValue);
        } else {
            userInteractionEventDescriptor = userInteractionEventDescriptor2;
        }
        composer.endReplaceGroup();
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ROW, this.$assetHomeState.getAssetType() == AssetType.EQUITY ? "equities_pnl_entry_point" : "options_pnl_entry_point", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        boolean z2 = this.$pnlUpdatesEnabled;
        boolean z3 = this.$showNewTag;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(1132781511);
        if (colorM21927getDividerColorQN2ZGVo != null) {
            i2 = 1;
            composer2 = composer;
            f = 0.0f;
            obj = null;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composer2, 0, 4);
        } else {
            obj = null;
            f = 0.0f;
            composer2 = composer;
            i2 = 1;
        }
        composer2.endReplaceGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion2, ((C2002Dp) composer2.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM()), f, i2, obj);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
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
        Modifier modifierAlign = row6.align(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), companion3.getCenterVertically());
        if (z2) {
            composer2.startReplaceGroup(2045069975);
            z = false;
            strStringResource = StringResources_androidKt.stringResource(C9612R.string.closed_pnl_hub_entry_point, composer2, 0);
            composer2.endReplaceGroup();
        } else {
            z = false;
            composer2.startReplaceGroup(2045189790);
            strStringResource = StringResources_androidKt.stringResource(C9612R.string.pnl_hub_entry_point, composer2, 0);
            composer2.endReplaceGroup();
        }
        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAlign, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer, 0, 0, 8184);
        Composer composer3 = composer;
        composer3.startReplaceGroup(-72564062);
        if (z3) {
            companion = companion2;
            i4 = 0;
            i3 = i5;
            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C11511R.string.pnl_new_label, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, null, null, false, null, null, composer, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            composer3 = composer;
        } else {
            companion = companion2;
            i3 = i5;
            i4 = 0;
        }
        composer3.endReplaceGroup();
        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_RIGHT_12.getResourceId(), composer3, i4), (String) null, row6.align(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(16)), companion3.getCenterVertically()), bentoTheme.getColors(composer3, i3).m21427getFg30d7_KjU(), composer, 48, 0);
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

package com.robinhood.android.options.p208ui.detail;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.options.tradebar.C11453R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageToolbarState;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageToolbarMenu.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"OptionsDetailPageToolbarMenu", "", "menuItemStates", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "onToolbarMenuItemTapped", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageToolbarMenuKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageToolbarMenu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageToolbarMenu$lambda$6(List list, Function1 function1, int i, Composer composer, int i2) {
        OptionsDetailPageToolbarMenu(list, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionsDetailPageToolbarMenu(final List<? extends OptionsDetailPageToolbarState.MenuItemState> menuItemStates, final Function1<? super OptionsDetailPageToolbarState.MenuItemState, Unit> onToolbarMenuItemTapped, Composer composer, final int i) {
        int i2;
        Iterator it;
        int i3;
        int i4;
        int i5;
        int i6;
        String strStringResource;
        Intrinsics.checkNotNullParameter(menuItemStates, "menuItemStates");
        Intrinsics.checkNotNullParameter(onToolbarMenuItemTapped, "onToolbarMenuItemTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1644679390);
        int i7 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(menuItemStates) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i8 = 32;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onToolbarMenuItemTapped) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644679390, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageToolbarMenu (OptionsDetailPageToolbarMenu.kt:22)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i9 = 0;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1712985147);
            Iterator it2 = menuItemStates.iterator();
            while (it2.hasNext()) {
                final OptionsDetailPageToolbarState.MenuItemState menuItemState = (OptionsDetailPageToolbarState.MenuItemState) it2.next();
                if (menuItemState instanceof OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier) {
                    composerStartRestartGroup.startReplaceGroup(-1035079653);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i10 = (composerStartRestartGroup.changed(menuItemState) ? 1 : 0) | ((i2 & 112) != i8 ? i9 : 1);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageToolbarMenuKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsDetailPageToolbarMenu.OptionsDetailPageToolbarMenu$lambda$5$lambda$4$lambda$1$lambda$0(onToolbarMenuItemTapped, menuItemState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM4893clickableXHw0xAI$default, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    composerStartRestartGroup.startReplaceGroup(1352091223);
                    OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier viewUnderlier = (OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier) menuItemState;
                    if (viewUnderlier.getSymbol() != null) {
                        strStringResource = StringResources_androidKt.stringResource(C11453R.string.option_detail_underlying_trade_bar_link_label, new Object[]{viewUnderlier.getSymbol()}, composerStartRestartGroup, i9);
                    } else {
                        strStringResource = "";
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i12 = i2;
                    Composer composer2 = composerStartRestartGroup;
                    i3 = i12;
                    it = it2;
                    i4 = i7;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i11).getTextM(), composer2, 817913856, 0, 7528);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = 0;
                    i6 = 32;
                } else {
                    it = it2;
                    i3 = i2;
                    i4 = i7;
                    if (!(menuItemState instanceof OptionsDetailPageToolbarState.MenuItemState.PictureInPicture)) {
                        composerStartRestartGroup.startReplaceGroup(1352082266);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1034149653);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM(), 0.0f, i4, null);
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.PICTURE_IN_PICTURE_24);
                    i5 = 0;
                    String strStringResource2 = StringResources_androidKt.stringResource(C11453R.string.option_detail_underlying_trader_bar_pip_description, composerStartRestartGroup, 0);
                    long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i13).m21425getFg0d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i14 = (composerStartRestartGroup.changed(menuItemState) ? 1 : 0) | ((i3 & 112) != 32 ? 0 : 1);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i14 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageToolbarMenuKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsDetailPageToolbarMenu.OptionsDetailPageToolbarMenu$lambda$5$lambda$4$lambda$3$lambda$2(onToolbarMenuItemTapped, menuItemState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i6 = 32;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource2, jM21425getFg0d7_KjU, modifierM5144paddingVpY3zN4$default, (Function0) objRememberedValue2, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i7 = i4;
                i9 = i5;
                i8 = i6;
                i2 = i3;
                it2 = it;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageToolbarMenuKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageToolbarMenu.OptionsDetailPageToolbarMenu$lambda$6(menuItemStates, onToolbarMenuItemTapped, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageToolbarMenu$lambda$5$lambda$4$lambda$1$lambda$0(Function1 function1, OptionsDetailPageToolbarState.MenuItemState menuItemState) {
        function1.invoke(menuItemState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDetailPageToolbarMenu$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, OptionsDetailPageToolbarState.MenuItemState menuItemState) {
        function1.invoke(menuItemState);
        return Unit.INSTANCE;
    }
}

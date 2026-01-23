package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiPollableCells.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"SduiPollableScreenerTableItem", "", "ActionT", "Landroid/os/Parcelable;", "modifier", "Landroidx/compose/ui/Modifier;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "instrumentId", "", "pollableViewModel", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableScreenerItemsViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableScreenerItemsViewModel;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "state", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPollableCells {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPollableScreenerTableItem$lambda$5(Modifier modifier, UIComponent uIComponent, String str, SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel, int i, int i2, Composer composer, int i3) {
        SduiPollableScreenerTableItem(modifier, uIComponent, str, sduiPollableScreenerItemsViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiPollableScreenerTableItem(Modifier modifier, final UIComponent<? extends ActionT> component, final String instrumentId, SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel2;
        int i4;
        Modifier modifier3;
        String str;
        int i5;
        SnapshotState snapshotState;
        SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel3;
        boolean z;
        Composer composer2;
        final SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel4;
        long jM21452getNegative0d7_KjU;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1312608039);
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
            i3 |= composerStartRestartGroup.changedInstance(component) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(instrumentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                sduiPollableScreenerItemsViewModel2 = sduiPollableScreenerItemsViewModel;
                int i7 = composerStartRestartGroup.changedInstance(sduiPollableScreenerItemsViewModel2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                sduiPollableScreenerItemsViewModel2 = sduiPollableScreenerItemsViewModel;
            }
            i3 |= i7;
        } else {
            sduiPollableScreenerItemsViewModel2 = sduiPollableScreenerItemsViewModel;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            sduiPollableScreenerItemsViewModel4 = sduiPollableScreenerItemsViewModel2;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 8) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    i4 = 256;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SduiPollableScreenerItemsViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    sduiPollableScreenerItemsViewModel2 = (SduiPollableScreenerItemsViewModel) viewModel;
                    i3 &= -7169;
                } else {
                    i4 = 256;
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier3 = modifier2;
                i4 = 256;
            }
            int i8 = i3;
            SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel5 = sduiPollableScreenerItemsViewModel2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1312608039, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerTableItem (SduiPollableCells.kt:34)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_emdash, composerStartRestartGroup, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(component);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                int i9 = i4;
                str = strStringResource;
                i5 = i9;
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(new SduiPollableViewState(null, component, str, 1, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i5 = i4;
                str = strStringResource;
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sduiPollableScreenerItemsViewModel5) | composerStartRestartGroup.changedInstance(component) | ((i8 & 896) == i5) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(snapshotState2) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                sduiPollableScreenerItemsViewModel3 = sduiPollableScreenerItemsViewModel5;
                z = true;
                SduiPollableCells2 sduiPollableCells2 = new SduiPollableCells2(sduiPollableScreenerItemsViewModel3, component, instrumentId, str, coroutineScope, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(sduiPollableCells2);
                objRememberedValue3 = sduiPollableCells2;
            } else {
                snapshotState = snapshotState2;
                sduiPollableScreenerItemsViewModel3 = sduiPollableScreenerItemsViewModel5;
                z = true;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(component, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i8 >> 3) & 14);
            if (SduiPollableScreenerTableItem$lambda$1(snapshotState).getHasLoaded()) {
                composerStartRestartGroup.startReplaceGroup(-1770149624);
                if (SduiPollableScreenerTableItem$lambda$1(snapshotState).getIsPositiveDelta()) {
                    composerStartRestartGroup.startReplaceGroup(-1304026001);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1304024977);
                    jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                long j = jM21452getNegative0d7_KjU;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                ServerToBentoAssetMapper2 icon = SduiPollableScreenerTableItem$lambda$1(snapshotState).getIcon();
                composerStartRestartGroup.startReplaceGroup(-886189233);
                if (icon != null) {
                    modifier2 = modifier3;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(icon), "", j, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(SduiPollableScreenerTableItem$lambda$1(snapshotState).getPriceText(), null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8174);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                modifier2 = modifier3;
                composerStartRestartGroup.startReplaceGroup(-1769305494);
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(SduiPollableScreenerTableItem$lambda$1(snapshotState).getPriceText(), ModifiersKt.bentoPlaceholder(Modifier.INSTANCE, z, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM())), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            sduiPollableScreenerItemsViewModel4 = sduiPollableScreenerItemsViewModel3;
        }
        final Modifier modifier5 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableCellsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPollableCells.SduiPollableScreenerTableItem$lambda$5(modifier5, component, instrumentId, sduiPollableScreenerItemsViewModel4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SduiPollableViewState SduiPollableScreenerTableItem$lambda$1(SnapshotState<SduiPollableViewState> snapshotState) {
        return snapshotState.getValue();
    }
}

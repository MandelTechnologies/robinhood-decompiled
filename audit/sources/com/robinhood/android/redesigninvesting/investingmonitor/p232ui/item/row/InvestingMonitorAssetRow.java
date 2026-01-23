package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.InvestingMonitorAssetDuxo;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.InvestingMonitorAssetItemViewState;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Asset;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorAssetRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a[\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"InvestingMonitorAssetRow", "", "asset", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;", "dragInProgress", "", "positionInList", "", "totalCountInList", "modifier", "Landroidx/compose/ui/Modifier;", "assetItemDuxo", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo;", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;ZIILandroidx/compose/ui/Modifier;Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo;Landroidx/compose/runtime/Composer;II)V", "InvestingMonitorAssetRowInternal", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "futureChart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "formattedPercentChange", "", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;ZIILcom/robinhood/android/redesign/model/AssetQuote;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowStart", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;Lcom/robinhood/android/redesign/model/AssetQuote;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowMiddle", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorAsset;Lcom/robinhood/models/serverdriven/experimental/api/Chart;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowEnd", "formattedPercentageChange", "(Lcom/robinhood/android/redesign/model/AssetQuote;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investing-monitor_externalDebug", "viewState", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorAssetRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorAssetRow$lambda$4(InvestingMonitorAsset investingMonitorAsset, boolean z, int i, int i2, Modifier modifier, InvestingMonitorAssetDuxo investingMonitorAssetDuxo, int i3, int i4, Composer composer, int i5) {
        InvestingMonitorAssetRow(investingMonitorAsset, z, i, i2, modifier, investingMonitorAssetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorAssetRowInternal$lambda$12(InvestingMonitorAsset investingMonitorAsset, boolean z, int i, int i2, AssetQuote assetQuote, Chart chart, String str, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        InvestingMonitorAssetRowInternal(investingMonitorAsset, z, i, i2, assetQuote, chart, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowEnd$lambda$18(AssetQuote assetQuote, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowEnd(assetQuote, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowMiddle$lambda$15(InvestingMonitorAsset investingMonitorAsset, Chart chart, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowMiddle(investingMonitorAsset, chart, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStart$lambda$14(InvestingMonitorAsset investingMonitorAsset, AssetQuote assetQuote, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowStart(investingMonitorAsset, assetQuote, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingMonitorAssetRow(final InvestingMonitorAsset asset, final boolean z, final int i, final int i2, Modifier modifier, InvestingMonitorAssetDuxo investingMonitorAssetDuxo, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        InvestingMonitorAssetDuxo investingMonitorAssetDuxo2;
        int i8;
        Modifier modifier3;
        int i9;
        final InvestingMonitorAssetDuxo investingMonitorAssetDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final InvestingMonitorAssetDuxo investingMonitorAssetDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Composer composerStartRestartGroup = composer.startRestartGroup(2093625802);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(asset) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            i6 = i;
        } else {
            i6 = i;
            if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
            i7 = i2;
        } else {
            i7 = i2;
            if ((i3 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(i7) ? 2048 : 1024;
            }
        }
        int i10 = i4 & 16;
        if (i10 == 0) {
            if ((i3 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i3) != 0) {
                if ((i4 & 32) == 0) {
                    investingMonitorAssetDuxo2 = investingMonitorAssetDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(investingMonitorAssetDuxo2) ? 131072 : 65536;
                    i5 |= i11;
                } else {
                    investingMonitorAssetDuxo2 = investingMonitorAssetDuxo;
                }
                i5 |= i11;
            } else {
                investingMonitorAssetDuxo2 = investingMonitorAssetDuxo;
            }
            i8 = i5;
            if ((74899 & i8) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i4 & 32) == 0) {
                        String str = "InvestingMonitorAsset-" + asset.getInstrumentType() + "-" + asset.getMetadataId();
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InvestingMonitorAssetDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$InvestingMonitorAssetRow$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$InvestingMonitorAssetRow$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i9 = i8 & (-458753);
                        investingMonitorAssetDuxo3 = (InvestingMonitorAssetDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2093625802, i9, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRow (InvestingMonitorAssetRow.kt:62)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(investingMonitorAssetDuxo3) | composerStartRestartGroup.changedInstance(asset);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InvestingMonitorAssetRow.InvestingMonitorAssetRow$lambda$2$lambda$1(investingMonitorAssetDuxo3, asset, (LifecycleResumePauseEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(asset, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i9 & 14, 2);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(investingMonitorAssetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    InvestingMonitorAssetRowInternal(asset, z, i6, i7, InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle).getAssetQuote(), InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle).getFutureChart(), InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle).getFormattedPercentChange(), modifier3, composerStartRestartGroup, (i9 & 8190) | ((i9 << 9) & 29360128), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    investingMonitorAssetDuxo4 = investingMonitorAssetDuxo3;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i4 & 32) != 0) {
                        i8 &= -458753;
                    }
                    modifier3 = modifier2;
                }
                i9 = i8;
                investingMonitorAssetDuxo3 = investingMonitorAssetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(investingMonitorAssetDuxo3) | composerStartRestartGroup.changedInstance(asset);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestingMonitorAssetRow.InvestingMonitorAssetRow$lambda$2$lambda$1(investingMonitorAssetDuxo3, asset, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LifecycleEffectKt.LifecycleResumeEffect(asset, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i9 & 14, 2);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(investingMonitorAssetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    InvestingMonitorAssetRowInternal(asset, z, i6, i7, InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getAssetQuote(), InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getFutureChart(), InvestingMonitorAssetRow$lambda$3(snapshotState4CollectAsStateWithLifecycle2).getFormattedPercentChange(), modifier3, composerStartRestartGroup, (i9 & 8190) | ((i9 << 9) & 29360128), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    investingMonitorAssetDuxo4 = investingMonitorAssetDuxo3;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                investingMonitorAssetDuxo4 = investingMonitorAssetDuxo2;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorAssetRow.InvestingMonitorAssetRow$lambda$4(asset, z, i, i2, modifier4, investingMonitorAssetDuxo4, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        modifier2 = modifier;
        if ((196608 & i3) != 0) {
        }
        i8 = i5;
        if ((74899 & i8) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i10 == 0) {
                }
                if ((i4 & 32) == 0) {
                    i9 = i8;
                    investingMonitorAssetDuxo3 = investingMonitorAssetDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(investingMonitorAssetDuxo3) | composerStartRestartGroup.changedInstance(asset);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InvestingMonitorAssetRow$lambda$2$lambda$1(InvestingMonitorAssetDuxo investingMonitorAssetDuxo, InvestingMonitorAsset investingMonitorAsset, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final CompletableJob completableJobBind = investingMonitorAssetDuxo.bind(investingMonitorAsset);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$InvestingMonitorAssetRow$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(completableJobBind, null, 1, null);
            }
        };
    }

    private static final InvestingMonitorAssetItemViewState InvestingMonitorAssetRow$lambda$3(SnapshotState4<InvestingMonitorAssetItemViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingMonitorAssetRowInternal(final InvestingMonitorAsset asset, final boolean z, final int i, final int i2, final AssetQuote assetQuote, final Chart<? extends Parcelable> chart, final String str, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Chart<? extends Parcelable> chart2;
        int i7;
        Modifier modifier2;
        Modifier modifier3;
        final Navigator navigator;
        Context context;
        int i8;
        Modifier modifierM4872backgroundbw27NRU$default;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        final Context context2;
        Object objRememberedValue2;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i9;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Composer composerStartRestartGroup = composer.startRestartGroup(-866442452);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(asset) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
            i6 = i2;
        } else {
            i6 = i2;
            if ((i3 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(i6) ? 2048 : 1024;
            }
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else {
            if ((i3 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(assetQuote) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else {
                if ((i3 & 196608) == 0) {
                    chart2 = chart;
                    i5 |= composerStartRestartGroup.changedInstance(chart2) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else {
                    if ((i3 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
                    }
                    i7 = i4 & 128;
                    if (i7 != 0) {
                        if ((12582912 & i3) == 0) {
                            modifier2 = modifier;
                            i5 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i5) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier5 = modifier2;
                        } else {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-866442452, i5, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowInternal (InvestingMonitorAssetRow.kt:96)");
                            }
                            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            if (!z) {
                                composerStartRestartGroup.startReplaceGroup(566845340);
                                i8 = i5;
                                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                i8 = i5;
                                composerStartRestartGroup.startReplaceGroup(566908797);
                                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            UUID metadataId = asset.getMetadataId();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(metadataId);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                modifier4 = modifier3;
                                String str2 = "InvestingMonitorAsset-" + asset.getInstrumentType() + "-" + asset.getMetadataId();
                                context2 = context;
                                String string2 = asset.getMetadataId().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                objRememberedValue = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, str2, null, null, new com.robinhood.rosetta.eventlogging.Context(i + 1, i6, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, asset.getAnalyticsInstrumentType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16388, -1, -1, -1, -1, -1, 16383, null), null, null, 54, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                modifier4 = modifier3;
                                context2 = context;
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(true, 0.0f, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(asset) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestingMonitorAssetRow.InvestingMonitorAssetRowInternal$lambda$9$lambda$8(asset, navigator, context2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier6 = modifier4;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifier6, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue3, 28, null), userInteractionEventDescriptor2, true, false, false, true, false, null, 108, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.m5158heightInVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null), null, false, 3, null), C2002Dp.m7995constructorimpl(80), 0.0f, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM());
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            int i11 = i8 & 14;
                            RowStart(asset, assetQuote, Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, ((i8 >> 9) & 112) | i11, 0);
                            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(1161798157);
                            if (asset.getIsOptionsStrategy()) {
                                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                int i12 = i11 | ((i8 >> 12) & 112);
                                i9 = i10;
                                RowMiddle(asset, chart2, Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, i12, 0);
                            } else {
                                i9 = i10;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            RowEnd(assetQuote, str, Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, ((i8 >> 12) & 14) | ((i8 >> 15) & 112), 0);
                            composerStartRestartGroup.endNode();
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i9).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InvestingMonitorAssetRow.InvestingMonitorAssetRowInternal$lambda$12(asset, z, i, i2, assetQuote, chart, str, modifier5, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    modifier2 = modifier;
                    if ((4793491 & i5) == 4793490) {
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        if (!z) {
                        }
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        UUID metadataId2 = asset.getMetadataId();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(metadataId2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            modifier4 = modifier3;
                            String str22 = "InvestingMonitorAsset-" + asset.getInstrumentType() + "-" + asset.getMetadataId();
                            context2 = context;
                            String string22 = asset.getMetadataId().toString();
                            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                            objRememberedValue = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, str22, null, null, new com.robinhood.rosetta.eventlogging.Context(i + 1, i6, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string22, asset.getAnalyticsInstrumentType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16388, -1, -1, -1, -1, -1, 16383, null), null, null, 54, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i102 = BentoTheme.$stable;
                            IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default2 = RippleKt.m5937rippleH2RKhps$default(true, 0.0f, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i102).m21425getFg0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(asset) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InvestingMonitorAssetRow.InvestingMonitorAssetRowInternal$lambda$9$lambda$8(asset, navigator, context2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier62 = modifier4;
                                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifier62, interactionSource32, indicationNodeFactoryM5937rippleH2RKhps$default2, false, null, null, (Function0) objRememberedValue3, 28, null), userInteractionEventDescriptor22, true, false, false, true, false, null, 108, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top2 = arrangement2.getTop();
                                Alignment.Companion companion22 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(SizeKt.m5158heightInVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null), null, false, 3, null), C2002Dp.m7995constructorimpl(80), 0.0f, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM(), BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM());
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                        Row6 row62 = Row6.INSTANCE;
                                        Modifier.Companion companion42 = Modifier.INSTANCE;
                                        int i112 = i8 & 14;
                                        RowStart(asset, assetQuote, Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, ((i8 >> 9) & 112) | i112, 0);
                                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i102).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceGroup(1161798157);
                                        if (asset.getIsOptionsStrategy()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                        RowEnd(assetQuote, str, Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, ((i8 >> 12) & 14) | ((i8 >> 15) & 112), 0);
                                        composerStartRestartGroup.endNode();
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i9).m21372getBg20d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier5 = modifier62;
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i7 = i4 & 128;
                if (i7 != 0) {
                }
                modifier2 = modifier;
                if ((4793491 & i5) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            chart2 = chart;
            if ((i4 & 64) != 0) {
            }
            i7 = i4 & 128;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            if ((4793491 & i5) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        chart2 = chart;
        if ((i4 & 64) != 0) {
        }
        i7 = i4 & 128;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorAssetRowInternal$lambda$9$lambda$8(InvestingMonitorAsset investingMonitorAsset, Navigator navigator, Context context) {
        FragmentKey intentKey = investingMonitorAsset.getIntentKey();
        if (intentKey != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, intentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void RowStart(InvestingMonitorAsset investingMonitorAsset, final AssetQuote assetQuote, Modifier modifier, Composer composer, final int i, final int i2) {
        InvestingMonitorAsset investingMonitorAsset2;
        int i3;
        Modifier modifier2;
        String displayName;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-198101631);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            investingMonitorAsset2 = investingMonitorAsset;
        } else if ((i & 6) == 0) {
            investingMonitorAsset2 = investingMonitorAsset;
            i3 = (composerStartRestartGroup.changedInstance(investingMonitorAsset2) ? 4 : 2) | i;
        } else {
            investingMonitorAsset2 = investingMonitorAsset;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(assetQuote) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-198101631, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.RowStart (InvestingMonitorAssetRow.kt:196)");
                }
                String symbol = investingMonitorAsset2.getSymbol();
                composerStartRestartGroup.startReplaceGroup(-1397088089);
                if (investingMonitorAsset2.getIsOptionsStrategy()) {
                    displayName = investingMonitorAsset2.getDisplayName();
                } else if (assetQuote == null) {
                    displayName = "";
                } else {
                    AssetQuote.Option option = (AssetQuote.Option) assetQuote;
                    UiOptionStrategyInfo uiStrategyInfo = option.getUiStrategyInfo();
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    displayName = UiOptionStrategyDisplays.getSubtitleString((UiOptionStrategyDisplay) uiStrategyInfo, resources, option.getUiStrategyInfo().getOptionChain().getSettleOnOpen(), false).toString();
                }
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(symbol, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817913856, 0, 15722);
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                BentoText2.m20747BentoText38GnDrw(displayName, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 817889280, 0, 7546);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final InvestingMonitorAsset investingMonitorAsset3 = investingMonitorAsset2;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorAssetRow.RowStart$lambda$14(investingMonitorAsset3, assetQuote, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String symbol2 = investingMonitorAsset2.getSymbol();
            composerStartRestartGroup.startReplaceGroup(-1397088089);
            if (investingMonitorAsset2.getIsOptionsStrategy()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                TextOverflow.Companion companion22 = TextOverflow.INSTANCE;
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(symbol2, null, Color.m6701boximpl(jM21425getFg0d7_KjU3), null, bold2, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817913856, 0, 15722);
                long jM21425getFg0d7_KjU22 = bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU();
                BentoText2.m20747BentoText38GnDrw(displayName, null, Color.m6701boximpl(jM21425getFg0d7_KjU22), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 817889280, 0, 7546);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowMiddle(final InvestingMonitorAsset asset, final Chart<? extends Parcelable> chart, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Composer composerStartRestartGroup = composer.startRestartGroup(844567400);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(asset) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chart) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(844567400, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.RowMiddle (InvestingMonitorAssetRow.kt:243)");
                }
                if (asset.getInstrumentType() == InstrumentType.FUTURE) {
                    composerStartRestartGroup.startReplaceGroup(589197972);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Clip.clipToBounds(modifier4), C2002Dp.m7995constructorimpl(40)), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                    OneDayMiniChartDetails oneDayMiniChartDetails = new OneDayMiniChartDetails(asset.getMetadataId(), asset.getChartInstrumentType());
                    String string2 = asset.getMetadataId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    OneDayMiniChart.OneDayMiniChart(oneDayMiniChartDetails, modifierM5144paddingVpY3zN4$default, string2, null, false, composerStartRestartGroup, OneDayMiniChartDetails.$stable, 24);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(589636250);
                    if (chart != null) {
                        composerStartRestartGroup.startReplaceGroup(589662445);
                        List<Line> lines = chart.getLines();
                        List<ChartFill> fills = chart.getFills();
                        List overlays = chart.getOverlays();
                        if (overlays == null) {
                            overlays = CollectionsKt.emptyList();
                        }
                        SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Clip.clipToBounds(modifier4), C2002Dp.m7995constructorimpl(40)), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                        int i5 = (SduiActionHandler.NotImplemented.$stable << 12) | 1572864;
                        composerStartRestartGroup.startReplaceGroup(977840936);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$RowMiddle$$inlined$SduiSegmentedLineChart$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Point it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Point point) {
                                    invoke2(point);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$RowMiddle$$inlined$SduiSegmentedLineChart$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                                    invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function12 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$RowMiddle$$inlined$SduiSegmentedLineChart$3
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i6 = i5 >> 6;
                        SduiChartMappersKt.SduiSegmentedLineChart(modifierM5144paddingVpY3zN4$default2, fills, lines, overlays, notImplemented, function1, function12, (Function0) objRememberedValue3, false, false, null, 0.0f, Parcelable.class, composerStartRestartGroup, (65534 & i5) | (458752 & i6) | (3670016 & i6) | (i6 & 29360128) | ((i5 << 9) & 1879048192), (i5 >> 15) & 14, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(590241494);
                        Placeholders2.ChartPlaceholder(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Clip.clipToBounds(modifier4), C2002Dp.m7995constructorimpl(40)), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), false, composerStartRestartGroup, 0, 2);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorAssetRow.RowMiddle$lambda$15(asset, chart, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (asset.getInstrumentType() == InstrumentType.FUTURE) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowEnd(final AssetQuote assetQuote, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        final Modifier modifier5;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        long jM21452getNegative0d7_KjU;
        long jM21452getNegative0d7_KjU2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1078489682);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(assetQuote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1078489682, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.RowEnd (InvestingMonitorAssetRow.kt:286)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal end = companion.getEnd();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                composerStartRestartGroup.startReplaceGroup(-559171784);
                if (assetQuote != null || str == null) {
                    modifier4 = modifier3;
                } else {
                    String str2 = Money.format$default(assetQuote.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                    int i6 = i3;
                    modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composerStartRestartGroup, 817913856, 0, 15722);
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 11, null);
                    if (assetQuote.getIsUp()) {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_12;
                    } else {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_12;
                    }
                    BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                    if (assetQuote.getIsUp()) {
                        composerStartRestartGroup.startReplaceGroup(-1394321861);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1394242501);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21452getNegative0d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                    if (assetQuote.getIsUp()) {
                        composerStartRestartGroup.startReplaceGroup(-1393938949);
                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1393859589);
                        jM21452getNegative0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21452getNegative0d7_KjU2), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composerStartRestartGroup, ((i6 >> 3) & 14) | 817889280, 0, 15738);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.item.row.InvestingMonitorAssetRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestingMonitorAssetRow.RowEnd$lambda$18(assetQuote, str, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Horizontal end2 = companion5.getEnd();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), end2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                composerStartRestartGroup.startReplaceGroup(-559171784);
                if (assetQuote != null) {
                    modifier4 = modifier3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

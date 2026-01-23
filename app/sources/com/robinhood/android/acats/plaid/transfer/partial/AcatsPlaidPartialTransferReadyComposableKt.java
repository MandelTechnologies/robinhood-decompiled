package com.robinhood.android.acats.plaid.transfer.partial;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize2;
import androidx.compose.material.Chip3;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SwipeableDefaults;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionPosition;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionType;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetType;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.LocalDate;

/* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u007f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aG\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a3\u0010#\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010*\u001a\u0085\u0001\u0010,\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b,\u0010-\u001a#\u00101\u001a\u0002002\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%H\u0002¢\u0006\u0004\b1\u00102\u001a/\u00108\u001a\u0002072\b\b\u0002\u00103\u001a\u00020%2\b\b\u0002\u00104\u001a\u00020\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b8\u00109\u001a%\u0010=\u001a\u00020<2\b\b\u0002\u0010:\u001a\u00020%2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b=\u0010>¨\u0006A²\u0006\u000e\u0010@\u001a\u00020?8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "state", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "filterState", "Lkotlin/Function1;", "", "onFilterClicked", "Lkotlin/Function0;", "onShowUnsupportedAssets", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "onRowClicked", "onComplete", "onSwipeRemove", "", "removeEnabled", "AcatsPlaidPartialTransferComposable", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "", "unsupportedCount", "Landroidx/compose/ui/Modifier;", "modifier", "AcatsPlaidPartialTransferUnsupportedBanner", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortData;", "sortData", "AcatsPlaidPartialTransferAssetFilterRow", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", WebsocketGatewayConstants.DATA_KEY, "AcatsPlaidPartialTransferAssetFilterChip", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortData;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferAssetRow", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "onClick", "content", "SwipeToRemoveRowLayout", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "text", "AcatsPartialTransferAssetSectionTitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PreviewLoading", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "PreviewLoaded", "(ZLcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "originalBalance", "adjustableBalance", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "cashType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "name", "adjustableQuantity", "Ljava/math/BigDecimal;", "borrowFee", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "equityType", "(Ljava/lang/String;ILjava/math/BigDecimal;)Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "quantity", "chainId", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "optionType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "Landroidx/compose/ui/unit/Dp;", "rowHeight", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferReadyComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPartialTransferAssetSectionTitle$lambda$37(String str, int i, Composer composer, int i2) {
        AcatsPartialTransferAssetSectionTitle(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetFilterChip$lambda$8(AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1 function1, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferAssetFilterChip(acatsPlaidPartialTransferSortData, acatsPlaidPartialTransferDuxo6, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetFilterRow$lambda$5(ImmutableList immutableList, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1 function1, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferAssetFilterRow(immutableList, acatsPlaidPartialTransferDuxo6, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetRow$lambda$12(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Function1 function1, Function1 function12, boolean z, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferAssetRow(acatsPlaidPartialTransferAssetRowData, function1, function12, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferComposable$lambda$0(AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function1 function13, boolean z, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferComposable(acatsPlaidPartialTransferUiState, acatsPlaidPartialTransferDuxo6, function1, function0, function12, function02, function13, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferUnsupportedBanner$lambda$1(int i, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        AcatsPlaidPartialTransferUnsupportedBanner(i, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoaded$lambda$49(boolean z, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function1 function13, int i, int i2, Composer composer, int i3) {
        PreviewLoaded(z, acatsPlaidPartialTransferDuxo6, function1, function0, function12, function02, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoading$lambda$38(int i, Composer composer, int i2) {
        PreviewLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToRemoveRowLayout$lambda$36(boolean z, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        SwipeToRemoveRowLayout(z, function0, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final float SwipeToRemoveRowLayout$lambda$15(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    public static final void AcatsPlaidPartialTransferComposable(final AcatsPlaidPartialTransferUiState state, final AcatsPlaidPartialTransferDuxo6 filterState, final Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> onFilterClicked, final Function0<Unit> onShowUnsupportedAssets, final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> onRowClicked, final Function0<Unit> onComplete, final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> onSwipeRemove, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        Intrinsics.checkNotNullParameter(onFilterClicked, "onFilterClicked");
        Intrinsics.checkNotNullParameter(onShowUnsupportedAssets, "onShowUnsupportedAssets");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSwipeRemove, "onSwipeRemove");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2046699024);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(filterState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFilterClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowUnsupportedAssets) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onComplete) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSwipeRemove) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        } else {
            z2 = z;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2046699024, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable (AcatsPlaidPartialTransferReadyComposable.kt:98)");
            }
            composer2 = composerStartRestartGroup;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(-1859281051, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                    invoke(bentoButtonBar3, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1859281051, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:190)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, composer3, 0, 1);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU();
                    BentoButtonKt.m20586BentoButtonEikTQX8(onComplete, StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_confirm_btn, composer3, 0), modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer3, 0, 0, 8056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1401537240, true, new C75442(state, filterState, onFilterClicked, onShowUnsupportedAssets, onRowClicked, onSwipeRemove, z2), composerStartRestartGroup, 54), composer2, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable$lambda$0(state, filterState, onFilterClicked, onShowUnsupportedAssets, onRowClicked, onComplete, onSwipeRemove, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2 */
    static final class C75442 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo6 $filterState;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo6, Unit> $onFilterClicked;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferAssetRowData, Unit> $onRowClicked;
        final /* synthetic */ Function0<Unit> $onShowUnsupportedAssets;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferAssetRowData, Unit> $onSwipeRemove;
        final /* synthetic */ boolean $removeEnabled;
        final /* synthetic */ AcatsPlaidPartialTransferUiState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C75442(AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Function0<Unit> function0, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function12, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function13, boolean z) {
            this.$state = acatsPlaidPartialTransferUiState;
            this.$filterState = acatsPlaidPartialTransferDuxo6;
            this.$onFilterClicked = function1;
            this.$onShowUnsupportedAssets = function0;
            this.$onRowClicked = function12;
            this.$onSwipeRemove = function13;
            this.$removeEnabled = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1401537240, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:105)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$state) | composer.changed(this.$filterState.ordinal()) | composer.changed(this.$onFilterClicked) | composer.changed(this.$onShowUnsupportedAssets) | composer.changed(this.$onRowClicked) | composer.changed(this.$onSwipeRemove) | composer.changed(this.$removeEnabled);
            final AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState = this.$state;
            final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6 = this.$filterState;
            final Function1<AcatsPlaidPartialTransferDuxo6, Unit> function1 = this.$onFilterClicked;
            final Function0<Unit> function0 = this.$onShowUnsupportedAssets;
            final Function1<AcatsPlaidPartialTransferAssetRowData, Unit> function12 = this.$onRowClicked;
            final Function1<AcatsPlaidPartialTransferAssetRowData, Unit> function13 = this.$onSwipeRemove;
            final boolean z = this.$removeEnabled;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function14 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.C75442.invoke$lambda$7$lambda$6(acatsPlaidPartialTransferUiState, acatsPlaidPartialTransferDuxo6, function1, function0, function12, function13, z, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(function14);
                objRememberedValue = function14;
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(final AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState, final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, final Function1 function1, final Function0 function0, final Function1 function12, final Function1 function13, final boolean z, LazyListScope LazyColumn) {
            LazyListScope lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if (!acatsPlaidPartialTransferUiState.getSortData().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1762647032, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$1$1$1
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
                            ComposerKt.traceEventStart(-1762647032, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:113)");
                        }
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterRow(extensions2.toImmutableList(acatsPlaidPartialTransferUiState.getSortData()), acatsPlaidPartialTransferDuxo6, function1, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            if (acatsPlaidPartialTransferUiState.getUnsupportedCount() > 0) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-240142721, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$1$1$2
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
                            ComposerKt.traceEventStart(-240142721, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:124)");
                        }
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferUnsupportedBanner(acatsPlaidPartialTransferUiState.getUnsupportedCount(), function0, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            if (acatsPlaidPartialTransferUiState.getCashAssets().isEmpty() || !acatsPlaidPartialTransferDuxo6.showCashAssets()) {
                lazyListScope = LazyColumn;
            } else {
                lazyListScope = LazyColumn;
                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$AcatsPlaidPartialTransferReadyComposableKt.INSTANCE.getLambda$1559651456$lib_acats_plaid_externalDebug(), 3, null);
                final List<AcatsPlaidPartialTransferAssetRowData> cashAssets = acatsPlaidPartialTransferUiState.getCashAssets();
                final Function1 function14 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.C75442.invoke$lambda$7$lambda$6$lambda$0((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                final C7523xd355cc6 c7523xd355cc6 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                LazyColumn.items(cashAssets.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function14.invoke(cashAssets.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7523xd355cc6.invoke(cashAssets.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = (AcatsPlaidPartialTransferAssetRowData) cashAssets.get(i);
                        composer.startReplaceGroup(-628102191);
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetRow(acatsPlaidPartialTransferAssetRowData, function12, function13, z, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!acatsPlaidPartialTransferUiState.getEquityAssets().isEmpty() && acatsPlaidPartialTransferDuxo6.showEquityAssets()) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$AcatsPlaidPartialTransferReadyComposableKt.INSTANCE.m10660getLambda$935521663$lib_acats_plaid_externalDebug(), 3, null);
                final List<AcatsPlaidPartialTransferAssetRowData> equityAssets = acatsPlaidPartialTransferUiState.getEquityAssets();
                final Function1 function15 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.C75442.invoke$lambda$7$lambda$6$lambda$2((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                final C7530xd355cca c7530xd355cca = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                LazyColumn.items(equityAssets.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function15.invoke(equityAssets.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7530xd355cca.invoke(equityAssets.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = (AcatsPlaidPartialTransferAssetRowData) equityAssets.get(i);
                        composer.startReplaceGroup(-1331496402);
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetRow(acatsPlaidPartialTransferAssetRowData, function12, function13, z, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!acatsPlaidPartialTransferUiState.getOptionsAssets().isEmpty() && acatsPlaidPartialTransferDuxo6.showOptionAssets()) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$AcatsPlaidPartialTransferReadyComposableKt.INSTANCE.getLambda$864272514$lib_acats_plaid_externalDebug(), 3, null);
                final List<AcatsPlaidPartialTransferAssetRowData> optionsAssets = acatsPlaidPartialTransferUiState.getOptionsAssets();
                final Function1 function16 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.C75442.invoke$lambda$7$lambda$6$lambda$4((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                final C7534xd355cce c7534xd355cce = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                LazyColumn.items(optionsAssets.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function16.invoke(optionsAssets.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c7534xd355cce.invoke(optionsAssets.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferComposable$2$invoke$lambda$7$lambda$6$$inlined$items$default$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = (AcatsPlaidPartialTransferAssetRowData) optionsAssets.get(i);
                        composer.startReplaceGroup(-2034892659);
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetRow(acatsPlaidPartialTransferAssetRowData, function12, function13, z, composer, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$7$lambda$6$lambda$0(AcatsPlaidPartialTransferAssetRowData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getComposeKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$7$lambda$6$lambda$2(AcatsPlaidPartialTransferAssetRowData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getComposeKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$7$lambda$6$lambda$4(AcatsPlaidPartialTransferAssetRowData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getComposeKey();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsPlaidPartialTransferUnsupportedBanner(int i, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        final int i4;
        int i5;
        Function0<Unit> function02;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(392205105);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i5 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(392205105, i5, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferUnsupportedBanner (AcatsPlaidPartialTransferReadyComposable.kt:208)");
                }
                String str = String.format(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_non_transferable_assets_banner, composerStartRestartGroup, 0), Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                String strStringResource = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_review_non_transferable_assets_cta, composerStartRestartGroup, 0);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifier2, str, size24, strStringResource, function02, null, bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), composerStartRestartGroup, ((i5 >> 6) & 14) | (BentoIcon4.Size24.$stable << 6) | ((i5 << 9) & 57344), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferUnsupportedBanner$lambda$1(i4, function0, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 384;
        modifier2 = modifier;
        if ((i5 & 147) != 146) {
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String str2 = String.format(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_non_transferable_assets_banner, composerStartRestartGroup, 0), Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_review_non_transferable_assets_cta, composerStartRestartGroup, 0);
            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifier2, str2, size242, strStringResource2, function02, null, bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), composerStartRestartGroup, ((i5 >> 6) & 14) | (BentoIcon4.Size24.$stable << 6) | ((i5 << 9) & 57344), 32);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferAssetFilterRow(final ImmutableList<AcatsPlaidPartialTransferSortData> immutableList, final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, final Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1602767598);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(acatsPlaidPartialTransferDuxo6.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1602767598, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetFilterRow (AcatsPlaidPartialTransferReadyComposable.kt:226)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterRow$lambda$4$lambda$3(immutableList, acatsPlaidPartialTransferDuxo6, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterRow$lambda$5(immutableList, acatsPlaidPartialTransferDuxo6, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetFilterRow$lambda$4$lambda$3(final ImmutableList immutableList, final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableSingletons$AcatsPlaidPartialTransferReadyComposableKt.INSTANCE.m10659getLambda$411857905$lib_acats_plaid_externalDebug(), 3, null);
        final C7514x45d269ab c7514x45d269ab = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferAssetFilterRow$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AcatsPlaidPartialTransferSortData) obj);
            }
        };
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferAssetFilterRow$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c7514x45d269ab.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$AcatsPlaidPartialTransferAssetFilterRow$lambda$4$lambda$3$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData = (AcatsPlaidPartialTransferSortData) immutableList.get(i);
                composer.startReplaceGroup(-1636143436);
                AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterChip(acatsPlaidPartialTransferSortData, acatsPlaidPartialTransferDuxo6, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferAssetFilterChip(final AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData, final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, final Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-541627474);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(acatsPlaidPartialTransferSortData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(acatsPlaidPartialTransferDuxo6.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-541627474, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetFilterChip (AcatsPlaidPartialTransferReadyComposable.kt:243)");
            }
            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, 1, null);
            boolean z = acatsPlaidPartialTransferSortData.getSortKey() == acatsPlaidPartialTransferDuxo6;
            AcatsPlaidPartialChipSortColors acatsPlaidPartialChipSortColors = AcatsPlaidPartialChipSortColors.INSTANCE;
            CornerBasedShape cornerBasedShapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall().copy(CornerSize2.CornerSize(50));
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterChip$lambda$7$lambda$6(function1, acatsPlaidPartialTransferSortData);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Chip3.FilterChip(z, (Function0) objRememberedValue, modifierWithBentoPillPlaceholder$default, false, null, cornerBasedShapeCopy, borderStrokeM4886BorderStrokecXLIe8U, acatsPlaidPartialChipSortColors, null, null, null, ComposableLambda3.rememberComposableLambda(-418637203, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterChip.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 FilterChip, Composer composer3, int i4) {
                    long jM21425getFg0d7_KjU;
                    Intrinsics.checkNotNullParameter(FilterChip, "$this$FilterChip");
                    if ((i4 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-418637203, i4, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetFilterChip.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:258)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i5).m21593getSmallD9Ej5fM());
                    StringResource chipText = acatsPlaidPartialTransferSortData.getChipText();
                    Resources resources2 = resources;
                    Intrinsics.checkNotNull(resources2);
                    String string2 = chipText.getText(resources2).toString();
                    TextStyle textM = bentoTheme2.getTypography(composer3, i5).getTextM();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    if (acatsPlaidPartialTransferSortData.getSortKey() == acatsPlaidPartialTransferDuxo6) {
                        composer3.startReplaceGroup(964439009);
                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i5).m21371getBg0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(964496545);
                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i5).m21425getFg0d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, modifierM5142padding3ABfNKs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 12582912, 48, 1816);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetFilterChip$lambda$8(acatsPlaidPartialTransferSortData, acatsPlaidPartialTransferDuxo6, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetFilterChip$lambda$7$lambda$6(Function1 function1, AcatsPlaidPartialTransferSortData acatsPlaidPartialTransferSortData) {
        function1.invoke(acatsPlaidPartialTransferSortData.getSortKey());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferAssetRow(final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function1, final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function12, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(894889418);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(acatsPlaidPartialTransferAssetRowData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894889418, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRow (AcatsPlaidPartialTransferReadyComposable.kt:280)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetRow$lambda$11$lambda$10$lambda$9(function12, acatsPlaidPartialTransferAssetRowData);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SwipeToRemoveRowLayout(z, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-2055784742, true, new C7542x1040039a(acatsPlaidPartialTransferAssetRowData, resources, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 384);
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            Color colorM21927getDividerColorQN2ZGVo = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
            composerStartRestartGroup.startReplaceGroup(-904735080);
            long jM21373getBg30d7_KjU = colorM21927getDividerColorQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
            composerStartRestartGroup.endReplaceGroup();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierM21623defaultHorizontalPaddingrAjV9yQ, jM21373getBg30d7_KjU, 0.0f, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferAssetRow$lambda$12(acatsPlaidPartialTransferAssetRowData, function1, function12, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAssetRow$lambda$11$lambda$10$lambda$9(Function1 function1, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData) {
        function1.invoke(acatsPlaidPartialTransferAssetRowData);
        return Unit.INSTANCE;
    }

    private static final void SwipeToRemoveRowLayout(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final SwipeableState swipeableState;
        int i3;
        final Density density;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964670472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1964670472, i4, -1, "com.robinhood.android.acats.plaid.transfer.partial.SwipeToRemoveRowLayout (AcatsPlaidPartialTransferReadyComposable.kt:340)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(96);
            final SwipeableState swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(0, null, null, composerStartRestartGroup, 6, 6);
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(Float.valueOf(0.0f), 0), Tuples4.m3642to(Float.valueOf(-density2.mo5016toPx0680j_4(fM7995constructorimpl)), 1));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new C7549x1c697cda(interactionSource3, focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(interactionSource3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1737327353);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(companion2, focusRequester);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(swipeableStateRememberSwipeableState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$21$lambda$20(coroutineScope, swipeableStateRememberSwipeableState, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFocusable$default = Focusable2.focusable$default(FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue6), false, null, 3, null);
            if (z) {
                Orientation orientation = Orientation.Horizontal;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$24$lambda$23$lambda$22(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierFocusable$default = SwipeableKt.m5651swipeablepPrIpRY(modifierFocusable$default, swipeableStateRememberSwipeableState, mapMapOf, orientation, (440 & 8) != 0, (440 & 16) != 0 ? false : false, (440 & 32) != 0 ? null : interactionSource3, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(C2002Dp.m7995constructorimpl(56), null);
                    }
                } : (Function2) objRememberedValue7, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & 256) != 0 ? SwipeableDefaults.INSTANCE.m5650getVelocityThresholdD9Ej5fM() : 0.0f);
                swipeableState = swipeableStateRememberSwipeableState;
            } else {
                swipeableState = swipeableStateRememberSwipeableState;
            }
            Modifier modifier = modifierFocusable$default;
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1711141434);
            if (!z || swipeableState.getOffset().getValue().floatValue() >= 0.0f) {
                i3 = i4;
                density = density2;
                snapshotState = snapshotState2;
            } else {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), companion3.getTop(), composerStartRestartGroup, 6);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion2, SwipeToRemoveRowLayout$lambda$15(snapshotState2)), fM7995constructorimpl);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5174width3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z2 = (i4 & 112) == 32;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$35$lambda$28$lambda$26$lambda$25(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue8, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                String strStringResource = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_swipe_to_remove, composerStartRestartGroup, 0);
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getNova());
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                i3 = i4;
                density = density2;
                snapshotState = snapshotState2;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$35$lambda$31$lambda$30(density, snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion2, (Function1) objRememberedValue9);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(swipeableState);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$35$lambda$33$lambda$32(swipeableState, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(OffsetKt.offset(modifierOnGloballyPositioned, (Function1) objRememberedValue10), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.SwipeToRemoveRowLayout$lambda$36(z, function0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SwipeToRemoveRowLayout$lambda$16(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToRemoveRowLayout$lambda$21$lambda$20(CoroutineScope coroutineScope, SwipeableState swipeableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isFocused()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C7550xa80bca68(swipeableState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThresholdConfig SwipeToRemoveRowLayout$lambda$24$lambda$23$lambda$22(int i, int i2) {
        return new FractionalThreshold(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToRemoveRowLayout$lambda$35$lambda$28$lambda$26$lambda$25(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToRemoveRowLayout$lambda$35$lambda$31$lambda$30(Density density, SnapshotState snapshotState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SwipeToRemoveRowLayout$lambda$16(snapshotState, density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset SwipeToRemoveRowLayout$lambda$35$lambda$33$lambda$32(SwipeableState swipeableState, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(swipeableState.getOffset().getValue().floatValue()) << 32) | (0 & 4294967295L)));
    }

    public static final void AcatsPartialTransferAssetSectionTitle(final String text, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(854183242);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(text) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(854183242, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPartialTransferAssetSectionTitle (AcatsPlaidPartialTransferReadyComposable.kt:423)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(text, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 5, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i2 & 14) | 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.AcatsPartialTransferAssetSectionTitle$lambda$37(text, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1731891350);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1731891350, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.PreviewLoading (AcatsPlaidPartialTransferReadyComposable.kt:473)");
            }
            final AcatsPlaidPartialTransferViewState.Loading loading = new AcatsPlaidPartialTransferViewState.Loading(null, 1, null);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-928078370, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt.PreviewLoading.1

                /* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AcatsPlaidPartialTransferViewState.Loading $viewState;

                    AnonymousClass1(AcatsPlaidPartialTransferViewState.Loading loading) {
                        this.$viewState = loading;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1156005454, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.PreviewLoading.<anonymous>.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:477)");
                        }
                        AcatsPlaidPartialTransferUiState uiState = this.$viewState.getMock().getUiState();
                        AcatsPlaidPartialTransferDuxo6 filterState = this.$viewState.getMock().getFilterState();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AcatsPlaidPartialTransferReadyComposableKt.C75481.AnonymousClass1.invoke$lambda$1$lambda$0((AcatsPlaidPartialTransferDuxo6) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AcatsPlaidPartialTransferReadyComposableKt.C75481.AnonymousClass1.invoke$lambda$5$lambda$4((AcatsPlaidPartialTransferAssetRowData) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function12 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function02 = (Function0) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoading$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AcatsPlaidPartialTransferReadyComposableKt.C75481.AnonymousClass1.invoke$lambda$9$lambda$8((AcatsPlaidPartialTransferAssetRowData) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable(uiState, filterState, function1, function0, function12, function02, (Function1) objRememberedValue5, this.$viewState.getMock().getAllowDeletion(), composer, 1797504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AcatsPlaidPartialTransferDuxo6 it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(AcatsPlaidPartialTransferAssetRowData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8(AcatsPlaidPartialTransferAssetRowData it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-928078370, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.PreviewLoading.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:476)");
                    }
                    LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(1156005454, true, new AnonymousClass1(loading), composer2, 54), composer2, 3078, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferReadyComposableKt.PreviewLoading$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoaded$lambda$40$lambda$39(AcatsPlaidPartialTransferDuxo6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoaded$lambda$44$lambda$43(AcatsPlaidPartialTransferAssetRowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoaded$lambda$48$lambda$47(AcatsPlaidPartialTransferDuxo3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoaded$6 */
    static final class C75476 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo6 $filterState;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo6, Unit> $onFilterClicked;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferAssetRowData, Unit> $onRowClicked;
        final /* synthetic */ Function0<Unit> $onShowUnsupportedAssets;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferDuxo3, Unit> $onSwipeRemove;
        final /* synthetic */ boolean $removeEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        C75476(AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Function0<Unit> function0, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function12, Function0<Unit> function02, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function13, boolean z) {
            this.$filterState = acatsPlaidPartialTransferDuxo6;
            this.$onFilterClicked = function1;
            this.$onShowUnsupportedAssets = function0;
            this.$onRowClicked = function12;
            this.$onComplete = function02;
            this.$onSwipeRemove = function13;
            this.$removeEnabled = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(994448721, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.PreviewLoaded.<anonymous> (AcatsPlaidPartialTransferReadyComposable.kt:503)");
            }
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustmentCashType$default = AcatsPlaidPartialTransferReadyComposableKt.cashType$default(null, null, 3, null);
            StringResource.Companion companion = StringResource.INSTANCE;
            AcatsPlaidPartialTransferUiState acatsPlaidPartialTransferUiState = new AcatsPlaidPartialTransferUiState(CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferAssetRowData[]{new AcatsPlaidPartialTransferAssetRowData(cashAssetWithAdjustmentCashType$default, companion.invoke("Cash balance"), companion.invoke("$12,345.67"), companion.invoke("Entire balance")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.cashType$default(null, null, 3, null), companion.invoke("Margin balance"), companion.invoke("$12,345.67"), companion.invoke("Entire balance"))}), CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferAssetRowData[]{new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.equityType$default(null, -30, new BigDecimal("5.255"), 1, null), companion.invoke("APPL"), companion.invoke("-30 Shares"), companion.invoke("All shares")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.equityType$default(null, 0, null, 7, null), companion.invoke("AMD"), companion.invoke("3 Shares"), companion.invoke("All shares")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.equityType$default(null, 0, null, 7, null), companion.invoke("NVDA"), companion.invoke("33 Shares"), companion.invoke("All shares")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.equityType$default(null, 0, null, 7, null), companion.invoke("INTL"), companion.invoke("13 Shares"), companion.invoke("All shares"))}), CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferAssetRowData[]{new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.optionType$default(null, null, 3, null), companion.invoke("TSLA $205.03 Call"), companion.invoke("03/15/2024 exp · 2 long"), companion.invoke("All Contracts")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.optionType$default(null, null, 3, null), companion.invoke("TSLA $205.02 Call"), companion.invoke("03/15/2024 exp · 2 long"), companion.invoke("All Contracts")), new AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferReadyComposableKt.optionType$default(null, null, 3, null), companion.invoke("TSLA $205.01 Call"), companion.invoke("03/15/2024 exp · 2 long"), companion.invoke("All Contracts"))}), CollectionsKt.listOf((Object[]) new AcatsPlaidPartialTransferSortData[]{new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.ALL, companion.invoke("All assets")), new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.CASH, companion.invoke("Cash")), new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.STOCKS_ETFS, companion.invoke("Stocks & ETFs")), new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.OPTIONS, companion.invoke("Options"))}), 17);
            AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6 = this.$filterState;
            Function1<AcatsPlaidPartialTransferDuxo6, Unit> function1 = this.$onFilterClicked;
            Function0<Unit> function0 = this.$onShowUnsupportedAssets;
            Function1<AcatsPlaidPartialTransferAssetRowData, Unit> function12 = this.$onRowClicked;
            Function0<Unit> function02 = this.$onComplete;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onSwipeRemove);
            final Function1<AcatsPlaidPartialTransferDuxo3, Unit> function13 = this.$onSwipeRemove;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$PreviewLoaded$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferReadyComposableKt.C75476.invoke$lambda$1$lambda$0(function13, (AcatsPlaidPartialTransferAssetRowData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AcatsPlaidPartialTransferReadyComposableKt.AcatsPlaidPartialTransferComposable(acatsPlaidPartialTransferUiState, acatsPlaidPartialTransferDuxo6, function1, function0, function12, function02, (Function1) objRememberedValue, this.$removeEnabled, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AcatsPlaidPartialTransferAssetRowData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it.getType());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PreviewLoaded(boolean z, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function1, Function0<Unit> function0, Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function12, Function0<Unit> function02, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function13, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function14;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function15;
        int i6;
        Function0<Unit> function04;
        int i7;
        Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function16;
        Function0<Unit> function05;
        Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function17;
        Function0<Unit> function06;
        Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function18;
        final AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo62;
        final Function1<? super AcatsPlaidPartialTransferDuxo6, Unit> function19;
        Composer composer2;
        final Function0<Unit> function07;
        final Function1<? super AcatsPlaidPartialTransferAssetRowData, Unit> function110;
        final Function0<Unit> function08;
        final Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function111;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1266488935);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(acatsPlaidPartialTransferDuxo6 == null ? -1 : acatsPlaidPartialTransferDuxo6.ordinal()) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function14 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function15 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function04 = function02;
                            i3 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            acatsPlaidPartialTransferDuxo62 = acatsPlaidPartialTransferDuxo6;
                            function111 = function13;
                            composer2 = composerStartRestartGroup;
                            z3 = z2;
                            function19 = function14;
                            function07 = function03;
                            function110 = function15;
                            function08 = function04;
                        } else {
                            boolean z4 = i8 == 0 ? true : z2;
                            AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo63 = i9 == 0 ? AcatsPlaidPartialTransferDuxo6.ALL : acatsPlaidPartialTransferDuxo6;
                            if (i10 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AcatsPlaidPartialTransferReadyComposableKt.PreviewLoaded$lambda$40$lambda$39((AcatsPlaidPartialTransferDuxo6) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function16 = (Function1) objRememberedValue;
                            } else {
                                function16 = function14;
                            }
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function05 = (Function0) objRememberedValue2;
                            } else {
                                function05 = function03;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AcatsPlaidPartialTransferReadyComposableKt.PreviewLoaded$lambda$44$lambda$43((AcatsPlaidPartialTransferAssetRowData) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function17 = (Function1) objRememberedValue3;
                            } else {
                                function17 = function15;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function06 = (Function0) objRememberedValue4;
                            } else {
                                function06 = function04;
                            }
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AcatsPlaidPartialTransferReadyComposableKt.PreviewLoaded$lambda$48$lambda$47((AcatsPlaidPartialTransferDuxo3) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function18 = (Function1) objRememberedValue5;
                            } else {
                                function18 = function13;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1266488935, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.PreviewLoaded (AcatsPlaidPartialTransferReadyComposable.kt:501)");
                            }
                            acatsPlaidPartialTransferDuxo62 = acatsPlaidPartialTransferDuxo63;
                            function19 = function16;
                            composer2 = composerStartRestartGroup;
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(994448721, true, new C75476(acatsPlaidPartialTransferDuxo63, function16, function05, function17, function06, function18, z4), composerStartRestartGroup, 54), composer2, 100663296, 255);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function07 = function05;
                            function110 = function17;
                            function08 = function06;
                            function111 = function18;
                            z3 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferReadyComposableKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AcatsPlaidPartialTransferReadyComposableKt.PreviewLoaded$lambda$49(z3, acatsPlaidPartialTransferDuxo62, function19, function07, function110, function08, function111, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function04 = function02;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i3 & 599187) == 599186) {
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        acatsPlaidPartialTransferDuxo62 = acatsPlaidPartialTransferDuxo63;
                        function19 = function16;
                        composer2 = composerStartRestartGroup;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(994448721, true, new C75476(acatsPlaidPartialTransferDuxo63, function16, function05, function17, function06, function18, z4), composerStartRestartGroup, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function07 = function05;
                        function110 = function17;
                        function08 = function06;
                        function111 = function18;
                        z3 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function15 = function12;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function04 = function02;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function03 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function15 = function12;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function04 = function02;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function14 = function1;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function15 = function12;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function04 = function02;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static /* synthetic */ AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashType$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "12345.67";
        }
        if ((i & 2) != 0) {
            str2 = "12345.67";
        }
        return cashType(str, str2);
    }

    private static final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashType(String str, String str2) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Money money = new Money("USD", uuidRandomUUID, new BigDecimal(str));
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        return new AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment(money, new Money("USD", uuidRandomUUID2, new BigDecimal(str2)));
    }

    static /* synthetic */ AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityType$default(String str, int i, BigDecimal bigDecimal, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bigDecimal = null;
        }
        return equityType(str, i, bigDecimal);
    }

    private static final AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityType(String str, int i, BigDecimal bigDecimal) {
        return new AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment(new EquityAsset(UUID.randomUUID().toString(), AcatsInBrokerAssetType.EQUITY, new BigDecimal(i), true, str, bigDecimal), new BigDecimal(i));
    }

    static /* synthetic */ AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionType$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Constants.SdidMigrationStatusCodes.ALREADY_SDID;
        }
        if ((i & 2) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        return optionType(str, str2);
    }

    private static final AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionType(String str, String str2) {
        AcatsInBrokerAssetOptionType acatsInBrokerAssetOptionType = AcatsInBrokerAssetOptionType.PUT;
        AcatsInBrokerAssetOptionPosition acatsInBrokerAssetOptionPosition = AcatsInBrokerAssetOptionPosition.LONG;
        BigDecimal bigDecimal = new BigDecimal(str);
        LocalDate MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        OptionAsset optionAsset = new OptionAsset(acatsInBrokerAssetOptionType, acatsInBrokerAssetOptionPosition, bigDecimal, null, str2, null, true, MAX, "");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment(optionAsset, ZERO);
    }
}

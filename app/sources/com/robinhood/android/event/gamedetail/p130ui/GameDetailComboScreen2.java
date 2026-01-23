package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.gamedetail.GameDetailEvent;
import com.robinhood.android.event.gamedetail.GameDetailFragment;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks2;
import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks2;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import com.robinhood.android.event.gamedetail.p130ui.GameDetailComboScreen2;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboBottomSheet;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboBottomSheetState;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBar5;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboTradeBarState;
import com.robinhood.android.event.gamedetail.p130ui.toolbar.GameDetailAppBar;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldKt;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeBottomSheetScaffoldState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aª\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u00132#\u0010\u001e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010#\u001a\u0012\u0010$\u001a\u00020\u0001*\u00020%2\u0006\u0010&\u001a\u00020\f\u001a\u001a\u0010'\u001a\u00020\u0001*\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+¨\u0006,²\u0006\n\u0010-\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u001dX\u008a\u008e\u0002"}, m3636d2 = {"GameDetailComboScreen", "", "viewState", "Lcom/robinhood/android/event/gamedetail/GameDetailViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/gamedetail/GameDetailEvent;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "contentListState", "Landroidx/compose/foundation/lazy/LazyListState;", "isScrolled", "", "showDisplayDataSheet", "callbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;", "orderSubmittedEvent", "Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;", "onShowDisplayDataSheetChanged", "Lkotlin/Function1;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/GameDetailViewState;Lcom/robinhood/android/udf/event/Event;Lcom/robinhood/compose/bento/component/TopBarScrollState;Landroidx/compose/foundation/lazy/LazyListState;ZZLcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "ComboScreen", "scaffoldState", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;", "onHeaderHeightChange", "", "onWheelPickerSelectionChange", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "Lkotlin/ParameterName;", "name", "newSelection", "(Lcom/robinhood/android/event/gamedetail/GameDetailViewState;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeBottomSheetScaffoldState;Lcom/robinhood/compose/bento/component/TopBarScrollState;Landroidx/compose/foundation/lazy/LazyListState;ZZLcom/robinhood/android/event/gamedetail/callbacks/GdpV2ComboUiCallbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "logSettingClick", "Lcom/robinhood/analytics/EventLogger;", "isInAmericanOdds", "logComboAction", "contractId", "", "action", "Lcom/robinhood/android/event/gamedetail/ui/ComboLoggingAction;", "feature-game-detail_externalDebug", "sheetHeaderHeight", "latestWheelPickerSelection", "dragHandleHeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboScreen2 {

    /* compiled from: GameDetailComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GameDetailComboScreen.values().length];
            try {
                iArr[GameDetailComboScreen.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameDetailComboScreen.DESELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboScreen$lambda$28(GameDetailViewState gameDetailViewState, MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, TopBarScrollState topBarScrollState, LazyListState lazyListState, boolean z, boolean z2, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ComboScreen(gameDetailViewState, multiModeBottomSheetScaffoldState, topBarScrollState, lazyListState, z, z2, gdpV2ComboUiCallbacks, function1, function0, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboScreen$lambda$24(GameDetailViewState gameDetailViewState, Event event, TopBarScrollState topBarScrollState, LazyListState lazyListState, boolean z, boolean z2, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        GameDetailComboScreen(gameDetailViewState, event, topBarScrollState, lazyListState, z, z2, gdpV2ComboUiCallbacks, orderSubmittedEvent, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailComboScreen(final GameDetailViewState viewState, final Event<GameDetailEvent> event, final TopBarScrollState topBarScrollState, final LazyListState contentListState, final boolean z, final boolean z2, final GdpV2ComboUiCallbacks callbacks, final GameDetailFragment.OrderSubmittedEvent orderSubmittedEvent, final Function1<? super Boolean, Unit> onShowDisplayDataSheetChanged, final Function0<Unit> onBack, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        Modifier modifier2;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z4;
        Object objRememberedValue2;
        final MultiModeSheetState multiModeSheetStateRememberComboSheetState;
        Object objRememberedValue3;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacksUpdateWithComboCallbacks;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue5;
        Object obj;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Composer composer2;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        boolean zChangedInstance3;
        Object objRememberedValue9;
        boolean zChangedInstance4;
        Object objRememberedValue10;
        boolean zChangedInstance5;
        Object objRememberedValue11;
        boolean zChangedInstance6;
        Object objRememberedValue12;
        final Modifier modifier3;
        EventConsumer<GameDetailEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Intrinsics.checkNotNullParameter(contentListState, "contentListState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onShowDisplayDataSheetChanged, "onShowDisplayDataSheetChanged");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(459784057);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(contentListState) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= (i & 2097152) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(orderSubmittedEvent) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onShowDisplayDataSheetChanged) ? 67108864 : 33554432;
            }
            if ((i3 & 512) == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onBack) ? 536870912 : 268435456;
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
                modifier2 = modifier;
                i6 = i2 | 6;
            } else {
                modifier2 = modifier;
                if ((i2 & 6) == 0) {
                    i6 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                } else {
                    i6 = i2;
                }
            }
            if ((i4 & 306783379) != 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(459784057, i4, i6, "com.robinhood.android.event.gamedetail.ui.GameDetailComboScreen (GameDetailComboScreen.kt:66)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int intValue = snapshotIntState2.getIntValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z4 = (i4 & 3670016) != 1048576 || ((i4 & 2097152) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$4$lambda$3(callbacks, (MultiModeSheetState2) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                multiModeSheetStateRememberComboSheetState = GameDetailComboBottomSheetState.rememberComboSheetState(intValue, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                coroutineScope = (CoroutineScope) objRememberedValue3;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(multiModeSheetStateRememberComboSheetState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$6$lambda$5(coroutineScope, multiModeSheetStateRememberComboSheetState, (GameDetailComboCallbacks) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                gdpV2ComboUiCallbacksUpdateWithComboCallbacks = GdpV2ComboUiCallbacks2.updateWithComboCallbacks(callbacks, (Function1) objRememberedValue4, composerStartRestartGroup, (i4 >> 18) & 14);
                MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(multiModeSheetStateRememberComboSheetState, null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                if (orderSubmittedEvent == null && orderSubmittedEvent.consume()) {
                    gdpV2ComboUiCallbacksUpdateWithComboCallbacks.clearSelections();
                    gdpV2ComboUiCallbacksUpdateWithComboCallbacks.onComingBackFromOrderSubmittedHandled();
                }
                if (event != null) {
                    if ((event.getData() instanceof GameDetailEvent.CloseComboSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$GameDetailComboScreen$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m14231invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14231invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GameDetailComboScreen5(multiModeSheetStateRememberComboSheetState, gdpV2ComboUiCallbacksUpdateWithComboCallbacks, null), 3, null);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier4;
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 != companion.getEmpty()) {
                    obj = null;
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    obj = null;
                }
                snapshotState = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClipToBounds = Clip.clipToBounds(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 1.0f, false, 2, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$23$lambda$15$lambda$12$lambda$11(snapshotIntState2, ((Integer) obj2).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function1 function1 = (Function1) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$23$lambda$15$lambda$14$lambda$13(snapshotState, (ContractElement) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = i4 >> 3;
                ComboScreen(viewState, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState, topBarScrollState, contentListState, z, z3, gdpV2ComboUiCallbacksUpdateWithComboCallbacks, onShowDisplayDataSheetChanged, onBack, function1, (Function1) objRememberedValue7, null, composerStartRestartGroup, (i4 & 14) | 805306368 | (TopBarScrollState.$stable << 6) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (29360128 & i7) | (i7 & 234881024), 6, 2048);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                GameDetailComboTradeBarState comboTradeBarState = viewState.getComboTradeBarState();
                composer2.startReplaceGroup(5004770);
                zChangedInstance2 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                objRememberedValue8 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new GameDetailComboScreen6(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                composer2.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue8);
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance3 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                objRememberedValue9 = composer2.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$23$lambda$19$lambda$18(snapshotState, gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                Function0 function02 = (Function0) objRememberedValue9;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                zChangedInstance4 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                objRememberedValue10 = composer2.rememberedValue();
                if (!zChangedInstance4 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new GameDetailComboScreen7(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                composer2.endReplaceGroup();
                Function1 function12 = (Function1) ((KFunction) objRememberedValue10);
                composer2.startReplaceGroup(5004770);
                zChangedInstance5 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                objRememberedValue11 = composer2.rememberedValue();
                if (!zChangedInstance5 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new GameDetailComboScreen8(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                composer2.endReplaceGroup();
                Function2 function2 = (Function2) ((KFunction) objRememberedValue11);
                composer2.startReplaceGroup(5004770);
                zChangedInstance6 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                objRememberedValue12 = composer2.rememberedValue();
                if (!zChangedInstance6 || objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new GameDetailComboScreen9(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                    composer2.updateRememberedValue(objRememberedValue12);
                }
                composer2.endReplaceGroup();
                GameDetailComboTradeBar5.GameDetailComboTradeBar(comboTradeBarState, function0, function02, function12, function2, (Function1) ((KFunction) objRememberedValue12), null, composer2, 0, 64);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GameDetailComboScreen2.GameDetailComboScreen$lambda$24(viewState, event, topBarScrollState, contentListState, z, z2, callbacks, orderSubmittedEvent, onShowDisplayDataSheetChanged, onBack, modifier3, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int intValue2 = snapshotIntState22.getIntValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 3670016) != 1048576) {
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GameDetailComboScreen2.GameDetailComboScreen$lambda$4$lambda$3(callbacks, (MultiModeSheetState2) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    multiModeSheetStateRememberComboSheetState = GameDetailComboBottomSheetState.rememberComboSheetState(intValue2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue3;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(multiModeSheetStateRememberComboSheetState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return GameDetailComboScreen2.GameDetailComboScreen$lambda$6$lambda$5(coroutineScope, multiModeSheetStateRememberComboSheetState, (GameDetailComboCallbacks) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        gdpV2ComboUiCallbacksUpdateWithComboCallbacks = GdpV2ComboUiCallbacks2.updateWithComboCallbacks(callbacks, (Function1) objRememberedValue4, composerStartRestartGroup, (i4 >> 18) & 14);
                        MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2 = MultiModeBottomSheetScaffoldKt.rememberMultiModeBottomSheetScaffoldState(multiModeSheetStateRememberComboSheetState, null, composerStartRestartGroup, MultiModeSheetState.$stable, 2);
                        if (orderSubmittedEvent == null) {
                            if (orderSubmittedEvent == null && orderSubmittedEvent.consume()) {
                            }
                            if (event != null) {
                            }
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Modifier modifier52 = modifier4;
                            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
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
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 != companion.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierClipToBounds2 = Clip.clipToBounds(Column5.weight$default(column62, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 1.0f, false, 2, null));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClipToBounds2);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    Function1 function13 = (Function1) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == companion.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i72 = i4 >> 3;
                                    ComboScreen(viewState, multiModeBottomSheetScaffoldStateRememberMultiModeBottomSheetScaffoldState2, topBarScrollState, contentListState, z, z3, gdpV2ComboUiCallbacksUpdateWithComboCallbacks, onShowDisplayDataSheetChanged, onBack, function13, (Function1) objRememberedValue7, null, composerStartRestartGroup, (i4 & 14) | 805306368 | (TopBarScrollState.$stable << 6) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (29360128 & i72) | (i72 & 234881024), 6, 2048);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endNode();
                                    GameDetailComboTradeBarState comboTradeBarState2 = viewState.getComboTradeBarState();
                                    composer2.startReplaceGroup(5004770);
                                    zChangedInstance2 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                    objRememberedValue8 = composer2.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue8 = new GameDetailComboScreen6(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                        composer2.updateRememberedValue(objRememberedValue8);
                                        composer2.endReplaceGroup();
                                        Function0 function03 = (Function0) ((KFunction) objRememberedValue8);
                                        composer2.startReplaceGroup(-1633490746);
                                        zChangedInstance3 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                        objRememberedValue9 = composer2.rememberedValue();
                                        if (!zChangedInstance3) {
                                            objRememberedValue9 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return GameDetailComboScreen2.GameDetailComboScreen$lambda$23$lambda$19$lambda$18(snapshotState, gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue9);
                                            Function0 function022 = (Function0) objRememberedValue9;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(5004770);
                                            zChangedInstance4 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                            objRememberedValue10 = composer2.rememberedValue();
                                            if (!zChangedInstance4) {
                                                objRememberedValue10 = new GameDetailComboScreen7(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                composer2.updateRememberedValue(objRememberedValue10);
                                                composer2.endReplaceGroup();
                                                Function1 function122 = (Function1) ((KFunction) objRememberedValue10);
                                                composer2.startReplaceGroup(5004770);
                                                zChangedInstance5 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                objRememberedValue11 = composer2.rememberedValue();
                                                if (!zChangedInstance5) {
                                                    objRememberedValue11 = new GameDetailComboScreen8(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                    composer2.updateRememberedValue(objRememberedValue11);
                                                    composer2.endReplaceGroup();
                                                    Function2 function22 = (Function2) ((KFunction) objRememberedValue11);
                                                    composer2.startReplaceGroup(5004770);
                                                    zChangedInstance6 = composer2.changedInstance(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                    objRememberedValue12 = composer2.rememberedValue();
                                                    if (!zChangedInstance6) {
                                                        objRememberedValue12 = new GameDetailComboScreen9(gdpV2ComboUiCallbacksUpdateWithComboCallbacks);
                                                        composer2.updateRememberedValue(objRememberedValue12);
                                                        composer2.endReplaceGroup();
                                                        GameDetailComboTradeBar5.GameDetailComboTradeBar(comboTradeBarState2, function03, function022, function122, function22, (Function1) ((KFunction) objRememberedValue12), null, composer2, 0, 64);
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
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboScreen$lambda$4$lambda$3(GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, MultiModeSheetState2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(it, MultiModeSheetState2.Expanded.INSTANCE) && !(it instanceof MultiModeSheetState2.FixedHeight)) {
            if (!Intrinsics.areEqual(it, MultiModeSheetState2.Hidden.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            gdpV2ComboUiCallbacks.clearSelections();
            gdpV2ComboUiCallbacks.resetEmptyState();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ComboScreen$lambda$26(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }

    private static final ContractElement GameDetailComboScreen$lambda$23$lambda$9(SnapshotState<ContractElement> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameDetailComboCallbacks GameDetailComboScreen$lambda$6$lambda$5(CoroutineScope coroutineScope, MultiModeSheetState multiModeSheetState, GameDetailComboCallbacks it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GameDetailComboCallbacks2.buildWith(it, coroutineScope, multiModeSheetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboScreen$lambda$23$lambda$15$lambda$12$lambda$11(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboScreen$lambda$23$lambda$15$lambda$14$lambda$13(SnapshotState snapshotState, ContractElement contractElement) {
        snapshotState.setValue(contractElement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboScreen$lambda$23$lambda$19$lambda$18(SnapshotState snapshotState, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks) {
        ContractElement contractElementGameDetailComboScreen$lambda$23$lambda$9 = GameDetailComboScreen$lambda$23$lambda$9(snapshotState);
        if (contractElementGameDetailComboScreen$lambda$23$lambda$9 != null) {
            gdpV2ComboUiCallbacks.confirmAlternativeStrike(ContractElementExt.toContractIdWithSide(contractElementGameDetailComboScreen$lambda$23$lambda$9));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ComboScreen(final GameDetailViewState gameDetailViewState, final MultiModeBottomSheetScaffoldState multiModeBottomSheetScaffoldState, final TopBarScrollState topBarScrollState, final LazyListState lazyListState, final boolean z, final boolean z2, final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function0, final Function1<? super Integer, Unit> function12, final Function1<? super ContractElement, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        LazyListState lazyListState2;
        boolean z3;
        Function1<? super Integer, Unit> function14;
        Function1<? super ContractElement, Unit> function15;
        int i5;
        int i6;
        int i7;
        int i8;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1481479586);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(gameDetailViewState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(multiModeBottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            lazyListState2 = lazyListState;
        } else {
            lazyListState2 = lazyListState;
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(lazyListState2) ? 2048 : 1024;
            }
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else {
            if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= (i & 2097152) == 0 ? composerStartRestartGroup.changed(gdpV2ComboUiCallbacks) : composerStartRestartGroup.changedInstance(gdpV2ComboUiCallbacks) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            function14 = function12;
                            i4 |= composerStartRestartGroup.changedInstance(function14) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                            function15 = function13;
                        } else if ((i2 & 6) == 0) {
                            function15 = function13;
                            i5 = i2 | (composerStartRestartGroup.changedInstance(function15) ? 4 : 2);
                        } else {
                            function15 = function13;
                            i5 = i2;
                        }
                        i6 = i3 & 2048;
                        if (i6 != 0) {
                            i7 = i6;
                            i8 = i5 | 48;
                        } else {
                            if ((i2 & 48) == 0) {
                                i7 = i6;
                                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
                            } else {
                                i7 = i6;
                            }
                            i8 = i5;
                        }
                        if ((i4 & 306783379) != 306783378 || (i8 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1481479586, i4, i8, "com.robinhood.android.event.gamedetail.ui.ComboScreen (GameDetailComboScreen.kt:162)");
                            }
                            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(0, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Shape rectangleShape = RectangleShape2.getRectangleShape();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            composer2 = composerStartRestartGroup;
                            MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(ComposableLambda3.rememberComposableLambda(235848233, true, new C163431(gameDetailViewState, gdpV2ComboUiCallbacks, function15, function14, snapshotState), composerStartRestartGroup, 54), modifier3, multiModeBottomSheetScaffoldState, 0.0f, rectangleShape, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), 0L, 0.0f, C2002Dp.m7995constructorimpl(12), null, ComposableLambda3.rememberComposableLambda(-43339023, true, new C163442(snapshotState), composerStartRestartGroup, 54), false, ComposableLambda3.rememberComposableLambda(-17193229, true, new C163453(gameDetailViewState, z3, topBarScrollState, function0, gdpV2ComboUiCallbacks, current, function1, lazyListState2), composerStartRestartGroup, 54), null, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-1953205100, true, new C163464(gdpV2ComboUiCallbacks, gameDetailViewState, lazyListState, z2, current, function1), composerStartRestartGroup, 54), composer2, (i8 & 112) | 805330950 | ((i4 << 3) & 896), 12586032, 87464);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return GameDetailComboScreen2.ComboScreen$lambda$28(gameDetailViewState, multiModeBottomSheetScaffoldState, topBarScrollState, lazyListState, z, z2, gdpV2ComboUiCallbacks, function1, function0, function12, function13, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    function14 = function12;
                    if ((i3 & 1024) != 0) {
                    }
                    i6 = i3 & 2048;
                    if (i6 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Shape rectangleShape2 = RectangleShape2.getRectangleShape();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        MultiModeBottomSheetScaffoldKt.m24809MultiModeBottomSheetScaffoldA036w5U(ComposableLambda3.rememberComposableLambda(235848233, true, new C163431(gameDetailViewState, gdpV2ComboUiCallbacks, function15, function14, snapshotState2), composerStartRestartGroup, 54), modifier3, multiModeBottomSheetScaffoldState, 0.0f, rectangleShape2, 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), 0L, 0.0f, C2002Dp.m7995constructorimpl(12), null, ComposableLambda3.rememberComposableLambda(-43339023, true, new C163442(snapshotState2), composerStartRestartGroup, 54), false, ComposableLambda3.rememberComposableLambda(-17193229, true, new C163453(gameDetailViewState, z3, topBarScrollState, function0, gdpV2ComboUiCallbacks, current2, function1, lazyListState2), composerStartRestartGroup, 54), null, bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-1953205100, true, new C163464(gdpV2ComboUiCallbacks, gameDetailViewState, lazyListState, z2, current2, function1), composerStartRestartGroup, 54), composer2, (i8 & 112) | 805330950 | ((i4 << 3) & 896), 12586032, 87464);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 512) != 0) {
                }
                function14 = function12;
                if ((i3 & 1024) != 0) {
                }
                i6 = i3 & 2048;
                if (i6 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            function14 = function12;
            if ((i3 & 1024) != 0) {
            }
            i6 = i3 & 2048;
            if (i6 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        function14 = function12;
        if ((i3 & 1024) != 0) {
        }
        i6 = i3 & 2048;
        if (i6 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComboScreen$lambda$27(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* compiled from: GameDetailComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$2 */
    static final class C163442 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Integer> $dragHandleHeight$delegate;

        C163442(SnapshotState<Integer> snapshotState) {
            this.$dragHandleHeight$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-43339023, i, -1, "com.robinhood.android.event.gamedetail.ui.ComboScreen.<anonymous> (GameDetailComboScreen.kt:174)");
            }
            BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.INSTANCE;
            long jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            final SnapshotState<Integer> snapshotState = this.$dragHandleHeight$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163442.invoke$lambda$1$lambda$0(snapshotState, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            bottomSheetDefaults.m5711DragHandlelgZ2HuY(OnRemeasuredModifier2.onSizeChanged(companion, (Function1) objRememberedValue), 0.0f, 0.0f, null, jM21427getFg30d7_KjU, composer, 196614, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, IntSize intSize) {
            GameDetailComboScreen2.ComboScreen$lambda$27(snapshotState, (int) (intSize.getPackedValue() & 4294967295L));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$3 */
    static final class C163453 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ GdpV2ComboUiCallbacks $callbacks;
        final /* synthetic */ LazyListState $contentListState;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isScrolled;
        final /* synthetic */ Function0<Unit> $onBack;
        final /* synthetic */ Function1<Boolean, Unit> $onShowDisplayDataSheetChanged;
        final /* synthetic */ TopBarScrollState $topBarScrollState;
        final /* synthetic */ GameDetailViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C163453(GameDetailViewState gameDetailViewState, boolean z, TopBarScrollState topBarScrollState, Function0<Unit> function0, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, EventLogger eventLogger, Function1<? super Boolean, Unit> function1, LazyListState lazyListState) {
            this.$viewState = gameDetailViewState;
            this.$isScrolled = z;
            this.$topBarScrollState = topBarScrollState;
            this.$onBack = function0;
            this.$callbacks = gdpV2ComboUiCallbacks;
            this.$eventLogger = eventLogger;
            this.$onShowDisplayDataSheetChanged = function1;
            this.$contentListState = lazyListState;
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
                ComposerKt.traceEventStart(-17193229, i, -1, "com.robinhood.android.event.gamedetail.ui.ComboScreen.<anonymous> (GameDetailComboScreen.kt:179)");
            }
            TitleState titleState = this.$viewState.getTitleState();
            boolean showSettingsSection = this.$viewState.getShowSettingsSection();
            boolean z = this.$isScrolled;
            boolean showDivider = this.$topBarScrollState.getShowDivider();
            Function0<Unit> function0 = this.$onBack;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$callbacks);
            final GameDetailViewState gameDetailViewState = this.$viewState;
            final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailComboScreen2.C163453.invoke$lambda$1$lambda$0(gameDetailViewState, gdpV2ComboUiCallbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$viewState) | composer.changed(this.$onShowDisplayDataSheetChanged);
            final EventLogger eventLogger = this.$eventLogger;
            final GameDetailViewState gameDetailViewState2 = this.$viewState;
            final Function1<Boolean, Unit> function1 = this.$onShowDisplayDataSheetChanged;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailComboScreen2.C163453.invoke$lambda$3$lambda$2(eventLogger, gameDetailViewState2, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GameDetailAppBar.GameDetailAppBar(titleState, showSettingsSection, z, showDivider, function0, function02, (Function0) objRememberedValue2, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, this.$contentListState, this.$topBarScrollState), composer, StringResource.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GameDetailViewState gameDetailViewState, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks) {
            ImmutableList<UUID> contractIdsForChart;
            DisplaySpan span;
            UUID eventId = gameDetailViewState.getEventId();
            if (eventId != null && (contractIdsForChart = gameDetailViewState.getContractIdsForChart()) != null) {
                EventContractChartArg chartArgs = gameDetailViewState.getChartArgs();
                if (chartArgs == null || (span = chartArgs.getSpan()) == null) {
                    return Unit.INSTANCE;
                }
                gdpV2ComboUiCallbacks.onStartPipMode(eventId, contractIdsForChart, span);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, GameDetailViewState gameDetailViewState, Function1 function1) {
            GameDetailComboScreen2.logSettingClick(eventLogger, gameDetailViewState.getShowAmericanOdds());
            function1.invoke(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$1 */
    static final class C163431 implements Function3<Column5, Composer, Integer, Unit> {
        final /* synthetic */ GdpV2ComboUiCallbacks $callbacks;
        final /* synthetic */ SnapshotState<Integer> $dragHandleHeight$delegate;
        final /* synthetic */ Function1<Integer, Unit> $onHeaderHeightChange;
        final /* synthetic */ Function1<ContractElement, Unit> $onWheelPickerSelectionChange;
        final /* synthetic */ GameDetailViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C163431(GameDetailViewState gameDetailViewState, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, Function1<? super ContractElement, Unit> function1, Function1<? super Integer, Unit> function12, SnapshotState<Integer> snapshotState) {
            this.$viewState = gameDetailViewState;
            this.$callbacks = gdpV2ComboUiCallbacks;
            this.$onWheelPickerSelectionChange = function1;
            this.$onHeaderHeightChange = function12;
            this.$dragHandleHeight$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Column5 MultiModeBottomSheetScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(MultiModeBottomSheetScaffold, "$this$MultiModeBottomSheetScaffold");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(235848233, i, -1, "com.robinhood.android.event.gamedetail.ui.ComboScreen.<anonymous> (GameDetailComboScreen.kt:202)");
            }
            GameDetailComboBottomSheetContentViewState comboSheetViewState = this.$viewState.getComboSheetViewState();
            GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks = this.$callbacks;
            Function1<ContractElement, Unit> function1 = this.$onWheelPickerSelectionChange;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onHeaderHeightChange);
            final Function1<Integer, Unit> function12 = this.$onHeaderHeightChange;
            final SnapshotState<Integer> snapshotState = this.$dragHandleHeight$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163431.invoke$lambda$1$lambda$0(function12, snapshotState, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GameDetailComboBottomSheet.GameDetailComboBottomSheet(comboSheetViewState, gdpV2ComboUiCallbacks, function1, (Function1) objRememberedValue, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, int i) {
            function1.invoke(Integer.valueOf(GameDetailComboScreen2.ComboScreen$lambda$26(snapshotState) + i));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GameDetailComboScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4 */
    static final class C163464 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ GdpV2ComboUiCallbacks $callbacks;
        final /* synthetic */ LazyListState $contentListState;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<Boolean, Unit> $onShowDisplayDataSheetChanged;
        final /* synthetic */ boolean $showDisplayDataSheet;
        final /* synthetic */ GameDetailViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C163464(GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, GameDetailViewState gameDetailViewState, LazyListState lazyListState, boolean z, EventLogger eventLogger, Function1<? super Boolean, Unit> function1) {
            this.$callbacks = gdpV2ComboUiCallbacks;
            this.$viewState = gameDetailViewState;
            this.$contentListState = lazyListState;
            this.$showDisplayDataSheet = z;
            this.$eventLogger = eventLogger;
            this.$onShowDisplayDataSheetChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953205100, i2, -1, "com.robinhood.android.event.gamedetail.ui.ComboScreen.<anonymous> (GameDetailComboScreen.kt:212)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(gdpV2ComboUiCallbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GameDetailComboScreen3(gdpV2ComboUiCallbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks2 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(gdpV2ComboUiCallbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GameDetailComboScreen4(gdpV2ComboUiCallbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            GameDetailViewState gameDetailViewState = this.$viewState;
            GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks3 = this.$callbacks;
            LazyListState lazyListState = this.$contentListState;
            boolean z = this.$showDisplayDataSheet;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(this.$callbacks);
            final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks4 = this.$callbacks;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163464.invoke$lambda$3$lambda$2(gdpV2ComboUiCallbacks4, (UUID) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$callbacks);
            final EventLogger eventLogger = this.$eventLogger;
            final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks5 = this.$callbacks;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163464.invoke$lambda$5$lambda$4(eventLogger, gdpV2ComboUiCallbacks5, (ContractOptionData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function12 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance5 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$callbacks);
            final EventLogger eventLogger2 = this.$eventLogger;
            final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks6 = this.$callbacks;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163464.invoke$lambda$7$lambda$6(eventLogger2, gdpV2ComboUiCallbacks6, (ContractOptionData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function1 function13 = (Function1) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(this.$callbacks);
            final GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks7 = this.$callbacks;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboScreen2.C163464.invoke$lambda$9$lambda$8(gdpV2ComboUiCallbacks7, (ContractOptionData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function14 = (Function1) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onShowDisplayDataSheetChanged);
            final Function1<Boolean, Unit> function15 = this.$onShowDisplayDataSheetChanged;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailComboScreen2.C163464.invoke$lambda$11$lambda$10(function15);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            GameDetailContentKt.GameDetailContent(gameDetailViewState, gdpV2ComboUiCallbacks3, gdpV2ComboUiCallbacks3, gdpV2ComboUiCallbacks3, lazyListState, z, function1, function12, function13, function14, (Function0) objRememberedValue7, (Function1) kFunction, (Function0) kFunction2, modifierPadding, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, UUID uuid) {
            if (uuid != null) {
                gdpV2ComboUiCallbacks.selectPosition(uuid);
            } else {
                gdpV2ComboUiCallbacks.clearSelections();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, ContractOptionData contractOptionData) {
            Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
            String string2 = contractOptionData.getSelectedContract().getContractId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            GameDetailComboScreen2.logComboAction(eventLogger, string2, GameDetailComboScreen.SELECT);
            gdpV2ComboUiCallbacks.addContractSelection(contractOptionData.getSelectedContract(), contractOptionData.getContractColumnType());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(EventLogger eventLogger, GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, ContractOptionData contractOptionData) {
            Intrinsics.checkNotNullParameter(contractOptionData, "contractOptionData");
            String string2 = contractOptionData.getSelectedContract().getContractId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            GameDetailComboScreen2.logComboAction(eventLogger, string2, GameDetailComboScreen.DESELECT);
            gdpV2ComboUiCallbacks.removeContractSelection(contractOptionData.getSelectedContract());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(GdpV2ComboUiCallbacks gdpV2ComboUiCallbacks, ContractOptionData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            gdpV2ComboUiCallbacks.addContractSelectionAndOpenPicker(it.getSelectedContract(), it.getContractColumnType());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(Function1 function1) {
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final void logSettingClick(EventLogger eventLogger, boolean z) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, z ? EventAnalyticsString.GAME_DETAIL_PAGE_SETTING_TOGGLE_ON : EventAnalyticsString.GAME_DETAIL_PAGE_SETTING_TOGGLE_OFF, null, 4, null), null, null, false, 57, null);
    }

    public static final void logComboAction(EventLogger eventLogger, String contractId, GameDetailComboScreen action) {
        String str;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            str = "combos-add-" + contractId;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "combos-delete-" + contractId;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.EVENT_CONTRACT_COMBO_LEG, str, null, 4, null), null, null, false, 57, null);
    }
}

package com.robinhood.android.event.trade.orderform;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.OrderFormFocusedField;
import com.robinhood.android.event.trade.explainer.PriceExplainer;
import com.robinhood.android.event.trade.orderform.EventOrderFormScreen3;
import com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle;
import com.robinhood.android.eventcontracts.sharedeventui.ImageBackground4;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.WaveBackgroundData2;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventOrderFormScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a½\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a|\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010&\u001aW\u0010'\u001a\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020,2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010.\u001a\u00020,2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010/\u001aW\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020,2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u00107\u001a7\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u0002052\u0006\u00106\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010<\u001a\u0011\u0010=\u001a\u00020>*\u00020)H\u0007¢\u0006\u0002\u0010?¨\u0006@²\u0006\u0018\u0010A\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010C0BX\u008a\u008e\u0002²\u0006\f\u0010D\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, m3636d2 = {"EventOrderFormScreen", "", "state", "Lcom/robinhood/android/event/trade/EventOrderFormViewState;", "notionalErrorShakeAnimationId", "Ljava/util/UUID;", "eventOrderFormCallbacks", "Lcom/robinhood/android/event/trade/orderform/EventOrderFormCallbacks;", "onBackClick", "Lkotlin/Function0;", "onSwipeToTrade", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "onKeyPress", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onQuantityFieldFocused", "onPriceFieldFocused", "onResubmitOrder", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "onChangeOrderType", "onTimeInForceChanged", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState;Ljava/util/UUID;Lcom/robinhood/android/event/trade/orderform/EventOrderFormCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "OrderFormContent", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "orderFormContentData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "focusedField", "Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "onPriceInfoClick", "onChangeTimeInForce", "Lkotlin/ParameterName;", "name", "currentTimeInForce", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;Lcom/robinhood/android/event/trade/OrderFormFocusedField;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TopBar", "topBarTitle", "Lcom/robinhood/utils/resource/StringResource;", "orderTypeDisplay", "allowChangingOrderType", "", "onOrderTypesClicked", "showCloseAsBack", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", CreateTransferV2Composable3.NumpadTag, "showDelimiter", "continueButtonEnabled", "continueButtonLoading", "continueButtonStyle", "Lcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;", "callbacks", "(ZLkotlin/jvm/functions/Function1;ZZLcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;Lcom/robinhood/android/event/trade/orderform/EventOrderFormCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderFormContinueButton", "enabled", "loading", ResourceTypes.STYLE, "(ZZLcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;Lcom/robinhood/android/event/trade/orderform/EventOrderFormCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getText", "", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "feature-event-trade_externalDebug", "showPriceExplainer", "Lkotlin/Pair;", "", "showTimeInForceBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormScreen3 {

    /* compiled from: EventOrderFormScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderForm6.values().length];
            try {
                iArr[OrderForm6.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderForm6.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderForm6.SUBMITTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderForm6.SUBMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderForm6.CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderFormScreen6.values().length];
            try {
                iArr2[EventOrderFormScreen6.REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EventOrderFormScreen6.CLOSE_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormScreen$lambda$14(EventOrderFormViewState eventOrderFormViewState, UUID uuid, EventOrderFormCallbacks eventOrderFormCallbacks, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function1 function13, Function0 function04, Function1 function14, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        EventOrderFormScreen(eventOrderFormViewState, uuid, eventOrderFormCallbacks, function0, function1, function12, function02, function03, function13, function04, function14, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Numpad$lambda$18(boolean z, Function1 function1, boolean z2, boolean z3, EventOrderFormScreen6 eventOrderFormScreen6, EventOrderFormCallbacks eventOrderFormCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Numpad(z, function1, z2, z3, eventOrderFormScreen6, eventOrderFormCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContent$lambda$15(OrderForm6 orderForm6, EventOrderFormViewState.OrderFormContentData orderFormContentData, OrderFormFocusedField orderFormFocusedField, UUID uuid, Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i, Composer composer, int i2) {
        OrderFormContent(orderForm6, orderFormContentData, orderFormFocusedField, uuid, function0, function02, function03, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContinueButton$lambda$21(boolean z, boolean z2, EventOrderFormScreen6 eventOrderFormScreen6, EventOrderFormCallbacks eventOrderFormCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderFormContinueButton(z, z2, eventOrderFormScreen6, eventOrderFormCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBar$lambda$16(StringResource stringResource, StringResource stringResource2, boolean z, Function0 function0, Function0 function02, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TopBar(stringResource, stringResource2, z, function0, function02, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventOrderFormScreen(final EventOrderFormViewState state, final UUID uuid, final EventOrderFormCallbacks eventOrderFormCallbacks, final Function0<Unit> onBackClick, final Function1<? super UiEventOrderContext, Unit> onSwipeToTrade, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> onQuantityFieldFocused, final Function0<Unit> onPriceFieldFocused, final Function1<? super EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> onResubmitOrder, final Function0<Unit> onChangeOrderType, final Function1<? super OrderFormTimeInForce, Unit> onTimeInForceChanged, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        UUID uuid2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(eventOrderFormCallbacks, "eventOrderFormCallbacks");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSwipeToTrade, "onSwipeToTrade");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(onQuantityFieldFocused, "onQuantityFieldFocused");
        Intrinsics.checkNotNullParameter(onPriceFieldFocused, "onPriceFieldFocused");
        Intrinsics.checkNotNullParameter(onResubmitOrder, "onResubmitOrder");
        Intrinsics.checkNotNullParameter(onChangeOrderType, "onChangeOrderType");
        Intrinsics.checkNotNullParameter(onTimeInForceChanged, "onTimeInForceChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-300303136);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            uuid2 = uuid;
        } else {
            uuid2 = uuid;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(uuid2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(eventOrderFormCallbacks) : composerStartRestartGroup.changedInstance(eventOrderFormCallbacks) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSwipeToTrade) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onQuantityFieldFocused) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPriceFieldFocused) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onResubmitOrder) ? 67108864 : 33554432;
        }
        if ((i3 & 512) == 0) {
            i10 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(onChangeOrderType) ? 536870912 : 268435456 : 805306368;
            if ((i3 & 1024) == 0) {
                i5 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i5 = i2 | (composerStartRestartGroup.changedInstance(onTimeInForceChanged) ? 4 : 2);
            } else {
                i5 = i2;
            }
            int i11 = i5;
            i6 = i3 & 2048;
            if (i6 == 0) {
                i9 = i11 | 48;
                i7 = i6;
            } else {
                if ((i2 & 48) != 0) {
                    i7 = i6;
                    i8 = i11;
                    if ((i4 & 306783379) == 306783378 && (i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                    } else {
                        Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-300303136, i4, i8, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen (EventOrderFormScreen.kt:73)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventOrderFormScreen3.EventOrderFormScreen$lambda$1$lambda$0();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(-828481200);
                        if (EventOrderFormScreen$lambda$2(snapshotState).getFirst().booleanValue()) {
                            UUID eventContractId = state.getEventContractId();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventOrderFormScreen3.EventOrderFormScreen$lambda$5$lambda$4(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            PriceExplainer.PriceExplainerBottomSheet(eventContractId, (Function0) objRememberedValue3, state.getExchangeSource(), EventOrderFormScreen$lambda$2(snapshotState).getSecond(), null, null, composerStartRestartGroup, 0, 48);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr2 = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        int i12 = i8;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventOrderFormScreen3.EventOrderFormScreen$lambda$7$lambda$6();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(-828466815);
                        if (EventOrderFormScreen$lambda$8(snapshotState2) == null) {
                            OrderFormTimeInForce orderFormTimeInForceEventOrderFormScreen$lambda$8 = EventOrderFormScreen$lambda$8(snapshotState2);
                            EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData = state.getOrderFormContentData().getQuantityBasedData();
                            StringResource gtdTimeDisplay = quantityBasedData != null ? quantityBasedData.getGtdTimeDisplay() : null;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChanged2 = ((i12 & 14) == 4) | composerStartRestartGroup.changed(snapshotState2);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventOrderFormScreen3.EventOrderFormScreen$lambda$11$lambda$10(onTimeInForceChanged, snapshotState2, (OrderFormTimeInForce) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function1 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState2);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventOrderFormScreen3.EventOrderFormScreen$lambda$13$lambda$12(snapshotState2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EventOrderTimeInForceBottomSheet.EventOrderTimeInForceBottomSheet(orderFormTimeInForceEventOrderFormScreen$lambda$8, gtdTimeDisplay, function1, (Function0) objRememberedValue5, composerStartRestartGroup, StringResource.$stable << 3);
                            composer2 = composerStartRestartGroup;
                        } else {
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        EventContractStyle tradeStyles = state.getTradeStyles();
                        composer2.startReplaceGroup(-828449559);
                        WaveBackgroundData2 orderForm = tradeStyles != null ? null : tradeStyles.getOrderForm(composer2, 0);
                        composer2.endReplaceGroup();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Modifier modifier4 = modifier3;
                        Composer composer3 = composer2;
                        final UUID uuid3 = uuid2;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1701225941, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope OptionalEventContractBackground, Composer composer4, int i13) {
                                Intrinsics.checkNotNullParameter(OptionalEventContractBackground, "$this$OptionalEventContractBackground");
                                if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1701225941, i13, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous> (EventOrderFormScreen.kt:105)");
                                }
                                OrderForm6 orderFormState = state.getOrderFormState();
                                UiEventOrderContext candidateOrder = state.getCandidateOrder();
                                long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                                long nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova();
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function1<UiEventOrderContext, Unit> function12 = onSwipeToTrade;
                                final EventOrderFormViewState eventOrderFormViewState = state;
                                final Function0<Unit> function0 = onBackClick;
                                final Function0<Unit> function02 = onChangeOrderType;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-934983417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i14) {
                                        if ((i14 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-934983417, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:110)");
                                        }
                                        StringResource topBarTitle = eventOrderFormViewState.getOrderFormContentData().getTopBarTitle();
                                        StringResource orderTypeDisplay = eventOrderFormViewState.getOrderFormContentData().getOrderTypeDisplay();
                                        boolean allowChangingOrderType = eventOrderFormViewState.getAllowChangingOrderType();
                                        Function0<Unit> function03 = function0;
                                        Function0<Unit> function04 = function02;
                                        boolean showCloseAsBack = eventOrderFormViewState.getShowCloseAsBack();
                                        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                                        int i15 = StringResource.$stable;
                                        EventOrderFormScreen3.TopBar(topBarTitle, orderTypeDisplay, allowChangingOrderType, function03, function04, showCloseAsBack, modifierStatusBarsPadding, composer5, i15 | (i15 << 3), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(159843016, true, new AnonymousClass2(state, uuid3, snapshotState, onQuantityFieldFocused, onPriceFieldFocused, snapshotState2), composer4, 54);
                                Function2<Composer, Integer, Unit> lambda$1254669449$feature_event_trade_externalDebug = EventOrderFormScreen.INSTANCE.getLambda$1254669449$feature_event_trade_externalDebug();
                                final EventOrderFormViewState eventOrderFormViewState2 = state;
                                final Function1<KeyEvent, Unit> function13 = onKeyPress;
                                final EventOrderFormCallbacks eventOrderFormCallbacks2 = eventOrderFormCallbacks;
                                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(911680372, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer5, Integer num) {
                                        invoke(modifier5, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Modifier numpadModifier, Composer composer5, int i14) {
                                        Intrinsics.checkNotNullParameter(numpadModifier, "numpadModifier");
                                        if ((i14 & 6) == 0) {
                                            i14 |= composer5.changed(numpadModifier) ? 4 : 2;
                                        }
                                        if ((i14 & 19) == 18 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(911680372, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:149)");
                                        }
                                        EventOrderFormScreen3.Numpad(eventOrderFormViewState2.getShowDelimiterOnNumpad(), function13, eventOrderFormViewState2.getOrderFormContentData().isContinueButtonEnabled(), eventOrderFormViewState2.getOrderFormContentData().isContinueButtonLoading(), eventOrderFormViewState2.getOrderFormContentData().getContinueButtonStyle(), eventOrderFormCallbacks2, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null).then(numpadModifier), composer5, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambda3.rememberComposableLambda(244181452, true, new AnonymousClass4(state, snapshotState), composer4, 54);
                                final EventOrderFormViewState eventOrderFormViewState3 = state;
                                final Function0<Unit> function03 = onBackClick;
                                final Function1<EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function14 = onResubmitOrder;
                                OrderForm2.m26341OrderFormVzGUr2s(orderFormState, candidateOrder, function12, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, lambda$1254669449$feature_event_trade_externalDebug, modifierFillMaxSize$default2, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda5, false, ComposableLambda3.rememberComposableLambda(-278826614, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.5
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                        invoke(animatedVisibilityScope, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final AnimatedVisibilityScope OrderForm, Composer composer5, int i14) {
                                        Intrinsics.checkNotNullParameter(OrderForm, "$this$OrderForm");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-278826614, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:162)");
                                        }
                                        final EventOrderFormViewState.ReceiptData receiptData = eventOrderFormViewState3.getReceiptData();
                                        if (receiptData != null) {
                                            EventOrderFormViewState eventOrderFormViewState4 = eventOrderFormViewState3;
                                            final Function0<Unit> function04 = function03;
                                            final Function1<EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function15 = function14;
                                            EventContractStyle tradeStyles2 = eventOrderFormViewState4.getTradeStyles();
                                            composer5.startReplaceGroup(-1664398543);
                                            WaveBackgroundData2 receipt = tradeStyles2 == null ? null : tradeStyles2.getReceipt(composer5, 0);
                                            composer5.endReplaceGroup();
                                            ImageBackground4.OptionalEventContractBackground(receipt, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter(), ComposableLambda3.rememberComposableLambda(-1154162920, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$5$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer6, Integer num) {
                                                    invoke(boxScope, composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BoxScope OptionalEventContractBackground2, Composer composer6, int i15) {
                                                    Intrinsics.checkNotNullParameter(OptionalEventContractBackground2, "$this$OptionalEventContractBackground");
                                                    if ((i15 & 17) == 16 && composer6.getSkipping()) {
                                                        composer6.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1154162920, i15, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventOrderFormScreen.kt:168)");
                                                    }
                                                    final AnimatedVisibilityScope animatedVisibilityScope = OrderForm;
                                                    final EventOrderFormViewState.ReceiptData receiptData2 = receiptData;
                                                    final Function0<Unit> function05 = function04;
                                                    final Function1<EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function16 = function15;
                                                    BentoThemeOverlays.DayNightThemeOverlay(false, ComposableLambda3.rememberComposableLambda(2108688871, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$5$1$1.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i16) {
                                                            if ((i16 & 3) == 2 && composer7.getSkipping()) {
                                                                composer7.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2108688871, i16, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventOrderFormScreen.kt:169)");
                                                            }
                                                            EventOrderReceipt3.EventOrderReceipt(animatedVisibilityScope, receiptData2, function05, function16, Clip.clip(Modifier.INSTANCE, RectangleShape2.getRectangleShape()), composer7, 24576, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer6, 54), composer6, 54);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer5, 54), composer5, 3504, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), jM6725getTransparent0d7_KjU, nova, null, null, null, composer4, 115043328, 54, 57856);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: EventOrderFormScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ UUID $notionalErrorShakeAnimationId;
                                final /* synthetic */ Function0<Unit> $onPriceFieldFocused;
                                final /* synthetic */ Function0<Unit> $onQuantityFieldFocused;
                                final /* synthetic */ SnapshotState<Tuples2<Boolean, Integer>> $showPriceExplainer$delegate;
                                final /* synthetic */ SnapshotState<OrderFormTimeInForce> $showTimeInForceBottomSheet$delegate;
                                final /* synthetic */ EventOrderFormViewState $state;

                                AnonymousClass2(EventOrderFormViewState eventOrderFormViewState, UUID uuid, SnapshotState<Tuples2<Boolean, Integer>> snapshotState, Function0<Unit> function0, Function0<Unit> function02, SnapshotState<OrderFormTimeInForce> snapshotState2) {
                                    this.$state = eventOrderFormViewState;
                                    this.$notionalErrorShakeAnimationId = uuid;
                                    this.$showPriceExplainer$delegate = snapshotState;
                                    this.$onQuantityFieldFocused = function0;
                                    this.$onPriceFieldFocused = function02;
                                    this.$showTimeInForceBottomSheet$delegate = snapshotState2;
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
                                        ComposerKt.traceEventStart(159843016, i, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:121)");
                                    }
                                    OrderForm6 orderFormState = this.$state.getOrderFormState();
                                    EventOrderFormViewState.OrderFormContentData orderFormContentData = this.$state.getOrderFormContentData();
                                    OrderFormFocusedField focusedField = this.$state.getFocusedField();
                                    UUID uuid = this.$notionalErrorShakeAnimationId;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$showPriceExplainer$delegate);
                                    final SnapshotState<Tuples2<Boolean, Integer>> snapshotState = this.$showPriceExplainer$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return EventOrderFormScreen3.C164804.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    Function0<Unit> function02 = this.$onQuantityFieldFocused;
                                    Function0<Unit> function03 = this.$onPriceFieldFocused;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer.changed(this.$showTimeInForceBottomSheet$delegate);
                                    final SnapshotState<OrderFormTimeInForce> snapshotState2 = this.$showTimeInForceBottomSheet$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return EventOrderFormScreen3.C164804.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState2, (OrderFormTimeInForce) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    EventOrderFormScreen3.OrderFormContent(orderFormState, orderFormContentData, focusedField, uuid, function0, function02, function03, (Function1) objRememberedValue2, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    EventOrderFormScreen3.EventOrderFormScreen$lambda$3(snapshotState, Tuples4.m3642to(Boolean.TRUE, null));
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, OrderFormTimeInForce currentTimeInForce) {
                                    Intrinsics.checkNotNullParameter(currentTimeInForce, "currentTimeInForce");
                                    EventOrderFormScreen3.EventOrderFormScreen$lambda$9(snapshotState, currentTimeInForce);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: EventOrderFormScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$4, reason: invalid class name */
                            static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<Tuples2<Boolean, Integer>> $showPriceExplainer$delegate;
                                final /* synthetic */ EventOrderFormViewState $state;

                                AnonymousClass4(EventOrderFormViewState eventOrderFormViewState, SnapshotState<Tuples2<Boolean, Integer>> snapshotState) {
                                    this.$state = eventOrderFormViewState;
                                    this.$showPriceExplainer$delegate = snapshotState;
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
                                        ComposerKt.traceEventStart(244181452, i, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:137)");
                                    }
                                    StringResource orderSummaryString = this.$state.getOrderFormContentData().getOrderSummaryString();
                                    if (orderSummaryString != null) {
                                        EventOrderFormViewState eventOrderFormViewState = this.$state;
                                        final SnapshotState<Tuples2<Boolean, Integer>> snapshotState = this.$showPriceExplainer$delegate;
                                        boolean showPriceInfoByOrderSummary = eventOrderFormViewState.getOrderFormContentData().getShowPriceInfoByOrderSummary();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(snapshotState);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$4$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return EventOrderFormScreen3.C164804.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        OrderFormComponents.OrderSummarySection(orderSummaryString, showPriceInfoByOrderSummary, (Function0) objRememberedValue, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composer, 6, 1), composer, StringResource.$stable, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
                                    EventOrderFormScreen3.EventOrderFormScreen$lambda$3(snapshotState, Tuples4.m3642to(Boolean.TRUE, Integer.valueOf(C16465R.string.order_form_notional_pricing_disclosure_title)));
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54);
                        composerStartRestartGroup = composer3;
                        ImageBackground4.OptionalEventContractBackground(orderForm, modifierFillMaxSize$default, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 3072, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EventOrderFormScreen3.EventOrderFormScreen$lambda$14(state, uuid, eventOrderFormCallbacks, onBackClick, onSwipeToTrade, onKeyPress, onQuantityFieldFocused, onPriceFieldFocused, onResubmitOrder, onChangeOrderType, onTimeInForceChanged, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i6;
                i9 = i11 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
            }
            i8 = i9;
            if ((i4 & 306783379) == 306783378) {
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(-828481200);
                if (EventOrderFormScreen$lambda$2(snapshotState).getFirst().booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr22 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                int i122 = i8;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(-828466815);
                if (EventOrderFormScreen$lambda$8(snapshotState2) == null) {
                }
                composer2.endReplaceGroup();
                EventContractStyle tradeStyles2 = state.getTradeStyles();
                composer2.startReplaceGroup(-828449559);
                if (tradeStyles2 != null) {
                }
                composer2.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Modifier modifier42 = modifier3;
                Composer composer32 = composer2;
                final UUID uuid32 = uuid2;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1701225941, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                        invoke(boxScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope OptionalEventContractBackground, Composer composer4, int i13) {
                        Intrinsics.checkNotNullParameter(OptionalEventContractBackground, "$this$OptionalEventContractBackground");
                        if ((i13 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1701225941, i13, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous> (EventOrderFormScreen.kt:105)");
                        }
                        OrderForm6 orderFormState = state.getOrderFormState();
                        UiEventOrderContext candidateOrder = state.getCandidateOrder();
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        long nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova();
                        Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function1<UiEventOrderContext, Unit> function12 = onSwipeToTrade;
                        final EventOrderFormViewState eventOrderFormViewState = state;
                        final Function0<Unit> function0 = onBackClick;
                        final Function0<Unit> function02 = onChangeOrderType;
                        ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-934983417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i14) {
                                if ((i14 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-934983417, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:110)");
                                }
                                StringResource topBarTitle = eventOrderFormViewState.getOrderFormContentData().getTopBarTitle();
                                StringResource orderTypeDisplay = eventOrderFormViewState.getOrderFormContentData().getOrderTypeDisplay();
                                boolean allowChangingOrderType = eventOrderFormViewState.getAllowChangingOrderType();
                                Function0<Unit> function03 = function0;
                                Function0<Unit> function04 = function02;
                                boolean showCloseAsBack = eventOrderFormViewState.getShowCloseAsBack();
                                Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
                                int i15 = StringResource.$stable;
                                EventOrderFormScreen3.TopBar(topBarTitle, orderTypeDisplay, allowChangingOrderType, function03, function04, showCloseAsBack, modifierStatusBarsPadding, composer5, i15 | (i15 << 3), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54);
                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(159843016, true, new AnonymousClass2(state, uuid32, snapshotState, onQuantityFieldFocused, onPriceFieldFocused, snapshotState2), composer4, 54);
                        Function2<Composer, Integer, Unit> lambda$1254669449$feature_event_trade_externalDebug = EventOrderFormScreen.INSTANCE.getLambda$1254669449$feature_event_trade_externalDebug();
                        final EventOrderFormViewState eventOrderFormViewState2 = state;
                        final Function1<? super KeyEvent, Unit> function13 = onKeyPress;
                        final EventOrderFormCallbacks eventOrderFormCallbacks2 = eventOrderFormCallbacks;
                        ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(911680372, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer5, Integer num) {
                                invoke(modifier5, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Modifier numpadModifier, Composer composer5, int i14) {
                                Intrinsics.checkNotNullParameter(numpadModifier, "numpadModifier");
                                if ((i14 & 6) == 0) {
                                    i14 |= composer5.changed(numpadModifier) ? 4 : 2;
                                }
                                if ((i14 & 19) == 18 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911680372, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:149)");
                                }
                                EventOrderFormScreen3.Numpad(eventOrderFormViewState2.getShowDelimiterOnNumpad(), function13, eventOrderFormViewState2.getOrderFormContentData().isContinueButtonEnabled(), eventOrderFormViewState2.getOrderFormContentData().isContinueButtonLoading(), eventOrderFormViewState2.getOrderFormContentData().getContinueButtonStyle(), eventOrderFormCallbacks2, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null).then(numpadModifier), composer5, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54);
                        ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambda3.rememberComposableLambda(244181452, true, new AnonymousClass4(state, snapshotState), composer4, 54);
                        final EventOrderFormViewState eventOrderFormViewState3 = state;
                        final Function0<Unit> function03 = onBackClick;
                        final Function1<? super EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function14 = onResubmitOrder;
                        OrderForm2.m26341OrderFormVzGUr2s(orderFormState, candidateOrder, function12, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda3, lambda$1254669449$feature_event_trade_externalDebug, modifierFillMaxSize$default22, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda5, false, ComposableLambda3.rememberComposableLambda(-278826614, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.EventOrderFormScreen.4.5
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num) {
                                invoke(animatedVisibilityScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final AnimatedVisibilityScope OrderForm, Composer composer5, int i14) {
                                Intrinsics.checkNotNullParameter(OrderForm, "$this$OrderForm");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-278826614, i14, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:162)");
                                }
                                final EventOrderFormViewState.ReceiptData receiptData = eventOrderFormViewState3.getReceiptData();
                                if (receiptData != null) {
                                    EventOrderFormViewState eventOrderFormViewState4 = eventOrderFormViewState3;
                                    final Function0<Unit> function04 = function03;
                                    final Function1<? super EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function15 = function14;
                                    EventContractStyle tradeStyles22 = eventOrderFormViewState4.getTradeStyles();
                                    composer5.startReplaceGroup(-1664398543);
                                    WaveBackgroundData2 receipt = tradeStyles22 == null ? null : tradeStyles22.getReceipt(composer5, 0);
                                    composer5.endReplaceGroup();
                                    ImageBackground4.OptionalEventContractBackground(receipt, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter(), ComposableLambda3.rememberComposableLambda(-1154162920, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$5$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer6, Integer num) {
                                            invoke(boxScope, composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope OptionalEventContractBackground2, Composer composer6, int i15) {
                                            Intrinsics.checkNotNullParameter(OptionalEventContractBackground2, "$this$OptionalEventContractBackground");
                                            if ((i15 & 17) == 16 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1154162920, i15, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventOrderFormScreen.kt:168)");
                                            }
                                            final AnimatedVisibilityScope animatedVisibilityScope = OrderForm;
                                            final EventOrderFormViewState.ReceiptData receiptData2 = receiptData;
                                            final Function0<Unit> function05 = function04;
                                            final Function1<? super EventOrderFormViewState.ReceiptData.QuickResubmit, Unit> function16 = function15;
                                            BentoThemeOverlays.DayNightThemeOverlay(false, ComposableLambda3.rememberComposableLambda(2108688871, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$5$1$1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                    invoke(composer7, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer7, int i16) {
                                                    if ((i16 & 3) == 2 && composer7.getSkipping()) {
                                                        composer7.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2108688871, i16, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EventOrderFormScreen.kt:169)");
                                                    }
                                                    EventOrderReceipt3.EventOrderReceipt(animatedVisibilityScope, receiptData2, function05, function16, Clip.clip(Modifier.INSTANCE, RectangleShape2.getRectangleShape()), composer7, 24576, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer6, 54), composer6, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer5, 54), composer5, 3504, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), jM6725getTransparent0d7_KjU, nova, null, null, null, composer4, 115043328, 54, 57856);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: EventOrderFormScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ UUID $notionalErrorShakeAnimationId;
                        final /* synthetic */ Function0<Unit> $onPriceFieldFocused;
                        final /* synthetic */ Function0<Unit> $onQuantityFieldFocused;
                        final /* synthetic */ SnapshotState<Tuples2<Boolean, Integer>> $showPriceExplainer$delegate;
                        final /* synthetic */ SnapshotState<OrderFormTimeInForce> $showTimeInForceBottomSheet$delegate;
                        final /* synthetic */ EventOrderFormViewState $state;

                        AnonymousClass2(EventOrderFormViewState eventOrderFormViewState, UUID uuid, SnapshotState<Tuples2<Boolean, Integer>> snapshotState, Function0<Unit> function0, Function0<Unit> function02, SnapshotState<OrderFormTimeInForce> snapshotState2) {
                            this.$state = eventOrderFormViewState;
                            this.$notionalErrorShakeAnimationId = uuid;
                            this.$showPriceExplainer$delegate = snapshotState;
                            this.$onQuantityFieldFocused = function0;
                            this.$onPriceFieldFocused = function02;
                            this.$showTimeInForceBottomSheet$delegate = snapshotState2;
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
                                ComposerKt.traceEventStart(159843016, i, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:121)");
                            }
                            OrderForm6 orderFormState = this.$state.getOrderFormState();
                            EventOrderFormViewState.OrderFormContentData orderFormContentData = this.$state.getOrderFormContentData();
                            OrderFormFocusedField focusedField = this.$state.getFocusedField();
                            UUID uuid = this.$notionalErrorShakeAnimationId;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$showPriceExplainer$delegate);
                            final SnapshotState snapshotState = this.$showPriceExplainer$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return EventOrderFormScreen3.C164804.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            Function0<Unit> function02 = this.$onQuantityFieldFocused;
                            Function0<Unit> function03 = this.$onPriceFieldFocused;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged2 = composer.changed(this.$showTimeInForceBottomSheet$delegate);
                            final SnapshotState snapshotState2 = this.$showTimeInForceBottomSheet$delegate;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EventOrderFormScreen3.C164804.AnonymousClass2.invoke$lambda$3$lambda$2(snapshotState2, (OrderFormTimeInForce) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            EventOrderFormScreen3.OrderFormContent(orderFormState, orderFormContentData, focusedField, uuid, function0, function02, function03, (Function1) objRememberedValue2, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                            EventOrderFormScreen3.EventOrderFormScreen$lambda$3(snapshotState, Tuples4.m3642to(Boolean.TRUE, null));
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, OrderFormTimeInForce currentTimeInForce) {
                            Intrinsics.checkNotNullParameter(currentTimeInForce, "currentTimeInForce");
                            EventOrderFormScreen3.EventOrderFormScreen$lambda$9(snapshotState, currentTimeInForce);
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: EventOrderFormScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$4, reason: invalid class name */
                    static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState<Tuples2<Boolean, Integer>> $showPriceExplainer$delegate;
                        final /* synthetic */ EventOrderFormViewState $state;

                        AnonymousClass4(EventOrderFormViewState eventOrderFormViewState, SnapshotState<Tuples2<Boolean, Integer>> snapshotState) {
                            this.$state = eventOrderFormViewState;
                            this.$showPriceExplainer$delegate = snapshotState;
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
                                ComposerKt.traceEventStart(244181452, i, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormScreen.<anonymous>.<anonymous> (EventOrderFormScreen.kt:137)");
                            }
                            StringResource orderSummaryString = this.$state.getOrderFormContentData().getOrderSummaryString();
                            if (orderSummaryString != null) {
                                EventOrderFormViewState eventOrderFormViewState = this.$state;
                                final SnapshotState snapshotState = this.$showPriceExplainer$delegate;
                                boolean showPriceInfoByOrderSummary = eventOrderFormViewState.getOrderFormContentData().getShowPriceInfoByOrderSummary();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(snapshotState);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$EventOrderFormScreen$4$4$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EventOrderFormScreen3.C164804.AnonymousClass4.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                OrderFormComponents.OrderSummarySection(orderSummaryString, showPriceInfoByOrderSummary, (Function0) objRememberedValue, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), composer, 6, 1), composer, StringResource.$stable, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
                            EventOrderFormScreen3.EventOrderFormScreen$lambda$3(snapshotState, Tuples4.m3642to(Boolean.TRUE, Integer.valueOf(C16465R.string.order_form_notional_pricing_disclosure_title)));
                            return Unit.INSTANCE;
                        }
                    }
                }, composer32, 54);
                composerStartRestartGroup = composer32;
                ImageBackground4.OptionalEventContractBackground(orderForm, modifierFillMaxSize$default2, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 3072, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 |= i10;
        if ((i3 & 1024) == 0) {
        }
        int i112 = i5;
        i6 = i3 & 2048;
        if (i6 == 0) {
        }
        i8 = i9;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState EventOrderFormScreen$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Tuples4.m3642to(Boolean.FALSE, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormScreen$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(Tuples4.m3642to(Boolean.FALSE, null));
        return Unit.INSTANCE;
    }

    private static final Tuples2<Boolean, Integer> EventOrderFormScreen$lambda$2(SnapshotState<Tuples2<Boolean, Integer>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final OrderFormTimeInForce EventOrderFormScreen$lambda$8(SnapshotState<OrderFormTimeInForce> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState EventOrderFormScreen$lambda$7$lambda$6() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* compiled from: EventOrderFormScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$OrderFormContent$1 */
    static final class C164821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OrderFormFocusedField $focusedField;
        final /* synthetic */ boolean $isInEditingState;
        final /* synthetic */ UUID $notionalErrorShakeAnimationId;
        final /* synthetic */ Function1<OrderFormTimeInForce, Unit> $onChangeTimeInForce;
        final /* synthetic */ Function0<Unit> $onPriceFieldFocused;
        final /* synthetic */ Function0<Unit> $onPriceInfoClick;
        final /* synthetic */ Function0<Unit> $onQuantityFieldFocused;
        final /* synthetic */ EventOrderFormViewState.OrderFormContentData $orderFormContentData;

        /* JADX WARN: Multi-variable type inference failed */
        C164821(EventOrderFormViewState.OrderFormContentData orderFormContentData, boolean z, OrderFormFocusedField orderFormFocusedField, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super OrderFormTimeInForce, Unit> function1, UUID uuid) {
            this.$orderFormContentData = orderFormContentData;
            this.$isInEditingState = z;
            this.$focusedField = orderFormFocusedField;
            this.$onPriceInfoClick = function0;
            this.$onQuantityFieldFocused = function02;
            this.$onPriceFieldFocused = function03;
            this.$onChangeTimeInForce = function1;
            this.$notionalErrorShakeAnimationId = uuid;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586558491, i, -1, "com.robinhood.android.event.trade.orderform.OrderFormContent.<anonymous> (EventOrderFormScreen.kt:208)");
            }
            final EventOrderFormViewState.OrderFormContentData orderFormContentData = this.$orderFormContentData;
            final boolean z = this.$isInEditingState;
            final OrderFormFocusedField orderFormFocusedField = this.$focusedField;
            final Function0<Unit> function0 = this.$onPriceInfoClick;
            final Function0<Unit> function02 = this.$onQuantityFieldFocused;
            final Function0<Unit> function03 = this.$onPriceFieldFocused;
            final Function1<OrderFormTimeInForce, Unit> function1 = this.$onChangeTimeInForce;
            final UUID uuid = this.$notionalErrorShakeAnimationId;
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
            String individualAccountNumber = orderFormContentData.getIndividualAccountNumber();
            UUID contractId = orderFormContentData.getContractId();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            InfoBannerComponent.InfoBannerComponent(individualAccountNumber, z ? IacInfoBannerLocation.INFO_BANNER_EVENTS_ORDER_PAGE_EDITING_TOP_LEVEL : IacInfoBannerLocation.INFO_BANNER_EVENTS_ORDER_PAGE_REVIEWING_TOP_LEVEL, null, contractId, null, null, null, null, null, null, null, androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 2, null), null, composer, 0, 0, 6132);
            Boolean boolValueOf = Boolean.valueOf(orderFormContentData.getQuantityBasedData() != null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$OrderFormContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EventOrderFormScreen3.C164821.invoke$lambda$2$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, "orderFormContentTransition", null, ComposableLambda3.rememberComposableLambda(1708357836, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$OrderFormContent$1$1$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z2, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1708357836, i3, -1, "com.robinhood.android.event.trade.orderform.OrderFormContent.<anonymous>.<anonymous>.<anonymous> (EventOrderFormScreen.kt:229)");
                    }
                    if (z2) {
                        composer2.startReplaceGroup(-1674090147);
                        EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData = orderFormContentData.getQuantityBasedData();
                        if (quantityBasedData != null) {
                            OrderFormContentRows3.OrderFormContentRows(quantityBasedData, orderFormFocusedField, function0, function02, function03, function1, null, composer2, 0, 64);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1673525327);
                        EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData = orderFormContentData.getNotionalBasedData();
                        if (notionalBasedData != null) {
                            EventOrderFormDollarInputContent.EventOrderFormDollarInputContent(notionalBasedData, z, uuid, null, composer2, 0, 8);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1597824, 42);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$2$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormScreen$lambda$11$lambda$10(Function1 function1, SnapshotState snapshotState, OrderFormTimeInForce it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormScreen$lambda$13$lambda$12(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* compiled from: EventOrderFormScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$TopBar$3 */
    static final class C164853 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowChangingOrderType;
        final /* synthetic */ Function0<Unit> $onOrderTypesClicked;
        final /* synthetic */ StringResource $orderTypeDisplay;

        C164853(StringResource stringResource, boolean z, Function0<Unit> function0) {
            this.$orderTypeDisplay = stringResource;
            this.$allowChangingOrderType = z;
            this.$onOrderTypesClicked = function0;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(443393145, i, -1, "com.robinhood.android.event.trade.orderform.TopBar.<anonymous> (EventOrderFormScreen.kt:279)");
            }
            if (this.$orderTypeDisplay == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z = this.$allowChangingOrderType;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onOrderTypesClicked);
            final Function0<Unit> function0 = this.$onOrderTypesClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$TopBar$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventOrderFormScreen3.C164853.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, z, null, null, (Function0) objRememberedValue, 6, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            StringResource stringResource = this.$orderTypeDisplay;
            boolean z2 = this.$allowChangingOrderType;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String text = EventOrderFormScreen3.getText(stringResource, composer, StringResource.$stable);
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8170);
            composer.startReplaceGroup(2080341009);
            if (z2) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DOWN_FILL_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventOrderFormScreen$lambda$3(SnapshotState<Tuples2<Boolean, Integer>> snapshotState, Tuples2<Boolean, Integer> tuples2) {
        snapshotState.setValue(tuples2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventOrderFormScreen$lambda$9(SnapshotState<OrderFormTimeInForce> snapshotState, OrderFormTimeInForce orderFormTimeInForce) {
        snapshotState.setValue(orderFormTimeInForce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void OrderFormContent(final OrderForm6 orderForm6, final EventOrderFormViewState.OrderFormContentData orderFormContentData, final OrderFormFocusedField orderFormFocusedField, final UUID uuid, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function1<? super OrderFormTimeInForce, Unit> function1, Composer composer, final int i) {
        int i2;
        UUID uuid2;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function1<? super OrderFormTimeInForce, Unit> function12;
        ?? r0;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1312376696);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(orderForm6.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(orderFormContentData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(orderFormFocusedField.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            uuid2 = uuid;
            i2 |= composerStartRestartGroup.changedInstance(uuid2) ? 2048 : 1024;
        } else {
            uuid2 = uuid;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function04 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i) == 0) {
            function05 = function03;
            i2 |= composerStartRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        } else {
            function05 = function03;
        }
        if ((12582912 & i) == 0) {
            function12 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
        } else {
            function12 = function1;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1312376696, i2, -1, "com.robinhood.android.event.trade.orderform.OrderFormContent (EventOrderFormScreen.kt:198)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[orderForm6.ordinal()];
            if (i3 == 1) {
                r0 = 1;
                z = true;
            } else {
                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
                r0 = 1;
            }
            DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(-586558491, r0, new C164821(orderFormContentData, z, orderFormFocusedField, function0, function04, function05, function12, uuid2), composerStartRestartGroup, 54), composerStartRestartGroup, 48, r0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderFormScreen3.OrderFormContent$lambda$15(orderForm6, orderFormContentData, orderFormFocusedField, uuid, function0, function02, function03, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopBar(final StringResource stringResource, final StringResource stringResource2, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-150661673);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-150661673, i3, -1, "com.robinhood.android.event.trade.orderform.TopBar (EventOrderFormScreen.kt:264)");
                }
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1254400572, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.TopBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1254400572, i5, -1, "com.robinhood.android.event.trade.orderform.TopBar.<anonymous> (EventOrderFormScreen.kt:269)");
                        }
                        StringResource stringResource3 = stringResource;
                        if (stringResource3 != null) {
                            BentoText2.m20747BentoText38GnDrw(EventOrderFormScreen3.getText(stringResource3, composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(669703448, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.TopBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i6 = ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(669703448, i6, -1, "com.robinhood.android.event.trade.orderform.TopBar.<anonymous> (EventOrderFormScreen.kt:272)");
                        }
                        if (z2) {
                            composer3.startReplaceGroup(1012366526);
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1012447808);
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(443393145, true, new C164853(stringResource2, z, function02), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 15) & 112) | 12586374, 0, 1904);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderFormScreen3.TopBar$lambda$16(stringResource, stringResource2, z, function0, function02, z2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1254400572, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.TopBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1254400572, i5, -1, "com.robinhood.android.event.trade.orderform.TopBar.<anonymous> (EventOrderFormScreen.kt:269)");
                    }
                    StringResource stringResource3 = stringResource;
                    if (stringResource3 != null) {
                        BentoText2.m20747BentoText38GnDrw(EventOrderFormScreen3.getText(stringResource3, composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier4, ComposableLambda3.rememberComposableLambda(669703448, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt.TopBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i6 = ((i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669703448, i6, -1, "com.robinhood.android.event.trade.orderform.TopBar.<anonymous> (EventOrderFormScreen.kt:272)");
                    }
                    if (z2) {
                        composer3.startReplaceGroup(1012366526);
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1012447808);
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(443393145, true, new C164853(stringResource2, z, function02), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, ((i3 >> 15) & 112) | 12586374, 0, 1904);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Numpad(final boolean z, final Function1<? super KeyEvent, Unit> function1, final boolean z2, final boolean z3, final EventOrderFormScreen6 eventOrderFormScreen6, final EventOrderFormCallbacks eventOrderFormCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z4;
        int i3;
        Function1<? super KeyEvent, Unit> function12;
        boolean z5;
        boolean z6;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1867551099);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(eventOrderFormScreen6.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(eventOrderFormCallbacks) : composerStartRestartGroup.changedInstance(eventOrderFormCallbacks) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i3;
            if ((599187 & i4) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1867551099, i4, -1, "com.robinhood.android.event.trade.orderform.Numpad (EventOrderFormScreen.kt:317)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                float fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM();
                float fM21592getMediumD9Ej5fM2 = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM();
                OrderFormContinueButton(z5, z6, eventOrderFormScreen6, eventOrderFormCallbacks, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, fM21592getMediumD9Ej5fM, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), fM21592getMediumD9Ej5fM2, 0.0f, 8, null), composerStartRestartGroup, (i4 >> 6) & 8190, 0);
                Modifier modifier5 = modifier4;
                BentoNumpad3.BentoNumpad(null, function12, z4, null, false, false, composerStartRestartGroup, (i4 & 112) | 3072 | ((i4 << 6) & 896), 49);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderFormScreen3.Numpad$lambda$18(z, function1, z2, z3, eventOrderFormScreen6, eventOrderFormCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i3;
        if ((599187 & i4) != 599186) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                float fM21592getMediumD9Ej5fM3 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM();
                float fM21592getMediumD9Ej5fM22 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM();
                OrderFormContinueButton(z5, z6, eventOrderFormScreen6, eventOrderFormCallbacks, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, fM21592getMediumD9Ej5fM3, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), fM21592getMediumD9Ej5fM22, 0.0f, 8, null), composerStartRestartGroup, (i4 >> 6) & 8190, 0);
                Modifier modifier52 = modifier4;
                BentoNumpad3.BentoNumpad(null, function12, z4, null, false, false, composerStartRestartGroup, (i4 & 112) | 3072 | ((i4 << 6) & 896), 49);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OrderFormContinueButton(final boolean z, final boolean z2, EventOrderFormScreen6 eventOrderFormScreen6, final EventOrderFormCallbacks eventOrderFormCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        boolean z6;
        Object objRememberedValue;
        final EventOrderFormScreen6 eventOrderFormScreen62;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694904844);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(eventOrderFormScreen6.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(eventOrderFormCallbacks) : composerStartRestartGroup.changedInstance(eventOrderFormCallbacks) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1694904844, i3, -1, "com.robinhood.android.event.trade.orderform.OrderFormContinueButton (EventOrderFormScreen.kt:354)");
                }
                BentoButtons.Type type2 = eventOrderFormScreen6.getType();
                z5 = false;
                String strStringResource = StringResources_androidKt.stringResource(eventOrderFormScreen6.getText(), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z7 = (i3 & 896) != 256;
                if ((i3 & 7168) != 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(eventOrderFormCallbacks))) {
                    z5 = true;
                }
                z6 = z7 | z5;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    eventOrderFormScreen62 = eventOrderFormScreen6;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventOrderFormScreen3.OrderFormContinueButton$lambda$20$lambda$19(eventOrderFormScreen62, eventOrderFormCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    eventOrderFormScreen62 = eventOrderFormScreen6;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, type2, z3, z4, null, null, null, null, false, null, composer2, (i3 << 15) & 4128768, 0, 8072);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                eventOrderFormScreen62 = eventOrderFormScreen6;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final EventOrderFormScreen6 eventOrderFormScreen63 = eventOrderFormScreen62;
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderFormScreen3.OrderFormContinueButton$lambda$21(z, z2, eventOrderFormScreen63, eventOrderFormCallbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoButtons.Type type22 = eventOrderFormScreen6.getType();
            z5 = false;
            String strStringResource2 = StringResources_androidKt.stringResource(eventOrderFormScreen6.getText(), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 896) != 256) {
            }
            if ((i3 & 7168) != 2048) {
                z5 = true;
                z6 = z7 | z5;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    eventOrderFormScreen62 = eventOrderFormScreen6;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventOrderFormScreen3.OrderFormContinueButton$lambda$20$lambda$19(eventOrderFormScreen62, eventOrderFormCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default2, null, type22, z3, z4, null, null, null, null, false, null, composer2, (i3 << 15) & 4128768, 0, 8072);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderFormContinueButton$lambda$20$lambda$19(EventOrderFormScreen6 eventOrderFormScreen6, EventOrderFormCallbacks eventOrderFormCallbacks) {
        int i = WhenMappings.$EnumSwitchMapping$1[eventOrderFormScreen6.ordinal()];
        if (i == 1) {
            eventOrderFormCallbacks.onReviewClicked();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventOrderFormCallbacks.onCloseAllClicked();
        }
        return Unit.INSTANCE;
    }

    public static final String getText(StringResource stringResource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        composer.startReplaceGroup(519227949);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(519227949, i, -1, "com.robinhood.android.event.trade.orderform.getText (EventOrderFormScreen.kt:377)");
        }
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = stringResource.getText(resources).toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return string2;
    }
}

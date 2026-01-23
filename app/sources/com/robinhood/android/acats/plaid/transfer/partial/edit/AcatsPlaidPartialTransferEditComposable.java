package com.robinhood.android.acats.plaid.transfer.partial.edit;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnPlacedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable;
import com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo6;
import com.robinhood.android.acats.plaid.transfer.partial.edit.utils.AmountInputVisualTransformation;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.resource.StringResource;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0018\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0019\u001a¯\u0001\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u0010*\u001aY\u0010+\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010-\u001a=\u0010.\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0003¢\u0006\u0002\u00100\u001a+\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u00105\u001aQ\u00106\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u00052\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u0010;\u001a1\u0010<\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010$2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u0010=\u001a\u0015\u0010>\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u001d2\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010(\u001a\u00020\u00052\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0003¢\u0006\u0002\u0010A\u001a\r\u0010B\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010C¨\u0006D²\u0006\n\u0010E\u001a\u00020FX\u008a\u0084\u0002²\u0006\n\u0010G\u001a\u00020HX\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020HX\u008a\u008e\u0002"}, m3636d2 = {"AcatsPlaidPartialTransferEditComposable", "", "editAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "removeEnabled", "", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "onEditComplete", "Lkotlin/Function1;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "onRemove", "hasSubZero", "duxo", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo;", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;ZLcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo;Landroidx/compose/runtime/Composer;II)V", "AcatsPlaidPartialTransferKeyboardSection", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScope;", "validAdjustedAmount", "showDelimiter", "updateUserFinishedEditingState", "handleKeyEvents", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "isZeroOrLess", "(Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScope;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferEditSection", "forEdit", "adjustedAmount", "", "amountFormatter", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;", "selectedRow", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "updateSelectedRow", "resetAdjustedAmount", "Lkotlin/Function0;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "userFinishedEditingState", "showBorrowingFeeTooltip", "onTooltipClick", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Ljava/lang/String;ZZLcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/focus/FocusRequester;ZLcom/robinhood/android/acatsin/util/AcatsInScreenContext;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "AcatsPlaidPartialTransferAdjustmentRow", "updateFinishedEditingState", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Landroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;ZLcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferEditText", "validNumber", "(Landroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;ZLcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;ZZLandroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferEditSelectionRow", "text", "selected", "onClick", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferPositionRow", "disabled", "borrowingFee", "Ljava/math/BigDecimal;", "assetName", "(Ljava/lang/String;ZZLjava/math/BigDecimal;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AcatsPlaidPartialTransferEditBottomSection", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AcatsPlaidPartialTransferEditTitle", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Landroidx/compose/runtime/Composer;I)V", "EquityPositionSection", "(Ljava/lang/String;Ljava/math/BigDecimal;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PositionComposable", "(Landroidx/compose/runtime/Composer;I)V", "lib-acats-plaid_externalDebug", "duxoViewState", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState;", "width", "Landroidx/compose/ui/unit/Dp;", "height"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferEditComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAdjustmentRow$lambda$19(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, FocusRequester focusRequester, String str, boolean z, AmountInputVisualTransformation amountInputVisualTransformation, Function1 function1, boolean z2, boolean z3, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferAdjustmentRow(acatsPlaidPartialTransferAssetRowData, focusRequester, str, z, amountInputVisualTransformation, function1, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditBottomSection$lambda$30(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferEditBottomSection(z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditComposable$lambda$6(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, boolean z, AcatsInScreenContext acatsInScreenContext, Function1 function1, Function1 function12, boolean z2, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, int i, int i2, Composer composer, int i3) {
        AcatsPlaidPartialTransferEditComposable(acatsPlaidPartialTransferAssetRowData, z, acatsInScreenContext, function1, function12, z2, acatsPlaidPartialTransferEditDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditSection$lambda$15(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, String str, boolean z, boolean z2, AmountInputVisualTransformation amountInputVisualTransformation, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, Function1 function1, Function1 function12, Function0 function0, FocusRequester focusRequester, boolean z3, AcatsInScreenContext acatsInScreenContext, boolean z4, boolean z5, Function0 function02, int i, int i2, int i3, Composer composer, int i4) {
        AcatsPlaidPartialTransferEditSection(acatsPlaidPartialTransferAssetRowData, str, z, z2, amountInputVisualTransformation, acatsPlaidPartialTransferEditDuxo4, function1, function12, function0, focusRequester, z3, acatsInScreenContext, z4, z5, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditSelectionRow$lambda$25(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferEditSelectionRow(str, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditText$lambda$22(FocusRequester focusRequester, String str, boolean z, AmountInputVisualTransformation amountInputVisualTransformation, boolean z2, boolean z3, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferEditText(focusRequester, str, z, amountInputVisualTransformation, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditTitle$lambda$32(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferEditTitle(acatsPlaidPartialTransferAssetRowData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferKeyboardSection$lambda$12(BentoNumpad4 bentoNumpad4, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, boolean z, boolean z2, Function1 function1, Function1 function12, boolean z3, int i, Composer composer, int i2) {
        AcatsPlaidPartialTransferKeyboardSection(bentoNumpad4, acatsPlaidPartialTransferAssetRowData, z, z2, function1, function12, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferPositionRow$lambda$28(String str, boolean z, boolean z2, BigDecimal bigDecimal, String str2, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        AcatsPlaidPartialTransferPositionRow(str, z, z2, bigDecimal, str2, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityPositionSection$lambda$38(String str, BigDecimal bigDecimal, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        EquityPositionSection(str, bigDecimal, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionComposable$lambda$39(int i, Composer composer, int i2) {
        PositionComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferAdjustmentRow$4 */
    static final class C75964 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $adjustedAmount;
        final /* synthetic */ AmountInputVisualTransformation $amountFormatter;
        final /* synthetic */ Density $density;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $isZeroOrLess;
        final /* synthetic */ Function1<Boolean, Unit> $updateFinishedEditingState;
        final /* synthetic */ boolean $userFinishedEditingState;
        final /* synthetic */ boolean $validAdjustedAmount;

        /* JADX WARN: Multi-variable type inference failed */
        C75964(Density density, FocusRequester focusRequester, String str, boolean z, AmountInputVisualTransformation amountInputVisualTransformation, boolean z2, boolean z3, Function1<? super Boolean, Unit> function1) {
            this.$density = density;
            this.$focusRequester = focusRequester;
            this.$adjustedAmount = str;
            this.$validAdjustedAmount = z;
            this.$amountFormatter = amountInputVisualTransformation;
            this.$isZeroOrLess = z2;
            this.$userFinishedEditingState = z3;
            this.$updateFinishedEditingState = function1;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386835321, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferAdjustmentRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:416)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$density);
            final Density density = this.$density;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferAdjustmentRow$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferEditComposable.C75964.invoke$lambda$9$lambda$8(density, snapshotState, snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Modifier modifierOnPlaced = OnPlacedModifier3.onPlaced(companion2, (Function1) objRememberedValue3);
            FocusRequester focusRequester = this.$focusRequester;
            String str = this.$adjustedAmount;
            boolean z = this.$validAdjustedAmount;
            AmountInputVisualTransformation amountInputVisualTransformation = this.$amountFormatter;
            boolean z2 = this.$isZeroOrLess;
            boolean z3 = this.$userFinishedEditingState;
            final Function1<Boolean, Unit> function1 = this.$updateFinishedEditingState;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierOnPlaced);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditText(focusRequester, str, z, amountInputVisualTransformation, z2, z3, composer, 0);
            Modifier modifierZIndex = ZIndexModifier2.zIndex(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion2, invoke$lambda$4(snapshotState2)), invoke$lambda$1(snapshotState)), 2.0f);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue4);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferAdjustmentRow$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.C75964.invoke$lambda$13$lambda$12$lambda$11(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierZIndex, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        private static final float invoke$lambda$1(SnapshotState<C2002Dp> snapshotState) {
            return snapshotState.getValue().getValue();
        }

        private static final float invoke$lambda$4(SnapshotState<C2002Dp> snapshotState) {
            return snapshotState.getValue().getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final void invoke$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
            snapshotState.setValue(C2002Dp.m7993boximpl(f));
        }

        private static final void invoke$lambda$5(SnapshotState<C2002Dp> snapshotState, float f) {
            snapshotState.setValue(C2002Dp.m7993boximpl(f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(Density density, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            invoke$lambda$2(snapshotState, density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() >> 32)));
            invoke$lambda$5(snapshotState2, density.mo5013toDpu2uoSUM((int) (it.mo7241getSizeYbymL2g() & 4294967295L)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$11(Function1 function1) {
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$PositionComposable$1 */
    static final class C76101 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BigDecimal $borrowingFee;

        C76101(BigDecimal bigDecimal) {
            this.$borrowingFee = bigDecimal;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1202687745, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.PositionComposable.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:671)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            BigDecimal bigDecimal = this.$borrowingFee;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$PositionComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AcatsPlaidPartialTransferEditComposable.EquityPositionSection("APPL", bigDecimal, false, (Function0) objRememberedValue, composer, 3078, 4);
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsPlaidPartialTransferEditComposable(final AcatsPlaidPartialTransferAssetRowData editAsset, final boolean z, final AcatsInScreenContext screenContext, final Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onEditComplete, final Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onRemove, final boolean z2, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        final boolean z4;
        AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo2;
        int i4;
        int i5;
        AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo3;
        int i6;
        Object objRememberedValue;
        AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo4;
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData;
        final AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1;
        AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo5;
        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(editAsset, "editAsset");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        Intrinsics.checkNotNullParameter(onEditComplete, "onEditComplete");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        Composer composerStartRestartGroup = composer.startRestartGroup(989975984);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(editAsset) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(screenContext) : composerStartRestartGroup.changedInstance(screenContext) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onEditComplete) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onRemove) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        acatsPlaidPartialTransferEditDuxo2 = acatsPlaidPartialTransferEditDuxo;
                        int i7 = composerStartRestartGroup.changedInstance(acatsPlaidPartialTransferEditDuxo2) ? 1048576 : 524288;
                        i3 |= i7;
                    } else {
                        acatsPlaidPartialTransferEditDuxo2 = acatsPlaidPartialTransferEditDuxo;
                    }
                    i3 |= i7;
                } else {
                    acatsPlaidPartialTransferEditDuxo2 = acatsPlaidPartialTransferEditDuxo;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    acatsPlaidPartialTransferEditDuxo6 = acatsPlaidPartialTransferEditDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 64) == 0) {
                            String string2 = editAsset.getType().toString();
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i4 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AcatsPlaidPartialTransferEditDuxo.class), current, string2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$$inlined$duxo$1.1
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
                            AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo7 = (AcatsPlaidPartialTransferEditDuxo) baseDuxo;
                            i5 = i3 & (-3670017);
                            acatsPlaidPartialTransferEditDuxo3 = acatsPlaidPartialTransferEditDuxo7;
                        } else {
                            i4 = 0;
                            i5 = i3;
                            acatsPlaidPartialTransferEditDuxo3 = acatsPlaidPartialTransferEditDuxo2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(989975984, i5, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable (AcatsPlaidPartialTransferEditComposable.kt:77)");
                        }
                        final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final Screen screen = new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, editAsset.editLoggingIdentifier(), null, 10, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i8 = i5 & 14;
                        i6 = (composerStartRestartGroup.changedInstance(acatsPlaidPartialTransferEditDuxo3) ? 1 : 0) | (i8 == 4 ? 1 : i4) | ((i5 & 7168) == 2048 ? 1 : i4) | ((57344 & i5) == 16384 ? 1 : i4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object acatsPlaidPartialTransferEditComposable2 = new AcatsPlaidPartialTransferEditComposable2(acatsPlaidPartialTransferEditDuxo3, editAsset, onEditComplete, onRemove, null);
                            acatsPlaidPartialTransferEditDuxo4 = acatsPlaidPartialTransferEditDuxo3;
                            acatsPlaidPartialTransferAssetRowData = editAsset;
                            composerStartRestartGroup.updateRememberedValue(acatsPlaidPartialTransferEditComposable2);
                            objRememberedValue = acatsPlaidPartialTransferEditComposable2;
                        } else {
                            acatsPlaidPartialTransferEditDuxo4 = acatsPlaidPartialTransferEditDuxo3;
                            acatsPlaidPartialTransferAssetRowData = editAsset;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(acatsPlaidPartialTransferAssetRowData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i8);
                        acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1 = AcatsPlaidPartialTransferEditComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(acatsPlaidPartialTransferEditDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                        if (!Intrinsics.areEqual(acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1, AcatsPlaidPartialTransferEditDuxo6.Loading.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(-1164957835);
                            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composerStartRestartGroup, i4, 1);
                            composerStartRestartGroup.endReplaceGroup();
                            acatsPlaidPartialTransferEditDuxo5 = acatsPlaidPartialTransferEditDuxo4;
                        } else {
                            if (!(acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1 instanceof AcatsPlaidPartialTransferEditDuxo6.Ready)) {
                                composerStartRestartGroup.startReplaceGroup(-2115786397);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-1164658592);
                            final AcatsPlaidPartialTransferAssetRowData editAsset2 = ((AcatsPlaidPartialTransferEditDuxo6.Ready) acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1).getEditAsset();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo8 = acatsPlaidPartialTransferEditDuxo4;
                            final boolean z5 = z3;
                            acatsPlaidPartialTransferEditDuxo5 = acatsPlaidPartialTransferEditDuxo8;
                            BentoNumpadScreenLayout.BentoNumpadScreenLayout(ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null), ComposableLambda3.rememberComposableLambda(1317365134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferEditComposable.4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i9) {
                                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1317365134, i9, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:107)");
                                    }
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(1031976579, true, new AnonymousClass1(acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1, z5, screenContext, current2, screen, acatsPlaidPartialTransferEditDuxo8), composer2, 54), ComposableLambda3.rememberComposableLambda(1275890294, true, new AnonymousClass2(editAsset2, acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1, acatsPlaidPartialTransferEditDuxo8, screenContext, z4, focusRequester), composer2, 54), composer2, 3504, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo $duxo;
                                    final /* synthetic */ FocusRequester $focusRequester;
                                    final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $forEditAsset;
                                    final /* synthetic */ boolean $hasSubZero;
                                    final /* synthetic */ AcatsInScreenContext $screenContext;
                                    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6 $viewState;

                                    AnonymousClass2(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, AcatsInScreenContext acatsInScreenContext, boolean z, FocusRequester focusRequester) {
                                        this.$forEditAsset = acatsPlaidPartialTransferAssetRowData;
                                        this.$viewState = acatsPlaidPartialTransferEditDuxo6;
                                        this.$duxo = acatsPlaidPartialTransferEditDuxo;
                                        this.$screenContext = acatsInScreenContext;
                                        this.$hasSubZero = z;
                                        this.$focusRequester = focusRequester;
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
                                            ComposerKt.traceEventStart(1275890294, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:110)");
                                        }
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChanged = composer.changed(this.$forEditAsset) | composer.changedInstance(this.$viewState) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$screenContext) | composer.changed(this.$hasSubZero);
                                        final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$forEditAsset;
                                        final AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6 = this.$viewState;
                                        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = this.$duxo;
                                        final FocusRequester focusRequester = this.$focusRequester;
                                        final AcatsInScreenContext acatsInScreenContext = this.$screenContext;
                                        final boolean z = this.$hasSubZero;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AcatsPlaidPartialTransferEditComposable.C75984.AnonymousClass2.invoke$lambda$1$lambda$0(acatsPlaidPartialTransferAssetRowData, acatsPlaidPartialTransferEditDuxo6, acatsPlaidPartialTransferEditDuxo, focusRequester, acatsInScreenContext, z, (LazyListScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, FocusRequester focusRequester, AcatsInScreenContext acatsInScreenContext, boolean z, LazyListScope LazyColumn) {
                                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-2032670773, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$1
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
                                                    ComposerKt.traceEventStart(-2032670773, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:112)");
                                                }
                                                AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditTitle(acatsPlaidPartialTransferAssetRowData, composer, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 3, null);
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(277146498, true, new AcatsPlaidPartialTransferEditComposable4(acatsPlaidPartialTransferEditDuxo6, acatsPlaidPartialTransferAssetRowData, acatsPlaidPartialTransferEditDuxo, focusRequester, acatsInScreenContext, z)), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo $duxo;
                                    final /* synthetic */ EventLogger $eventLogger;
                                    final /* synthetic */ boolean $removeEnabled;
                                    final /* synthetic */ Screen $screen;
                                    final /* synthetic */ AcatsInScreenContext $screenContext;
                                    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6 $viewState;

                                    AnonymousClass1(AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6, boolean z, AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo) {
                                        this.$viewState = acatsPlaidPartialTransferEditDuxo6;
                                        this.$removeEnabled = z;
                                        this.$screenContext = acatsInScreenContext;
                                        this.$eventLogger = eventLogger;
                                        this.$screen = screen;
                                        this.$duxo = acatsPlaidPartialTransferEditDuxo;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                        invoke(bentoButtonBar3, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1031976579, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:142)");
                                        }
                                        if (((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getUserFinishedEditing()) {
                                            boolean z = this.$removeEnabled;
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(this.$screenContext) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changedInstance(this.$duxo);
                                            final AcatsInScreenContext acatsInScreenContext = this.$screenContext;
                                            final EventLogger eventLogger = this.$eventLogger;
                                            final Screen screen = this.$screen;
                                            final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = this.$duxo;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return AcatsPlaidPartialTransferEditComposable.C75984.AnonymousClass1.invoke$lambda$1$lambda$0(acatsInScreenContext, eventLogger, screen, acatsPlaidPartialTransferEditDuxo);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            Function0 function0 = (Function0) objRememberedValue;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance2 = composer.changedInstance(this.$screenContext) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changedInstance(this.$duxo);
                                            final AcatsInScreenContext acatsInScreenContext2 = this.$screenContext;
                                            final EventLogger eventLogger2 = this.$eventLogger;
                                            final Screen screen2 = this.$screen;
                                            final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo2 = this.$duxo;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$1$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return AcatsPlaidPartialTransferEditComposable.C75984.AnonymousClass1.invoke$lambda$3$lambda$2(acatsInScreenContext2, eventLogger2, screen2, acatsPlaidPartialTransferEditDuxo2);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditBottomSection(z, function0, (Function0) objRememberedValue2, composer, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo) throws IOException {
                                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "confirm_update", null, 4, null), null, acatsInScreenContext.toEventContext(), false, 41, null);
                                        acatsPlaidPartialTransferEditDuxo.editComplete();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo) {
                                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "remove_from_transfer", null, 4, null), null, acatsInScreenContext.toEventContext(), false, 41, null);
                                        acatsPlaidPartialTransferEditDuxo.remove();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-934755170, true, new C76015(acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1, editAsset, acatsPlaidPartialTransferEditDuxo8, screenContext, current2, screen, focusRequester), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        acatsPlaidPartialTransferEditDuxo6 = acatsPlaidPartialTransferEditDuxo5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i5 = i3 & (-3670017);
                            acatsPlaidPartialTransferEditDuxo3 = acatsPlaidPartialTransferEditDuxo2;
                            i4 = 0;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final Screen screen2 = new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, editAsset.editLoggingIdentifier(), null, 10, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i82 = i5 & 14;
                        i6 = (composerStartRestartGroup.changedInstance(acatsPlaidPartialTransferEditDuxo3) ? 1 : 0) | (i82 == 4 ? 1 : i4) | ((i5 & 7168) == 2048 ? 1 : i4) | ((57344 & i5) == 16384 ? 1 : i4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (i6 != 0) {
                            Object acatsPlaidPartialTransferEditComposable22 = new AcatsPlaidPartialTransferEditComposable2(acatsPlaidPartialTransferEditDuxo3, editAsset, onEditComplete, onRemove, null);
                            acatsPlaidPartialTransferEditDuxo4 = acatsPlaidPartialTransferEditDuxo3;
                            acatsPlaidPartialTransferAssetRowData = editAsset;
                            composerStartRestartGroup.updateRememberedValue(acatsPlaidPartialTransferEditComposable22);
                            objRememberedValue = acatsPlaidPartialTransferEditComposable22;
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(acatsPlaidPartialTransferAssetRowData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i82);
                            acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1 = AcatsPlaidPartialTransferEditComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(acatsPlaidPartialTransferEditDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                            if (!Intrinsics.areEqual(acatsPlaidPartialTransferEditDuxo6AcatsPlaidPartialTransferEditComposable$lambda$1, AcatsPlaidPartialTransferEditDuxo6.Loading.INSTANCE)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            acatsPlaidPartialTransferEditDuxo6 = acatsPlaidPartialTransferEditDuxo5;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditComposable$lambda$6(editAsset, z, screenContext, onEditComplete, onRemove, z2, acatsPlaidPartialTransferEditDuxo6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z4 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 64) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final EventLogger current222 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    final Screen screen22 = new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, editAsset.editLoggingIdentifier(), null, 10, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i822 = i5 & 14;
                    i6 = (composerStartRestartGroup.changedInstance(acatsPlaidPartialTransferEditDuxo3) ? 1 : 0) | (i822 == 4 ? 1 : i4) | ((i5 & 7168) == 2048 ? 1 : i4) | ((57344 & i5) == 16384 ? 1 : i4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i6 != 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        z4 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final AcatsPlaidPartialTransferEditDuxo6 AcatsPlaidPartialTransferEditComposable$lambda$1(SnapshotState4<? extends AcatsPlaidPartialTransferEditDuxo6> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditSection$2 */
    static final class C76022 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $adjustedAmount;
        final /* synthetic */ AmountInputVisualTransformation $amountFormatter;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $forEdit;
        final /* synthetic */ boolean $hasSubZero;
        final /* synthetic */ boolean $isZeroOrLess;
        final /* synthetic */ Function0<Unit> $onTooltipClick;
        final /* synthetic */ Function0<Unit> $resetAdjustedAmount;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ AcatsInScreenContext $screenContext;
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo4 $selectedRow;
        final /* synthetic */ boolean $showBorrowingFeeTooltip;
        final /* synthetic */ Function1<AcatsPlaidPartialTransferEditDuxo4, Unit> $updateSelectedRow;
        final /* synthetic */ Function1<Boolean, Unit> $updateUserFinishedEditingState;
        final /* synthetic */ boolean $userFinishedEditingState;
        final /* synthetic */ boolean $validAdjustedAmount;

        /* JADX WARN: Multi-variable type inference failed */
        C76022(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, boolean z, boolean z2, Function0<Unit> function0, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, Function0<Unit> function02, Function1<? super AcatsPlaidPartialTransferEditDuxo4, Unit> function1, Function1<? super Boolean, Unit> function12, FocusRequester focusRequester, String str, boolean z3, AmountInputVisualTransformation amountInputVisualTransformation, boolean z4, boolean z5) {
            this.$forEdit = acatsPlaidPartialTransferAssetRowData;
            this.$hasSubZero = z;
            this.$showBorrowingFeeTooltip = z2;
            this.$onTooltipClick = function0;
            this.$selectedRow = acatsPlaidPartialTransferEditDuxo4;
            this.$screenContext = acatsInScreenContext;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$resetAdjustedAmount = function02;
            this.$updateSelectedRow = function1;
            this.$updateUserFinishedEditingState = function12;
            this.$focusRequester = focusRequester;
            this.$adjustedAmount = str;
            this.$validAdjustedAmount = z3;
            this.$amountFormatter = amountInputVisualTransformation;
            this.$isZeroOrLess = z4;
            this.$userFinishedEditingState = z5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            EventLogger eventLogger;
            Screen screen;
            Composer composer2;
            Function0<Unit> function0;
            int i2;
            String strStringResource;
            Function1<Boolean, Unit> function1;
            EquityAsset equityAsset;
            EquityAsset equityAsset2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764236072, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSection.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:278)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$forEdit;
            boolean z = this.$hasSubZero;
            boolean z2 = this.$showBorrowingFeeTooltip;
            Function0<Unit> function02 = this.$onTooltipClick;
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4 = this.$selectedRow;
            final AcatsInScreenContext acatsInScreenContext = this.$screenContext;
            EventLogger eventLogger2 = this.$eventLogger;
            Screen screen2 = this.$screen;
            Function0<Unit> function03 = this.$resetAdjustedAmount;
            final Function1<AcatsPlaidPartialTransferEditDuxo4, Unit> function12 = this.$updateSelectedRow;
            final Function1<Boolean, Unit> function13 = this.$updateUserFinishedEditingState;
            FocusRequester focusRequester = this.$focusRequester;
            String str = this.$adjustedAmount;
            boolean z3 = this.$validAdjustedAmount;
            AmountInputVisualTransformation amountInputVisualTransformation = this.$amountFormatter;
            boolean z4 = this.$isZeroOrLess;
            boolean z5 = this.$userFinishedEditingState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(-679359854);
            if (acatsPlaidPartialTransferAssetRowData.getShouldShowPositionInformation() && z) {
                AcatsPlaidPartialTransferDuxo3 type2 = acatsPlaidPartialTransferAssetRowData.getType();
                AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment = type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment ? (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2 : null;
                BigDecimal borrowFee = (equityAssetWithAdjustment == null || (equityAsset2 = equityAssetWithAdjustment.getEquityAsset()) == null) ? null : equityAsset2.getBorrowFee();
                AcatsPlaidPartialTransferDuxo3 type3 = acatsPlaidPartialTransferAssetRowData.getType();
                AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment2 = type3 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment ? (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type3 : null;
                String name = (equityAssetWithAdjustment2 == null || (equityAsset = equityAssetWithAdjustment2.getEquityAsset()) == null) ? null : equityAsset.getName();
                if (name == null) {
                    name = "";
                }
                String str2 = name;
                screen = screen2;
                eventLogger = eventLogger2;
                composer2 = composer;
                function0 = function03;
                AcatsPlaidPartialTransferEditComposable.EquityPositionSection(str2, borrowFee, z2, function02, composer2, 0, 0);
            } else {
                eventLogger = eventLogger2;
                screen = screen2;
                composer2 = composer;
                function0 = function03;
            }
            composer2.endReplaceGroup();
            final Screen screen3 = screen;
            final Function0<Unit> function04 = function0;
            final EventLogger eventLogger3 = eventLogger;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_add_equity_quantity_header, composer2, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer, 24576, 0, 8174);
            Composer composer3 = composer;
            boolean z6 = acatsPlaidPartialTransferEditDuxo4 == AcatsPlaidPartialTransferEditDuxo4.ALL;
            AcatsPlaidPartialTransferDuxo3 type4 = acatsPlaidPartialTransferAssetRowData.getType();
            if ((type4 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) || (type4 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment)) {
                i2 = 0;
                composer3.startReplaceGroup(415997485);
                strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_cash_input_entire_balance, composer3, 0);
                composer3.endReplaceGroup();
            } else if (type4 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                composer3.startReplaceGroup(416210703);
                i2 = 0;
                strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_add_equity_quantity_all, composer3, 0);
                composer3.endReplaceGroup();
            } else {
                i2 = 0;
                if (!(type4 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                    composer3.startReplaceGroup(-679324593);
                    composer3.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer3.startReplaceGroup(416422092);
                strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_all_contracts, composer3, 0);
                composer3.endReplaceGroup();
            }
            composer3.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer3.changedInstance(acatsInScreenContext) | composer3.changedInstance(eventLogger3) | composer3.changedInstance(screen3) | composer3.changed(function04) | composer3.changed(function12) | composer3.changed(function13);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function05 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditSection$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.C76022.invoke$lambda$5$lambda$1$lambda$0(acatsInScreenContext, eventLogger3, screen3, function04, function12, function13);
                    }
                };
                composer3.updateRememberedValue(function05);
                objRememberedValue = function05;
            }
            composer3.endReplaceGroup();
            AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSelectionRow(strStringResource, z6, (Function0) objRememberedValue, composer3, i2);
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo42 = AcatsPlaidPartialTransferEditDuxo4.AMOUNT;
            boolean z7 = acatsPlaidPartialTransferEditDuxo4 == acatsPlaidPartialTransferEditDuxo42 ? 1 : i2;
            String strStringResource2 = StringResources_androidKt.stringResource(C7686R.string.acats_in_cash_input_specific_amount, composer3, i2);
            composer3.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer3.changedInstance(acatsInScreenContext) | composer3.changedInstance(eventLogger3) | composer3.changedInstance(screen3) | composer3.changed(function12) | composer3.changed(function13);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function0 function06 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditSection$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.C76022.invoke$lambda$5$lambda$3$lambda$2(acatsInScreenContext, eventLogger3, screen3, function12, function13);
                    }
                };
                function1 = function13;
                composer3.updateRememberedValue(function06);
                objRememberedValue2 = function06;
            } else {
                function1 = function13;
            }
            composer3.endReplaceGroup();
            AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSelectionRow(strStringResource2, z7, (Function0) objRememberedValue2, composer3, i2);
            composer3.startReplaceGroup(-679251108);
            if (acatsPlaidPartialTransferEditDuxo4 == acatsPlaidPartialTransferEditDuxo42) {
                AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferAdjustmentRow(acatsPlaidPartialTransferAssetRowData, focusRequester, str, z3, amountInputVisualTransformation, function1, z4, z5, composer3, 0);
                composer3 = composer3;
                Unit unit = Unit.INSTANCE;
                composer3.startReplaceGroup(5004770);
                boolean zChanged = composer3.changed(focusRequester);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AcatsPlaidPartialTransferEditComposable5(focusRequester, null);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer3, 6);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
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
        public static final Unit invoke$lambda$5$lambda$1$lambda$0(AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, Function0 function0, Function1 function1, Function1 function12) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "transfer_all", null, 4, null), null, acatsInScreenContext.toEventContext(), false, 41, null);
            function0.invoke();
            function1.invoke(AcatsPlaidPartialTransferEditDuxo4.ALL);
            function12.invoke(Boolean.TRUE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$3$lambda$2(AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, Function1 function1, Function1 function12) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "edit_quantity", null, 4, null), null, acatsInScreenContext.toEventContext(), false, 41, null);
            function1.invoke(AcatsPlaidPartialTransferEditDuxo4.AMOUNT);
            function12.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$5 */
    static final class C76015 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo $duxo;
        final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $editAsset;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ Screen $screen;
        final /* synthetic */ AcatsInScreenContext $screenContext;
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6 $viewState;

        C76015(AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, FocusRequester focusRequester) {
            this.$viewState = acatsPlaidPartialTransferEditDuxo6;
            this.$editAsset = acatsPlaidPartialTransferAssetRowData;
            this.$duxo = acatsPlaidPartialTransferEditDuxo;
            this.$screenContext = acatsInScreenContext;
            this.$eventLogger = eventLogger;
            this.$screen = screen;
            this.$focusRequester = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) throws IOException {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) throws IOException {
            int i2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934755170, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:173)");
            }
            if (!((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getUserFinishedEditing()) {
                boolean zIsZeroOrLess = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).isZeroOrLess();
                boolean validAdjustedAmount = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getValidAdjustedAmount();
                boolean showDelimiter = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getShowDelimiter();
                int i3 = i2;
                AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$editAsset;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$screenContext) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen);
                final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = this.$duxo;
                final AcatsInScreenContext acatsInScreenContext = this.$screenContext;
                final EventLogger eventLogger = this.$eventLogger;
                final Screen screen = this.$screen;
                final FocusRequester focusRequester = this.$focusRequester;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsPlaidPartialTransferEditComposable.C76015.invoke$lambda$1$lambda$0(acatsPlaidPartialTransferEditDuxo, acatsInScreenContext, eventLogger, screen, focusRequester, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsPlaidPartialTransferEditComposable.C76015.invoke$lambda$3$lambda$2(acatsPlaidPartialTransferEditDuxo2, (KeyEvent) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferKeyboardSection(BentoNumpadScreenLayout, acatsPlaidPartialTransferAssetRowData, validAdjustedAmount, showDelimiter, function1, (Function1) objRememberedValue2, zIsZeroOrLess, composer, (i3 & 14) | BentoNumpad4.$stable);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, AcatsInScreenContext acatsInScreenContext, EventLogger eventLogger, Screen screen, FocusRequester focusRequester, boolean z) throws IOException {
            acatsPlaidPartialTransferEditDuxo.updateUserEditingState(z);
            if (z) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "update_quantity", null, 4, null), null, acatsInScreenContext.toEventContext(), false, 41, null);
                focusRequester.freeFocus();
            }
            acatsPlaidPartialTransferEditDuxo.editComplete();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, KeyEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            acatsPlaidPartialTransferEditDuxo.handleKeyEvents(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AcatsPlaidPartialTransferKeyboardSection(final BentoNumpad4 bentoNumpad4, final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, final boolean z, final boolean z2, final Function1<? super Boolean, Unit> function1, final Function1<? super KeyEvent, Unit> function12, final boolean z3, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-13186138);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoNumpad4) : composerStartRestartGroup.changedInstance(bentoNumpad4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(acatsPlaidPartialTransferAssetRowData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-13186138, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferKeyboardSection (AcatsPlaidPartialTransferEditComposable.kt:212)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (!z) {
                composerStartRestartGroup.startReplaceGroup(400780546);
                i4 = 0;
                String strStringResource = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_edit_invalid, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                i3 = i2;
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = i2;
                companion = companion2;
                i4 = 0;
                if (acatsPlaidPartialTransferAssetRowData.getType() instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                    composerStartRestartGroup.startReplaceGroup(401147803);
                    String strStringResource2 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_edit_whole_number, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(401446674);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), 5, null), 0.0f, composerStartRestartGroup, i4, 1);
            boolean z4 = (!z || z3) ? i4 : 1;
            long jM21425getFg0d7_KjU = bentoTheme3.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
            String strStringResource3 = StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_edit_update_btn, composerStartRestartGroup, i4);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i8 = (57344 & i3) != 16384 ? i4 : 1;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.m1696x85e25dcc(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource3, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, z4, false, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, false, null, composer2, 0, 0, 8024);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            bentoNumpad4.BentoNumpadWithButton(null, function12, "", (Function0) objRememberedValue2, false, false, false, false, z2, false, null, false, composerStartRestartGroup, ((i3 >> 12) & 112) | 1772928 | ((i3 << 15) & 234881024), (BentoNumpad4.$stable << 6) | ((i3 << 6) & 896), 3729);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferKeyboardSection$lambda$12(bentoNumpad4, acatsPlaidPartialTransferAssetRowData, z, z2, function1, function12, z3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AcatsPlaidPartialTransferKeyboardSection$lambda$11$lambda$8$lambda$7 */
    public static final Unit m1696x85e25dcc(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsPlaidPartialTransferEditSection(final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, final String str, final boolean z, final boolean z2, final AmountInputVisualTransformation amountInputVisualTransformation, final AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, final Function1<? super AcatsPlaidPartialTransferEditDuxo4, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0, final FocusRequester focusRequester, final boolean z3, final AcatsInScreenContext acatsInScreenContext, boolean z4, boolean z5, Function0<Unit> function02, Composer composer, final int i, final int i2, final int i3) {
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData2;
        int i4;
        String str2;
        boolean z6;
        AmountInputVisualTransformation amountInputVisualTransformation2;
        Function1<? super AcatsPlaidPartialTransferEditDuxo4, Unit> function13;
        Function1<? super Boolean, Unit> function14;
        Function0<Unit> function03;
        FocusRequester focusRequester2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(898803243);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            acatsPlaidPartialTransferAssetRowData2 = acatsPlaidPartialTransferAssetRowData;
        } else if ((i & 6) == 0) {
            acatsPlaidPartialTransferAssetRowData2 = acatsPlaidPartialTransferAssetRowData;
            i4 = (composerStartRestartGroup.changed(acatsPlaidPartialTransferAssetRowData2) ? 4 : 2) | i;
        } else {
            acatsPlaidPartialTransferAssetRowData2 = acatsPlaidPartialTransferAssetRowData;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                z6 = z;
                i4 |= composerStartRestartGroup.changed(z6) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        amountInputVisualTransformation2 = amountInputVisualTransformation;
                        i4 |= composerStartRestartGroup.changed(amountInputVisualTransformation2) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(acatsPlaidPartialTransferEditDuxo4.ordinal()) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else {
                        if ((i & 1572864) == 0) {
                            function13 = function1;
                            i4 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                function14 = function12;
                                i4 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((100663296 & i) == 0) {
                                    function03 = function0;
                                    i4 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                                }
                                if ((i3 & 512) == 0) {
                                    if ((805306368 & i) == 0) {
                                        focusRequester2 = focusRequester;
                                        i4 |= composerStartRestartGroup.changed(focusRequester2) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 1024) == 0) {
                                        i5 = i2 | 6;
                                    } else if ((i2 & 6) == 0) {
                                        i5 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                    } else {
                                        i5 = i2;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        i5 |= 48;
                                    } else if ((i2 & 48) == 0) {
                                        i5 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(acatsInScreenContext) : composerStartRestartGroup.changedInstance(acatsInScreenContext) ? 32 : 16;
                                    }
                                    int i12 = i5;
                                    i6 = i3 & 4096;
                                    if (i6 == 0) {
                                        i7 = i12 | 384;
                                    } else {
                                        int i13 = i12;
                                        if ((i2 & 384) == 0) {
                                            i13 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                                        }
                                        i7 = i13;
                                    }
                                    i8 = i3 & 8192;
                                    if (i8 == 0) {
                                        i9 = i7 | 3072;
                                    } else {
                                        int i14 = i7;
                                        if ((i2 & 3072) == 0) {
                                            i9 = i14 | (composerStartRestartGroup.changed(z5) ? 2048 : 1024);
                                        } else {
                                            i9 = i14;
                                        }
                                    }
                                    i10 = i3 & 16384;
                                    if (i10 == 0) {
                                        i11 = i9 | 24576;
                                    } else {
                                        int i15 = i9;
                                        if ((i2 & 24576) == 0) {
                                            i15 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                                        }
                                        i11 = i15;
                                    }
                                    if ((i4 & 306783379) == 306783378 || (i11 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                        boolean z9 = i6 == 0 ? false : z4;
                                        boolean z10 = i8 == 0 ? false : z5;
                                        if (i10 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda13
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            function04 = (Function0) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function04 = function02;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            function05 = function04;
                                        } else {
                                            function05 = function04;
                                            ComposerKt.traceEventStart(898803243, i4, i11, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSection (AcatsPlaidPartialTransferEditComposable.kt:270)");
                                        }
                                        boolean z11 = z10;
                                        Function0<Unit> function07 = function05;
                                        composer2 = composerStartRestartGroup;
                                        DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(-764236072, true, new C76022(acatsPlaidPartialTransferAssetRowData2, z9, z11, function07, acatsPlaidPartialTransferEditDuxo4, acatsInScreenContext, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, acatsPlaidPartialTransferAssetRowData2.editLoggingIdentifier(), null, 10, null), function03, function13, function14, focusRequester2, str2, z2, amountInputVisualTransformation2, z6, z3), composer2, 54), composer2, 48, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z7 = z9;
                                        z8 = z11;
                                        function06 = function07;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z7 = z4;
                                        z8 = z5;
                                        function06 = function02;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda14
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSection$lambda$15(acatsPlaidPartialTransferAssetRowData, str, z, z2, amountInputVisualTransformation, acatsPlaidPartialTransferEditDuxo4, function1, function12, function0, focusRequester, z3, acatsInScreenContext, z7, z8, function06, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                focusRequester2 = focusRequester;
                                if ((i3 & 1024) == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                int i122 = i5;
                                i6 = i3 & 4096;
                                if (i6 == 0) {
                                }
                                i8 = i3 & 8192;
                                if (i8 == 0) {
                                }
                                i10 = i3 & 16384;
                                if (i10 == 0) {
                                }
                                if ((i4 & 306783379) == 306783378) {
                                    if (i6 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    boolean z112 = z10;
                                    Function0<Unit> function072 = function05;
                                    composer2 = composerStartRestartGroup;
                                    DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(-764236072, true, new C76022(acatsPlaidPartialTransferAssetRowData2, z9, z112, function072, acatsPlaidPartialTransferEditDuxo4, acatsInScreenContext, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, acatsPlaidPartialTransferAssetRowData2.editLoggingIdentifier(), null, 10, null), function03, function13, function14, focusRequester2, str2, z2, amountInputVisualTransformation2, z6, z3), composer2, 54), composer2, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z7 = z9;
                                    z8 = z112;
                                    function06 = function072;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            function03 = function0;
                            if ((i3 & 512) == 0) {
                            }
                            focusRequester2 = focusRequester;
                            if ((i3 & 1024) == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            int i1222 = i5;
                            i6 = i3 & 4096;
                            if (i6 == 0) {
                            }
                            i8 = i3 & 8192;
                            if (i8 == 0) {
                            }
                            i10 = i3 & 16384;
                            if (i10 == 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        function14 = function12;
                        if ((i3 & 256) == 0) {
                        }
                        function03 = function0;
                        if ((i3 & 512) == 0) {
                        }
                        focusRequester2 = focusRequester;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i12222 = i5;
                        i6 = i3 & 4096;
                        if (i6 == 0) {
                        }
                        i8 = i3 & 8192;
                        if (i8 == 0) {
                        }
                        i10 = i3 & 16384;
                        if (i10 == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function13 = function1;
                    if ((i3 & 128) != 0) {
                    }
                    function14 = function12;
                    if ((i3 & 256) == 0) {
                    }
                    function03 = function0;
                    if ((i3 & 512) == 0) {
                    }
                    focusRequester2 = focusRequester;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i122222 = i5;
                    i6 = i3 & 4096;
                    if (i6 == 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 == 0) {
                    }
                    i10 = i3 & 16384;
                    if (i10 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                amountInputVisualTransformation2 = amountInputVisualTransformation;
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                function13 = function1;
                if ((i3 & 128) != 0) {
                }
                function14 = function12;
                if ((i3 & 256) == 0) {
                }
                function03 = function0;
                if ((i3 & 512) == 0) {
                }
                focusRequester2 = focusRequester;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i1222222 = i5;
                i6 = i3 & 4096;
                if (i6 == 0) {
                }
                i8 = i3 & 8192;
                if (i8 == 0) {
                }
                i10 = i3 & 16384;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            amountInputVisualTransformation2 = amountInputVisualTransformation;
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            function13 = function1;
            if ((i3 & 128) != 0) {
            }
            function14 = function12;
            if ((i3 & 256) == 0) {
            }
            function03 = function0;
            if ((i3 & 512) == 0) {
            }
            focusRequester2 = focusRequester;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i12222222 = i5;
            i6 = i3 & 4096;
            if (i6 == 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            i10 = i3 & 16384;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z6 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        amountInputVisualTransformation2 = amountInputVisualTransformation;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        function13 = function1;
        if ((i3 & 128) != 0) {
        }
        function14 = function12;
        if ((i3 & 256) == 0) {
        }
        function03 = function0;
        if ((i3 & 512) == 0) {
        }
        focusRequester2 = focusRequester;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i122222222 = i5;
        i6 = i3 & 4096;
        if (i6 == 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        i10 = i3 & 16384;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferAdjustmentRow(final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, final FocusRequester focusRequester, final String str, final boolean z, final AmountInputVisualTransformation amountInputVisualTransformation, final Function1<? super Boolean, Unit> function1, final boolean z2, final boolean z3, Composer composer, final int i) {
        int i2;
        FocusRequester focusRequester2;
        String str2;
        boolean z4;
        AmountInputVisualTransformation amountInputVisualTransformation2;
        boolean z5;
        boolean z6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1386080839);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(acatsPlaidPartialTransferAssetRowData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            focusRequester2 = focusRequester;
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 32 : 16;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            z4 = z;
            i2 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z;
        }
        if ((i & 24576) == 0) {
            amountInputVisualTransformation2 = amountInputVisualTransformation;
            i2 |= composerStartRestartGroup.changed(amountInputVisualTransformation2) ? 16384 : 8192;
        } else {
            amountInputVisualTransformation2 = amountInputVisualTransformation;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z5 = z2;
            i2 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
        } else {
            z5 = z2;
        }
        if ((12582912 & i) == 0) {
            z6 = z3;
            i2 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
        } else {
            z6 = z3;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386080839, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferAdjustmentRow (AcatsPlaidPartialTransferEditComposable.kt:382)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z7 = (i2 & 458752) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferAdjustmentRow$lambda$18$lambda$17(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), null, null, ComposableLambda3.rememberComposableLambda(-795104714, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferAdjustmentRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String strStringResource;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-795104714, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferAdjustmentRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:393)");
                    }
                    Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 1.0f);
                    AcatsPlaidPartialTransferDuxo3 type2 = acatsPlaidPartialTransferAssetRowData.getType();
                    if ((type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) || (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment)) {
                        composer2.startReplaceGroup(-219531873);
                        strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_cash_input_amount_row_label, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                        composer2.startReplaceGroup(-219328296);
                        strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_add_equity_number_of_shares_prompt, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                            composer2.startReplaceGroup(408553472);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-219118240);
                        strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_num_contracts, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    String str3 = strStringResource;
                    BentoText2.m20747BentoText38GnDrw(str3, modifierZIndex, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 100687920, 0, 7916);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(386835321, true, new C75964(density, focusRequester2, str2, z4, amountInputVisualTransformation2, z5, z6, function1), composerStartRestartGroup, 54), true, false, true, null, composerStartRestartGroup, 819465216, 0, 1334);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferAdjustmentRow$lambda$19(acatsPlaidPartialTransferAssetRowData, focusRequester, str, z, amountInputVisualTransformation, function1, z2, z3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferAdjustmentRow$lambda$18$lambda$17(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferEditText(final FocusRequester focusRequester, final String str, final boolean z, final AmountInputVisualTransformation amountInputVisualTransformation, final boolean z2, final boolean z3, Composer composer, final int i) {
        int i2;
        AmountInputVisualTransformation amountInputVisualTransformation2;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(792835830);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(focusRequester) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            amountInputVisualTransformation2 = amountInputVisualTransformation;
            i2 |= composerStartRestartGroup.changed(amountInputVisualTransformation2) ? 2048 : 1024;
        } else {
            amountInputVisualTransformation2 = amountInputVisualTransformation;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(792835830, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditText (AcatsPlaidPartialTransferEditComposable.kt:455)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(Modifier.INSTANCE, focusRequester);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1347538551);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else if (!z) {
                composerStartRestartGroup.startReplaceGroup(1347615090);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21452getNegative0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1347678392);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744442, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditText$lambda$21$lambda$20((String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i4 = i2 >> 3;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, modifierFocusRequester, false, z3, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) amountInputVisualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer2, (i4 & 14) | 100663344 | (i4 & 57344), (i2 >> 6) & 112, 63176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditText$lambda$22(focusRequester, str, z, amountInputVisualTransformation, z2, z3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditText$lambda$21$lambda$20(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferEditSelectionRow(final String str, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(880799440);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(880799440, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSelectionRow (AcatsPlaidPartialTransferEditComposable.kt:484)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSelectionRow$lambda$24$lambda$23(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), null, null, ComposableLambda3.rememberComposableLambda(1361123981, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferEditSelectionRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1361123981, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSelectionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:491)");
                    }
                    TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8174);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1537862800, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferEditSelectionRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1537862800, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSelectionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:498)");
                    }
                    final boolean z3 = z;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1744049563, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferEditSelectionRow.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1744049563, i4, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditSelectionRow.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:499)");
                            }
                            BentoRadioButton2.BentoRadioButton(z3, null, true, composer4, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), true, false, true, null, composer2, 819465216, 0, 1334);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSelectionRow$lambda$25(str, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsPlaidPartialTransferEditSelectionRow$lambda$24$lambda$23(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AcatsPlaidPartialTransferPositionRow(final String str, final boolean z, final boolean z2, final BigDecimal bigDecimal, final String str2, boolean z3, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Composer composer2;
        final Function0<Unit> function04;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-36548167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
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
            i3 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                z4 = z3;
                i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    boolean z6 = i5 == 0 ? false : z4;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function03 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36548167, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow (AcatsPlaidPartialTransferEditComposable.kt:518)");
                    }
                    Function0<Unit> function05 = function03;
                    boolean z7 = z6;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(Alpha.alpha(Modifier.INSTANCE, !z2 ? 0.5f : 1.0f), null, null, ComposableLambda3.rememberComposableLambda(-786449636, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-786449636, i6, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:524)");
                            }
                            TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                            BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8174);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2128732347, true, new C76073(bigDecimal, function03, z6, str2), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-630838279, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-630838279, i6, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:562)");
                            }
                            final boolean z8 = z;
                            final boolean z9 = z2;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1723596082, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.4.1
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
                                        ComposerKt.traceEventStart(-1723596082, i7, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:563)");
                                    }
                                    BentoRadioButton2.BentoRadioButton(z8, null, !z9, composer4, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), true, false, true, null, composer2, 819489792, 0, 1318);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function05;
                    z5 = z7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    z5 = z4;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferPositionRow$lambda$28(str, z, z2, bigDecimal, str2, z5, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function02 = function0;
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Function0<Unit> function052 = function03;
                boolean z72 = z6;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(Alpha.alpha(Modifier.INSTANCE, !z2 ? 0.5f : 1.0f), null, null, ComposableLambda3.rememberComposableLambda(-786449636, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-786449636, i6, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:524)");
                        }
                        TextStyle textM = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8174);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2128732347, true, new C76073(bigDecimal, function03, z6, str2), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-630838279, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-630838279, i6, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:562)");
                        }
                        final boolean z8 = z;
                        final boolean z9 = z2;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1723596082, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt.AcatsPlaidPartialTransferPositionRow.4.1
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
                                    ComposerKt.traceEventStart(-1723596082, i7, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:563)");
                                }
                                BentoRadioButton2.BentoRadioButton(z8, null, !z9, composer4, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), true, false, true, null, composer2, 819489792, 0, 1318);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function052;
                z5 = z72;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z3;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferPositionRow$3 */
    static final class C76073 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $assetName;
        final /* synthetic */ BigDecimal $borrowingFee;
        final /* synthetic */ Function0<Unit> $onTooltipClick;
        final /* synthetic */ boolean $showBorrowingFeeTooltip;

        C76073(BigDecimal bigDecimal, Function0<Unit> function0, boolean z, String str) {
            this.$borrowingFee = bigDecimal;
            this.$onTooltipClick = function0;
            this.$showBorrowingFeeTooltip = z;
            this.$assetName = str;
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
                ComposerKt.traceEventStart(2128732347, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:531)");
            }
            BigDecimal bigDecimal = this.$borrowingFee;
            if (bigDecimal != null) {
                final Function0<Unit> function0 = this.$onTooltipClick;
                boolean z = this.$showBorrowingFeeTooltip;
                final String str = this.$assetName;
                String str2 = Formats.getLeadingZeroesHundredthPercentFormat().format(bigDecimal);
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_rate, new Object[]{str2}, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferPositionRow$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsPlaidPartialTransferEditComposable.C76073.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                Boolean boolValueOf = Boolean.valueOf(z);
                PopupPositioning popupPositioning = PopupPositioning.BELOW;
                Duration.Companion companion3 = Duration.INSTANCE;
                BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21426getFg20d7_KjU, modifierM4893clickableXHw0xAI$default.then(PopupTooltipKt.m26519popupTooltipBgaGok8(companion, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : popupPositioning, (16232 & 32) != 0 ? null : Duration.m28726boximpl(Duration3.toDuration(5, DurationUnitJvm.SECONDS)), (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(1260383531, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferPositionRow$3$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1260383531, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferPositionRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:549)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_tooltip, new Object[]{str}, composer2, 0), SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54))), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                composer.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferEditBottomSection(final boolean z, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1125911919);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1125911919, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditBottomSection (AcatsPlaidPartialTransferEditComposable.kt:578)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            int i4 = i2;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_confirm_btn, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, false, null, composerStartRestartGroup, (i2 >> 3) & 14, 0, 8056);
            composerStartRestartGroup.startReplaceGroup(1455135204);
            if (z) {
                function03 = function0;
                function04 = function02;
                BentoButtonKt.m20586BentoButtonEikTQX8(function04, StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_transfer_remove_btn, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, false, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 384, 0, 7288);
            } else {
                function03 = function0;
                function04 = function02;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditBottomSection$lambda$30(z, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsPlaidPartialTransferEditTitle(final AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1381194741);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(acatsPlaidPartialTransferAssetRowData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381194741, i2, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditTitle (AcatsPlaidPartialTransferEditComposable.kt:605)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 5, null), 0.0f, composerStartRestartGroup, 0, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            StringResource primaryText = acatsPlaidPartialTransferAssetRowData.getPrimaryText();
            Intrinsics.checkNotNull(resources);
            String string2 = primaryText.getText(resources).toString();
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, companion3.getW500(), null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 24576, 0, 8174);
            BentoText2.m20747BentoText38GnDrw(acatsPlaidPartialTransferAssetRowData.getSecondaryText().getText(resources).toString(), null, null, null, companion3.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextL(), composer2, 24576, 0, 8174);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditTitle$lambda$32(acatsPlaidPartialTransferAssetRowData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityPositionSection(final String str, BigDecimal bigDecimal, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        BigDecimal bigDecimal2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        final BigDecimal bigDecimal3;
        final boolean z3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-963685304);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                bigDecimal2 = bigDecimal;
                i3 |= composerStartRestartGroup.changedInstance(bigDecimal2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        bigDecimal3 = bigDecimal2;
                        z3 = z2;
                        function04 = function02;
                    } else {
                        BigDecimal bigDecimal4 = i6 == 0 ? null : bigDecimal2;
                        boolean z4 = i4 == 0 ? false : z2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-963685304, i3, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.EquityPositionSection (AcatsPlaidPartialTransferEditComposable.kt:634)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_position_header, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                        composerStartRestartGroup = composerStartRestartGroup;
                        String strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_long_row_primary, composerStartRestartGroup, 0);
                        boolean z5 = bigDecimal4 != null;
                        boolean z6 = bigDecimal4 == null;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AcatsPlaidPartialTransferPositionRow(strStringResource, z5, z6, null, "", false, (Function0) objRememberedValue, composerStartRestartGroup, 1797120, 0);
                        int i8 = ((i3 << 6) & 7168) | ((i3 << 12) & 57344);
                        int i9 = i3 << 9;
                        BigDecimal bigDecimal5 = bigDecimal4;
                        boolean z7 = z4;
                        Function0<Unit> function05 = function03;
                        AcatsPlaidPartialTransferPositionRow(StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_short_row_primary, composerStartRestartGroup, 0), bigDecimal4 == null, bigDecimal4 != null, bigDecimal5, str2, z7, function05, composerStartRestartGroup, i8 | (458752 & i9) | (i9 & 3670016), 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        bigDecimal3 = bigDecimal5;
                        z3 = z7;
                        function04 = function05;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AcatsPlaidPartialTransferEditComposable.EquityPositionSection$lambda$38(str, bigDecimal3, z3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function02 = function0;
                if ((i3 & 1171) != 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_position_header, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
                        composerStartRestartGroup = composerStartRestartGroup;
                        String strStringResource2 = StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_long_row_primary, composerStartRestartGroup, 0);
                        if (bigDecimal4 != null) {
                        }
                        if (bigDecimal4 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AcatsPlaidPartialTransferPositionRow(strStringResource2, z5, z6, null, "", false, (Function0) objRememberedValue, composerStartRestartGroup, 1797120, 0);
                        int i82 = ((i3 << 6) & 7168) | ((i3 << 12) & 57344);
                        int i92 = i3 << 9;
                        BigDecimal bigDecimal52 = bigDecimal4;
                        boolean z72 = z4;
                        Function0<Unit> function052 = function03;
                        AcatsPlaidPartialTransferPositionRow(StringResources_androidKt.stringResource(C7686R.string.acats_in_option_input_short_row_primary, composerStartRestartGroup, 0), bigDecimal4 == null, bigDecimal4 != null, bigDecimal52, str2, z72, function052, composerStartRestartGroup, i82 | (458752 & i92) | (i92 & 3670016), 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        bigDecimal3 = bigDecimal52;
                        z3 = z72;
                        function04 = function052;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        bigDecimal2 = bigDecimal;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PositionComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1239499193);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1239499193, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.PositionComposable (AcatsPlaidPartialTransferEditComposable.kt:667)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1202687745, true, new C76101(new BigDecimal("3.05")), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsPlaidPartialTransferEditComposable.PositionComposable$lambda$39(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

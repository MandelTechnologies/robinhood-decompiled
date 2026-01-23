package defpackage;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.firstdeposit.AccountRowData;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferEvent;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferViewState;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.resource.StringResource;
import defpackage.AdvisoryFirstDepositTransferComposableKt;
import defpackage.TransferAccountListConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a}\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001ac\u0010#\u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b#\u0010$\u001a/\u0010&\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00192\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b&\u0010'\u001a/\u0010)\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b)\u0010*\u001aC\u00100\u001a\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u000e2\u0006\u0010/\u001a\u00020.2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b0\u00101\u001a/\u00105\u001a\u00020\u00012\u0006\u00103\u001a\u0002022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b5\u00106\"\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006B²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u0014\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\nX\u008a\u0084\u0002²\u0006\u000e\u0010@\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onBackPress", "onPushToAgreements", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDuxo;", "duxo", "AdvisoryFirstDepositComposable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferDuxo;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;", "viewState", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onKeyPress", "", "onSelectTransferAccount", "Ljava/math/BigDecimal;", "onQuickAmountSelected", "onContinueCtaClicked", "onResetShake", "Landroidx/compose/ui/Modifier;", "modifier", "FirstTimeDeposit", "(Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "amountStringFormatted", "", "shake", "TickerInput", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "chips", "continueCtaEnabled", "showContinueCta", "disclaimer", "CenterButtons", "(Lkotlinx/collections/immutable/ImmutableList;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "visible", CreateTransferV2Composable3.NumpadTag, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onAccountClicked", "TransferInfo", "(Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AccountRowData;", "transferAccounts", "selectedTransferAccountId", "LTransferAccountListConfig;", "config", "TransferAccountList", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;LTransferAccountListConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/utils/resource/StringResource;", "selectedTransferAccountName", "onClick", "AccountSelectorDropdown", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/EnterTransition;", "ENTER_SLIDE_IN", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "EXIT_SLIDE_OUT", "Landroidx/compose/animation/ExitTransition;", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AdvisoryFirstDepositTransferEvent;", "event", "showTransferAccountList", "amountStringInitialized", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvisoryFirstDepositTransferComposableKt {
    private static final EnterTransition ENTER_SLIDE_IN = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 2, null));
    private static final ExitTransition EXIT_SLIDE_OUT = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutVertically$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 2, null));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorDropdown$lambda$41(StringResource stringResource, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectorDropdown(stringResource, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryFirstDepositComposable$lambda$3(Function0 function0, Function0 function02, AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, int i, int i2, Composer composer, int i3) {
        AdvisoryFirstDepositComposable(function0, function02, advisoryFirstDepositTransferDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CenterButtons$lambda$30(ImmutableList immutableList, boolean z, boolean z2, String str, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CenterButtons(immutableList, z, z2, str, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTimeDeposit$lambda$16(AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FirstTimeDeposit(advisoryFirstDepositTransferViewState, function1, function12, function13, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Numpad$lambda$31(boolean z, Function1 function1, int i, Composer composer, int i2) {
        Numpad(z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInput$lambda$26(String str, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        TickerInput(str, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferAccountList$lambda$40(ImmutableList immutableList, String str, TransferAccountListConfig transferAccountListConfig, Function1 function1, int i, Composer composer, int i2) {
        TransferAccountList(immutableList, str, transferAccountListConfig, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferInfo$lambda$32(AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferInfo(advisoryFirstDepositTransferViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisoryFirstDepositTransferViewState AdvisoryFirstDepositComposable$lambda$0(SnapshotState4<AdvisoryFirstDepositTransferViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<AdvisoryFirstDepositTransferEvent> AdvisoryFirstDepositComposable$lambda$1(SnapshotState4<Event<AdvisoryFirstDepositTransferEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean FirstTimeDeposit$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean TickerInput$lambda$18(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryFirstDepositComposable(final Function0<Unit> onBackPress, final Function0<Unit> onPushToAgreements, AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo2;
        final AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo3;
        Event<AdvisoryFirstDepositTransferEvent> event;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        Intrinsics.checkNotNullParameter(onBackPress, "onBackPress");
        Intrinsics.checkNotNullParameter(onPushToAgreements, "onPushToAgreements");
        Composer composerStartRestartGroup = composer.startRestartGroup(-731067157);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackPress) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPushToAgreements) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                advisoryFirstDepositTransferDuxo2 = advisoryFirstDepositTransferDuxo;
                int i4 = composerStartRestartGroup.changedInstance(advisoryFirstDepositTransferDuxo2) ? 256 : 128;
                i3 |= i4;
            } else {
                advisoryFirstDepositTransferDuxo2 = advisoryFirstDepositTransferDuxo;
            }
            i3 |= i4;
        } else {
            advisoryFirstDepositTransferDuxo2 = advisoryFirstDepositTransferDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            advisoryFirstDepositTransferDuxo3 = advisoryFirstDepositTransferDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisoryFirstDepositTransferDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$duxo$1.1
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
                    advisoryFirstDepositTransferDuxo2 = (AdvisoryFirstDepositTransferDuxo) baseDuxo;
                    i3 &= -897;
                }
                int i5 = i3;
                advisoryFirstDepositTransferDuxo3 = advisoryFirstDepositTransferDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731067157, i5, -1, "AdvisoryFirstDepositComposable (AdvisoryFirstDepositTransferComposable.kt:114)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advisoryFirstDepositTransferDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<AdvisoryFirstDepositTransferEvent>> eventFlow = advisoryFirstDepositTransferDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AdvisoryFirstDepositTransferComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdvisoryFirstDepositTransferEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdvisoryFirstDepositTransferEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof AdvisoryFirstDepositTransferEvent)) {
                    value = null;
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Screen screen = new Screen(Screen.Name.CREATE_TRANSFER_V2, null, "advisory-onboarding", null, 10, null);
                String str = null;
                final Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getSource(), null, null, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getBrokerageAccountType()), str, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(-1289626969, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1289626969, i7, -1, "AdvisoryFirstDepositComposable.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:133)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final SnapshotState4<AdvisoryFirstDepositTransferViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(971728730, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(971728730, i8, -1, "AdvisoryFirstDepositComposable.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:138)");
                                }
                                BentoText2.m20747BentoText38GnDrw(AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$0(snapshotState4).getHeaderText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Function0<Unit> function0 = onBackPress;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1168641670, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1168641670, i8, -1, "AdvisoryFirstDepositComposable.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:135)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, appBarType, null, 0L, null, composer2, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1824045244, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1824045244, i7, -1, "AdvisoryFirstDepositComposable.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:146)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen, null, context, null, null, 53, null)), paddingValues);
                        AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewStateAdvisoryFirstDepositComposable$lambda$0 = AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo4 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(advisoryFirstDepositTransferDuxo4);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new C0030x876a5278(advisoryFirstDepositTransferDuxo4);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue3;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo5 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(advisoryFirstDepositTransferDuxo5);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C0031x876a5639(advisoryFirstDepositTransferDuxo5);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        KFunction kFunction2 = (KFunction) objRememberedValue4;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo6 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(advisoryFirstDepositTransferDuxo6);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new C0032x876a59fa(advisoryFirstDepositTransferDuxo6);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue5;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo7 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer2.changedInstance(advisoryFirstDepositTransferDuxo7);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new C0033x876a5dbb(advisoryFirstDepositTransferDuxo7);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        KFunction kFunction4 = (KFunction) objRememberedValue6;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo8 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance6 = composer2.changedInstance(advisoryFirstDepositTransferDuxo8);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new C0034x876a617c(advisoryFirstDepositTransferDuxo8);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit(advisoryFirstDepositTransferViewStateAdvisoryFirstDepositComposable$lambda$0, (Function1) kFunction4, (Function1) kFunction, (Function1) kFunction2, (Function0) kFunction3, (Function0) ((KFunction) objRememberedValue7), modifierPadding, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                Event<AdvisoryFirstDepositTransferEvent> eventAdvisoryFirstDepositComposable$lambda$1 = AdvisoryFirstDepositComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i5 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C0035x96ead06c(snapshotState4CollectAsStateWithLifecycle, onPushToAgreements, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(eventAdvisoryFirstDepositComposable$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                int i52 = i3;
                advisoryFirstDepositTransferDuxo3 = advisoryFirstDepositTransferDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<AdvisoryFirstDepositTransferViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(advisoryFirstDepositTransferDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = advisoryFirstDepositTransferDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "AdvisoryFirstDepositTransferComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof AdvisoryFirstDepositTransferEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<AdvisoryFirstDepositTransferEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof AdvisoryFirstDepositTransferEvent)) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final Screen screen2 = new Screen(Screen.Name.CREATE_TRANSFER_V2, null, "advisory-onboarding", null, 10, null);
                String str2 = null;
                final Context context2 = new Context(0, 0, 0, null, null, null, null, null, 0, null, AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getSource(), null, null, str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getBrokerageAccountType()), str2, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, ComposableLambda3.rememberComposableLambda(-1289626969, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1289626969, i7, -1, "AdvisoryFirstDepositComposable.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:133)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final SnapshotState4<AdvisoryFirstDepositTransferViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(971728730, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(971728730, i8, -1, "AdvisoryFirstDepositComposable.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:138)");
                                }
                                BentoText2.m20747BentoText38GnDrw(AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$0(snapshotState4).getHeaderText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Function0<Unit> function0 = onBackPress;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1168641670, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1168641670, i8, -1, "AdvisoryFirstDepositComposable.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:135)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, appBarType, null, 0L, null, composer2, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1824045244, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1824045244, i7, -1, "AdvisoryFirstDepositComposable.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:146)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, screen2, null, context2, null, null, 53, null)), paddingValues);
                        AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewStateAdvisoryFirstDepositComposable$lambda$0 = AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22);
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo4 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(advisoryFirstDepositTransferDuxo4);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new C0030x876a5278(advisoryFirstDepositTransferDuxo4);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue3;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo5 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(advisoryFirstDepositTransferDuxo5);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new C0031x876a5639(advisoryFirstDepositTransferDuxo5);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        KFunction kFunction2 = (KFunction) objRememberedValue4;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo6 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(advisoryFirstDepositTransferDuxo6);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new C0032x876a59fa(advisoryFirstDepositTransferDuxo6);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue5;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo7 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer2.changedInstance(advisoryFirstDepositTransferDuxo7);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new C0033x876a5dbb(advisoryFirstDepositTransferDuxo7);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        KFunction kFunction4 = (KFunction) objRememberedValue6;
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferDuxo advisoryFirstDepositTransferDuxo8 = advisoryFirstDepositTransferDuxo3;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance6 = composer2.changedInstance(advisoryFirstDepositTransferDuxo8);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new C0034x876a617c(advisoryFirstDepositTransferDuxo8);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit(advisoryFirstDepositTransferViewStateAdvisoryFirstDepositComposable$lambda$0, (Function1) kFunction4, (Function1) kFunction, (Function1) kFunction2, (Function0) kFunction3, (Function0) ((KFunction) objRememberedValue7), modifierPadding, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306422, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                Event<AdvisoryFirstDepositTransferEvent> eventAdvisoryFirstDepositComposable$lambda$12 = AdvisoryFirstDepositComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i52 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new C0035x96ead06c(snapshotState4CollectAsStateWithLifecycle, onPushToAgreements, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(eventAdvisoryFirstDepositComposable$lambda$12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferComposableKt.AdvisoryFirstDepositComposable$lambda$3(onBackPress, onPushToAgreements, advisoryFirstDepositTransferDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FirstTimeDeposit(final AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, final Function1<? super KeyEvent, Unit> function1, final Function1<? super String, Unit> function12, final Function1<? super BigDecimal, Unit> function13, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        StringResource accountSelectorDropdownLabel;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-16966608);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(advisoryFirstDepositTransferViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 != 0) {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                        } else {
                            Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-16966608, i3, -1, "FirstTimeDeposit (AdvisoryFirstDepositTransferComposable.kt:181)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier3, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                            Modifier modifier4 = modifier3;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i6 = i3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierWeight$default = Column5.weight$default(column6, companion4, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            TickerInput(advisoryFirstDepositTransferViewState.getAmountStringFormatted(), advisoryFirstDepositTransferViewState.getShakeAmountText(), companion4, function02, composerStartRestartGroup, ((i6 >> 6) & 7168) | 384, 0);
                            accountSelectorDropdownLabel = advisoryFirstDepositTransferViewState.getAccountSelectorDropdownLabel();
                            composerStartRestartGroup.startReplaceGroup(463934593);
                            if (accountSelectorDropdownLabel != null) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit$lambda$13$lambda$10$lambda$9$lambda$8$lambda$7(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                AccountSelectorDropdown(accountSelectorDropdownLabel, (Function0) objRememberedValue3, null, composerStartRestartGroup, StringResource.$stable | 48, 4);
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            AnimatedVisibilityKt.AnimatedVisibility(column6, advisoryFirstDepositTransferViewState.getAmountInfoDisclaimer() == null, PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(943003884, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(943003884, i7, -1, "FirstTimeDeposit.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:222)");
                                    }
                                    final AdvisoryFirstDepositTransferViewState2 amountInfoDisclaimer = advisoryFirstDepositTransferViewState.getAmountInfoDisclaimer();
                                    if (amountInfoDisclaimer instanceof AdvisoryFirstDepositTransferViewState2.Label) {
                                        composer2.startReplaceGroup(-352236971);
                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(((AdvisoryFirstDepositTransferViewState2.Label) amountInfoDisclaimer).getResource(), composer2, StringResource.$stable), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 0, 0, 8124);
                                        composer2.endReplaceGroup();
                                    } else if (amountInfoDisclaimer instanceof AdvisoryFirstDepositTransferViewState2.Sdui) {
                                        composer2.startReplaceGroup(-351837009);
                                        GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(1306138877, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$1$1$2.1
                                            public final void invoke(Composer composer3, int i8) {
                                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1306138877, i8, -1, "FirstTimeDeposit.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:234)");
                                                }
                                                ImmutableList<UIComponent<GenericAction>> content = ((AdvisoryFirstDepositTransferViewState2.Sdui) amountInfoDisclaimer).getContent();
                                                composer3.startReplaceGroup(-1772220517);
                                                SduiColumns.SduiColumn(content, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 0, 0);
                                                composer3.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }
                                        }, composer2, 54), composer2, 24576, 15);
                                        composer2.endReplaceGroup();
                                    } else {
                                        if (amountInfoDisclaimer != null) {
                                            composer2.startReplaceGroup(-11365558);
                                            composer2.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer2.startReplaceGroup(-351585196);
                                        composer2.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 28);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit$lambda$13$lambda$12$lambda$11(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TransferInfo(advisoryFirstDepositTransferViewState, (Function0) objRememberedValue2, null, composerStartRestartGroup, (i6 & 14) | 48, 4);
                            CenterButtons(advisoryFirstDepositTransferViewState.getChips(), advisoryFirstDepositTransferViewState.getContinueCtaEnabled(), advisoryFirstDepositTransferViewState.getShowContinueCta(), advisoryFirstDepositTransferViewState.getFooterDisclaimer(), function13, function0, null, composerStartRestartGroup, (i6 << 3) & 516096, 64);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(378729733);
                            float fM21590getDefaultD9Ej5fM = !advisoryFirstDepositTransferViewState.getShowTransferAccountInfo() ? bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM() : C2002Dp.m7995constructorimpl(0);
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, fM21590getDefaultD9Ej5fM), composerStartRestartGroup, 0);
                            Numpad(advisoryFirstDepositTransferViewState.getShowNumpad(), function1, composerStartRestartGroup, i6 & 112);
                            composerStartRestartGroup.endNode();
                            if (FirstTimeDeposit$lambda$5(snapshotState)) {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit$lambda$15$lambda$14(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(925372540, true, new C00373(advisoryFirstDepositTransferViewState, function12), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 62);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AdvisoryFirstDepositTransferComposableKt.FirstTimeDeposit$lambda$16(advisoryFirstDepositTransferViewState, function1, function12, function13, function0, function02, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier3, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null);
                        Modifier modifier42 = modifier3;
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        int i62 = i3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierWeight$default2 = Column5.weight$default(column62, companion42, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getCenter(), companion22.getCenterHorizontally(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                TickerInput(advisoryFirstDepositTransferViewState.getAmountStringFormatted(), advisoryFirstDepositTransferViewState.getShakeAmountText(), companion42, function02, composerStartRestartGroup, ((i62 >> 6) & 7168) | 384, 0);
                                accountSelectorDropdownLabel = advisoryFirstDepositTransferViewState.getAccountSelectorDropdownLabel();
                                composerStartRestartGroup.startReplaceGroup(463934593);
                                if (accountSelectorDropdownLabel != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                AnimatedVisibilityKt.AnimatedVisibility(column62, advisoryFirstDepositTransferViewState.getAmountInfoDisclaimer() == null, PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(943003884, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$1$1$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(943003884, i7, -1, "FirstTimeDeposit.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:222)");
                                        }
                                        final AdvisoryFirstDepositTransferViewState2 amountInfoDisclaimer = advisoryFirstDepositTransferViewState.getAmountInfoDisclaimer();
                                        if (amountInfoDisclaimer instanceof AdvisoryFirstDepositTransferViewState2.Label) {
                                            composer2.startReplaceGroup(-352236971);
                                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(((AdvisoryFirstDepositTransferViewState2.Label) amountInfoDisclaimer).getResource(), composer2, StringResource.$stable), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 0, 0, 8124);
                                            composer2.endReplaceGroup();
                                        } else if (amountInfoDisclaimer instanceof AdvisoryFirstDepositTransferViewState2.Sdui) {
                                            composer2.startReplaceGroup(-351837009);
                                            GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(1306138877, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$1$1$2.1
                                                public final void invoke(Composer composer3, int i8) {
                                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1306138877, i8, -1, "FirstTimeDeposit.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:234)");
                                                    }
                                                    ImmutableList<UIComponent<GenericAction>> content = ((AdvisoryFirstDepositTransferViewState2.Sdui) amountInfoDisclaimer).getContent();
                                                    composer3.startReplaceGroup(-1772220517);
                                                    SduiColumns.SduiColumn(content, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 0, 0);
                                                    composer3.endReplaceGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer2, 54), composer2, 24576, 15);
                                            composer2.endReplaceGroup();
                                        } else {
                                            if (amountInfoDisclaimer != null) {
                                                composer2.startReplaceGroup(-11365558);
                                                composer2.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer2.startReplaceGroup(-351585196);
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 28);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                TransferInfo(advisoryFirstDepositTransferViewState, (Function0) objRememberedValue2, null, composerStartRestartGroup, (i62 & 14) | 48, 4);
                                CenterButtons(advisoryFirstDepositTransferViewState.getChips(), advisoryFirstDepositTransferViewState.getContinueCtaEnabled(), advisoryFirstDepositTransferViewState.getShowContinueCta(), advisoryFirstDepositTransferViewState.getFooterDisclaimer(), function13, function0, null, composerStartRestartGroup, (i62 << 3) & 516096, 64);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.startReplaceGroup(378729733);
                                if (!advisoryFirstDepositTransferViewState.getShowTransferAccountInfo()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, fM21590getDefaultD9Ej5fM), composerStartRestartGroup, 0);
                                Numpad(advisoryFirstDepositTransferViewState.getShowNumpad(), function1, composerStartRestartGroup, i62 & 112);
                                composerStartRestartGroup.endNode();
                                if (FirstTimeDeposit$lambda$5(snapshotState)) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void FirstTimeDeposit$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTimeDeposit$lambda$13$lambda$10$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState) {
        FirstTimeDeposit$lambda$6(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTimeDeposit$lambda$13$lambda$12$lambda$11(SnapshotState snapshotState) {
        FirstTimeDeposit$lambda$6(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FirstTimeDeposit$lambda$15$lambda$14(SnapshotState snapshotState) {
        FirstTimeDeposit$lambda$6(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryFirstDepositTransferComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$3 */
    static final class C00373 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onSelectTransferAccount;
        final /* synthetic */ AdvisoryFirstDepositTransferViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C00373(AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, Function1<? super String, Unit> function1) {
            this.$viewState = advisoryFirstDepositTransferViewState;
            this.$onSelectTransferAccount = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925372540, i, -1, "FirstTimeDeposit.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:275)");
            }
            ImmutableList<AccountRowData> accountRows = this.$viewState.getAccountRows();
            String selectedTransferAccountId = this.$viewState.getSelectedTransferAccountId();
            TransferAccountListConfig accountListConfig = this.$viewState.getAccountListConfig();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = ((i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changed(this.$onSelectTransferAccount);
            final Function1<String, Unit> function1 = this.$onSelectTransferAccount;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$FirstTimeDeposit$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryFirstDepositTransferComposableKt.C00373.invoke$lambda$1$lambda$0(function1, RhModalBottomSheet, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AdvisoryFirstDepositTransferComposableKt.TransferAccountList(accountRows, selectedTransferAccountId, accountListConfig, (Function1) objRememberedValue, composer, StringResource.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TickerInput(final String str, boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Modifier modifier3;
        final boolean z2;
        final Function0<Unit> function02;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1607050407);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function02 = function0;
                modifier4 = modifier2;
                z2 = z;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1607050407, i3, -1, "TickerInput (AdvisoryFirstDepositTransferComposable.kt:294)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-361497084);
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 14, 0, 16382);
                    composerStartRestartGroup.endReplaceGroup();
                    z2 = z;
                    function02 = function0;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-361406719);
                    modifier3 = modifier2;
                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(100));
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryFirstDepositTransferComposableKt.TickerInput$lambda$22$lambda$21((android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == companion.getEmpty()) {
                        z2 = z;
                        function02 = function0;
                        objRememberedValue3 = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryFirstDepositTransferComposableKt.TickerInput$lambda$25$lambda$24(str, z2, function02, snapshotState, (TickerInputView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        z2 = z;
                        function02 = function0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function1, modifierM5156height3ABfNKs, (Function1) objRememberedValue3, composerStartRestartGroup, 6, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryFirstDepositTransferComposableKt.TickerInput$lambda$26(str, z2, modifier4, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TickerInput$lambda$19(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TickerInputView TickerInput$lambda$22$lambda$21(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, 0.0f, 0, 30, null);
        tickerInputView.setUseLegacyTextSizingAndLayout(false);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_display_book));
        return tickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInput$lambda$25$lambda$24(String str, boolean z, Function0 function0, SnapshotState snapshotState, TickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        if (!TickerInput$lambda$18(snapshotState)) {
            TickerInput$lambda$19(snapshotState, true);
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            view.setValue(charArray);
        } else {
            char[] charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            view.transitionTo(charArray2);
        }
        if (z) {
            AnimationUtils.animateErrorShake$default(AnimationUtils.INSTANCE, view, 0L, 0.05f, 1, null);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CenterButtons(final ImmutableList<KeypadChip> immutableList, final boolean z, boolean z2, final String str, final Function1<? super BigDecimal, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        ImmutableList<KeypadChip> immutableList2;
        int i3;
        boolean z3;
        final boolean z4;
        String str2;
        Function1<? super BigDecimal, Unit> function12;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(107286264);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            immutableList2 = immutableList;
        } else {
            immutableList2 = immutableList;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(immutableList2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(107286264, i3, -1, "CenterButtons (AdvisoryFirstDepositTransferComposable.kt:335)");
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
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
                    int i5 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvisoryFirstDepositTransferComposableKt.CenterButtons$lambda$29$lambda$28$lambda$27((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1249108465, true, new AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2(str2, function02, z3, immutableList2, function12), composerStartRestartGroup, 54), composer2, ((i5 >> 6) & 14) | 1573248, 58);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AdvisoryFirstDepositTransferComposableKt.CenterButtons$lambda$30(immutableList, z, z4, str, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i52 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1249108465, true, new AdvisoryFirstDepositTransferComposableKt$CenterButtons$1$2(str2, function02, z3, immutableList2, function12), composerStartRestartGroup, 54), composer2, ((i52 >> 6) & 14) | 1573248, 58);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform CenterButtons$lambda$29$lambda$28$lambda$27(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(ENTER_SLIDE_IN, EXIT_SLIDE_OUT);
    }

    private static final void Numpad(boolean z, final Function1<? super KeyEvent, Unit> function1, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-227851253);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227851253, i2, -1, "Numpad (AdvisoryFirstDepositTransferComposable.kt:395)");
            }
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(554453731, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt.Numpad.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(554453731, i3, -1, "Numpad.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:399)");
                    }
                    BentoNumpad3.BentoNumpad(Modifier.INSTANCE, function1, true, null, false, false, composer2, 3462, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferComposableKt.Numpad$lambda$31(z2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TransferInfo(final AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-944298187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(advisoryFirstDepositTransferViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-944298187, i3, -1, "TransferInfo (AdvisoryFirstDepositTransferComposable.kt:413)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(advisoryFirstDepositTransferViewState.getShowTransferAccountInfo(), (Modifier) null, ENTER_SLIDE_IN, EXIT_SLIDE_OUT, (String) null, ComposableLambda3.rememberComposableLambda(-1259905187, true, new C00441(modifier, advisoryFirstDepositTransferViewState, function0), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferComposableKt.TransferInfo$lambda$32(advisoryFirstDepositTransferViewState, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AdvisoryFirstDepositTransferComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: AdvisoryFirstDepositTransferComposableKt$TransferInfo$1 */
    /* loaded from: classes7.dex */
    static final class C00441 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onAccountClicked;
        final /* synthetic */ AdvisoryFirstDepositTransferViewState $viewState;

        C00441(Modifier modifier, AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$viewState = advisoryFirstDepositTransferViewState;
            this.$onAccountClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259905187, i, -1, "TransferInfo.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:419)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null);
            final AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState = this.$viewState;
            final Function0<Unit> function0 = this.$onAccountClicked;
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
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), !advisoryFirstDepositTransferViewState.getLockSourceTransferAccount(), null, null, function0, 6, null);
            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_from, composer, 0), null, 2, null);
            StringResource selectedTransferAccountNameWithValue = advisoryFirstDepositTransferViewState.getSelectedTransferAccountNameWithValue();
            Resources resources = ((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            AnnotatedString annotatedString2 = new AnnotatedString(selectedTransferAccountNameWithValue.getText(resources).toString(), null, 2, null);
            if (advisoryFirstDepositTransferViewState.getLockSourceTransferAccount()) {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.LOCK_16;
            } else {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DROPDOWN_16;
            }
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, null, null, new BentoIcon4.Size16(serverToBentoAssetMapper2), null, false, false, 3805, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(advisoryFirstDepositTransferViewState) | composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferInfo$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFirstDepositTransferComposableKt.C00441.invoke$lambda$2$lambda$1$lambda$0(advisoryFirstDepositTransferViewState, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            int i3 = BentoDataRowState.$stable;
            BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, modifierM4893clickableXHw0xAI$default, function02, null, null, composer, i3, 24);
            AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_to, composer, 0), null, 2, null);
            StringResource destinationTransferAccountName = advisoryFirstDepositTransferViewState.getDestinationTransferAccountName();
            Resources resources2 = ((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, new AnnotatedString(destinationTransferAccountName.getText(resources2).toString(), null, 2, null), null, null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.LOCK_16), null, false, false, 3805, null), null, null, null, null, composer, i3, 30);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(AdvisoryFirstDepositTransferViewState advisoryFirstDepositTransferViewState, Function0 function0) {
            if (!advisoryFirstDepositTransferViewState.getLockSourceTransferAccount()) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TransferAccountList(final ImmutableList<AccountRowData> immutableList, final String str, final TransferAccountListConfig transferAccountListConfig, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        String str2;
        final Function1<? super String, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1856384317);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(transferAccountListConfig) : composerStartRestartGroup.changedInstance(transferAccountListConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1856384317, i2, -1, "TransferAccountList (AdvisoryFirstDepositTransferComposable.kt:489)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AccountRowData accountRowData : immutableList) {
                if (accountRowData.isExternal()) {
                    arrayList.add(accountRowData);
                } else {
                    arrayList2.add(accountRowData);
                }
            }
            Tuples2 tuples2 = new Tuples2(arrayList, arrayList2);
            final List list = (List) tuples2.component1();
            final List list2 = (List) tuples2.component2();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 112) == 32) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(transferAccountListConfig))) | composerStartRestartGroup.changedInstance(list2) | ((i2 & 7168) == 2048) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final String str3 = str2;
                Function1 function13 = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryFirstDepositTransferComposableKt.TransferAccountList$lambda$39$lambda$38(transferAccountListConfig, list2, list, str3, function12, navigator, context, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function13);
                objRememberedValue = function13;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferComposableKt.TransferAccountList$lambda$40(immutableList, str, transferAccountListConfig, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferAccountList$lambda$39$lambda$38(final TransferAccountListConfig transferAccountListConfig, final List list, final List list2, final String str, final Function1 function1, Navigator navigator, android.content.Context context, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1918260526, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                int i2;
                int iM7924getStarte0LSkKk;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1918260526, i, -1, "TransferAccountList.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:501)");
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                TransferAccountListConfig transferAccountListConfig2 = transferAccountListConfig;
                if (transferAccountListConfig2 instanceof TransferAccountListConfig.InternalOnly) {
                    i2 = C8825R.string.advisory_first_deposit_transfer_internal_account_list_title;
                } else {
                    if (!Intrinsics.areEqual(transferAccountListConfig2, TransferAccountListConfig.Default.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C8825R.string.advisory_first_deposit_transfer_account_list_title;
                }
                String strStringResource = StringResources_androidKt.stringResource(i2, composer, 0);
                TransferAccountListConfig transferAccountListConfig3 = transferAccountListConfig;
                if (transferAccountListConfig3 instanceof TransferAccountListConfig.InternalOnly) {
                    iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                } else {
                    if (!Intrinsics.areEqual(transferAccountListConfig3, TransferAccountListConfig.Default.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                }
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        boolean z = transferAccountListConfig instanceof TransferAccountListConfig.Default;
        if (!z || list.isEmpty()) {
            lazyListScope = LazyColumn;
        } else {
            lazyListScope = LazyColumn;
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.INSTANCE.getLambda$1849537133$feature_advisory_onboarding_externalDebug(), 3, null);
        }
        final T t = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AccountRowData accountRowData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AccountRowData) obj);
            }
        };
        lazyListScope.items(list.size(), null, new Function1<Integer, Object>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return t.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$4
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final AccountRowData accountRowData = (AccountRowData) list.get(i);
                composer.startReplaceGroup(-305425465);
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                StringResource primaryText = accountRowData.getPrimaryText();
                int i4 = StringResource.$stable;
                String string2 = StringResource2.getString(primaryText, composer, i4);
                StringResource secondaryText = accountRowData.getSecondaryText();
                composer.startReplaceGroup(-1672414938);
                String string3 = secondaryText == null ? null : StringResource2.getString(secondaryText, composer, i4);
                composer.endReplaceGroup();
                boolean zAreEqual = Intrinsics.areEqual(accountRowData.getAccountId(), str);
                String str2 = string3;
                boolean enabled = accountRowData.getEnabled();
                BentoSelectionRowState.IconPosition.Leading leading = new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(-1292491081, true, new Function2<Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        long jM21427getFg30d7_KjU;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1292491081, i5, -1, "TransferAccountList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryFirstDepositTransferComposable.kt:543)");
                        }
                        ServerToBentoAssetMapper2 icon = accountRowData.getIcon();
                        if (icon != null) {
                            AccountRowData accountRowData2 = accountRowData;
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(icon);
                            if (accountRowData2.getEnabled()) {
                                composer2.startReplaceGroup(-833284409);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(-833283576);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21427getFg30d7_KjU, null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54));
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(accountRowData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(accountRowData.getAccountId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type2, string2, zAreEqual, str2, enabled, leading, false, false, false, (Function0) objRememberedValue, composer, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, 0, 897);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$AdvisoryFirstDepositTransferComposableKt.INSTANCE.m4309getLambda$1888890332$feature_advisory_onboarding_externalDebug(), 3, null);
        }
        final C50840x97dcb54 c50840x97dcb54 = new Function1() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AccountRowData accountRowData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AccountRowData) obj);
            }
        };
        lazyListScope.items(list2.size(), null, new Function1<Integer, Object>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c50840x97dcb54.invoke(list2.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$lambda$39$lambda$38$$inlined$items$default$8
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final AccountRowData accountRowData = (AccountRowData) list2.get(i);
                composer.startReplaceGroup(1762736413);
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String string2 = StringResource2.getString(accountRowData.getPrimaryText(), composer, StringResource.$stable);
                boolean zAreEqual = Intrinsics.areEqual(accountRowData.getAccountId(), str);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(accountRowData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: AdvisoryFirstDepositTransferComposableKt$TransferAccountList$2$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(accountRowData.getAccountId());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type2, string2, zAreEqual, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 48, 0, 1009);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-378868507, true, new C0043x6341e7ef(navigator, context)), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AccountSelectorDropdown(final StringResource selectedTransferAccountName, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(selectedTransferAccountName, "selectedTransferAccountName");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1336449268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(selectedTransferAccountName) : composerStartRestartGroup.changedInstance(selectedTransferAccountName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1336449268, i3, -1, "AccountSelectorDropdown (AdvisoryFirstDepositTransferComposable.kt:607)");
            }
            String string2 = StringResource2.getString(selectedTransferAccountName, composerStartRestartGroup, StringResource.$stable | (i3 & 14));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoChip.BentoDropdownChip(onClick, com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, (i3 >> 6) & 14, 0), false, null, string2, composerStartRestartGroup, (i3 >> 3) & 14, 12);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: AdvisoryFirstDepositTransferComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryFirstDepositTransferComposableKt.AccountSelectorDropdown$lambda$41(selectedTransferAccountName, onClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

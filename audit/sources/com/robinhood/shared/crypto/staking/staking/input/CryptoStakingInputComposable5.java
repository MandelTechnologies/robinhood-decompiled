package com.robinhood.shared.crypto.staking.staking.input;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.CryptoYieldsOrderFlowAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputComposable;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputEvent;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable5;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputEvent;
import com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoStakingInputComposable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aa\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000626\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0091\u0001\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\u0004\u0012\u00020\u00040\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0003¢\u0006\u0002\u0010*\u001as\u0010+\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\b2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040 2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0003¢\u0006\u0002\u0010.\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002²\u0006\u0012\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101X\u008a\u008e\u0002"}, m3636d2 = {"TestTagLoadingReviewContentTag", "", CryptoStakingInputComposable5.TestTagReviewButtonTag, "CryptoStakingInputComposable", "", "args", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;", "onOrderRequested", "Lkotlin/Function2;", "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "Lkotlin/ParameterName;", "name", Card.Icon.ORDER, "Ljava/util/UUID;", "idempotencyId", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo;", "(Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadingReviewContent", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingReviewContent", "LoadedContent", "viewState", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;", "entryPointIdentifier", "onNumpadKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onReviewButtonClick", "Lkotlin/Function0;", "onSuggestedAmountClick", "Ljava/math/BigDecimal;", "Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;", "onShowAmountAvailable", "Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "onCryptoModeClick", "(Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AmountDetails", "onReviewButtonClicked", "onClick", "(Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-crypto-staking_externalDebug", "amountInputEvent", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingInputComposable5 {
    public static final String TestTagLoadingReviewContentTag = "TestTagLoadingReviewContentTag";
    public static final String TestTagReviewButtonTag = "TestTagReviewButtonTag";

    /* compiled from: CryptoStakingInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
            try {
                iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountDetails$lambda$21(CryptoStakingInputViewState cryptoStakingInputViewState, String str, Function0 function0, Function2 function2, Event event, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        AmountDetails(cryptoStakingInputViewState, str, function0, function2, event, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoStakingInputComposable$lambda$4(CryptoStakingInputDuxo.InitArgs initArgs, Function2 function2, Modifier modifier, CryptoStakingInputDuxo cryptoStakingInputDuxo, int i, int i2, Composer composer, int i3) {
        CryptoStakingInputComposable(initArgs, function2, modifier, cryptoStakingInputDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$7(CryptoStakingInputViewState cryptoStakingInputViewState, String str, Function1 function1, Function0 function0, Function2 function2, Function1 function12, Event event, Function0 function02, int i, Composer composer, int i2) {
        LoadedContent(cryptoStakingInputViewState, str, function1, function0, function2, function12, event, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingReviewContent$lambda$5(int i, Composer composer, int i2) {
        LoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingReviewContent$lambda$6(int i, Composer composer, int i2) {
        PreviewLoadingReviewContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final ComposeUiEvent<CryptoAmountInputEvent> AmountDetails$lambda$9(SnapshotState<ComposeUiEvent<CryptoAmountInputEvent>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoStakingInputViewState CryptoStakingInputComposable$lambda$0(SnapshotState4<CryptoStakingInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<CryptoStakingInputEvent> CryptoStakingInputComposable$lambda$1(SnapshotState4<Event<CryptoStakingInputEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoStakingInputComposable(final CryptoStakingInputDuxo.InitArgs args, final Function2<? super UiCryptoStakingOrderModel, ? super UUID, Unit> onOrderRequested, Modifier modifier, CryptoStakingInputDuxo cryptoStakingInputDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoStakingInputDuxo cryptoStakingInputDuxo2;
        int i4;
        Modifier modifier3;
        CryptoStakingInputDuxo cryptoStakingInputDuxo3;
        int i5;
        Event<CryptoStakingInputEvent> event;
        Object objRememberedValue;
        int i6;
        String str;
        Composer composer2;
        final CryptoStakingInputDuxo cryptoStakingInputDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onOrderRequested, "onOrderRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(959128045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderRequested) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoStakingInputDuxo2 = cryptoStakingInputDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(cryptoStakingInputDuxo2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    cryptoStakingInputDuxo2 = cryptoStakingInputDuxo;
                }
                i3 |= i8;
            } else {
                cryptoStakingInputDuxo2 = cryptoStakingInputDuxo;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoStakingInputDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$duxo$1.1
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
                        int i9 = i4 & (-7169);
                        cryptoStakingInputDuxo3 = (CryptoStakingInputDuxo) baseDuxo;
                        i5 = i9;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(959128045, i5, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable (CryptoStakingInputComposable.kt:89)");
                    }
                    Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) objConsume;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CryptoStakingInputEvent>> eventFlow = cryptoStakingInputDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingInputComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
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
                                    if ((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Event<CryptoStakingInputEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        ActivityErrorHandler activityErrorHandler = new ActivityErrorHandler(activity, true, 0, null, 12, null);
                        composerStartRestartGroup.updateRememberedValue(activityErrorHandler);
                        objRememberedValue = activityErrorHandler;
                    }
                    ActivityErrorHandler activityErrorHandler2 = (ActivityErrorHandler) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Screen.Name name = Screen.Name.CRYPTO_STAKING_AMOUNT_ENTRY;
                    String string2 = args.getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    i6 = WhenMappings.$EnumSwitchMapping$0[args.getOrderType().ordinal()];
                    if (i6 == 1) {
                        str = "staking";
                    } else if (i6 == 2) {
                        str = "unstaking";
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "unknown";
                    }
                    Screen screen = new Screen(name, str, string2, null, 8, null);
                    String entryPointIdentifier = args.getEntryPointIdentifier();
                    CryptoStakingInputDuxo cryptoStakingInputDuxo5 = cryptoStakingInputDuxo3;
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, entryPointIdentifier != null ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-258176808, true, new C378092(snapshotState4CollectAsStateWithLifecycle, cryptoStakingInputDuxo5, userInteractionEventDescriptor, navigator, context, modifier5, args, snapshotState4CollectAsStateWithLifecycle2, activityErrorHandler2, onOrderRequested), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoStakingInputDuxo4 = cryptoStakingInputDuxo5;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i5 = i4;
                cryptoStakingInputDuxo3 = cryptoStakingInputDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = cryptoStakingInputDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingInputComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoStakingInputEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ActivityErrorHandler activityErrorHandler22 = (ActivityErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Screen.Name name2 = Screen.Name.CRYPTO_STAKING_AMOUNT_ENTRY;
                String string22 = args.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                i6 = WhenMappings.$EnumSwitchMapping$0[args.getOrderType().ordinal()];
                if (i6 == 1) {
                }
                Screen screen2 = new Screen(name2, str, string22, null, 8, null);
                String entryPointIdentifier2 = args.getEntryPointIdentifier();
                CryptoStakingInputDuxo cryptoStakingInputDuxo52 = cryptoStakingInputDuxo3;
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, entryPointIdentifier2 != null ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-258176808, true, new C378092(snapshotState4CollectAsStateWithLifecycle3, cryptoStakingInputDuxo52, userInteractionEventDescriptor2, navigator2, context2, modifier52, args, snapshotState4CollectAsStateWithLifecycle22, activityErrorHandler22, onOrderRequested), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoStakingInputDuxo4 = cryptoStakingInputDuxo52;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoStakingInputDuxo4 = cryptoStakingInputDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$4(args, onOrderRequested, modifier4, cryptoStakingInputDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i5 = i4;
                    cryptoStakingInputDuxo3 = cryptoStakingInputDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume22 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                Activity activity22 = (Activity) objConsume22;
                UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(cryptoStakingInputDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow22 = cryptoStakingInputDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoStakingInputComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if ((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<CryptoStakingInputEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof CryptoStakingInputEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ActivityErrorHandler activityErrorHandler222 = (ActivityErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Screen.Name name22 = Screen.Name.CRYPTO_STAKING_AMOUNT_ENTRY;
                String string222 = args.getCurrencyPairId().toString();
                Intrinsics.checkNotNullExpressionValue(string222, "toString(...)");
                i6 = WhenMappings.$EnumSwitchMapping$0[args.getOrderType().ordinal()];
                if (i6 == 1) {
                }
                Screen screen22 = new Screen(name22, str, string222, null, 8, null);
                String entryPointIdentifier22 = args.getEntryPointIdentifier();
                CryptoStakingInputDuxo cryptoStakingInputDuxo522 = cryptoStakingInputDuxo3;
                composer2 = composerStartRestartGroup;
                Modifier modifier522 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen22, null, entryPointIdentifier22 != null ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-258176808, true, new C378092(snapshotState4CollectAsStateWithLifecycle32, cryptoStakingInputDuxo522, userInteractionEventDescriptor22, navigator22, context22, modifier522, args, snapshotState4CollectAsStateWithLifecycle222, activityErrorHandler222, onOrderRequested), composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoStakingInputDuxo4 = cryptoStakingInputDuxo522;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoStakingInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2 */
    static final class C378092 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ActivityErrorHandler<Object> $activityErrorHandler;
        final /* synthetic */ CryptoStakingInputDuxo.InitArgs $args;
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoStakingInputDuxo $duxo;
        final /* synthetic */ SnapshotState4<Event<CryptoStakingInputEvent>> $event$delegate;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function2<UiCryptoStakingOrderModel, UUID, Unit> $onOrderRequested;
        final /* synthetic */ SnapshotState4<CryptoStakingInputViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C378092(SnapshotState4<CryptoStakingInputViewState> snapshotState4, CryptoStakingInputDuxo cryptoStakingInputDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, Navigator navigator, Context context, Modifier modifier, CryptoStakingInputDuxo.InitArgs initArgs, SnapshotState4<Event<CryptoStakingInputEvent>> snapshotState42, ActivityErrorHandler<Object> activityErrorHandler, Function2<? super UiCryptoStakingOrderModel, ? super UUID, Unit> function2) {
            this.$viewState$delegate = snapshotState4;
            this.$duxo = cryptoStakingInputDuxo;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$navigator = navigator;
            this.$context = context;
            this.$modifier = modifier;
            this.$args = initArgs;
            this.$event$delegate = snapshotState42;
            this.$activityErrorHandler = activityErrorHandler;
            this.$onOrderRequested = function2;
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
                ComposerKt.traceEventStart(-258176808, i, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous> (CryptoStakingInputComposable.kt:116)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$eventDescriptor);
            final CryptoStakingInputDuxo cryptoStakingInputDuxo = this.$duxo;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final SnapshotState4<CryptoStakingInputViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingInputComposable5.C378092.invoke$lambda$1$lambda$0(cryptoStakingInputDuxo, userInteractionEventDescriptor, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final SnapshotState4<CryptoStakingInputViewState> snapshotState42 = this.$viewState$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingInputComposable5.C378092.invoke$lambda$3$lambda$2(navigator, context, snapshotState42);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            final Modifier modifier = this.$modifier;
            final SnapshotState4<CryptoStakingInputViewState> snapshotState43 = this.$viewState$delegate;
            final CryptoStakingInputDuxo.InitArgs initArgs = this.$args;
            final CryptoStakingInputDuxo cryptoStakingInputDuxo2 = this.$duxo;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            final SnapshotState4<Event<CryptoStakingInputEvent>> snapshotState44 = this.$event$delegate;
            final ActivityErrorHandler<Object> activityErrorHandler = this.$activityErrorHandler;
            final Function2<UiCryptoStakingOrderModel, UUID, Unit> function2 = this.$onOrderRequested;
            CryptoYieldsOrderFlowActionHandler.CryptoYieldsOrderFlowActionHandler(function0, (Function0) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1516107786, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.CryptoStakingInputComposable.2.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    EventConsumer eventConsumer;
                    EventConsumer eventConsumer2;
                    EventConsumer eventConsumer3;
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1516107786, i2, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:138)");
                    }
                    final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier, null, 1, null);
                    final SnapshotState4<CryptoStakingInputViewState> snapshotState45 = snapshotState43;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1442860486, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.CryptoStakingInputComposable.2.3.1
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
                                ComposerKt.traceEventStart(1442860486, i3, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:144)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                            final SnapshotState4<CryptoStakingInputViewState> snapshotState46 = snapshotState45;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-216406919, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.CryptoStakingInputComposable.2.3.1.1
                                public final void invoke(Composer composer4, int i4) {
                                    BentoTheme bentoTheme;
                                    int i5;
                                    long jM21426getFg20d7_KjU;
                                    if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-216406919, i4, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:148)");
                                    }
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                    SnapshotState4<CryptoStakingInputViewState> snapshotState47 = snapshotState46;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer4, 54);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    String string2 = StringResource2.getString(CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getTitle(), composer4, StringResource.$stable);
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i6 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i6).getTextM(), composer4, 0, 0, 8190);
                                    composer4.startReplaceGroup(1025036725);
                                    if (CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getShouldShowApyText()) {
                                        Modifier modifierAlign = column6.align(companion2, companion.getCenterHorizontally());
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer4, 48);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierAlign);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        if (CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getRewardsEnabled()) {
                                            composer4.startReplaceGroup(1278014562);
                                            bentoTheme = bentoTheme2;
                                            i5 = i6;
                                            jM21426getFg20d7_KjU = bentoTheme.getColors(composer4, i5).m21456getPositive0d7_KjU();
                                            composer4.endReplaceGroup();
                                        } else {
                                            bentoTheme = bentoTheme2;
                                            i5 = i6;
                                            composer4.startReplaceGroup(1278133447);
                                            jM21426getFg20d7_KjU = bentoTheme.getColors(composer4, i5).m21426getFg20d7_KjU();
                                            composer4.endReplaceGroup();
                                        }
                                        int i7 = i5;
                                        BentoTheme bentoTheme3 = bentoTheme;
                                        BentoText2.m20747BentoText38GnDrw(CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getEstimatedApyText(), null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i5).getTextS(), composer4, 0, 0, 8186);
                                        composer4.startReplaceGroup(-97301913);
                                        if (CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getRewardsEnabled()) {
                                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ROBINHOOD_12), CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState47).getEstimatedApyText(), bentoTheme3.getColors(composer4, i7).m21456getPositive0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme3.getSpacing(composer4, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, true, composer4, BentoIcon4.Size12.$stable | 196608, 16);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), modifierFillMaxWidth$default, CryptoStakingInputComposable.INSTANCE.getLambda$1018950565$feature_crypto_staking_externalDebug(), null, null, false, false, appBarType, null, 0L, null, composer3, 12583350, 0, 1912);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final SnapshotState4<CryptoStakingInputViewState> snapshotState46 = snapshotState43;
                    final CryptoStakingInputDuxo.InitArgs initArgs2 = initArgs;
                    final CryptoStakingInputDuxo cryptoStakingInputDuxo3 = cryptoStakingInputDuxo2;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                    final SnapshotState4<Event<CryptoStakingInputEvent>> snapshotState47 = snapshotState44;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(158601691, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.CryptoStakingInputComposable.2.3.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i3 & 6) == 0) {
                                i3 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i3 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(158601691, i3, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous>.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:196)");
                            }
                            Crossfade.Crossfade(Boolean.valueOf(CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState46).isLoading()), PaddingKt.padding(Modifier.INSTANCE, paddingValues), (FiniteAnimationSpec<Float>) null, "CryptoStakingInputComposable", ComposableLambda3.rememberComposableLambda(547647386, true, new AnonymousClass1(initArgs2, cryptoStakingInputDuxo3, snapshotState46, userInteractionEventDescriptor3, sduiActionHandlerCurrentActionHandler, snapshotState47), composer3, 54), composer3, 27648, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoStakingInputComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<Boolean, Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<CryptoYieldsOrderFlowAction> $actionHandler;
                            final /* synthetic */ CryptoStakingInputDuxo.InitArgs $args;
                            final /* synthetic */ CryptoStakingInputDuxo $duxo;
                            final /* synthetic */ SnapshotState4<Event<CryptoStakingInputEvent>> $event$delegate;
                            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                            final /* synthetic */ SnapshotState4<CryptoStakingInputViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(CryptoStakingInputDuxo.InitArgs initArgs, CryptoStakingInputDuxo cryptoStakingInputDuxo, SnapshotState4<CryptoStakingInputViewState> snapshotState4, UserInteractionEventDescriptor userInteractionEventDescriptor, SduiActionHandler<? super CryptoYieldsOrderFlowAction> sduiActionHandler, SnapshotState4<Event<CryptoStakingInputEvent>> snapshotState42) {
                                this.$args = initArgs;
                                this.$duxo = cryptoStakingInputDuxo;
                                this.$viewState$delegate = snapshotState4;
                                this.$eventDescriptor = userInteractionEventDescriptor;
                                this.$actionHandler = sduiActionHandler;
                                this.$event$delegate = snapshotState42;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
                                invoke(bool.booleanValue(), composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z, Composer composer, int i) {
                                if ((i & 6) == 0) {
                                    i |= composer.changed(z) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(547647386, i, -1, "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:201)");
                                }
                                if (z) {
                                    composer.startReplaceGroup(-1991836560);
                                    CryptoStakingInputComposable5.LoadingReviewContent(composer, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    if (z) {
                                        composer.startReplaceGroup(-1991835508);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-1991832031);
                                    CryptoStakingInputViewState cryptoStakingInputViewStateCryptoStakingInputComposable$lambda$0 = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(this.$viewState$delegate);
                                    String entryPointIdentifier = this.$args.getEntryPointIdentifier();
                                    CryptoStakingInputDuxo cryptoStakingInputDuxo = this.$duxo;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(cryptoStakingInputDuxo);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new CryptoStakingInputComposable6(cryptoStakingInputDuxo);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$eventDescriptor);
                                    final CryptoStakingInputDuxo cryptoStakingInputDuxo2 = this.$duxo;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                    final SnapshotState4<CryptoStakingInputViewState> snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoStakingInputComposable5.C378092.AnonymousClass3.AnonymousClass2.AnonymousClass1.invoke$lambda$2$lambda$1(cryptoStakingInputDuxo2, userInteractionEventDescriptor, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1746271574);
                                    boolean zChanged2 = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$eventDescriptor);
                                    final CryptoStakingInputDuxo cryptoStakingInputDuxo3 = this.$duxo;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                                    final SnapshotState4<CryptoStakingInputViewState> snapshotState42 = this.$viewState$delegate;
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return CryptoStakingInputComposable5.C378092.AnonymousClass3.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$3(cryptoStakingInputDuxo3, userInteractionEventDescriptor2, snapshotState42, (BigDecimal) obj, (SuggestedInputAmountState.Type) obj2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function2 = (Function2) objRememberedValue3;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$actionHandler);
                                    final SduiActionHandler<CryptoYieldsOrderFlowAction> sduiActionHandler = this.$actionHandler;
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$2$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoStakingInputComposable5.C378092.AnonymousClass3.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$5(sduiActionHandler, (AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue4;
                                    composer.endReplaceGroup();
                                    Event eventCryptoStakingInputComposable$lambda$1 = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$1(this.$event$delegate);
                                    CryptoStakingInputDuxo cryptoStakingInputDuxo4 = this.$duxo;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer.changedInstance(cryptoStakingInputDuxo4);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new CryptoStakingInputComposable7(cryptoStakingInputDuxo4);
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoStakingInputComposable5.LoadedContent(cryptoStakingInputViewStateCryptoStakingInputComposable$lambda$0, entryPointIdentifier, function1, function0, function2, function12, eventCryptoStakingInputComposable$lambda$1, (Function0) ((KFunction) objRememberedValue5), composer, 0);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(CryptoStakingInputDuxo cryptoStakingInputDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4 snapshotState4) {
                                BigDecimal amount = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getAmount();
                                if (amount != null) {
                                    UiCurrencyPair uiCurrencyPair = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getUiCurrencyPair();
                                    if (uiCurrencyPair == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    cryptoStakingInputDuxo.onReviewButtonClick(amount, CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getAmountType(), uiCurrencyPair, CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getIdempotencyId(), CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getOrderType(), userInteractionEventDescriptor);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(CryptoStakingInputDuxo cryptoStakingInputDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4 snapshotState4, BigDecimal suggestedAmount, SuggestedInputAmountState.Type type2) {
                                Intrinsics.checkNotNullParameter(suggestedAmount, "suggestedAmount");
                                Intrinsics.checkNotNullParameter(type2, "type");
                                UiCurrencyPair uiCurrencyPair = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getUiCurrencyPair();
                                if (uiCurrencyPair == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                cryptoStakingInputDuxo.onSuggestedAmountClick(suggestedAmount, type2, uiCurrencyPair, CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getIdempotencyId(), CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getOrderType(), userInteractionEventDescriptor);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5(SduiActionHandler sduiActionHandler, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow infoSheetData) {
                                Intrinsics.checkNotNullParameter(infoSheetData, "infoSheetData");
                                sduiActionHandler.mo15941handle(new CryptoYieldsOrderFlowAction.InfoAlert(new AlertAction(infoSheetData.getContent(), GenericAlertMobilePresentationStyle.BOTTOM_SHEET)));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 508);
                    final Event eventCryptoStakingInputComposable$lambda$1 = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$1(snapshotState44);
                    if (eventCryptoStakingInputComposable$lambda$1 != null && (eventCryptoStakingInputComposable$lambda$1.getData() instanceof CryptoStakingInputEvent.InputError) && (eventConsumer3 = (EventConsumer) eventCryptoStakingInputComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(eventCryptoStakingInputComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$invoke$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m24943invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m24943invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                sduiActionHandlerCurrentActionHandler.mo15941handle(new CryptoYieldsOrderFlowAction.InfoAlert(((CryptoStakingInputEvent.InputError) eventCryptoStakingInputComposable$lambda$1.getData()).getInputError().getAlertAction()));
                            }
                        });
                    }
                    final Event eventCryptoStakingInputComposable$lambda$12 = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$1(snapshotState44);
                    if (eventCryptoStakingInputComposable$lambda$12 != null) {
                        final ActivityErrorHandler<Object> activityErrorHandler2 = activityErrorHandler;
                        if ((eventCryptoStakingInputComposable$lambda$12.getData() instanceof CryptoStakingInputEvent.Error) && (eventConsumer2 = (EventConsumer) eventCryptoStakingInputComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumer2.consume(eventCryptoStakingInputComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$invoke$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24944invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24944invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    activityErrorHandler2.handleError(((CryptoStakingInputEvent.Error) eventCryptoStakingInputComposable$lambda$12.getData()).getThrowable(), true);
                                }
                            });
                        }
                    }
                    final Event eventCryptoStakingInputComposable$lambda$13 = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$1(snapshotState44);
                    if (eventCryptoStakingInputComposable$lambda$13 != null) {
                        final Function2<UiCryptoStakingOrderModel, UUID, Unit> function22 = function2;
                        if ((eventCryptoStakingInputComposable$lambda$13.getData() instanceof CryptoStakingInputEvent.OrderRequested) && (eventConsumer = (EventConsumer) eventCryptoStakingInputComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                            eventConsumer.consume(eventCryptoStakingInputComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$CryptoStakingInputComposable$2$3$invoke$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m24945invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m24945invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoStakingInputEvent.OrderRequested orderRequested = (CryptoStakingInputEvent.OrderRequested) eventCryptoStakingInputComposable$lambda$13.getData();
                                    function22.invoke(orderRequested.getOrder(), orderRequested.getIdempotencyId());
                                }
                            });
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoStakingInputDuxo cryptoStakingInputDuxo, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4 snapshotState4) {
            UiCurrencyPair uiCurrencyPair = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getUiCurrencyPair();
            if (uiCurrencyPair == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cryptoStakingInputDuxo.unstakeAll(uiCurrencyPair, CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getOrderType(), CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getIdempotencyId(), userInteractionEventDescriptor);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context, SnapshotState4 snapshotState4) {
            UiCurrencyPair uiCurrencyPair = CryptoStakingInputComposable5.CryptoStakingInputComposable$lambda$0(snapshotState4).getUiCurrencyPair();
            if (uiCurrencyPair == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Navigator.DefaultImpls.startActivity$default(navigator, context, new CryptoOrderIntentKey(uiCurrencyPair.getId(), TradeAction.BUY, null, null, CryptoOrderIntentKey.ENTRYPOINT_STAKING, 12, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1917179383);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1917179383, i, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadingReviewContent (CryptoStakingInputComposable.kt:272)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, "TestTagLoadingReviewContentTag"), null, CryptoStakingInputComposable.INSTANCE.getLambda$418727833$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingInputComposable5.LoadingReviewContent$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingReviewContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(186242749);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(186242749, i, -1, "com.robinhood.shared.crypto.staking.staking.input.PreviewLoadingReviewContent (CryptoStakingInputComposable.kt:313)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoStakingInputComposable.INSTANCE.getLambda$1821240325$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingInputComposable5.PreviewLoadingReviewContent$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedContent(final CryptoStakingInputViewState cryptoStakingInputViewState, final String str, final Function1<? super KeyEvent, Unit> function1, final Function0<Unit> function0, final Function2<? super BigDecimal, ? super SuggestedInputAmountState.Type, Unit> function2, final Function1<? super AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow, Unit> function12, final Event<CryptoStakingInputEvent> event, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        String str2;
        Function0<Unit> function03;
        Function2<? super BigDecimal, ? super SuggestedInputAmountState.Type, Unit> function22;
        Function1<? super AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow, Unit> function13;
        Event<CryptoStakingInputEvent> event2;
        Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(1798417321);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cryptoStakingInputViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function03 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        if ((i & 24576) == 0) {
            function22 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        } else {
            function22 = function2;
        }
        if ((196608 & i) == 0) {
            function13 = function12;
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        } else {
            function13 = function12;
        }
        if ((1572864 & i) == 0) {
            event2 = event;
            i2 |= composerStartRestartGroup.changed(event2) ? 1048576 : 524288;
        } else {
            event2 = event;
        }
        if ((12582912 & i) == 0) {
            function04 = function02;
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
        } else {
            function04 = function02;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1798417321, i2, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadedContent (CryptoStakingInputComposable.kt:329)");
            }
            BentoNumpadScreenLayout.BentoNumpadScreenLayout(null, ComposableLambda3.rememberComposableLambda(-1325564724, true, new C378121(cryptoStakingInputViewState, str2, function03, function22, event2, function13, function04), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(310198204, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.LoadedContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer2, Integer num) {
                    invoke(bentoNumpad4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final BentoNumpad4 BentoNumpadScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer2.changed(BentoNumpadScreenLayout) : composer2.changedInstance(BentoNumpadScreenLayout) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(310198204, i3, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadedContent.<anonymous> (CryptoStakingInputComposable.kt:345)");
                    }
                    final Function1<KeyEvent, Unit> function14 = function1;
                    final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1984239061, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$LoadedContent$2$numpad$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1984239061, i4, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadedContent.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:346)");
                            }
                            BentoNumpadScreenLayout.BentoNumpadOnly(null, function14, false, false, true, null, composer3, (BentoNumpad4.$stable << 18) | 24576, 45);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    BentoAccentNumpadOverlay.BentoAccentNumpadOverlay(ComposableLambda3.rememberComposableLambda(-1283296467, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt.LoadedContent.2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer3, Integer num) {
                            invoke(bentoNumpad4, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpad4 BentoAccentNumpadOverlay, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(BentoAccentNumpadOverlay, "$this$BentoAccentNumpadOverlay");
                            if ((i4 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1283296467, i4, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadedContent.<anonymous>.<anonymous> (CryptoStakingInputComposable.kt:352)");
                            }
                            composableLambdaRememberComposableLambda.invoke(composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 432, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingInputComposable5.LoadedContent$lambda$7(cryptoStakingInputViewState, str, function1, function0, function2, function12, event, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoStakingInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$LoadedContent$1 */
    static final class C378121 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $entryPointIdentifier;
        final /* synthetic */ Event<CryptoStakingInputEvent> $event;
        final /* synthetic */ Function0<Unit> $onCryptoModeClick;
        final /* synthetic */ Function0<Unit> $onReviewButtonClick;
        final /* synthetic */ Function1<AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow, Unit> $onShowAmountAvailable;
        final /* synthetic */ Function2<BigDecimal, SuggestedInputAmountState.Type, Unit> $onSuggestedAmountClick;
        final /* synthetic */ CryptoStakingInputViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C378121(CryptoStakingInputViewState cryptoStakingInputViewState, String str, Function0<Unit> function0, Function2<? super BigDecimal, ? super SuggestedInputAmountState.Type, Unit> function2, Event<CryptoStakingInputEvent> event, Function1<? super AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow, Unit> function1, Function0<Unit> function02) {
            this.$viewState = cryptoStakingInputViewState;
            this.$entryPointIdentifier = str;
            this.$onReviewButtonClick = function0;
            this.$onSuggestedAmountClick = function2;
            this.$event = event;
            this.$onShowAmountAvailable = function1;
            this.$onCryptoModeClick = function02;
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
                ComposerKt.traceEventStart(-1325564724, i, -1, "com.robinhood.shared.crypto.staking.staking.input.LoadedContent.<anonymous> (CryptoStakingInputComposable.kt:332)");
            }
            CryptoStakingInputViewState cryptoStakingInputViewState = this.$viewState;
            String str = this.$entryPointIdentifier;
            Function0<Unit> function0 = this.$onReviewButtonClick;
            Function2<BigDecimal, SuggestedInputAmountState.Type, Unit> function2 = this.$onSuggestedAmountClick;
            Event<CryptoStakingInputEvent> event = this.$event;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$onShowAmountAvailable);
            final CryptoStakingInputViewState cryptoStakingInputViewState2 = this.$viewState;
            final Function1<AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow, Unit> function1 = this.$onShowAmountAvailable;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$LoadedContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingInputComposable5.C378121.invoke$lambda$2$lambda$1(cryptoStakingInputViewState2, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoStakingInputComposable5.AmountDetails(cryptoStakingInputViewState, str, function0, function2, event, (Function0) objRememberedValue, this.$onCryptoModeClick, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(CryptoStakingInputViewState cryptoStakingInputViewState, Function1 function1) {
            AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingAmountInfoSheet = cryptoStakingInputViewState.getStakingAmountInfoSheet();
            if (stakingAmountInfoSheet != null) {
                function1.invoke(stakingAmountInfoSheet);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AmountDetails(final CryptoStakingInputViewState cryptoStakingInputViewState, final String str, final Function0<Unit> function0, final Function2<? super BigDecimal, ? super SuggestedInputAmountState.Type, Unit> function2, final Event<CryptoStakingInputEvent> event, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        SnapshotState snapshotState;
        boolean z;
        Composer composer2;
        EventConsumer<CryptoStakingInputEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1996340027);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(cryptoStakingInputViewState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(event) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1996340027, i2, -1, "com.robinhood.shared.crypto.staking.staking.input.AmountDetails (CryptoStakingInputComposable.kt:367)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                if ((event.getData() instanceof CryptoStakingInputEvent.AmountInputEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$AmountDetails$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m24942invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24942invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            snapshotState2.setValue(new ComposeUiEvent(((CryptoStakingInputEvent.AmountInputEvent) event.getData()).getCryptoAmountInputEvent()));
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String typedAmountText = cryptoStakingInputViewState.getTypedAmountText();
            StringResource estimatedAmountText = cryptoStakingInputViewState.getEstimatedAmountText();
            composerStartRestartGroup.startReplaceGroup(1604868538);
            String string2 = estimatedAmountText == null ? null : StringResource2.getString(estimatedAmountText, composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.endReplaceGroup();
            if (string2 == null) {
                string2 = "";
            }
            String currencySymbol = cryptoStakingInputViewState.getCurrencySymbol();
            if (cryptoStakingInputViewState.getCryptoInputMode() == CryptoInputMode.ASSET_CURRENCY) {
                snapshotState = snapshotState2;
                z = true;
            } else {
                snapshotState = snapshotState2;
                z = false;
            }
            int i4 = i2;
            CryptoAmountInputComposable.CryptoAmountInputView(typedAmountText, string2, currencySymbol, z, AmountDetails$lambda$9(snapshotState), function03, null, false, composerStartRestartGroup, (ComposeUiEvent.$stable << 12) | ((i2 >> 3) & 458752), 192);
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            StringResource availableText = cryptoStakingInputViewState.getAvailableText();
            int i5 = StringResource.$stable;
            String string3 = StringResource2.getString(availableText, composerStartRestartGroup, i5);
            boolean z2 = (StringsKt.isBlank(string3) || cryptoStakingInputViewState.getStakingAmountInfoSheet() == null) ? false : true;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAlign = column6.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), companion3.getCenterHorizontally());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i4 & 458752) == 131072;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoStakingInputComposable5.AmountDetails$lambda$20$lambda$14$lambda$13(function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierAlign, interactionSource3, null, z2, null, null, (Function0) objRememberedValue3, 24, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
            BentoText2.m20747BentoText38GnDrw(string3, row6.weight(companion2, 1.0f, false), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1994879692);
            if (z2) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), StringResource2.getString(cryptoStakingInputViewState.getAvailableAmountSheetIconContentDescription(), composer2, i5), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM()), null, true, composer2, BentoIcon4.Size16.$stable | 196608, 16);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), composer2, 0);
            final SuggestedInputAmountState suggestedInputAmountState = cryptoStakingInputViewState.getSuggestedInputAmountState();
            composer2.startReplaceGroup(1604936065);
            if (suggestedInputAmountState != null) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), companion3.getTop(), composer2, 0);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                composer2.startReplaceGroup(-441863411);
                int i6 = 0;
                for (StakingConfig.SuggestedInputAmount suggestedInputAmount : suggestedInputAmountState.getPills()) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final StakingConfig.SuggestedInputAmount suggestedInputAmount2 = suggestedInputAmount;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, str == null ? "" : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoStakingInputViewState.getEventContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -536870913, -1, 16383, null), new Component(Component.ComponentType.BUTTON, SuggestedInputAmountState2.getLoggingIdentifier(suggestedInputAmount2, i7), null, 4, null), null, 39, null)), true, false, false, true, false, null, 108, null);
                    String title = suggestedInputAmount2.getTitle();
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    boolean zIsSuggestionPillTappable = cryptoStakingInputViewState.isSuggestionPillTappable();
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer2.changedInstance(suggestedInputAmount2) | ((i4 & 7168) == 2048) | composer2.changedInstance(suggestedInputAmountState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoStakingInputComposable5.AmountDetails$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(function2, suggestedInputAmount2, suggestedInputAmountState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, title, modifierAutoLogEvents$default, null, type2, zIsSuggestionPillTappable, false, null, null, null, null, false, null, composer3, 24576, 0, 8136);
                    i6 = i7;
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1604999727);
            if (cryptoStakingInputViewState.isReviewButtonVisible()) {
                Composer composer4 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C37760R.string.staking_input_review_order, composer2, 0), TestTag3.testTag(ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, str == null ? "" : str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoStakingInputViewState.getEventContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -536870913, -1, 16383, null), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 39, null)), true, false, false, true, false, null, 108, null), TestTagReviewButtonTag), null, null, cryptoStakingInputViewState.isReviewButtonEnabled(), cryptoStakingInputViewState.isRequestingOrder(), null, null, null, null, false, null, composer4, (i4 >> 6) & 14, 0, 8088);
                composer2 = composer4;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoStakingInputComposable5.AmountDetails$lambda$21(cryptoStakingInputViewState, str, function0, function2, event, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountDetails$lambda$20$lambda$14$lambda$13(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AmountDetails$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(Function2 function2, StakingConfig.SuggestedInputAmount suggestedInputAmount, SuggestedInputAmountState suggestedInputAmountState) {
        function2.invoke(suggestedInputAmount.getValue(), suggestedInputAmountState.getType());
        return Unit.INSTANCE;
    }
}

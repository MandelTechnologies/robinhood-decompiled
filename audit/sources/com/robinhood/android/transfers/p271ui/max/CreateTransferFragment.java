package com.robinhood.android.transfers.p271ui.max;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.TransferActionDto;
import bff_money_movement.service.p019v1.TransferActionTypeDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.jakewharton.rxbinding3.view.RxView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.crypto.lib.C12914R;
import com.robinhood.android.crypto.lib.CancelPendingCryptoOrderViewState2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.incentives.wonka.TransferInteractionHandler;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.android.retirement.contracts.RetirementEnokiInfo;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys3;
import com.robinhood.android.retirement.contracts.RetirementMatchRateSelection;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireContract;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.LimitsHubDetails;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.contracts.TransfersDeepLinkMetadata;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.databinding.FragmentCreateTransferV2Binding;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.transfers.lib.validation.IraDistributionCheck;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.composecomponents.OutgoingWireMemoEntryData;
import com.robinhood.android.transfers.p271ui.instant.InstantRestrictionBottomSheet;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.createtransfer.CreateTransferAccountRowView;
import com.robinhood.android.transfers.p271ui.max.createtransfer.GoldDepositBoostPillComposable;
import com.robinhood.android.transfers.p271ui.max.createtransfer.TransferConstraints;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireActivity;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment;
import com.robinhood.android.transfers.p271ui.max.rtp.AchTransferOptionsSelectorBundle;
import com.robinhood.android.transfers.p271ui.max.rtp.AchTransferOptionsSelectorComposable;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertArgs;
import com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks;
import com.robinhood.android.transfers.util.IsEligibleForDepositSuggesstionPills;
import com.robinhood.android.transfers.util.PreCreateLoggingEvents;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DeepLinkContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u009d\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020[H\u0016J\u001a\u0010\\\u001a\u00020F2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\b\u0010a\u001a\u00020FH\u0016J\u0010\u0010b\u001a\u00020F2\u0006\u0010c\u001a\u00020dH\u0002J\b\u0010e\u001a\u00020FH\u0016J\u0010\u0010f\u001a\u00020F2\u0006\u0010g\u001a\u00020hH\u0016J\u001a\u0010i\u001a\u0002032\u0006\u0010Z\u001a\u00020[2\b\u0010j\u001a\u0004\u0018\u00010`H\u0016J\u001a\u0010k\u001a\u0002032\u0006\u0010Z\u001a\u00020[2\b\u0010j\u001a\u0004\u0018\u00010`H\u0016J\"\u0010l\u001a\u0002032\u0006\u0010Z\u001a\u00020[2\b\u0010j\u001a\u0004\u0018\u00010`2\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u00020F2\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010r\u001a\u000203H\u0016J\"\u0010s\u001a\u00020F2\u0006\u0010t\u001a\u00020[2\u0006\u0010u\u001a\u00020[2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020F2\u0006\u0010y\u001a\u00020zH\u0016J\u0010\u0010{\u001a\u0002032\u0006\u0010|\u001a\u00020}H\u0016J\u0010\u0010~\u001a\u00020F2\u0006\u0010|\u001a\u00020\u007fH\u0016J\u0013\u0010\u0080\u0001\u001a\u00020F2\b\u0010m\u001a\u0004\u0018\u00010nH\u0016J\u001d\u0010\u0081\u0001\u001a\u00020F2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0016J\t\u0010\u0085\u0001\u001a\u00020FH\u0016J\u001d\u0010\u0086\u0001\u001a\u00020F2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\u0013\u0010\u008b\u0001\u001a\u00020F2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0013\u0010\u008c\u0001\u001a\u00020F2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0013\u0010\u008d\u0001\u001a\u00020F2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\u0015\u0010\u0090\u0001\u001a\u00020F2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0002J\t\u0010\u0093\u0001\u001a\u00020FH\u0016J\u0012\u0010\u0094\u0001\u001a\u00020F2\u0007\u0010|\u001a\u00030\u0095\u0001H\u0016J\t\u0010\u0096\u0001\u001a\u00020FH\u0016J\t\u0010\u0097\u0001\u001a\u00020FH\u0016J\t\u0010\u0098\u0001\u001a\u00020FH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020F2\u0007\u0010\u009a\u0001\u001a\u000203H\u0016J\u001b\u0010\u009b\u0001\u001a\u00020F2\u0007\u0010\u009a\u0001\u001a\u0002032\u0007\u0010|\u001a\u00030\u009c\u0001H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R#\u0010$\u001a\n &*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R/\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010,8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00104\u001a\u0002032\u0006\u0010+\u001a\u0002038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010:\u001a\u0002032\u0006\u0010+\u001a\u0002038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010*\u001a\u0004\b;\u00106\"\u0004\b<\u00108R(\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020A &*\n\u0012\u0004\u0012\u00020A\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010B\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010C0C0?X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010D\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020F0EX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010G\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020H &*\n\u0012\u0004\u0012\u00020H\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010I\u001a\u00020J8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bK\u0010LR\u001b\u0010O\u001a\u00020P8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bQ\u0010RR\u001b\u0010T\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010N\u001a\u0004\bV\u0010W¨\u0006\u009e\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferFragment;", "Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosureCallbacks;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoCallbacks;", "Lcom/robinhood/android/transfers/ui/instant/InstantRestrictionBottomSheet$Callbacks;", "Lcom/robinhood/android/incentives/wonka/TransferInteractionHandler;", "Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "getWonkaServiceManager", "()Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "setWonkaServiceManager", "(Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;)V", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sessionId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getSessionId", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "<set-?>", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "mode", "getMode", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "setMode", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;)V", "mode$delegate", "", "hasShownFrequencyBottomSheetOnLaunch", "getHasShownFrequencyBottomSheetOnLaunch", "()Z", "setHasShownFrequencyBottomSheetOnLaunch", "(Z)V", "hasShownFrequencyBottomSheetOnLaunch$delegate", "hasShownGoldNativeFundingUpsell", "getHasShownGoldNativeFundingUpsell", "setHasShownGoldNativeFundingUpsell", "hasShownGoldNativeFundingUpsell$delegate", "iraContributionQuestionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "iraDistributionQuestionnaireLauncher", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "launchSuv", "Lkotlin/Function2;", "", "matchRateSelectionLauncher", "Lcom/robinhood/android/retirement/contracts/RetirementMatchRateSelection;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "quickSelectorChipsComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getQuickSelectorChipsComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "quickSelectorChipsComponent$delegate", "onDialogDismissed", "id", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "handleGoldApyBoostErrorEvent", "it", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$ApyGoldBoostErrorEvent;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "onLinkTextClicked", "url", "", "bindState", "state", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "onBackPressed", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onContentFailure", "throwable", "", "handle", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onInfoButtonClicked", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDisclosure$Action;", "onLinkClicked", "onEditIraDistributionTaxWithholding", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "onEditIraDistributionWithdrawalAmount", "onIraContributionTypeClicked", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "contributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "onIraTaxYearClicked", "onDistributionTypeClicked", "onIraTaxWithholdingClicked", "withholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "showMatchRateSelection", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "launchIncomingWires", "onActionTriggeredForInstantRestrictionBottomSheet", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "onDebitCardActionTriggered", "onTransferContinueRequested", "onTransferExitRequested", "onDismiss", "leavingEditMode", "onAlertSelected", "Lbff_money_movement/service/v1/TransferActionDto;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferFragment extends BaseCreateTransferFragment implements AutoLoggableFragment, CreateTransferAccountRowView.Callbacks, IraDistributionTaxWithholdingBottomSheetFragment.Callbacks, CreateTransferDisclosure2, IraTransferInfo3, InstantRestrictionBottomSheet.Callbacks, TransferInteractionHandler, ValidationAlertCallbacks {
    private static final int DEBIT_CARD_LINKING_REQUEST_CODE = 437;
    private static final String MENU_OF_OPTIONS_INITIAL_SCREEN_SOURCE = "menu_of_options_initial_screen";
    private static final String TAG_IRA_DISTRIBUTION_TAX_WITHHOLDING = "ira-distribution-tax-withholding";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;

    /* renamed from: hasShownFrequencyBottomSheetOnLaunch$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasShownFrequencyBottomSheetOnLaunch;

    /* renamed from: hasShownGoldNativeFundingUpsell$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasShownGoldNativeFundingUpsell;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> iraContributionQuestionnaireLauncher;
    private final ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> iraDistributionQuestionnaireLauncher;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public Markwon markwon;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementMatchRateSelection>> matchRateSelectionLauncher;

    /* renamed from: mode$delegate, reason: from kotlin metadata */
    private final Interfaces3 mode;

    /* renamed from: quickSelectorChipsComponent$delegate, reason: from kotlin metadata */
    private final Lazy quickSelectorChipsComponent;

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;
    public WonkaServiceManager wonkaServiceManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateTransferFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentCreateTransferV2Binding;", 0)), Reflection.property1(new PropertyReference1Impl(CreateTransferFragment.class, "sessionId", "getSessionId()Ljava/util/UUID;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferFragment.class, "mode", "getMode()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferFragment.class, "hasShownFrequencyBottomSheetOnLaunch", "getHasShownFrequencyBottomSheetOnLaunch()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferFragment.class, "hasShownGoldNativeFundingUpsell", "getHasShownGoldNativeFundingUpsell()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IraContributionType.values().length];
            try {
                iArr[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks
    public void onDismiss(boolean leavingEditMode) {
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public CreateTransferFragment() {
        super(C30065R.layout.fragment_create_transfer_v2);
        this.binding = ViewBinding5.viewBinding(this, CreateTransferFragment$binding$2.INSTANCE);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this, uuidRandomUUID);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.sessionId = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[1]);
        this.mode = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[2]);
        this.hasShownFrequencyBottomSheetOnLaunch = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[3]);
        this.hasShownGoldNativeFundingUpsell = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[4]);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new IraContributionQuestionnaireContract(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$iraContributionQuestionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraContributionQuestionnaireResult iraContributionQuestionnaireResult) {
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.UpdateTaxYear) {
                    this.this$0.getDuxo().setTaxYear((IraContributionQuestionnaireResult.UpdateTaxYear) iraContributionQuestionnaireResult);
                } else if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution) {
                    IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) iraContributionQuestionnaireResult;
                    this.this$0.getDuxo().setSinkAccount(iraContribution.getAccount(), iraContribution, null, null);
                } else if (iraContributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.iraContributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<IraDistributionQuestionnaireLaunchMode> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(IraDistributionQuestionnaireActivity.ResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$iraDistributionQuestionnaireLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraDistributionQuestionnaireResult iraDistributionQuestionnaireResult) {
                if (iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.IraDistribution) {
                    IraDistributionQuestionnaireResult.IraDistribution iraDistribution = (IraDistributionQuestionnaireResult.IraDistribution) iraDistributionQuestionnaireResult;
                    this.this$0.getDuxo().setSourceAccount(iraDistribution.getTransferAccount(), iraDistribution);
                } else if (iraDistributionQuestionnaireResult instanceof IraDistributionQuestionnaireResult.UpdateDistributionType) {
                    this.this$0.getDuxo().setWithdrawalReason(((IraDistributionQuestionnaireResult.UpdateDistributionType) iraDistributionQuestionnaireResult).getDistributionType());
                } else if (iraDistributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.iraDistributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult2;
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.launchSuv$lambda$2(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.launchSuv$lambda$3(this.f$0);
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementMatchRateSelection>> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new RetirementIntentKeys3(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$matchRateSelectionLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(RetirementIntentKeys3.Result result) {
                if (result instanceof RetirementIntentKeys3.Result.Success) {
                    this.this$0.getDuxo().onMatchRateSelected();
                } else if (!(result instanceof RetirementIntentKeys3.Result.Canceled) && result != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.matchRateSelectionLauncher = activityResultLauncherRegisterForActivityResult3;
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.eventScreen_delegate$lambda$5(this.f$0);
            }
        });
        this.screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.screenEventContext_delegate$lambda$8(this.f$0);
            }
        });
        this.quickSelectorChipsComponent = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.quickSelectorChipsComponent_delegate$lambda$9(this.f$0);
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final WonkaServiceManager getWonkaServiceManager() {
        WonkaServiceManager wonkaServiceManager = this.wonkaServiceManager;
        if (wonkaServiceManager != null) {
            return wonkaServiceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("wonkaServiceManager");
        return null;
    }

    public final void setWonkaServiceManager(WonkaServiceManager wonkaServiceManager) {
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "<set-?>");
        this.wonkaServiceManager = wonkaServiceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCreateTransferV2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCreateTransferV2Binding) value;
    }

    private final UUID getSessionId() {
        return (UUID) this.sessionId.getValue(this, $$delegatedProperties[1]);
    }

    private final CreateTransferViewState.Mode getMode() {
        return (CreateTransferViewState.Mode) this.mode.getValue(this, $$delegatedProperties[2]);
    }

    private final void setMode(CreateTransferViewState.Mode mode) {
        this.mode.setValue(this, $$delegatedProperties[2], mode);
    }

    private final boolean getHasShownFrequencyBottomSheetOnLaunch() {
        return ((Boolean) this.hasShownFrequencyBottomSheetOnLaunch.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    private final void setHasShownFrequencyBottomSheetOnLaunch(boolean z) {
        this.hasShownFrequencyBottomSheetOnLaunch.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    private final boolean getHasShownGoldNativeFundingUpsell() {
        return ((Boolean) this.hasShownGoldNativeFundingUpsell.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    private final void setHasShownGoldNativeFundingUpsell(boolean z) {
        this.hasShownGoldNativeFundingUpsell.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(CreateTransferFragment createTransferFragment) {
        CreateTransferDuxo.createTransfer$default(createTransferFragment.getDuxo(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$3(CreateTransferFragment createTransferFragment) {
        createTransferFragment.getDuxo().onVerificationResultNotApproved();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$5(CreateTransferFragment createTransferFragment) {
        String str;
        Screen.Name name = Screen.Name.CREATE_MAX_TRANSFER;
        if (((BaseCreateTransferFragment.Args) INSTANCE.getArgs((Fragment) createTransferFragment)).getTransferConfiguration().getUseQueuedDepositMode()) {
            str = CreateTransferDuxo.QUEUED_DEPOSIT_SCREEN_IDENTIFIER;
        } else {
            str = "";
        }
        return new Screen(name, null, str, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return (Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context screenEventContext_delegate$lambda$8(CreateTransferFragment createTransferFragment) {
        DeepLinkContext deepLinkContext;
        Companion companion = INSTANCE;
        MAXTransferContext.EntryPoint entryPoint = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) createTransferFragment)).getTransferConfiguration().getEntryPoint();
        String entryPointLoggingIdentifier = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) createTransferFragment)).getTransferConfiguration().getEntryPointLoggingIdentifier();
        if (entryPointLoggingIdentifier == null) {
            entryPointLoggingIdentifier = "";
        }
        MAXTransferContext mAXTransferContext = new MAXTransferContext(null, null, null, null, null, null, entryPoint, null, null, null, null, null, null, null, null, entryPointLoggingIdentifier, null, null, null, null, 1015743, null);
        TransferConfiguration transferConfiguration = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) createTransferFragment)).getTransferConfiguration();
        TransferConfiguration.OutgoingWire outgoingWire = transferConfiguration instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration : null;
        WiresContext loggingContext = outgoingWire != null ? outgoingWire.getLoggingContext() : null;
        TransfersDeepLinkMetadata deepLinkMetadata = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) createTransferFragment)).getDeepLinkMetadata();
        if (deepLinkMetadata != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - deepLinkMetadata.getStartTime();
            String string2 = deepLinkMetadata.getDeepLinkUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            deepLinkContext = new DeepLinkContext(jCurrentTimeMillis, string2, null, 4, null);
        } else {
            deepLinkContext = null;
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, deepLinkContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -65, -65537, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Component getQuickSelectorChipsComponent() {
        return (Component) this.quickSelectorChipsComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component quickSelectorChipsComponent_delegate$lambda$9(CreateTransferFragment createTransferFragment) {
        String str;
        Component.ComponentType componentType = Component.ComponentType.CHIP_GRID;
        if (IsEligibleForDepositSuggesstionPills.isEligibleForDepositSuggestionPills(((BaseCreateTransferFragment.Args) INSTANCE.getArgs((Fragment) createTransferFragment)).getTransferConfiguration().getEntryPoint())) {
            str = "suggested_deposit_amounts";
        } else {
            str = "predetermined_suggested_amounts";
        }
        return new Component(componentType, str, null, 4, null);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C30383R.id.dialog_id_gold_apy_min_deposit_sink_account) {
            getDuxo().resetSinkToRhsAccount();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        UiEvent<Unit> threeDSCancelationEvent = getThreeDSCallbacks().getThreeDSCancelationEvent();
        if (threeDSCancelationEvent != null) {
            threeDSCancelationEvent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferFragment.onViewCreated$lambda$10(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> threeDSCompletionEvent = getThreeDSCallbacks().getThreeDSCompletionEvent();
        if (threeDSCompletionEvent != null) {
            threeDSCompletionEvent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferFragment.onViewCreated$lambda$11(this.f$0, (Unit) obj);
                }
            });
        }
        TransferConfiguration transferConfiguration = ((BaseCreateTransferFragment.Args) INSTANCE.getArgs((Fragment) this)).getTransferConfiguration();
        getDuxo().setSessionId(getSessionId());
        if (getMode() == null) {
            setMode(TransferConfigurations.getInitialMode(transferConfiguration));
        }
        TickerInputView tickerInputView = getBinding().inputView;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(contextRequireContext, C16915R.font.capsule_sans_medium));
        CreateTransferAccountRowView createTransferAccountRowView = getBinding().sourceAccountRow;
        createTransferAccountRowView.setCallbacks(this);
        CreateTransferDuxo duxo = getDuxo();
        Observable<Boolean> observableIsLoadingStream = createTransferAccountRowView.isLoadingStream();
        Intrinsics.checkNotNullExpressionValue(observableIsLoadingStream, "<get-isLoadingStream>(...)");
        duxo.bindSourceAccountRowIsLoadingStream(observableIsLoadingStream);
        CreateTransferAccountRowView createTransferAccountRowView2 = getBinding().sinkAccountRow;
        createTransferAccountRowView2.setCallbacks(this);
        CreateTransferDuxo duxo2 = getDuxo();
        Observable<Boolean> observableIsLoadingStream2 = createTransferAccountRowView2.isLoadingStream();
        Intrinsics.checkNotNullExpressionValue(observableIsLoadingStream2, "<get-isLoadingStream>(...)");
        duxo2.bindSinkAccountRowIsLoadingStream(observableIsLoadingStream2);
        CreateTransferDuxo duxo3 = getDuxo();
        Observable<TransferConstraints> serviceFeeStream = createTransferAccountRowView2.getServiceFeeStream();
        Intrinsics.checkNotNullExpressionValue(serviceFeeStream, "<get-serviceFeeStream>(...)");
        duxo3.bindSinkAccountRowTransferConstraintsStream(serviceFeeStream);
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C306875(getDuxo()));
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        Observable<Unit> observableThrottleFirst = RxView.clicks(continueBtn).throttleFirst(250L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleFirst, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$14(this.f$0, (Unit) obj);
            }
        });
        RdsTextButton editBtn = getBinding().editBtn;
        Intrinsics.checkNotNullExpressionValue(editBtn, "editBtn");
        OnClickListeners.onClick(editBtn, new C306887(getDuxo()));
        CreateTransferAccountRowView sourceAccountRow = getBinding().sourceAccountRow;
        Intrinsics.checkNotNullExpressionValue(sourceAccountRow, "sourceAccountRow");
        OnClickListeners.onClick(sourceAccountRow, new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.onViewCreated$lambda$15(this.f$0);
            }
        });
        CreateTransferAccountRowView sinkAccountRow = getBinding().sinkAccountRow;
        Intrinsics.checkNotNullExpressionValue(sinkAccountRow, "sinkAccountRow");
        OnClickListeners.onClick(sinkAccountRow, new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferFragment.onViewCreated$lambda$16(this.f$0);
            }
        });
        RdsSettingsRowView frequencyRow = getBinding().frequencyRow;
        Intrinsics.checkNotNullExpressionValue(frequencyRow, "frequencyRow");
        OnClickListeners.onClick(frequencyRow, new C3068610(getDuxo()));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getShowIacUpsellEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservableDelay2.minTimeInFlight(ObservablesKt.filterIsPresent(map), 2L, TimeUnit.SECONDS), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$19(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getGoldApyBoostMinDepositInvalidEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map2)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$22(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getGoldNativeFundingUpsellEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map3).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$24(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getInstantRestrictionBottomSheetEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map4)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$27(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getDebitCardLinkingEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map5)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$30(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getTransferValidationErrors());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map6)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$33(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$$inlined$mapNotNull$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getThreeDSRedirectEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onViewCreated$$inlined$mapNotNull$7<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map7)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$36(this.f$0, (UiEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(CreateTransferFragment createTransferFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferFragment.getDuxo().invalidateRefIdForCurrentTransfer();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(CreateTransferFragment createTransferFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferFragment.getDuxo().createTransfer(true);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$5 */
    /* synthetic */ class C306875 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C306875(Object obj) {
            super(1, obj, CreateTransferDuxo.class, "consumeKeyEvent", "consumeKeyEvent(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CreateTransferDuxo) this.receiver).consumeKeyEvent(p0);
        }
    }

    /* compiled from: CreateTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$7 */
    /* synthetic */ class C306887 extends FunctionReferenceImpl implements Function0<Unit> {
        C306887(Object obj) {
            super(0, obj, CreateTransferDuxo.class, "enterEditMode", "enterEditMode()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CreateTransferDuxo) this.receiver).enterEditMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(CreateTransferFragment createTransferFragment, Unit unit) {
        CreateTransferDuxo.onContinueClick$default(createTransferFragment.getDuxo(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(CreateTransferFragment createTransferFragment) {
        createTransferFragment.getDuxo().onAccountRowClicked(TransferAccountDirection.SOURCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(CreateTransferFragment createTransferFragment) {
        createTransferFragment.getDuxo().onAccountRowClicked(TransferAccountDirection.SINK);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onViewCreated$10 */
    /* synthetic */ class C3068610 extends FunctionReferenceImpl implements Function0<Unit> {
        C3068610(Object obj) {
            super(0, obj, CreateTransferDuxo.class, "showFrequencyBottomSheet", "showFrequencyBottomSheet()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CreateTransferDuxo) this.receiver).showFrequencyBottomSheet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$19(final CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$19$lambda$18(this.f$0, (IacUpsell) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$19$lambda$18(CreateTransferFragment createTransferFragment, IacUpsell iacUpsell) {
        Intrinsics.checkNotNullParameter(iacUpsell, "iacUpsell");
        if (iacUpsell.getUpsellDeeplink() != null) {
            Navigator navigator = createTransferFragment.getNavigator();
            android.content.Context contextRequireContext = createTransferFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String upsellDeeplink = iacUpsell.getUpsellDeeplink();
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, upsellDeeplink != null ? Uri.parse(upsellDeeplink) : null, null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$22(CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        CreateTransferViewState.ApyGoldBoostErrorEvent apyGoldBoostErrorEvent = (CreateTransferViewState.ApyGoldBoostErrorEvent) event.consume();
        if (apyGoldBoostErrorEvent != null) {
            createTransferFragment.handleGoldApyBoostErrorEvent(apyGoldBoostErrorEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$24(CreateTransferFragment createTransferFragment, UiEvent uiEvent) {
        if (!createTransferFragment.getHasShownGoldNativeFundingUpsell() && uiEvent.consume() != null) {
            createTransferFragment.getDuxo().onGoldNativeFundingUpsellCompleted();
            createTransferFragment.setHasShownGoldNativeFundingUpsell(true);
            Navigator navigator = createTransferFragment.getNavigator();
            android.content.Context contextRequireContext = createTransferFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldNativeFundingUpsellIntentKey("menu_of_options_initial_screen", false, ColorTheme.DEFAULT), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$27(final CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$27$lambda$26(this.f$0, (InstantRestrictionBottomSheet.Args) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$27$lambda$26(CreateTransferFragment createTransferFragment, InstantRestrictionBottomSheet.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        InstantRestrictionBottomSheet instantRestrictionBottomSheet = (InstantRestrictionBottomSheet) InstantRestrictionBottomSheet.INSTANCE.newInstance((Parcelable) args);
        FragmentManager childFragmentManager = createTransferFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        instantRestrictionBottomSheet.show(childFragmentManager, "instantRestrictionBottomSheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$30(final CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$30$lambda$29(this.f$0, (LegacyIntentKey.DebitCardLinking) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$30$lambda$29(CreateTransferFragment createTransferFragment, LegacyIntentKey.DebitCardLinking key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Navigator.DefaultImpls.startActivityForResult$default(createTransferFragment.getNavigator(), (Fragment) createTransferFragment, (IntentKey) key, DEBIT_CARD_LINKING_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$33(CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TransferValidationErrorDetailsDto transferValidationErrorDetailsDto = (TransferValidationErrorDetailsDto) event.consume();
        if (transferValidationErrorDetailsDto != null) {
            Navigator.DefaultImpls.createDialogFragment$default(createTransferFragment.getNavigator(), new ValidationAlertArgs(transferValidationErrorDetailsDto, true), null, 2, null).show(createTransferFragment.getChildFragmentManager(), "validationAlert");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$36(final CreateTransferFragment createTransferFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onViewCreated$lambda$36$lambda$35(this.f$0, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$36$lambda$35(CreateTransferFragment createTransferFragment, String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        createTransferFragment.getThreeDSCallbacks().onThreeDSRequested(redirectUrl);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getWonkaServiceManager().disableMicrogramInteractions();
        super.onDestroy();
    }

    private final void handleGoldApyBoostErrorEvent(CreateTransferViewState.ApyGoldBoostErrorEvent it) {
        if (!(it instanceof CreateTransferViewState.ApyGoldBoostErrorEvent.DestinationAccountNotRhs)) {
            throw new NoWhenBranchMatchedException();
        }
        Companion companion = INSTANCE;
        if (((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration() instanceof TransferConfiguration.GoldApyBoostMinDeposit) {
            Double minDepositRate = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration().getMinDepositRate();
            RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion2.create(contextRequireContext).setId(C30383R.id.dialog_id_gold_apy_min_deposit_sink_account).setTitle(getString(C30383R.string.apy_boost_min_deposit_sink_account_title, minDepositRate)).setMessage(C30383R.string.apy_boost_min_deposit_sink_account_message, new Object[0]).setPositiveButton(C30383R.string.apy_boost_min_deposit_sink_account_primary_button, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "gold_apy_boost_destination_account", false, 4, null);
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        final TransferConfiguration transferConfiguration = ((BaseCreateTransferFragment.Args) INSTANCE.getArgs((Fragment) this)).getTransferConfiguration();
        Observable<CreateTransferViewState> states = getDuxo().getStates();
        final C306831 c306831 = new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((CreateTransferViewState) obj).getIsQuickSelectorVisible());
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c306831) { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c306831, "function");
                this.function = c306831;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$37(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Optional<IraTransferInfo5> apply(CreateTransferViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIraTransferInfoStateOptional();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$38(this.f$0, (Optional) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getAssetRetentionUpsellContent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$41(this.f$0, (UiEvent) obj);
            }
        });
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$43(this.f$0, (CreateTransferViewState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$44((Throwable) obj);
            }
        }, null, null, 12, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$49(this.f$0, transferConfiguration, (CreateTransferViewState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$50(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, getDuxo().getStates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$54(this.f$0, (CreateTransferViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getDuxo().getStates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$55(this.f$0, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$37(CreateTransferFragment createTransferFragment, Boolean bool) {
        if (bool.booleanValue()) {
            EventLogger.DefaultImpls.logAppear$default(createTransferFragment.getEventLogger(), null, createTransferFragment.getEventScreen(), createTransferFragment.getQuickSelectorChipsComponent(), null, createTransferFragment.getScreenEventContext(), 9, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$38(CreateTransferFragment createTransferFragment, Optional optional) {
        IraTransferInfo4.bindIraTransferInfo(createTransferFragment.getBinding(), (IraTransferInfo5) optional.component1(), createTransferFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$41(final CreateTransferFragment createTransferFragment, UiEvent uiEvent) {
        uiEvent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferFragment.onStart$lambda$41$lambda$40(this.f$0, (AssetRetentionUpsellContent) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$41$lambda$40(CreateTransferFragment createTransferFragment, AssetRetentionUpsellContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        createTransferFragment.getWonkaServiceManager().enableMicrogramInteractions(createTransferFragment.getLifecycleScope(), createTransferFragment);
        Navigator navigator = createTransferFragment.getNavigator();
        android.content.Context contextRequireContext = createTransferFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(content.getDeeplink()), null, null, false, null, 60, null);
        createTransferFragment.getWonkaServiceManager().markAssetRetentionPromotionSeen(content.getRetentionPeriodKey());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$43(final CreateTransferFragment createTransferFragment, CreateTransferViewState state) {
        final ShowOutgoingWireMemoDataHolder showOutgoingWireMemoDataHolderConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<ShowOutgoingWireMemoDataHolder> showOutgoingWireMemoEvent = state.getShowOutgoingWireMemoEvent();
        if (showOutgoingWireMemoEvent != null && (showOutgoingWireMemoDataHolderConsume = showOutgoingWireMemoEvent.consume()) != null) {
            if (showOutgoingWireMemoDataHolderConsume.getDisplayData() != null) {
                createTransferFragment.getBinding().memoPopup.setVisibility(0);
                createTransferFragment.getBinding().memoPopup.setContent(ComposableLambda3.composableLambdaInstance(1040583732, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1
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
                            ComposerKt.traceEventStart(1040583732, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:513)");
                        }
                        final ShowOutgoingWireMemoDataHolder showOutgoingWireMemoDataHolder = showOutgoingWireMemoDataHolderConsume;
                        final CreateTransferFragment createTransferFragment2 = createTransferFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1462178324, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1.1

                            /* compiled from: CreateTransferFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ ShowOutgoingWireMemoDataHolder $data;
                                final /* synthetic */ CreateTransferFragment this$0;

                                AnonymousClass1(ShowOutgoingWireMemoDataHolder showOutgoingWireMemoDataHolder, CreateTransferFragment createTransferFragment) {
                                    this.$data = showOutgoingWireMemoDataHolder;
                                    this.this$0 = createTransferFragment;
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
                                        ComposerKt.traceEventStart(1925670647, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:515)");
                                    }
                                    OutgoingWireMemoEntryData displayData = this.$data.getDisplayData();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                                    final CreateTransferFragment createTransferFragment = this.this$0;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = (r2v0 'createTransferFragment' com.robinhood.android.transfers.ui.max.CreateTransferFragment A[DONT_INLINE]) A[MD:(com.robinhood.android.transfers.ui.max.CreateTransferFragment):void (m)] (LINE:518) call: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.transfers.ui.max.CreateTransferFragment):void type: CONSTRUCTOR in method: com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.7.1.1.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 25 more
                                            */
                                        /*
                                            this = this;
                                            r0 = r10 & 3
                                            r1 = 2
                                            if (r0 != r1) goto L10
                                            boolean r0 = r9.getSkipping()
                                            if (r0 != 0) goto Lc
                                            goto L10
                                        Lc:
                                            r9.skipToGroupEnd()
                                            return
                                        L10:
                                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r0 == 0) goto L1f
                                            r0 = -1
                                            java.lang.String r1 = "com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:515)"
                                            r2 = 1925670647(0x72c766f7, float:7.899135E30)
                                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r0, r1)
                                        L1f:
                                            com.robinhood.android.transfers.ui.max.ShowOutgoingWireMemoDataHolder r10 = r8.$data
                                            com.robinhood.android.transfers.ui.composecomponents.OutgoingWireMemoEntryData r0 = r10.getDisplayData()
                                            r10 = 5004770(0x4c5de2, float:7.013177E-39)
                                            r9.startReplaceGroup(r10)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r1 = r8.this$0
                                            boolean r1 = r9.changedInstance(r1)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r2 = r8.this$0
                                            java.lang.Object r3 = r9.rememberedValue()
                                            if (r1 != 0) goto L41
                                            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                            java.lang.Object r1 = r1.getEmpty()
                                            if (r3 != r1) goto L49
                                        L41:
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda0
                                            r3.<init>(r2)
                                            r9.updateRememberedValue(r3)
                                        L49:
                                            r1 = r3
                                            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                            r9.endReplaceGroup()
                                            r9.startReplaceGroup(r10)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r2 = r8.this$0
                                            boolean r2 = r9.changedInstance(r2)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r3 = r8.this$0
                                            java.lang.Object r4 = r9.rememberedValue()
                                            if (r2 != 0) goto L68
                                            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                            java.lang.Object r2 = r2.getEmpty()
                                            if (r4 != r2) goto L70
                                        L68:
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda1 r4 = new com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda1
                                            r4.<init>(r3)
                                            r9.updateRememberedValue(r4)
                                        L70:
                                            r2 = r4
                                            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                            r9.endReplaceGroup()
                                            r9.startReplaceGroup(r10)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r10 = r8.this$0
                                            boolean r10 = r9.changedInstance(r10)
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment r3 = r8.this$0
                                            java.lang.Object r4 = r9.rememberedValue()
                                            if (r10 != 0) goto L8f
                                            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                                            java.lang.Object r10 = r10.getEmpty()
                                            if (r4 != r10) goto L97
                                        L8f:
                                            com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda2 r4 = new com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$7$1$1$1$1$$ExternalSyntheticLambda2
                                            r4.<init>(r3)
                                            r9.updateRememberedValue(r4)
                                        L97:
                                            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                                            r9.endReplaceGroup()
                                            int r6 = com.robinhood.utils.resource.StringResource.$stable
                                            r7 = 8
                                            r3 = 0
                                            r5 = r9
                                            com.robinhood.android.transfers.p271ui.composecomponents.OutgoingWireMemoEntryScreen5.OutgoingWireMemoEntryScreen(r0, r1, r2, r3, r4, r5, r6, r7)
                                            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r9 == 0) goto Lae
                                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                                        Lae:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.CreateTransferFragment$onStart$7$1$1.C306851.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(CreateTransferFragment createTransferFragment, String newMemoText) {
                                        Intrinsics.checkNotNullParameter(newMemoText, "newMemoText");
                                        createTransferFragment.getDuxo().memoTextChanged(newMemoText);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(CreateTransferFragment createTransferFragment) {
                                        createTransferFragment.getDuxo().memoSaveSelected();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$5$lambda$4(CreateTransferFragment createTransferFragment) {
                                        createTransferFragment.getDuxo().memoSkipSelected();
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
                                        ComposerKt.traceEventStart(-1462178324, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:514)");
                                    }
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1925670647, true, new AnonymousClass1(showOutgoingWireMemoDataHolder, createTransferFragment2), composer2, 54), composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 100663296, 255);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                } else {
                    createTransferFragment.getBinding().memoPopup.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$44(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$49(final CreateTransferFragment createTransferFragment, final TransferConfiguration transferConfiguration, final CreateTransferViewState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getRfpContent() == null) {
                createTransferFragment.getBinding().rfpPopup.setContent(ComposableSingletons$CreateTransferFragmentKt.INSTANCE.m19766getLambda$118441884$feature_transfers_externalRelease());
                createTransferFragment.getBinding().rfpPopup.setVisibility(8);
            } else {
                it.getRfpContent().consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferFragment.onStart$lambda$49$lambda$46(this.f$0, it, transferConfiguration, (ApiPreCreateTransferSduiContainer) obj);
                    }
                });
            }
            UiEvent<CreateTransferViewState.PreCreateGenericAlert> genericAlertContent = it.getGenericAlertContent();
            if (genericAlertContent != null) {
                genericAlertContent.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferFragment.onStart$lambda$49$lambda$48(this.f$0, (CreateTransferViewState.PreCreateGenericAlert) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$49$lambda$46(CreateTransferFragment createTransferFragment, CreateTransferViewState createTransferViewState, TransferConfiguration transferConfiguration, ApiPreCreateTransferSduiContainer content) {
            MAXTransferContext mAXTransferContextCopy;
            Intrinsics.checkNotNullParameter(content, "content");
            List<UIComponent<GenericAction>> sduiContent = content.getSduiContent();
            if (sduiContent != null) {
                EventLogger eventLogger = createTransferFragment.getEventLogger();
                Screen eventScreen = createTransferFragment.getEventScreen();
                Component component = new Component(Component.ComponentType.BOTTOM_SHEET, "rfp_upsell", null, 4, null);
                MAXTransferContext max_transfer_context = createTransferFragment.getScreenEventContext().getMax_transfer_context();
                if (max_transfer_context != null) {
                    mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : ExtensionsKt.toMoneyForLogging(createTransferViewState.getAmount()), (377169 & 4) != 0 ? max_transfer_context.source_account : null, (377169 & 8) != 0 ? max_transfer_context.sink_account : null, (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : null, (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
                } else {
                    mAXTransferContextCopy = null;
                }
                EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), 9, null);
                createTransferFragment.getBinding().rfpPopup.setVisibility(0);
                createTransferFragment.getBinding().rfpPopup.setContent(ComposableLambda3.composableLambdaInstance(786845415, true, new CreateTransferFragment$onStart$9$1$1$1(createTransferFragment, content, sduiContent, createTransferViewState, transferConfiguration)));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$49$lambda$48(final CreateTransferFragment createTransferFragment, CreateTransferViewState.PreCreateGenericAlert preCreateGenericAlert) {
            Intrinsics.checkNotNullParameter(preCreateGenericAlert, "<destruct>");
            final PreCreatePopupType type2 = preCreateGenericAlert.getType();
            AlertAction<DisplayRTPUpsellAction> alertActionComponent2 = preCreateGenericAlert.component2();
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = createTransferFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            createTransferFragment.setSheetListener(sduiAlert.sheetListener(childFragmentManager, createTransferFragment.getMarkwon(), alertActionComponent2.getAlert(), new SduiActionHandler() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$9$2$1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                public final boolean mo15941handle(DisplayRTPUpsellAction action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.this$0.setSheetListener(null);
                    if (action instanceof DisplayRTPUpsellAction.RtpUpsellSwitchToRtp) {
                        this.this$0.getDuxo().selectInstantTransfers();
                    } else if (action instanceof DisplayRTPUpsellAction.RtpUpsellProceedWithRegularTransfer) {
                        PreCreateLoggingEvents.logPreCreateBottomSheetClick$default(this.this$0.getEventLogger(), PreCreatePopupType.RTP_UPSELL, UserInteractionEventData.Action.SECONDARY_CTA, null, 4, null);
                        this.this$0.getDuxo().continueTransaction(true);
                    } else if (action instanceof DisplayRTPUpsellAction.Confirm) {
                        PreCreateLoggingEvents.logPreCreateBottomSheetClick$default(this.this$0.getEventLogger(), type2, UserInteractionEventData.Action.CONTINUE, null, 4, null);
                        this.this$0.getDuxo().continueTransaction(true);
                    } else if (action instanceof DisplayRTPUpsellAction.Dismiss) {
                        PreCreateLoggingEvents.logPreCreateBottomSheetClick$default(this.this$0.getEventLogger(), type2, UserInteractionEventData.Action.DISMISS, null, 4, null);
                    } else if (action instanceof DisplayRTPUpsellAction.Deeplink) {
                        PreCreateLoggingEvents.logPreCreateBottomSheetClick$default(this.this$0.getEventLogger(), type2, UserInteractionEventData.Action.VIEW_DEEPLINK, null, 4, null);
                        Navigator navigator = this.this$0.getNavigator();
                        android.content.Context contextRequireContext = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((DisplayRTPUpsellAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
                    }
                    return true;
                }
            }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferFragment.onStart$lambda$49$lambda$48$lambda$47(this.f$0);
                }
            }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$16((String) obj2);
                }
            } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$17((String) obj2);
                }
            } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$49$lambda$48$lambda$47(CreateTransferFragment createTransferFragment) {
            createTransferFragment.getDuxo().alertDismissed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$50(CreateTransferFragment createTransferFragment, Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            createTransferFragment.setSheetListener(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$54(final CreateTransferFragment createTransferFragment, CreateTransferViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            UiEvent<AlertAction<GenericAction>> validateContributionTypeAlert = state.getValidateContributionTypeAlert();
            if (validateContributionTypeAlert != null) {
                validateContributionTypeAlert.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferFragment.onStart$lambda$54$lambda$52(this.f$0, (AlertAction) obj);
                    }
                });
            }
            UiEvent<Throwable> validateContributionTypeError = state.getValidateContributionTypeError();
            if (validateContributionTypeError != null) {
                validateContributionTypeError.consumeWith(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferFragment.onStart$lambda$54$lambda$53(this.f$0, (Throwable) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$54$lambda$52(CreateTransferFragment createTransferFragment, AlertAction alertAction) {
            Intrinsics.checkNotNullParameter(alertAction, "alertAction");
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager childFragmentManager = createTransferFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            createTransferFragment.setSheetListener(sduiAlert.sheetListener(childFragmentManager, createTransferFragment.getMarkwon(), alertAction.getAlert(), new CreateTransferFragment$onStart$11$1$1(createTransferFragment), (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$16((String) obj2);
                }
            } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SduiAlert.sheetListener$lambda$17((String) obj2);
                }
            } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$54$lambda$53(CreateTransferFragment createTransferFragment, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            AbsErrorHandler.handleError$default(createTransferFragment.getActivityErrorHandler(), throwable, false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onStart$lambda$55(CreateTransferFragment createTransferFragment, CreateTransferViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            UiEvent<AdvisoryFullWithdrawalKey> navigateToFullWithdrawalEvent = state.getNavigateToFullWithdrawalEvent();
            if (navigateToFullWithdrawalEvent != null) {
                navigateToFullWithdrawalEvent.consumeWith(new CreateTransferFragment$onStart$12$1(createTransferFragment.getCallbacks()));
            }
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
        public void configureToolbar(RhToolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            super.configureToolbar(toolbar);
            Companion companion = INSTANCE;
            if (((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration().getUseQueuedDepositMode()) {
                toolbar.setTitle("Fund your account");
            } else if (((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration() instanceof TransferConfiguration.UpdateRecurringDeposit) {
                toolbar.setTitle(getString(C30065R.string.update_recurring_deposit_frequency_toolbar));
            } else {
                super.configureToolbar(toolbar);
                toolbar.setTitle(getString(C30065R.string.create_transfer_title));
            }
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
            if (id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.INCOMING_WIRE, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell", null, 4, null), null, null, false, 56, null);
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.INCOMING, WiresContext.EntryPoint.LIMITS_HUB_ERROR), null, false, null, null, 60, null);
                return true;
            }
            if (id == C30383R.id.dialog_id_limits_hub_check_failure) {
                getDuxo().enterEditMode();
                return true;
            }
            if (id == C30383R.id.dialog_id_ira_contribution_exceeded) {
                Navigator navigator2 = getNavigator();
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Navigators3.showContactSupportTriageFragment$default(navigator2, contextRequireContext2, "149", false, 4, null);
                return true;
            }
            if (id != C30383R.id.dialog_id_ira_distribution_enoki_removal && id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                if (id == C30383R.id.dialog_id_gold_apy_min_deposit_min_amount) {
                    getDuxo().enterEditMode();
                    return true;
                }
                if (id == C30383R.id.dialog_id_update_recurring_deposit_no_change_dialog) {
                    return true;
                }
                return super.onPositiveButtonClicked(id, passthroughArgs);
            }
            if (passthroughArgs == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EventLogger eventLogger = getEventLogger();
            Screen screen = new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
            Component.ComponentType componentType = Component.ComponentType.ALERT;
            String string2 = passthroughArgs.getString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER);
            if (string2 != null) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
                if (id == C30383R.id.dialog_id_ira_distribution_enoki_removal) {
                    getDuxo().overrideDistributionEnokiRemovalAlert();
                } else {
                    if (id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                        throw new IllegalStateException(("Unexpected distribution dialog id: " + id).toString());
                    }
                    getDuxo().overrideDistributionPreReviewAlert();
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
            if (id != C30383R.id.dialog_id_ira_distribution_enoki_removal && id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                if (id == C30383R.id.dialog_id_ira_contribution_no_enoki) {
                    getDuxo().overrideNoEnokiAlert();
                    return true;
                }
                if (id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell) {
                    EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell", null, 4, null), null, getScreenEventContext(), false, 40, null);
                    return true;
                }
                if (id == C30383R.id.dialog_id_gold_apy_min_deposit_min_amount) {
                    getDuxo().overrideGoldApyMinDepositAlert();
                    return true;
                }
                if (id == C30383R.id.dialog_id_update_recurring_deposit_no_change_dialog) {
                    requireActivity().finish();
                    return true;
                }
                return super.onNegativeButtonClicked(id, passthroughArgs);
            }
            if (passthroughArgs == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EventLogger eventLogger = getEventLogger();
            Screen screen = new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
            Component.ComponentType componentType = Component.ComponentType.ALERT;
            String string2 = passthroughArgs.getString(IraDistributionCheck.ARG_LOGGING_IDENTIFIER);
            if (string2 != null) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
                if (id == C30383R.id.dialog_id_ira_distribution_enoki_removal) {
                    Navigator navigator = getNavigator();
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new RetirementEnokiInfo(null, 1, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null));
                } else if (id != C30383R.id.dialog_id_ira_distribution_pre_review) {
                    throw new IllegalStateException(("Unexpected distribution dialog id: " + id).toString());
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (id == C30383R.id.dialog_id_limits_hub_check_failure || id == C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell) {
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_LIMIT_HUB, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "limit_alert_link", null, 4, null), null, null, false, 56, null);
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, LimitsHubDetails.INSTANCE, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
                return true;
            }
            return super.onLinkTextClicked(id, passthroughArgs, url);
        }

        @Override // com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment
        public void bindState(final CreateTransferViewState state) throws Throwable {
            StringResource stringResourceConsume;
            Throwable thConsume;
            ValidationFailure validationFailureConsume;
            Tuples2<UUID, Boolean> tuples2Consume;
            TransferAccount transferAccountConsume;
            TransferFrequencyBottomSheetFragmentKey transferFrequencyBottomSheetFragmentKeyConsume;
            TransferAccountSelectionKey transferAccountSelectionKeyConsume;
            Throwable thConsume2;
            Result<PostTransferFlow> resultConsume;
            Intrinsics.checkNotNullParameter(state, "state");
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null) {
                rhToolbar.setTitle(getString(state.getToolbarTitle()));
            }
            if (getMode() != state.getMode()) {
                setMode(state.getMode());
                ConstraintLayout root = getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$$inlined$beginDelayedTransition$1
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$$inlined$beginDelayedTransition$2
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                transitionSet.excludeTarget((View) getBinding().disclosureSection, true);
                Fade fade = new Fade();
                Interpolators interpolators = Interpolators.INSTANCE;
                fade.setInterpolator(interpolators.getFastOutSlowIn());
                transitionSet.addTransition(fade);
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setInterpolator(interpolators.getFastOutSlowIn());
                transitionSet.addTransition(changeBounds);
                transitionSet.setOrdering(0);
                TransitionManager.beginDelayedTransition(root, transitionSet);
            }
            RdsNumpadView numpad = getBinding().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
            numpad.setVisibility(state.getIsNumpadVisible() ? 0 : 8);
            UiEvent<Boolean> animateInput = state.getAnimateInput();
            if (animateInput != null ? Intrinsics.areEqual(animateInput.consume(), Boolean.TRUE) : false) {
                getBinding().inputView.transitionTo(state.getInputChars());
            } else {
                getBinding().inputView.setValue(state.getInputChars());
            }
            ComposeView quickSelector = getBinding().quickSelector;
            Intrinsics.checkNotNullExpressionValue(quickSelector, "quickSelector");
            quickSelector.setVisibility(state.getIsQuickSelectorVisible() ? 0 : 8);
            final RemoteMicrogramApplication quickSelectorMicrogramSource = state.getQuickSelectorMicrogramSource();
            if (quickSelectorMicrogramSource != null) {
                getBinding().quickSelector.setContent(ComposableLambda3.composableLambdaInstance(620959450, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$2$1
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
                            ComposerKt.traceEventStart(620959450, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous> (CreateTransferFragment.kt:904)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                        final CreateTransferFragment createTransferFragment = this.this$0;
                        final RemoteMicrogramApplication remoteMicrogramApplication = quickSelectorMicrogramSource;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1436012184, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$2$1.1
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
                                    ComposerKt.traceEventStart(-1436012184, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:905)");
                                }
                                ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(createTransferFragment.getNavigator()), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, createTransferFragment.getEventScreen(), null, createTransferFragment.getScreenEventContext(), null, null, 53, null))};
                                final CreateTransferFragment createTransferFragment2 = createTransferFragment;
                                final RemoteMicrogramApplication remoteMicrogramApplication2 = remoteMicrogramApplication;
                                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-613202776, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.2.1.1.1
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
                                            ComposerKt.traceEventStart(-613202776, i3, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:912)");
                                        }
                                        final CreateTransferFragment createTransferFragment3 = createTransferFragment2;
                                        final RemoteMicrogramApplication remoteMicrogramApplication3 = remoteMicrogramApplication2;
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-640996419, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.2.1.1.1.1
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
                                                    ComposerKt.traceEventStart(-640996419, i4, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:913)");
                                                }
                                                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                                                FragmentManager childFragmentManager = createTransferFragment3.getChildFragmentManager();
                                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                                MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication3, childFragmentManager, modifierAnimateContentSize$default, null, ComposableSingletons$CreateTransferFragmentKt.INSTANCE.m19765getLambda$1084336724$feature_transfers_externalRelease(), null, null, false, null, composer4, 24576, 488);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            final List<QuickSelectorChip> quickSelectorChips = state.getQuickSelectorChips();
            if (quickSelectorChips != null) {
                getBinding().quickSelector.setContent(ComposableLambda3.composableLambdaInstance(-751269602, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1
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
                            ComposerKt.traceEventStart(-751269602, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous> (CreateTransferFragment.kt:926)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(1371013676, true, new C306781(quickSelectorChips, this.this$0), composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CreateTransferFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1$1 */
                    static final class C306781 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ List<QuickSelectorChip> $chips;
                        final /* synthetic */ CreateTransferFragment this$0;

                        C306781(List<QuickSelectorChip> list, CreateTransferFragment createTransferFragment) {
                            this.$chips = list;
                            this.this$0 = createTransferFragment;
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
                                ComposerKt.traceEventStart(1371013676, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:929)");
                            }
                            ImmutableList immutableList = extensions2.toImmutableList(this.$chips);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final CreateTransferFragment createTransferFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r1v1 'createTransferFragment' com.robinhood.android.transfers.ui.max.CreateTransferFragment A[DONT_INLINE]) A[MD:(com.robinhood.android.transfers.ui.max.CreateTransferFragment):void (m)] (LINE:932) call: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.transfers.ui.max.CreateTransferFragment):void type: CONSTRUCTOR in method: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r11 & 3
                                    r1 = 2
                                    if (r0 != r1) goto L10
                                    boolean r0 = r10.getSkipping()
                                    if (r0 != 0) goto Lc
                                    goto L10
                                Lc:
                                    r10.skipToGroupEnd()
                                    return
                                L10:
                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r0 == 0) goto L1f
                                    r0 = -1
                                    java.lang.String r1 = "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:929)"
                                    r2 = 1371013676(0x51b8022c, float:9.8788803E10)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                                L1f:
                                    java.util.List<com.robinhood.android.transfers.ui.max.suggestionpills.QuickSelectorChip> r11 = r9.$chips
                                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                                    kotlinx.collections.immutable.ImmutableList r0 = kotlinx.collections.immutable.extensions2.toImmutableList(r11)
                                    r11 = 5004770(0x4c5de2, float:7.013177E-39)
                                    r10.startReplaceGroup(r11)
                                    com.robinhood.android.transfers.ui.max.CreateTransferFragment r11 = r9.this$0
                                    boolean r11 = r10.changedInstance(r11)
                                    com.robinhood.android.transfers.ui.max.CreateTransferFragment r1 = r9.this$0
                                    java.lang.Object r2 = r10.rememberedValue()
                                    if (r11 != 0) goto L43
                                    androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r11 = r11.getEmpty()
                                    if (r2 != r11) goto L4b
                                L43:
                                    com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$3$1$1$$ExternalSyntheticLambda0
                                    r2.<init>(r1)
                                    r10.updateRememberedValue(r2)
                                L4b:
                                    r1 = r2
                                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                    r10.endReplaceGroup()
                                    androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoTheme r11 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r3 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoSpacing r4 = r11.getSpacing(r10, r3)
                                    float r6 = r4.m21590getDefaultD9Ej5fM()
                                    com.robinhood.compose.bento.theme.BentoSpacing r4 = r11.getSpacing(r10, r3)
                                    float r4 = r4.m21592getMediumD9Ej5fM()
                                    com.robinhood.compose.bento.theme.BentoSpacing r11 = r11.getSpacing(r10, r3)
                                    float r5 = r11.m21592getMediumD9Ej5fM()
                                    r7 = 2
                                    r8 = 0
                                    r3 = r4
                                    r4 = 0
                                    androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r2, r3, r4, r5, r6, r7, r8)
                                    r2 = 1
                                    r3 = 0
                                    androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r11, r4, r2, r3)
                                    r5 = 0
                                    r6 = 8
                                    r3 = 0
                                    r4 = r10
                                    com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelector.QuickSelector(r0, r1, r2, r3, r4, r5, r6)
                                    boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r10 == 0) goto L8e
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L8e:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.CreateTransferFragment$bindState$3$1.C306781.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(CreateTransferFragment createTransferFragment, QuickSelectorChip chip) {
                                MAXTransferContext mAXTransferContextCopy;
                                Intrinsics.checkNotNullParameter(chip, "chip");
                                EventLogger eventLogger = createTransferFragment.getEventLogger();
                                Screen eventScreen = createTransferFragment.getEventScreen();
                                Component quickSelectorChipsComponent = createTransferFragment.getQuickSelectorChipsComponent();
                                MAXTransferContext max_transfer_context = createTransferFragment.getScreenEventContext().getMax_transfer_context();
                                if (max_transfer_context != null) {
                                    mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : ExtensionsKt.toMoneyForLogging(chip.getValue()), (377169 & 4) != 0 ? max_transfer_context.source_account : null, (377169 & 8) != 0 ? max_transfer_context.sink_account : null, (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : null, (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
                                } else {
                                    mAXTransferContextCopy = null;
                                }
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, quickSelectorChipsComponent, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
                                createTransferFragment.getDuxo().onQuickSelectorChipSelected(chip);
                                return Unit.INSTANCE;
                            }
                        }
                    }));
                }
                getBinding().goldDepositBoostPill.setContent(ComposableLambda3.composableLambdaInstance(684000479, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.4
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
                            ComposerKt.traceEventStart(684000479, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous> (CreateTransferFragment.kt:957)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(CreateTransferFragment.this.getScarletManager());
                        final CreateTransferViewState createTransferViewState = state;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1299285777, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.4.1
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
                                    ComposerKt.traceEventStart(1299285777, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous> (CreateTransferFragment.kt:960)");
                                }
                                GoldDepositBoostPillComposable.GoldDepositBoostPillComposable(createTransferViewState.getAmount(), createTransferViewState.getDepositBoostInformation(), null, composer2, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                RdsTextButton editBtn = getBinding().editBtn;
                Intrinsics.checkNotNullExpressionValue(editBtn, "editBtn");
                editBtn.setVisibility(state.getIsEditButtonVisible() ? 0 : 8);
                final ComposeView composeView = getBinding().amountFooterDisclosureSection;
                final CreateTransferDisclosure.Resource amountFooterDisclosureResource = state.getAmountFooterDisclosureResource();
                Intrinsics.checkNotNull(composeView);
                composeView.setVisibility(amountFooterDisclosureResource != null ? 0 : 8);
                if (amountFooterDisclosureResource != null) {
                    composeView.setContent(ComposableLambda3.composableLambdaInstance(-2091035763, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$5$1$1$1
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
                                ComposerKt.traceEventStart(-2091035763, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:973)");
                            }
                            ComposeView composeView2 = composeView;
                            Intrinsics.checkNotNull(composeView2);
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(composeView2));
                            final CreateTransferDisclosure.Resource resource = amountFooterDisclosureResource;
                            final CreateTransferFragment createTransferFragment = this;
                            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-593127141, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$5$1$1$1.1
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
                                        ComposerKt.traceEventStart(-593127141, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:976)");
                                    }
                                    CreateTransferDisclosure3.CreateTransferDisclosureWithResource(resource, createTransferFragment, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                RdsButton continueBtn = getBinding().continueBtn;
                Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
                ComposeView quickSelector2 = getBinding().quickSelector;
                Intrinsics.checkNotNullExpressionValue(quickSelector2, "quickSelector");
                continueBtn.setVisibility(!(quickSelector2.getVisibility() == 0) ? 0 : 8);
                RdsButton rdsButton = getBinding().continueBtn;
                IdlingResourceCounters2.setBusy(IdlingResourceType.CREATE_TRANSFER_BUTTON_LOADING, !state.isButtonEnabled());
                rdsButton.setEnabled(state.isButtonEnabled());
                rdsButton.setLoading(state.getIsContinueButtonLoading());
                StringResource buttonTextRes = state.getButtonTextRes();
                Resources resources = rdsButton.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                rdsButton.setText(buttonTextRes.getText(resources));
                getBinding().sourceAccountRow.bind(state.getSourceAccountRowBundle());
                getBinding().sinkAccountRow.bind(state.getSinkAccountRowBundle());
                RdsSettingsRowView frequencyRow = getBinding().frequencyRow;
                Intrinsics.checkNotNullExpressionValue(frequencyRow, "frequencyRow");
                frequencyRow.setVisibility(state.getIsFrequencyRowVisible() ? 0 : 8);
                getBinding().frequencyRow.setValueText(getString(state.getFrequencyPrimaryTextRes()));
                ComposeView outgoingWireDetails = getBinding().outgoingWireDetails;
                Intrinsics.checkNotNullExpressionValue(outgoingWireDetails, "outgoingWireDetails");
                outgoingWireDetails.setVisibility(state.isOutgoingWireDetailsVisible() ? 0 : 8);
                final List<CreateTransferViewState.OutgoingWireDetailRow> visibleOutgoingWireDetailRows = state.getVisibleOutgoingWireDetailRows();
                if (visibleOutgoingWireDetailRows != null) {
                    getBinding().outgoingWireDetails.setContent(ComposableLambda3.composableLambdaInstance(214293215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$7$1
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
                                ComposerKt.traceEventStart(214293215, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous> (CreateTransferFragment.kt:1003)");
                            }
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                            final List<CreateTransferViewState.OutgoingWireDetailRow> list = visibleOutgoingWireDetailRows;
                            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1958390803, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$bindState$7$1.1
                                public final void invoke(Composer composer2, int i2) {
                                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1958390803, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:1004)");
                                    }
                                    List<CreateTransferViewState.OutgoingWireDetailRow> list2 = list;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer2.startReplaceGroup(692528867);
                                    for (CreateTransferViewState.OutgoingWireDetailRow outgoingWireDetailRow : list2) {
                                        StringResource label = outgoingWireDetailRow.getLabel();
                                        BentoSettingsRowKt.BentoSettingsRow((Modifier) null, StringResource2.getString(label, composer2, StringResource.$stable), outgoingWireDetailRow.getValue(), (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) null, composer2, 0, EnumC7081g.f2779x59907a3d);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer, 54), composer, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
                getBinding().achTransferOptionsSelector.setContent(ComposableLambda3.composableLambdaInstance(210193302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.8
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
                            ComposerKt.traceEventStart(210193302, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous> (CreateTransferFragment.kt:1014)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(CreateTransferFragment.this.getScarletManager());
                        final CreateTransferViewState createTransferViewState = state;
                        final CreateTransferFragment createTransferFragment = CreateTransferFragment.this;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1206122168, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.8.1
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
                                    ComposerKt.traceEventStart(-1206122168, i2, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.bindState.<anonymous>.<anonymous> (CreateTransferFragment.kt:1017)");
                                }
                                AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle = createTransferViewState.getAchTransferOptionsSelectorBundle();
                                CreateTransferDuxo duxo = createTransferFragment.getDuxo();
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer2.changedInstance(duxo);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new CreateTransferFragment$bindState$8$1$1$1(duxo);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                AchTransferOptionsSelectorComposable.AchTransferOptionsSelectorComposable(achTransferOptionsSelectorBundle, function1, PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), null, composer2, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                CreateTransferFragmentBindings.bindDisclosure(getBinding(), state, getScarletManager(), this, getNavigator());
                ShimmerLoadingView loadingView = getBinding().loadingView;
                Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
                loadingView.setVisibility(state.getIsLoadingOverlayVisible() ? 0 : 8);
                if (!state.isLoadingAccounts()) {
                    Companion companion = INSTANCE;
                    TransferConfiguration transferConfiguration = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration();
                    if (!getHasShownFrequencyBottomSheetOnLaunch() && transferConfiguration.getShowFrequencyBottomSheetOnLaunch()) {
                        setHasShownFrequencyBottomSheetOnLaunch(true);
                        boolean z = ((BaseCreateTransferFragment.Args) companion.getArgs((Fragment) this)).getTransferConfiguration() instanceof TransferConfiguration.RadHook;
                        ApiCreateTransferRequest2 frequency = transferConfiguration.getFrequency();
                        if (frequency == null) {
                            frequency = ApiCreateTransferRequest2.ONCE;
                        }
                        showFrequencyBottomSheet(new TransferFrequencyBottomSheetFragmentKey(z, frequency, null, 4, null));
                    }
                }
                UiEvent<Result<PostTransferFlow>> createEvent = state.getCreateEvent();
                if (createEvent != null && (resultConsume = createEvent.consume()) != null) {
                    Object value = resultConsume.getValue();
                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                    if (thM28553exceptionOrNullimpl == null) {
                        onTransferCreateSuccess((PostTransferFlow) value);
                    } else {
                        onTransferCreateFailure(thM28553exceptionOrNullimpl);
                    }
                }
                UiEvent<Throwable> accountsErrorEvent = state.getAccountsErrorEvent();
                if (accountsErrorEvent != null && (thConsume2 = accountsErrorEvent.consume()) != null) {
                    onTransferAccountsError(thConsume2);
                }
                UiEvent<TransferAccountSelectionKey> showAccountSelectionEvent = state.getShowAccountSelectionEvent();
                if (showAccountSelectionEvent != null && (transferAccountSelectionKeyConsume = showAccountSelectionEvent.consume()) != null) {
                    getCallbacks().onShowAccountSelection(transferAccountSelectionKeyConsume);
                }
                UiEvent<TransferFrequencyBottomSheetFragmentKey> showFrequencyBottomSheetEvent = state.getShowFrequencyBottomSheetEvent();
                if (showFrequencyBottomSheetEvent != null && (transferFrequencyBottomSheetFragmentKeyConsume = showFrequencyBottomSheetEvent.consume()) != null) {
                    showFrequencyBottomSheet(transferFrequencyBottomSheetFragmentKeyConsume);
                }
                UiEvent<TransferAccount> showDistributionQuestionnaireEvent = state.getShowDistributionQuestionnaireEvent();
                if (showDistributionQuestionnaireEvent != null && (transferAccountConsume = showDistributionQuestionnaireEvent.consume()) != null) {
                    this.iraDistributionQuestionnaireLauncher.launch(new IraDistributionQuestionnaireLaunchMode.FullQuestionnaire(transferAccountConsume));
                }
                UiEvent<Tuples2<UUID, Boolean>> verificationWorkflowEvent = state.getVerificationWorkflowEvent();
                if (verificationWorkflowEvent != null && (tuples2Consume = verificationWorkflowEvent.consume()) != null) {
                    UUID uuidComponent1 = tuples2Consume.component1();
                    Boolean boolComponent2 = tuples2Consume.component2();
                    boolComponent2.booleanValue();
                    this.launchSuv.invoke(uuidComponent1, boolComponent2);
                }
                UiEvent<ValidationFailure> validationFailureEvent = state.getValidationFailureEvent();
                if (validationFailureEvent != null && (validationFailureConsume = validationFailureEvent.consume()) != null) {
                    validationFailureConsume.showAlert(requireBaseActivity(), getEventLogger());
                }
                Throwable serviceFeeParamsError = state.getServiceFeeParamsError();
                if (serviceFeeParamsError != null) {
                    onContentFailure(serviceFeeParamsError);
                }
                UiEvent<Throwable> rothConversionTransferInfoFailedEvent = state.getRothConversionTransferInfoFailedEvent();
                if (rothConversionTransferInfoFailedEvent != null && (thConsume = rothConversionTransferInfoFailedEvent.consume()) != null) {
                    ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, requireBaseActivity(), thConsume, true, false, 0, null, 56, null);
                }
                ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getCancelPendingCryptoOrderNetworkErrorEvent());
                UiEvent<StringResource> cancelPendingCryptoOrderTransferErrorEvent = CancelPendingCryptoOrderViewState2.getCancelPendingCryptoOrderTransferErrorEvent(state);
                if (cancelPendingCryptoOrderTransferErrorEvent != null && (stringResourceConsume = cancelPendingCryptoOrderTransferErrorEvent.consume()) != null) {
                    RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder title = companion2.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C12914R.string.cancel_pending_crypto_orders_error_title, new Object[0]);
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    RhDialogFragment.Builder positiveButton = title.setMessage(stringResourceConsume.getText(resources2)).setPositiveButton(C12914R.string.cancel_pending_crypto_orders_transfer_error_cta, new Object[0]);
                    FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cancelPendingCryptoOrdersError", false, 4, null);
                }
                UiEvent<Unit> showMatchRateSelectionEvent = state.getShowMatchRateSelectionEvent();
                if (showMatchRateSelectionEvent == null || showMatchRateSelectionEvent.consume() == null) {
                    return;
                }
                showMatchRateSelection(state.getIraContribution());
            }

            @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
            public boolean onBackPressed() {
                if (getMode() == CreateTransferViewState.Mode.REVIEW) {
                    getDuxo().enterEditMode();
                    return true;
                }
                return super.onBackPressed();
            }

            @Override // androidx.fragment.app.Fragment
            public void onActivityResult(int requestCode, int resultCode, Intent data) {
                if (requestCode == DEBIT_CARD_LINKING_REQUEST_CODE && resultCode == -1) {
                    getDuxo().onAccountRowClicked(TransferAccountDirection.SOURCE);
                } else {
                    super.onActivityResult(requestCode, resultCode, data);
                }
            }

            @Override // com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.Callbacks
            public void onContentFailure(Throwable throwable) throws Throwable {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                getDuxo().enterEditMode();
                if (Throwables.isNetworkRelated(throwable)) {
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C30065R.id.dialog_id_transfer_account_row_error).setTitle(C30065R.string.transfer_account_row_error_dialog_title, new Object[0]).setMessage(C30065R.string.transfer_account_row_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "accountRowContentFailure", false, 4, null);
                    return;
                }
                throw throwable;
            }

            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof GenericAction.Deeplink) {
                    return ActionHandlingFragment2.handleDeeplink$default(this, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
                }
                if (action instanceof GenericAction.Dismiss) {
                    setSheetListener(null);
                    return true;
                }
                if (action instanceof GenericAction.InfoAlert) {
                    SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), this, (1016 & 8) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAlertKt.presentSduiAlertSheet$lambda$0((String) obj);
                        }
                    } : null, (1016 & 16) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiAlertKt.presentSduiAlertSheet$lambda$1((String) obj);
                        }
                    } : null, (1016 & 32) != 0 ? new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    } : null, (1016 & 64) != 0 ? false : false, (1016 & 128) != 0 ? false : true, (1016 & 256) != 0, (1016 & 512) != 0 ? null : null);
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure2
            public void onInfoButtonClicked(CreateTransferDisclosure.Action action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof CreateTransferDisclosure.Action.IraDistributionTaxWithholdingBottomSheet) {
                    onIraTaxWithholdingClicked(((CreateTransferDisclosure.Action.IraDistributionTaxWithholdingBottomSheet) action).getWithholding());
                    return;
                }
                if (!(action instanceof CreateTransferDisclosure.Action.LimitsHubDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_LIMIT_HUB, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "limit_disclaimer_footer", null, 4, null), null, null, false, 56, null);
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, LimitsHubDetails.INSTANCE, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            }

            @Override // com.robinhood.android.transfers.p271ui.max.CreateTransferDisclosure2
            public void onLinkClicked(String url) {
                WebUtils.viewUrl$default(getContext(), url, 0, 4, (Object) null);
            }

            @Override // com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.Callbacks
            public void onEditIraDistributionTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
                Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
                Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
                getDuxo().setCustomIraDistributionTaxWithholding(federalWithholdingPercent, stateWithholdingPercent);
            }

            @Override // com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.Callbacks
            public void onEditIraDistributionWithdrawalAmount() {
                getDuxo().enterEditMode();
            }

            @Override // com.robinhood.android.transfers.p271ui.max.IraTransferInfo
            public void onIraContributionTypeClicked(TransferAccount transferAccount, IraContributionType contributionType) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                Intrinsics.checkNotNullParameter(contributionType, "contributionType");
                NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditContributionType(transferAccount, contributionType), null, 2, null), null, false, 6, null);
            }

            @Override // com.robinhood.android.transfers.p271ui.max.IraTransferInfo
            public void onIraTaxYearClicked(TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW), null, 2, null), null, false, 6, null);
            }

            @Override // com.robinhood.android.transfers.p271ui.max.IraTransferInfo2
            public void onDistributionTypeClicked(TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                this.iraDistributionQuestionnaireLauncher.launch(new IraDistributionQuestionnaireLaunchMode.EditDistributionType(transferAccount));
            }

            @Override // com.robinhood.android.transfers.p271ui.max.IraTransferInfo2
            public void onIraTaxWithholdingClicked(ApiIraDistributionTaxWithholding withholding) {
                Intrinsics.checkNotNullParameter(withholding, "withholding");
                IraDistributionTaxWithholdingBottomSheetFragment iraDistributionTaxWithholdingBottomSheetFragment = (IraDistributionTaxWithholdingBottomSheetFragment) IraDistributionTaxWithholdingBottomSheetFragment.INSTANCE.newInstance((Parcelable) new IraDistributionTaxWithholdingBottomSheetFragment.Args(withholding, false));
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                iraDistributionTaxWithholdingBottomSheetFragment.show(childFragmentManager, "ira-distribution-tax-withholding");
            }

            private final void showMatchRateSelection(IraContributionQuestionnaireResult.IraContribution iraContribution) {
                ApiMatchRateSelection6 apiMatchRateSelection6;
                IraContributionType iraContributionType = iraContribution != null ? iraContribution.getIraContributionType() : null;
                if ((iraContributionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[iraContributionType.ordinal()]) == 1) {
                    apiMatchRateSelection6 = ApiMatchRateSelection6.CONTRIBUTION;
                } else {
                    apiMatchRateSelection6 = ApiMatchRateSelection6.INDIRECT_ROLLOVER;
                }
                NavigationActivityResultContract3.launch$default(this.matchRateSelectionLauncher, new RetirementMatchRateSelection(apiMatchRateSelection6), null, false, 6, null);
            }

            @Override // com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheet.Callbacks
            public void launchIncomingWires() {
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.INCOMING, null, 2, null), null, false, null, null, 60, null);
            }

            @Override // com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheet.Callbacks
            public void onActionTriggeredForInstantRestrictionBottomSheet(DisplayRTPUpsellAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (!(action instanceof DisplayRTPUpsellAction.Confirm)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Non-confirm action " + action + " detected for instant restriction bottom sheet!"), false, null, 4, null);
                }
                getDuxo().continueTransaction(true);
            }

            @Override // com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheet.Callbacks
            public void onDebitCardActionTriggered() {
                getDuxo().handleDebitCardAction();
            }

            @Override // com.robinhood.android.incentives.wonka.TransferInteractionHandler
            public void onTransferContinueRequested() {
                getDuxo().continueTransaction(true);
            }

            @Override // com.robinhood.android.incentives.wonka.TransferInteractionHandler
            public void onTransferExitRequested() {
                requireActivity().finish();
            }

            /* compiled from: CreateTransferFragment.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferFragment;", "Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Args;", "<init>", "()V", "TAG_IRA_DISTRIBUTION_TAX_WITHHOLDING", "", "MENU_OF_OPTIONS_INITIAL_SCREEN_SOURCE", "DEBIT_CARD_LINKING_REQUEST_CODE", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements FragmentWithArgsCompanion<CreateTransferFragment, BaseCreateTransferFragment.Args> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
                public BaseCreateTransferFragment.Args getArgs(CreateTransferFragment createTransferFragment) {
                    return (BaseCreateTransferFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createTransferFragment);
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
                public CreateTransferFragment newInstance(BaseCreateTransferFragment.Args args) {
                    return (CreateTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
                public void setArgs(CreateTransferFragment createTransferFragment, BaseCreateTransferFragment.Args args) {
                    FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createTransferFragment, args);
                }
            }

            @Override // com.robinhood.android.transfers.p271ui.p272v2.alerts.ValidationAlertCallbacks
            public void onAlertSelected(boolean leavingEditMode, TransferActionDto action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.getType() == TransferActionTypeDto.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE) {
                    getDuxo().triggerNavigationToFullWithdrawal();
                } else if (action.getType() == TransferActionTypeDto.TRANSFER_ACTION_TYPE_EDIT_AMOUNT) {
                    getDuxo().clearCreatingTransfer();
                    getDuxo().enterEditMode();
                }
            }
        }

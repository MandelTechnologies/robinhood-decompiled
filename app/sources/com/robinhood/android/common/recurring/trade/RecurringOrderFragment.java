package com.robinhood.android.common.recurring.trade;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.amount.RhPercentageInputView;
import com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderBinding;
import com.robinhood.android.common.recurring.databinding.MergeRecurringOrderBinding;
import com.robinhood.android.common.recurring.trade.RecurringOrderExplanationBottomSheetFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.RebrandBackgroundOverlay;
import com.robinhood.android.designsystem.style.RebrandPrimaryToolbarOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.recurring.contracts.RecurringDialogFragmentKeys;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.transfers.contracts.CreateRetirementContributionsDialogFragmentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionLimitRemaining;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import contracts.crypto.trade.proto.p431v1.CryptoDisclosuresService;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequestDto;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresResponseDto;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import rh_server_driven_ui.p531v1.MarkdownTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: RecurringOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ¡\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u0001¡\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH\u0016J\u0012\u0010n\u001a\u00020g2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u0010\u0010q\u001a\u00020g2\u0006\u0010r\u001a\u00020sH\u0016J\u0010\u0010t\u001a\u00020g2\u0006\u0010r\u001a\u00020sH\u0002J\u001a\u0010u\u001a\u00020g2\u0006\u0010v\u001a\u00020G2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\b\u0010w\u001a\u00020gH\u0016J\b\u0010x\u001a\u00020gH\u0016J\b\u0010y\u001a\u00020gH\u0016J\u0010\u0010z\u001a\u00020g2\u0006\u0010{\u001a\u00020\u0002H\u0002J\b\u0010|\u001a\u00020gH\u0002J\b\u0010}\u001a\u00020gH\u0002J\b\u0010~\u001a\u00020\u001fH\u0016J\b\u0010\u007f\u001a\u00020gH\u0016J\u0011\u0010\u0080\u0001\u001a\u00020S2\u0006\u0010{\u001a\u00020\u0002H\u0016J\t\u0010\u0081\u0001\u001a\u00020gH\u0016J\t\u0010\u0082\u0001\u001a\u00020gH\u0016J\t\u0010\u0083\u0001\u001a\u00020gH\u0016J\t\u0010\u0084\u0001\u001a\u00020gH\u0016J\t\u0010\u0085\u0001\u001a\u00020gH\u0016J\t\u0010\u0086\u0001\u001a\u00020gH\u0016J\t\u0010\u0087\u0001\u001a\u00020gH\u0016J\u0013\u0010\u0088\u0001\u001a\u00020g2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002J\t\u0010\u008b\u0001\u001a\u00020gH\u0002J\u001d\u0010\u008c\u0001\u001a\u00020\u001f2\u0007\u0010\u008d\u0001\u001a\u00020Q2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010pH\u0016J\u001d\u0010\u008f\u0001\u001a\u00020\u001f2\u0007\u0010\u008d\u0001\u001a\u00020Q2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010pH\u0016J\u001f\u0010\u0090\u0001\u001a\u00020\u001f2\u0007\u0010\u008d\u0001\u001a\u00020Q2\u000b\b\u0002\u0010\u008e\u0001\u001a\u0004\u0018\u00010pH\u0002J\u0013\u0010\u0091\u0001\u001a\u00020g2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u0094\u0001\u001a\u00020g2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u0095\u0001\u001a\u00020g2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020g2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\u0012\u0010\u0097\u0001\u001a\u00020g2\u0007\u0010\u0098\u0001\u001a\u00020\u001fH\u0002J\u0013\u0010\u0099\u0001\u001a\u00020g2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\t\u0010\u009a\u0001\u001a\u00020gH\u0002J\t\u0010\u009b\u0001\u001a\u00020gH\u0002J\t\u0010\u009c\u0001\u001a\u00020gH\u0002J\t\u0010\u009d\u0001\u001a\u00020gH\u0002J\t\u0010\u009e\u0001\u001a\u00020gH\u0002J\t\u0010\u009f\u0001\u001a\u00020gH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0003\u0018\u00010+j\u0004\u0018\u0001`-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b;\u0010<R+\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010)\u001a\u0004\bL\u0010MR\u000e\u0010O\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020QX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020QX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010XR\u0014\u0010[\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001b\u0010_\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010)\u001a\u0004\b_\u0010AR\u0014\u0010a\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010AR\u001b\u0010b\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010)\u001a\u0004\bb\u0010AR\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010j\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010AR\u0014\u0010l\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bm\u0010A¨\u0006¢\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderState;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "<init>", "()V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "showDropFromRecurringCreationSurveyPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowDropFromRecurringCreationSurveyPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowDropFromRecurringCreationSurveyPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "isUsRecurringVTExperimentEnabled", "", "cryptoDisclosuresMicrogramApp", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getCryptoDisclosuresMicrogramApp", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "cryptoDisclosuresService", "Lcontracts/crypto/trade/proto/v1/CryptoDisclosuresService;", "getCryptoDisclosuresService", "()Lcontracts/crypto/trade/proto/v1/CryptoDisclosuresService;", "cryptoDisclosuresService$delegate", "Lkotlin/Lazy;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "callbacks", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "fragmentBindings", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBinding;", "getFragmentBindings", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBinding;", "fragmentBindings$delegate", "mergeBindings", "Lcom/robinhood/android/common/recurring/databinding/MergeRecurringOrderBinding;", "getMergeBindings", "()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringOrderBinding;", "mergeBindings$delegate", "<set-?>", "actionOrderTypeVisible", "getActionOrderTypeVisible", "()Z", "setActionOrderTypeVisible", "(Z)V", "actionOrderTypeVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "actionOrderTypeContainer", "Landroid/view/View;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "duxo", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/trade/RecurringOrderDuxo;", "duxo$delegate", "reviewOnly", "reviewingConstraintLayoutRes", "", "reviewingConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "initialConstraints", "brokerageCashEditToolbarButton", "initialLayoutRes", "getInitialLayoutRes", "()I", "contentRes", "getContentRes", "screenName", "", "getScreenName", "()Ljava/lang/String;", "isCryptoOrder", "isCryptoOrder$delegate", "isCrypto", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "isBrokerageCashTransfer$delegate", "editTextGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onAttach", "", "context", "Landroid/content/Context;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "usePrimaryColorBackground", "getUsePrimaryColorBackground", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "configurePaycheckRecurringBrokerageCashToolbar", "onViewCreated", "view", "onDestroyView", "onStart", "onResume", "updateViewForRebrand", "formState", "bindDollarAmountInput", "bindPercentageAmountInput", "onBackPressed", "onFormStateUpdated", "getConstraintsForState", "validateAndReviewOrder", "performSubmitOrder", "launchSourceOfFundsSelection", "overrideBuyingPowerCheck", "launchRhsConversion", "launchCryptoSignupFlow", "launchDepositFlow", "showAmountLabelExplanationDialog", "explanationModel", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$Dialog;", "showPaycheckDisclosureDialog", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "onLearnMoreClicked", "setState", "viewState", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState;", "setReviewMessage", "updateDisclosure", "updateReviewButtonVisibility", "setIsActionOrderTypeVisible", "isVisible", "updateAmountLabel", "requestEditTextFocus", "logScreenAppear", "logReviewTap", "logAmountEdit", "logOrderSubmit", "logOrderFailure", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderFragment extends BaseOrderFragment<RecurringOrderState> implements RecurringOrderValidationFailureResolver {
    private static final String LEARN_MORE_EQUITY_URL = "https://robinhood.com/us/en/support/articles/recurring-investments/";
    private static final String LEARN_MORE_RESOURCE_PASSTHROUGH_KEY = "learnMoreResource";
    private View actionOrderTypeContainer;

    /* renamed from: actionOrderTypeVisible$delegate, reason: from kotlin metadata */
    private final Interfaces3 actionOrderTypeVisible;
    private View brokerageCashEditToolbarButton;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private RecurringOrderConfiguration configuration;
    private final int contentRes;

    /* renamed from: cryptoDisclosuresService$delegate, reason: from kotlin metadata */
    private final Lazy cryptoDisclosuresService;
    public CryptoExperimentsStore cryptoExperimentsStore;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private ViewTreeObserver.OnGlobalLayoutListener editTextGlobalLayoutListener;
    public EventLogger eventLogger;
    private Validator.Failure<? super RecurringOrderContext, ? super RecurringOrderValidationFailureResolver> failure;

    /* renamed from: fragmentBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBindings;
    private final ConstraintSet initialConstraints;
    private final int initialLayoutRes;

    /* renamed from: isBrokerageCashTransfer$delegate, reason: from kotlin metadata */
    private final Lazy isBrokerageCashTransfer;

    /* renamed from: isCryptoOrder$delegate, reason: from kotlin metadata */
    private final Lazy isCryptoOrder;
    private boolean isUsRecurringVTExperimentEnabled;

    /* renamed from: mergeBindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 mergeBindings;
    public MicrogramManager microgramManager;
    private boolean reviewOnly;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;

    @ShowDropFromRecurringCreationSurvey
    public BooleanPreference showDropFromRecurringCreationSurveyPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderFragment.class, "fragmentBindings", "getFragmentBindings()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderFragment.class, "mergeBindings", "getMergeBindings()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringOrderBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringOrderFragment.class, "actionOrderTypeVisible", "getActionOrderTypeVisible()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "launchSourceOfFundsSelection", "", "amount", "Lcom/robinhood/models/util/Money;", "startOrderConfigurationSelection", "accountNumber", "", "editRecurringOrder", "onReviewingStateChanged", "isReviewing", "", "onAmountChanged", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks {
        void editRecurringOrder(String accountNumber);

        void launchSourceOfFundsSelection(Money amount);

        void onAmountChanged(InvestmentScheduleAmount amount);

        void onReviewingStateChanged(boolean isReviewing);

        void startOrderConfigurationSelection(String accountNumber);
    }

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AmountType.values().length];
            try {
                iArr[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringOrderState.values().length];
            try {
                iArr2[RecurringOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecurringOrderState.REVIEWING_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecurringOrderState.REVIEWING_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected boolean getUsePrimaryColorBackground() {
        return true;
    }

    public RecurringOrderFragment() {
        super(RecurringOrderState.EDITING);
        this.cryptoDisclosuresService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderFragment.cryptoDisclosuresService_delegate$lambda$0(this.f$0);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.fragmentBindings = ViewBinding5.viewBinding(this, RecurringOrderFragment2.INSTANCE);
        this.mergeBindings = ViewBinding5.viewBinding(this, RecurringOrderFragment3.INSTANCE);
        this.actionOrderTypeVisible = BindSavedState2.savedBoolean(this, true).provideDelegate(this, $$delegatedProperties[3]);
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderDuxo.class);
        this.reviewingConstraintLayoutRes = C11595R.layout.fragment_recurring_order_reviewing;
        this.reviewingConstraints = new ConstraintSet();
        this.initialConstraints = new ConstraintSet();
        this.initialLayoutRes = C11595R.layout.fragment_recurring_order;
        this.contentRes = C11595R.layout.merge_recurring_order;
        this.isCryptoOrder = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RecurringOrderFragment.isCryptoOrder_delegate$lambda$1(this.f$0));
            }
        });
        this.isBrokerageCashTransfer = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RecurringOrderFragment.isBrokerageCashTransfer_delegate$lambda$2(this.f$0));
            }
        });
    }

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
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

    public final BooleanPreference getShowDropFromRecurringCreationSurveyPref() {
        BooleanPreference booleanPreference = this.showDropFromRecurringCreationSurveyPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showDropFromRecurringCreationSurveyPref");
        return null;
    }

    public final void setShowDropFromRecurringCreationSurveyPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showDropFromRecurringCreationSurveyPref = booleanPreference;
    }

    private final MicrogramManager2 getCryptoDisclosuresMicrogramApp() {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(getMicrogramManager(), getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-disclosures", null, 2, null), null, 2, null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoDisclosuresService getCryptoDisclosuresService() {
        return (CryptoDisclosuresService) this.cryptoDisclosuresService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDisclosuresService cryptoDisclosuresService_delegate$lambda$0(RecurringOrderFragment recurringOrderFragment) {
        return (CryptoDisclosuresService) recurringOrderFragment.getCryptoDisclosuresMicrogramApp().getComponent().getServiceLocator().getClient(CryptoDisclosuresService.class);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRecurringOrderBinding getFragmentBindings() {
        Object value = this.fragmentBindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeRecurringOrderBinding getMergeBindings() {
        Object value = this.mergeBindings.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRecurringOrderBinding) value;
    }

    private final boolean getActionOrderTypeVisible() {
        return ((Boolean) this.actionOrderTypeVisible.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    private final void setActionOrderTypeVisible(boolean z) {
        this.actionOrderTypeVisible.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    private final RecurringOrderDuxo getDuxo() {
        return (RecurringOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return this.initialLayoutRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.EQUITY_ORDER_ENTRY.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCryptoOrder() {
        return ((Boolean) this.isCryptoOrder.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCryptoOrder_delegate$lambda$1(RecurringOrderFragment recurringOrderFragment) {
        return ((RecurringOrderArgs) INSTANCE.getArgs((Fragment) recurringOrderFragment)).getInvestmentTarget().isCrypto();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return isCryptoOrder();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((Boolean) this.isBrokerageCashTransfer.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBrokerageCashTransfer_delegate$lambda$2(RecurringOrderFragment recurringOrderFragment) {
        return ((RecurringOrderArgs) INSTANCE.getArgs((Fragment) recurringOrderFragment)).getInvestmentTarget().isBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        } else {
            putAchromaticOverlay(scarletContextWrapper);
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), RebrandBackgroundOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecurringOrderConfiguration orderConfiguration = ((RecurringOrderArgs) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration();
        if (orderConfiguration == null) {
            throw new IllegalStateException("configuration cannot be null in arguments to recurring order fragment");
        }
        this.configuration = orderConfiguration;
        setIsActionOrderTypeVisible(orderConfiguration.getShowToolbarAction());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        RecurringOrderConfiguration orderConfiguration = ((RecurringOrderArgs) companion.getArgs((Fragment) this)).getOrderConfiguration();
        if ((orderConfiguration.getFrequency() == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK && orderConfiguration.getDirectDepositRelationshipId() == null) || orderConfiguration.getFromPaycheckRecurringInvocation()) {
            if (((RecurringOrderArgs) companion.getArgs((Fragment) this)).getInvestmentTarget().getTargetType() == ApiAssetType.BROKERAGE_CASH) {
                configurePaycheckRecurringBrokerageCashToolbar(toolbar);
                return;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
        if (viewGroup == null) {
            RhToolbar.addCustomView$default(toolbar, C20649R.layout.include_equity_order_toolbar, false, 0, 6, null);
            View viewFindViewById = toolbar.findViewById(C20649R.id.equity_order_toolbar_content);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) viewFindViewById;
        }
        View viewFindViewById2 = viewGroup.findViewById(C20649R.id.action_order_types_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById2).setText(getResources().getString(C11595R.string.order_create_title_recurring));
        View viewFindViewById3 = viewGroup.findViewById(C20649R.id.action_order_types);
        this.actionOrderTypeContainer = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(getActionOrderTypeVisible() ? 0 : 8);
        }
    }

    private final void configurePaycheckRecurringBrokerageCashToolbar(RhToolbar toolbar) {
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C11595R.id.brokerage_cash_order_toolbar_content);
        if (viewGroup == null) {
            View viewFindViewById = RhToolbar.addCustomView$default(toolbar, C11595R.layout.include_toolbar_brokerage_cash_review, false, 0, 6, null).findViewById(C11595R.id.brokerage_cash_order_toolbar_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            viewGroup = (ViewGroup) viewFindViewById;
        }
        View viewFindViewById2 = viewGroup.findViewById(C11595R.id.brokerage_cash_edit);
        Intrinsics.checkNotNull(viewFindViewById2);
        viewFindViewById2.setVisibility(8);
        View viewFindViewById3 = viewFindViewById2.findViewById(C11595R.id.brokerage_cash_edit_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById3, new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderFragment.configurePaycheckRecurringBrokerageCashToolbar$lambda$8$lambda$7(this.f$0);
            }
        });
        this.brokerageCashEditToolbarButton = viewFindViewById2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configurePaycheckRecurringBrokerageCashToolbar$lambda$8$lambda$7(RecurringOrderFragment recurringOrderFragment) {
        recurringOrderFragment.getDuxo().setFormState(RecurringOrderState.EDITING);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
        RhTextView recurringOrderCreateScheduleEditInvestmentBtn = getMergeBindings().recurringOrderCreateScheduleEditInvestmentBtn;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleEditInvestmentBtn, "recurringOrderCreateScheduleEditInvestmentBtn");
        Companion companion = INSTANCE;
        recurringOrderCreateScheduleEditInvestmentBtn.setVisibility(((RecurringOrderArgs) companion.getArgs((Fragment) this)).getOrderConfiguration().getFrequency() != ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK ? 0 : 8);
        if (isCryptoOrder()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderArgs) companion.getArgs((Fragment) this)).getOrderConfiguration().getAmountType().ordinal()];
            if (i == 1) {
                getMergeBindings().recurringOrderCreateAmountLabelTxt.setText(C11595R.string.order_create_recurring_amount_label_crypto);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.editTextGlobalLayoutListener;
        if (onGlobalLayoutListener != null) {
            getFragmentBindings().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.editTextGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment.onViewCreated.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (!RecurringOrderFragment.this.isResumed() || RecurringOrderFragment.this.getFormState().getIsReviewingState()) {
                    return;
                }
                RecurringOrderFragment.this.requestEditTextFocus();
            }
        };
        getFragmentBindings().getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this.editTextGlobalLayoutListener);
        RhMoneyInputView rhMoneyInputView = getMergeBindings().recurringOrderCreateAmountDollarValue;
        RhTextView recurringOrderCreateAmountLabelTxt = getMergeBindings().recurringOrderCreateAmountLabelTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateAmountLabelTxt, "recurringOrderCreateAmountLabelTxt");
        rhMoneyInputView.setAccessibilityLabel(recurringOrderCreateAmountLabelTxt);
        updateViewForRebrand(getFormState());
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.onViewCreated$lambda$10(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(RecurringOrderFragment recurringOrderFragment, DayNightOverlay it) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(it, "it");
        recurringOrderFragment.updateViewForRebrand(recurringOrderFragment.getFormState());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.editTextGlobalLayoutListener;
        if (onGlobalLayoutListener != null) {
            getFragmentBindings().getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        logScreenAppear();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C117601(null));
    }

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderFragment$onStart$1", m3645f = "RecurringOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$onStart$1 */
    static final class C117601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117601(Continuation<? super C117601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderFragment.this.new C117601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = RecurringOrderFragment.this.getCryptoExperimentsStore().streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringOrderFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderFragment$onStart$1$1", m3645f = "RecurringOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RecurringOrderFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringOrderFragment recurringOrderFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.isUsRecurringVTExperimentEnabled = this.Z$0;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((RecurringOrderArgs) companion.getArgs((Fragment) this)).getOrderConfiguration().getAmountType().ordinal()];
        if (i == 1) {
            bindDollarAmountInput();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bindPercentageAmountInput();
        }
        if (((RecurringOrderArgs) companion.getArgs((Fragment) this)).getOrderConfiguration().getReviewOnly()) {
            getDuxo().setFormState(RecurringOrderState.REVIEWING_ORDER);
            this.reviewOnly = true;
        }
        getDuxo().setRefId(getCallbacks().getOrderUuid());
        Observable<RecurringOrderViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C117571(this));
        Observable<RecurringOrderViewState> states = getDuxo().getStates();
        final C117582 c117582 = new PropertyReference1Impl() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment.onResume.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RecurringOrderViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged2 = states.map(new Function(c117582) { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c117582, "function");
                this.function = c117582;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.onResume$lambda$12(this.f$0, (RecurringOrderState) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment.onResume.4
            @Override // io.reactivex.functions.Function
            public final InvestmentScheduleAmount apply(RecurringOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAmount();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.onResume$lambda$13(this.f$0, (InvestmentScheduleAmount) obj);
            }
        });
    }

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$onResume$1 */
    /* synthetic */ class C117571 extends FunctionReferenceImpl implements Function1<RecurringOrderViewState, Unit> {
        C117571(Object obj) {
            super(1, obj, RecurringOrderFragment.class, "setState", "setState(Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecurringOrderViewState recurringOrderViewState) throws Resources.NotFoundException {
            invoke2(recurringOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecurringOrderViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecurringOrderFragment) this.receiver).setState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(RecurringOrderFragment recurringOrderFragment, RecurringOrderState recurringOrderState) {
        Intrinsics.checkNotNull(recurringOrderState);
        recurringOrderFragment.setFormState(recurringOrderState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(RecurringOrderFragment recurringOrderFragment, InvestmentScheduleAmount investmentScheduleAmount) {
        Callbacks callbacks = recurringOrderFragment.getCallbacks();
        Intrinsics.checkNotNull(investmentScheduleAmount);
        callbacks.onAmountChanged(investmentScheduleAmount);
        return Unit.INSTANCE;
    }

    private final void updateViewForRebrand(RecurringOrderState formState) throws Resources.NotFoundException {
        Toolbar toolbar;
        Tuples2 tuples2M3642to;
        Toolbar toolbar2;
        Drawable navigationIcon;
        Toolbar toolbar3;
        getFragmentBindings().content.setBackgroundColor(requireContext().getColor(C20690R.color.mobius_white));
        ConstraintLayout constraintLayout = getFragmentBindings().content;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1)));
        if (formState == RecurringOrderState.EDITING) {
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            ThemedResourceReference<Integer> color_background_1 = themeAttributes.getCOLOR_BACKGROUND_1();
            ThemedResourceReference<Integer> color_foreground_1 = themeAttributes.getCOLOR_FOREGROUND_1();
            requireBaseActivity().overrideSystemBarsStyle(DayNightChanges.isDay(getScarletManager()));
            ScarletManager2.overrideAttribute(getRoot(), R.attr.backgroundTint, color_background_1);
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null && (toolbar3 = rhToolbar.getToolbar()) != null) {
                ScarletManager2.overrideAttribute(toolbar3, R$attr.colorControlNormal, color_foreground_1);
            }
            ScarletManager.removeOverlay$default(getScarletManager(), RebrandPrimaryToolbarOverlay.INSTANCE.getPriority(), null, 2, null);
        } else {
            ThemeAttributes themeAttributes2 = ThemeAttributes.INSTANCE;
            ThemedResourceReference<Integer> color_background_primary = themeAttributes2.getCOLOR_BACKGROUND_PRIMARY();
            ThemedResourceReference<Integer> color_on_background_primary = themeAttributes2.getCOLOR_ON_BACKGROUND_PRIMARY();
            requireBaseActivity().overrideSystemBarsStyle(false);
            ScarletManager2.overrideAttribute(getRoot(), R.attr.backgroundTint, color_background_primary);
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null && (toolbar = rhToolbar2.getToolbar()) != null) {
                ScarletManager2.overrideAttribute(toolbar, R$attr.colorControlNormal, color_on_background_primary);
            }
            ScarletManager.putOverlay$default(getScarletManager(), RebrandPrimaryToolbarOverlay.INSTANCE, null, 2, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
        if (i == 1) {
            tuples2M3642to = Tuples4.m3642to(Boolean.FALSE, Integer.valueOf(C20690R.attr.colorForeground1));
        } else if (i == 2) {
            tuples2M3642to = Tuples4.m3642to(Boolean.TRUE, Integer.valueOf(C20690R.attr.colorOnBackgroundPrimary));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            tuples2M3642to = Tuples4.m3642to(Boolean.TRUE, Integer.valueOf(C20690R.attr.colorForeground1));
        }
        boolean zBooleanValue = ((Boolean) tuples2M3642to.component1()).booleanValue();
        int iIntValue = ((Number) tuples2M3642to.component2()).intValue();
        if (zBooleanValue) {
            requireBaseActivity().showBackArrowIcon();
        } else {
            requireBaseActivity().showCloseIcon();
        }
        RhToolbar rhToolbar3 = requireBaseActivity().getRhToolbar();
        if (rhToolbar3 != null && (toolbar2 = rhToolbar3.getToolbar()) != null && (navigationIcon = toolbar2.getNavigationIcon()) != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            navigationIcon.setTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext2, iIntValue)));
        }
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        int themeColor = ThemeColors.getThemeColor(contextRequireContext3, C20690R.attr.colorOnBackgroundPrimary);
        getFragmentBindings().swipeHint.setTextColor(themeColor);
        RhTextView swipeHint = getFragmentBindings().swipeHint;
        Intrinsics.checkNotNullExpressionValue(swipeHint, "swipeHint");
        TextViewsKt.tintDrawables(swipeHint, themeColor);
    }

    private final void bindDollarAmountInput() {
        RhMoneyInputView rhMoneyInputView = getMergeBindings().recurringOrderCreateAmountDollarValue;
        rhMoneyInputView.setSelection(getMergeBindings().recurringOrderCreateAmountDollarValue.getLength());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(rhMoneyInputView.getAmountObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.bindDollarAmountInput$lambda$16$lambda$14(this.f$0, (Optional) obj);
            }
        });
        Observable observableTake = ObservablesAndroid.observeOnMainThread(rhMoneyInputView.getAmountObservable()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.bindDollarAmountInput$lambda$16$lambda$15(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDollarAmountInput$lambda$16$lambda$14(RecurringOrderFragment recurringOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        recurringOrderFragment.getDuxo().setAmount((Money) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDollarAmountInput$lambda$16$lambda$15(RecurringOrderFragment recurringOrderFragment, Optional optional) {
        recurringOrderFragment.logAmountEdit();
        return Unit.INSTANCE;
    }

    private final void bindPercentageAmountInput() {
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getMergeBindings().recurringOrderCreateAmountPercentageValue.getPercentageObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.bindPercentageAmountInput$lambda$17(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindPercentageAmountInput$lambda$17(RecurringOrderFragment recurringOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        recurringOrderFragment.getDuxo().setPercentage((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.reviewOnly) {
            return false;
        }
        getShowDropFromRecurringCreationSurveyPref().set(true);
        if (getReviewing()) {
            getDuxo().setFormState(RecurringOrderState.EDITING);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() throws Resources.NotFoundException {
        super.onFormStateUpdated();
        updateViewForRebrand(getFormState());
        RdsButton rdsButton = getFragmentBindings().reviewBtn;
        StringResource reviewBtnText = getFormState().getReviewBtnText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsButton.setText(reviewBtnText.getText(resources));
        int i = WhenMappings.$EnumSwitchMapping$1[getFormState().ordinal()];
        if (i == 1 || i == 2) {
            setIsActionOrderTypeVisible(!getReviewing());
            RhTextView orderSummaryHeader = getMergeBindings().orderSummaryHeader;
            Intrinsics.checkNotNullExpressionValue(orderSummaryHeader, "orderSummaryHeader");
            orderSummaryHeader.setVisibility(getReviewing() ? 0 : 8);
            RhTextView orderReviewTxt = getMergeBindings().orderReviewTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewTxt, "orderReviewTxt");
            orderReviewTxt.setVisibility(getReviewing() ? 0 : 8);
            RhTextView recurringOrderCreateScheduleEditInvestmentBtn = getMergeBindings().recurringOrderCreateScheduleEditInvestmentBtn;
            Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleEditInvestmentBtn, "recurringOrderCreateScheduleEditInvestmentBtn");
            recurringOrderCreateScheduleEditInvestmentBtn.setVisibility((getReviewing() || ((RecurringOrderArgs) INSTANCE.getArgs((Fragment) this)).getOrderConfiguration().getFrequency() == ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) ? false : true ? 0 : 8);
            RdsNumpadView numpad = getFragmentBindings().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
            numpad.setVisibility(getReviewing() ? 8 : 0);
            View view = this.brokerageCashEditToolbarButton;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setIsActionOrderTypeVisible(true);
            RhTextView orderSummaryHeader2 = getMergeBindings().orderSummaryHeader;
            Intrinsics.checkNotNullExpressionValue(orderSummaryHeader2, "orderSummaryHeader");
            orderSummaryHeader2.setVisibility(8);
            RhTextView orderReviewTxt2 = getMergeBindings().orderReviewTxt;
            Intrinsics.checkNotNullExpressionValue(orderReviewTxt2, "orderReviewTxt");
            orderReviewTxt2.setVisibility(8);
            RhTextView recurringOrderCreateScheduleEditInvestmentBtn2 = getMergeBindings().recurringOrderCreateScheduleEditInvestmentBtn;
            Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleEditInvestmentBtn2, "recurringOrderCreateScheduleEditInvestmentBtn");
            recurringOrderCreateScheduleEditInvestmentBtn2.setVisibility(8);
            RdsNumpadView numpad2 = getFragmentBindings().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad2, "numpad");
            numpad2.setVisibility(8);
            View view2 = this.brokerageCashEditToolbarButton;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        getCallbacks().onReviewingStateChanged(getReviewing());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(RecurringOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$1[formState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.reviewingConstraints;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return this.initialConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        logReviewTap();
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        logOrderSubmit();
        getDuxo().submit();
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver
    public void launchSourceOfFundsSelection() {
        getCallbacks().launchSourceOfFundsSelection(getMergeBindings().recurringOrderCreateAmountDollarValue.getAmount());
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver
    public void overrideBuyingPowerCheck() {
        getDuxo().overrideBuyingPowerCheck();
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver
    public void launchRhsConversion() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhsConversion(true), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver
    public void launchCryptoSignupFlow() {
        Navigator navigator = getNavigator();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new CryptoUpgradeIntentKey(false, null, 3, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver
    public void launchDepositFlow() {
        Transfer transfer = new Transfer(new TransferContext.Normal(TransferDirection.DEPOSIT, null, null, 6, null));
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
    }

    private final void showAmountLabelExplanationDialog(AmountLabelExplanationUiModel.Dialog explanationModel) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(getId()).setTitle(explanationModel.getTitle(), new Object[0]);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder message = title.setMessage(explanationModel.getText(resources));
        if (explanationModel.getLearnMore() != null) {
            if (this.isUsRecurringVTExperimentEnabled) {
                message.setPositiveButton(C11048R.string.general_label_got_it, new Object[0]);
                message.setNegativeButton(C11048R.string.general_action_learn_more, new Object[0]);
            } else {
                message.setPositiveButton(C11048R.string.general_action_learn_more, new Object[0]);
                message.setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            }
            Bundle bundle = new Bundle();
            bundle.putInt(LEARN_MORE_RESOURCE_PASSTHROUGH_KEY, explanationModel.getLearnMore().intValue());
            message.setPassthroughArgs(bundle);
        } else {
            message.setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        }
        RhDialogFragment.Builder theme = message.setTheme(explanationModel.getTheme());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, explanationModel.getTag(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPaycheckDisclosureDialog() {
        int i;
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C11595R.id.dialog_id_paycheck_disclaimer);
        if (isCryptoOrder()) {
            i = C11595R.string.gated_crypto_rhc_recurring_investment_paycheck_crypto_disclosure;
        } else {
            i = C11595R.string.recurring_investment_paycheck_instrument_disclosure;
        }
        RhDialogFragment.Builder theme = id.setMessage(i, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "paycheckDisclaimer", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_equity_recurring_order_validation_failure) {
            Validator.Failure<? super RecurringOrderContext, ? super RecurringOrderValidationFailureResolver> failure = this.failure;
            if (failure != null) {
                failure.onPositiveResponse(this, passthroughArgs);
            }
            this.failure = null;
            if (!isCryptoOrder()) {
                return true;
            }
            RdsNumpadView numpad = getFragmentBindings().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
            numpad.setVisibility(0);
            return true;
        }
        if (this.isUsRecurringVTExperimentEnabled) {
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        return onLearnMoreClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_equity_recurring_order_validation_failure) {
            Validator.Failure<? super RecurringOrderContext, ? super RecurringOrderValidationFailureResolver> failure = this.failure;
            if (failure != null) {
                failure.onNegativeResponse(this, passthroughArgs);
            }
            this.failure = null;
            if (!isCryptoOrder()) {
                return true;
            }
            RdsNumpadView numpad = getFragmentBindings().numpad;
            Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
            numpad.setVisibility(0);
            return true;
        }
        if (this.isUsRecurringVTExperimentEnabled) {
            return onLearnMoreClicked(id, passthroughArgs);
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    static /* synthetic */ boolean onLearnMoreClicked$default(RecurringOrderFragment recurringOrderFragment, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return recurringOrderFragment.onLearnMoreClicked(i, bundle);
    }

    private final boolean onLearnMoreClicked(int id, Bundle passthroughArgs) {
        if (id == C11595R.id.dialog_id_collar_explanation) {
            return WebUtils.viewUrl$default(requireContext(), C11595R.string.collar_explanation_learn_more_url, 0, 4, (Object) null);
        }
        if (id == C11595R.id.dialog_id_collar_fee_explanation) {
            return WebUtils.viewUrl$default(requireContext(), C11595R.string.collar_fee_explanation_learn_more_url, 0, 4, (Object) null);
        }
        Integer numValueOf = passthroughArgs != null ? Integer.valueOf(passthroughArgs.getInt(LEARN_MORE_RESOURCE_PASSTHROUGH_KEY)) : null;
        if (numValueOf != null) {
            return WebUtils.viewUrl$default(requireContext(), numValueOf.intValue(), 0, 4, (Object) null);
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(RecurringOrderViewState viewState) throws Resources.NotFoundException {
        Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> failureConsume;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Resources resources = contextRequireContext.getResources();
        UiEvent<Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver>> validationFailureEvent = viewState.getValidationFailureEvent();
        if (validationFailureEvent != null && (failureConsume = validationFailureEvent.consume()) != null) {
            this.failure = failureConsume;
            logOrderFailure();
            if (isCryptoOrder()) {
                RdsNumpadView numpad = getFragmentBindings().numpad;
                Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
                numpad.setVisibility(8);
            }
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNull(baseActivity);
            RecurringOrderContext recurringOrderContext = viewState.getRecurringOrderContext();
            Intrinsics.checkNotNull(recurringOrderContext);
            failureConsume.showAlert(baseActivity, recurringOrderContext);
        }
        UiEvent<Unit> submitBrokerageCashTransferEvent = viewState.getSubmitBrokerageCashTransferEvent();
        if (submitBrokerageCashTransferEvent != null) {
            submitBrokerageCashTransferEvent.consumeWith(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderFragment.setState$lambda$21(this.f$0, (Unit) obj);
                }
            });
        }
        final String accountNumber = viewState.getAccountNumber();
        View view = this.actionOrderTypeContainer;
        if (view != null) {
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderFragment.setState$lambda$22(accountNumber, this);
                }
            });
        }
        MergeRecurringOrderBinding mergeBindings = getMergeBindings();
        RhMoneyInputView recurringOrderCreateAmountDollarValue = mergeBindings.recurringOrderCreateAmountDollarValue;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateAmountDollarValue, "recurringOrderCreateAmountDollarValue");
        recurringOrderCreateAmountDollarValue.setVisibility(viewState.isDollarAmountInputVisible() ? 0 : 8);
        Money initialDollarAmount = viewState.getInitialDollarAmount();
        if (initialDollarAmount != null) {
            final RhMoneyInputView rhMoneyInputView = mergeBindings.recurringOrderCreateAmountDollarValue;
            new MutablePropertyReference0Impl(rhMoneyInputView) { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$setState$4$2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((RhMoneyInputView) this.receiver).getAmount();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((RhMoneyInputView) this.receiver).setAmount((Money) obj);
                }
            }.set(initialDollarAmount);
        }
        if (viewState.shouldFocusDollarAmountInput()) {
            mergeBindings.recurringOrderCreateAmountDollarValue.requestAmountTextFocus();
        }
        RhPercentageInputView recurringOrderCreateAmountPercentageValue = mergeBindings.recurringOrderCreateAmountPercentageValue;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateAmountPercentageValue, "recurringOrderCreateAmountPercentageValue");
        recurringOrderCreateAmountPercentageValue.setVisibility(viewState.isPercentageInputVisible() ? 0 : 8);
        if (viewState.shouldFocusPercentageInput()) {
            mergeBindings.recurringOrderCreateAmountPercentageValue.requestAmountTextFocus();
        }
        RhTextView recurringOrderCreateScheduleEditInvestmentBtn = mergeBindings.recurringOrderCreateScheduleEditInvestmentBtn;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleEditInvestmentBtn, "recurringOrderCreateScheduleEditInvestmentBtn");
        OnClickListeners.onClick(recurringOrderCreateScheduleEditInvestmentBtn, new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderFragment.setState$lambda$28$lambda$25(accountNumber, this);
            }
        });
        mergeBindings.recurringOrderCreateAmountDollarValue.setAmountEnabled(!viewState.getReviewing());
        mergeBindings.recurringOrderCreateAmountPercentageValue.setAmountEnabled(!viewState.getReviewing());
        RhTextView recurringOrderCreateTitleTxt = mergeBindings.recurringOrderCreateTitleTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateTitleTxt, "recurringOrderCreateTitleTxt");
        Intrinsics.checkNotNull(resources);
        TextViewsKt.setVisibilityText(recurringOrderCreateTitleTxt, viewState.getTitleText(resources));
        RhTextView recurringOrderCreateScheduleFrequencyTxt = mergeBindings.recurringOrderCreateScheduleFrequencyTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleFrequencyTxt, "recurringOrderCreateScheduleFrequencyTxt");
        TextViewsKt.setVisibilityText(recurringOrderCreateScheduleFrequencyTxt, viewState.getFrequencyText(resources));
        RhTextView recurringOrderCreateScheduleStartDateTxt = mergeBindings.recurringOrderCreateScheduleStartDateTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleStartDateTxt, "recurringOrderCreateScheduleStartDateTxt");
        TextViewsKt.setVisibilityText(recurringOrderCreateScheduleStartDateTxt, viewState.getStartDateText(resources));
        RhTextView recurringOrderCreateScheduleSourceOfFundsTxt = mergeBindings.recurringOrderCreateScheduleSourceOfFundsTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleSourceOfFundsTxt, "recurringOrderCreateScheduleSourceOfFundsTxt");
        TextViewsKt.setVisibilityText(recurringOrderCreateScheduleSourceOfFundsTxt, viewState.getSourceOfFundsText(resources));
        RhTextView recurringOrderCreateScheduleBackupPaymentTxt = mergeBindings.recurringOrderCreateScheduleBackupPaymentTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleBackupPaymentTxt, "recurringOrderCreateScheduleBackupPaymentTxt");
        TextViewsKt.setVisibilityText(recurringOrderCreateScheduleBackupPaymentTxt, viewState.getBackupText(resources));
        setReviewMessage(viewState);
        mergeBindings.recurringOrderCreateScheduleLabelTxt.setText(viewState.getRecurringOrderScheduleLabelTxt().getText(resources));
        RhTextView recurringOrderCreateScheduleStartDateTxt2 = mergeBindings.recurringOrderCreateScheduleStartDateTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleStartDateTxt2, "recurringOrderCreateScheduleStartDateTxt");
        recurringOrderCreateScheduleStartDateTxt2.setVisibility(viewState.getRecurringOrderScheduleDetailsVisible() ? 0 : 8);
        RhTextView recurringOrderCreateScheduleSourceOfFundsTxt2 = mergeBindings.recurringOrderCreateScheduleSourceOfFundsTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleSourceOfFundsTxt2, "recurringOrderCreateScheduleSourceOfFundsTxt");
        recurringOrderCreateScheduleSourceOfFundsTxt2.setVisibility(viewState.getRecurringOrderScheduleDetailsVisible() ? 0 : 8);
        RhTextView recurringOrderCreateScheduleBackupPaymentTxt2 = mergeBindings.recurringOrderCreateScheduleBackupPaymentTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleBackupPaymentTxt2, "recurringOrderCreateScheduleBackupPaymentTxt");
        recurringOrderCreateScheduleBackupPaymentTxt2.setVisibility(viewState.getRecurringOrderScheduleDetailsVisible() ? 0 : 8);
        if (!getReviewing()) {
            RhTextView recurringOrderCreateScheduleEditInvestmentBtn2 = mergeBindings.recurringOrderCreateScheduleEditInvestmentBtn;
            Intrinsics.checkNotNullExpressionValue(recurringOrderCreateScheduleEditInvestmentBtn2, "recurringOrderCreateScheduleEditInvestmentBtn");
            recurringOrderCreateScheduleEditInvestmentBtn2.setVisibility(viewState.getRecurringOrderScheduleDetailsVisible() ? 0 : 8);
        }
        mergeBindings.recurringOrderAccountTxt.setText(viewState.getAccountNameTitle(resources));
        RhTextView rhTextView = mergeBindings.recurringOrderAccountSubtitleTxt;
        Intrinsics.checkNotNull(rhTextView);
        StringResource accountNameSubtitle = viewState.getAccountNameSubtitle();
        TextViewsKt.setVisibilityText(rhTextView, accountNameSubtitle != null ? accountNameSubtitle.getText(resources) : null);
        ServerToBentoAssetMapper2 accountNameSubtitleIcon = viewState.getAccountNameSubtitleIcon();
        TextViewsKt.setDrawableStart(rhTextView, accountNameSubtitleIcon != null ? ViewsKt.getDrawable(rhTextView, accountNameSubtitleIcon.getResourceId()) : null);
        View recurringOrderCreateAccountDivider = mergeBindings.recurringOrderCreateAccountDivider;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateAccountDivider, "recurringOrderCreateAccountDivider");
        recurringOrderCreateAccountDivider.setVisibility(viewState.getRecurringOrderAccountDetailsVisible() ? 0 : 8);
        RhTextView recurringOrderAccountLabel = mergeBindings.recurringOrderAccountLabel;
        Intrinsics.checkNotNullExpressionValue(recurringOrderAccountLabel, "recurringOrderAccountLabel");
        recurringOrderAccountLabel.setVisibility(viewState.getRecurringOrderAccountDetailsVisible() ? 0 : 8);
        RhTextView recurringOrderAccountTxt = mergeBindings.recurringOrderAccountTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderAccountTxt, "recurringOrderAccountTxt");
        recurringOrderAccountTxt.setVisibility(viewState.getRecurringOrderAccountDetailsVisible() ? 0 : 8);
        RhTextView recurringOrderAccountSubtitleTxt = mergeBindings.recurringOrderAccountSubtitleTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderAccountSubtitleTxt, "recurringOrderAccountSubtitleTxt");
        recurringOrderAccountSubtitleTxt.setVisibility(viewState.getRecurringOrderAccountDetailsVisible() ? 0 : 8);
        getFragmentBindings().reviewBtn.setLoading(viewState.getReviewButtonIsLoading());
        updateDisclosure(viewState);
        updateReviewButtonVisibility(viewState);
        updateAmountLabel(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$21(RecurringOrderFragment recurringOrderFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        recurringOrderFragment.performSubmitOrder();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$22(String str, RecurringOrderFragment recurringOrderFragment) {
        if (str != null) {
            recurringOrderFragment.getCallbacks().startOrderConfigurationSelection(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$28$lambda$25(String str, RecurringOrderFragment recurringOrderFragment) {
        if (str != null) {
            recurringOrderFragment.getCallbacks().editRecurringOrder(str);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.RecurringOrderFragment$setReviewMessage$1", m3645f = "RecurringOrderFragment.kt", m3646l = {702, 706}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$setReviewMessage$1 */
    static final class C117621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecurringOrderViewState $viewState;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C117621(RecurringOrderViewState recurringOrderViewState, Continuation<? super C117621> continuation) {
            super(2, continuation);
            this.$viewState = recurringOrderViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderFragment.this.new C117621(this.$viewState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            String str;
            String str2;
            final CharSequence reviewText;
            String str3;
            final String text;
            RenderableTextDto text2;
            MarkdownTextDto markdown_text;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String string2 = RecurringOrderFragment.this.getResources().getString((RecurringOrderFragment.this.isCryptoOrder() && this.$viewState.isUsRecurringVTExperimentEnabled()) ? C11048R.string.general_label_disclosures : RecurringOrderFragment.this.isCryptoOrder() ? C11595R.string.full_disclosure : C11595R.string.learn_more);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                if (RecurringOrderFragment.this.isCryptoOrder()) {
                    Flow<Boolean> flowStreamCryptoTradeFlowMicrogramDisclosureExperiment = RecurringOrderFragment.this.getCryptoExperimentsStore().streamCryptoTradeFlowMicrogramDisclosureExperiment();
                    this.L$0 = string2;
                    this.label = 1;
                    Object objFirst = FlowKt.first(flowStreamCryptoTradeFlowMicrogramDisclosureExperiment, this);
                    if (objFirst != coroutine_suspended) {
                        str2 = string2;
                        obj = objFirst;
                    }
                    return coroutine_suspended;
                }
                str = string2;
                RecurringOrderViewState recurringOrderViewState = this.$viewState;
                Resources resources = RecurringOrderFragment.this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                reviewText = recurringOrderViewState.getReviewText(resources);
                if (reviewText != null) {
                    final RecurringOrderFragment recurringOrderFragment = RecurringOrderFragment.this;
                    RhTextView orderReviewTxt = recurringOrderFragment.getMergeBindings().orderReviewTxt;
                    Intrinsics.checkNotNullExpressionValue(orderReviewTxt, "orderReviewTxt");
                    com.robinhood.android.common.util.extensions.TextViewsKt.setTextWithLearnMore((TextView) orderReviewTxt, reviewText, true, true, str, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$setReviewMessage$1$invokeSuspend$lambda$2$$inlined$setTextWithLearnMore$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (recurringOrderFragment.isCryptoOrder()) {
                                RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragmentCreateDialogFragment = RecurringCryptoDisclosureBottomSheetFragment.INSTANCE.createDialogFragment(new RecurringDialogFragmentKeys(reviewText.toString()));
                                FragmentManager parentFragmentManager = recurringOrderFragment.getParentFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                                recurringCryptoDisclosureBottomSheetFragmentCreateDialogFragment.show(parentFragmentManager, "recurringCryptoDisclosureBottomSheetFragment");
                                return;
                            }
                            WebUtils.viewUrl$default(recurringOrderFragment.getContext(), "https://robinhood.com/us/en/support/articles/recurring-investments/", 0, 4, (Object) null);
                        }
                    }, 1, (DefaultConstructorMarker) null));
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = str4;
                TextDto disclosure_text = ((StreamCryptoDisclosuresResponseDto) obj).getDisclosure_text();
                text = (disclosure_text != null || (text2 = disclosure_text.getText()) == null || (markdown_text = text2.getMarkdown_text()) == null) ? null : markdown_text.getText();
                if (text != null) {
                    RhTextView orderReviewTxt2 = RecurringOrderFragment.this.getMergeBindings().orderReviewTxt;
                    Intrinsics.checkNotNullExpressionValue(orderReviewTxt2, "orderReviewTxt");
                    final RecurringOrderFragment recurringOrderFragment2 = RecurringOrderFragment.this;
                    com.robinhood.android.common.util.extensions.TextViewsKt.setTextWithLearnMore((TextView) orderReviewTxt2, (CharSequence) text, true, true, str3, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$setReviewMessage$1$invokeSuspend$$inlined$setTextWithLearnMore$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragmentCreateDialogFragment = RecurringCryptoDisclosureBottomSheetFragment.INSTANCE.createDialogFragment(new RecurringDialogFragmentKeys(text));
                            FragmentManager parentFragmentManager = recurringOrderFragment2.getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                            recurringCryptoDisclosureBottomSheetFragmentCreateDialogFragment.show(parentFragmentManager, "recurringCryptoDisclosureBottomSheetFragment");
                        }
                    }, 1, (DefaultConstructorMarker) null));
                }
                return Unit.INSTANCE;
            }
            str2 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                str = str2;
                RecurringOrderViewState recurringOrderViewState2 = this.$viewState;
                Resources resources2 = RecurringOrderFragment.this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                reviewText = recurringOrderViewState2.getReviewText(resources2);
                if (reviewText != null) {
                }
                return Unit.INSTANCE;
            }
            StreamCryptoDisclosuresRequestDto streamCryptoDisclosuresRequestDtoM1848x15c7b2be = this.$viewState.m1848x15c7b2be();
            if (streamCryptoDisclosuresRequestDtoM1848x15c7b2be == null) {
                return Unit.INSTANCE;
            }
            Flow<StreamCryptoDisclosuresResponseDto> flowStreamCryptoDisclosures = RecurringOrderFragment.this.getCryptoDisclosuresService().StreamCryptoDisclosures(streamCryptoDisclosuresRequestDtoM1848x15c7b2be);
            this.L$0 = str2;
            this.label = 2;
            obj = FlowKt.first(flowStreamCryptoDisclosures, this);
            if (obj != coroutine_suspended) {
                str3 = str2;
                TextDto disclosure_text2 = ((StreamCryptoDisclosuresResponseDto) obj).getDisclosure_text();
                if (disclosure_text2 != null) {
                    if (text != null) {
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void setReviewMessage(RecurringOrderViewState viewState) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C117621(viewState, null), 3, null);
    }

    private final void updateDisclosure(RecurringOrderViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence charSequenceBuildTextWithLearnMore$default;
        RhTextView rhTextView = getFragmentBindings().paycheckRecurringOrderDisclaimerTitle;
        Intrinsics.checkNotNull(rhTextView);
        StringResource paycheckDisclaimerTitleVisibilityText = viewState.getPaycheckDisclaimerTitleVisibilityText();
        if (paycheckDisclaimerTitleVisibilityText != null) {
            Resources resources = rhTextView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = paycheckDisclaimerTitleVisibilityText.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(rhTextView, text);
        Integer paycheckDisclaimerTitleIconRes = viewState.getPaycheckDisclaimerTitleIconRes();
        TextViewsKt.setDrawableEnd(rhTextView, paycheckDisclaimerTitleIconRes != null ? requireContext().getDrawable(paycheckDisclaimerTitleIconRes.intValue()) : null);
        this.initialConstraints.setVisibility(C11595R.id.paycheck_recurring_order_disclaimer_title, getFragmentBindings().paycheckRecurringOrderDisclaimerTitle.getVisibility());
        RhTextView rhTextView2 = getFragmentBindings().paycheckRecurringOrderDisclaimer;
        StringResource paycheckDisclaimerVisibilityText = viewState.getPaycheckDisclaimerVisibilityText();
        if (paycheckDisclaimerVisibilityText != null) {
            Resources resources2 = rhTextView2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            charSequenceBuildTextWithLearnMore$default = paycheckDisclaimerVisibilityText.getText(resources2);
        } else {
            charSequenceBuildTextWithLearnMore$default = null;
        }
        ContributionLimitRemaining retirementContributionRemaining = viewState.getRetirementContributionRemaining();
        final Integer numValueOf = retirementContributionRemaining != null ? Integer.valueOf(retirementContributionRemaining.getTaxYear()) : null;
        Intrinsics.checkNotNull(rhTextView2);
        if (viewState.getPaycheckDisclaimerHasLearnMore() && charSequenceBuildTextWithLearnMore$default != null && numValueOf != null) {
            OnClickListeners.onClick(rhTextView2, new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringOrderFragment.updateDisclosure$lambda$34$lambda$31(this.f$0, numValueOf);
                }
            });
            Resources resources3 = rhTextView2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            charSequenceBuildTextWithLearnMore$default = LearnMoresKt.buildTextWithLearnMore$default(resources3, charSequenceBuildTextWithLearnMore$default, true, Integer.valueOf(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground2)), true, null, new ActionSpan(false, new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, 1, (DefaultConstructorMarker) null), 16, null);
        } else {
            OnClickListeners.onClick(rhTextView2, new RecurringOrderFragment6(this));
        }
        TextViewsKt.setVisibilityText(rhTextView2, charSequenceBuildTextWithLearnMore$default);
        Integer paycheckDisclaimerBodyIconRes = viewState.getPaycheckDisclaimerBodyIconRes();
        TextViewsKt.setDrawableEnd(rhTextView2, paycheckDisclaimerBodyIconRes != null ? requireContext().getDrawable(paycheckDisclaimerBodyIconRes.intValue()) : null);
        this.initialConstraints.setVisibility(C11595R.id.paycheck_recurring_order_disclaimer, getFragmentBindings().paycheckRecurringOrderDisclaimer.getVisibility());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDisclosure$lambda$34$lambda$31(RecurringOrderFragment recurringOrderFragment, Integer num) {
        Navigator.DefaultImpls.createDialogFragment$default(recurringOrderFragment.getNavigator(), new CreateRetirementContributionsDialogFragmentKey("0", num.intValue(), true), null, 2, null).show(recurringOrderFragment.getChildFragmentManager(), "retirement-contributions-disclaimer");
        return Unit.INSTANCE;
    }

    private final void updateReviewButtonVisibility(RecurringOrderViewState viewState) {
        if (viewState.getReviewing()) {
            return;
        }
        getReviewOrderBtn().setEnabled(viewState.isReviewButtonEnabled());
    }

    private final void setIsActionOrderTypeVisible(boolean isVisible) {
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION);
            recurringOrderConfiguration = null;
        }
        setActionOrderTypeVisible(recurringOrderConfiguration.getShowToolbarAction() && isVisible);
        View view = this.actionOrderTypeContainer;
        if (view != null) {
            view.setVisibility(getActionOrderTypeVisible() ? 0 : 8);
        }
    }

    private final void updateAmountLabel(final RecurringOrderViewState viewState) {
        MergeRecurringOrderBinding mergeBindings = getMergeBindings();
        ImageView amountLabelQuestionMarkImg = mergeBindings.amountLabelQuestionMarkImg;
        Intrinsics.checkNotNullExpressionValue(amountLabelQuestionMarkImg, "amountLabelQuestionMarkImg");
        amountLabelQuestionMarkImg.setVisibility(viewState.getShowAmountLabelQuestionMark() ? 0 : 8);
        Function0 function0 = new Function0() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderFragment.updateAmountLabel$lambda$37$lambda$36(viewState, this);
            }
        };
        RhTextView recurringOrderCreateAmountLabelTxt = mergeBindings.recurringOrderCreateAmountLabelTxt;
        Intrinsics.checkNotNullExpressionValue(recurringOrderCreateAmountLabelTxt, "recurringOrderCreateAmountLabelTxt");
        OnClickListeners.onClick(recurringOrderCreateAmountLabelTxt, function0);
        ImageView amountLabelQuestionMarkImg2 = getMergeBindings().amountLabelQuestionMarkImg;
        Intrinsics.checkNotNullExpressionValue(amountLabelQuestionMarkImg2, "amountLabelQuestionMarkImg");
        OnClickListeners.onClick(amountLabelQuestionMarkImg2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateAmountLabel$lambda$37$lambda$36(RecurringOrderViewState recurringOrderViewState, RecurringOrderFragment recurringOrderFragment) {
        AmountLabelExplanationUiModel amountLabelExplanationUi = recurringOrderViewState.getAmountLabelExplanationUi();
        if (amountLabelExplanationUi != null) {
            if (amountLabelExplanationUi instanceof AmountLabelExplanationUiModel.Dialog) {
                recurringOrderFragment.showAmountLabelExplanationDialog((AmountLabelExplanationUiModel.Dialog) amountLabelExplanationUi);
            } else {
                if (!(amountLabelExplanationUi instanceof AmountLabelExplanationUiModel.BottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecurringOrderExplanationBottomSheetFragment recurringOrderExplanationBottomSheetFragment = (RecurringOrderExplanationBottomSheetFragment) RecurringOrderExplanationBottomSheetFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderExplanationBottomSheetFragment.Args((AmountLabelExplanationUiModel.BottomSheet) amountLabelExplanationUi));
                FragmentManager childFragmentManager = recurringOrderFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                recurringOrderExplanationBottomSheetFragment.show(childFragmentManager, "recurringOrderExplanationBottomSheet");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestEditTextFocus() {
        if (getFragmentBindings().getRoot().getFocusedChild() instanceof EditText) {
            return;
        }
        RecurringOrderConfiguration recurringOrderConfiguration = this.configuration;
        if (recurringOrderConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION);
            recurringOrderConfiguration = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[recurringOrderConfiguration.getAmountType().ordinal()];
        if (i == 1) {
            getMergeBindings().recurringOrderCreateAmountDollarValue.requestAmountTextFocus();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getMergeBindings().recurringOrderCreateAmountPercentageValue.requestAmountTextFocus();
        }
    }

    private final void logScreenAppear() {
        Observable<RecurringOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.logScreenAppear$lambda$38(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logScreenAppear$lambda$38(RecurringOrderFragment recurringOrderFragment, RecurringOrderViewState recurringOrderViewState) {
        EventLogger.DefaultImpls.logAppear$default(recurringOrderFragment.getEventLogger(), null, INSTANCE.toProtobufReviewScreen(recurringOrderViewState.getInvestmentTarget().getTargetType()), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getRhyLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    private final void logReviewTap() {
        Observable<RecurringOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.logReviewTap$lambda$39(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit logReviewTap$lambda$39(RecurringOrderFragment recurringOrderFragment, RecurringOrderViewState recurringOrderViewState) {
        EventLogger eventLogger = recurringOrderFragment.getEventLogger();
        Screen protobufReviewScreen = INSTANCE.toProtobufReviewScreen(recurringOrderViewState.getInvestmentTarget().getTargetType());
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, protobufReviewScreen, new Component(Component.ComponentType.REVIEW_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getRhyLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logAmountEdit() {
        Observable<RecurringOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.logAmountEdit$lambda$40(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit logAmountEdit$lambda$40(RecurringOrderFragment recurringOrderFragment, RecurringOrderViewState recurringOrderViewState) {
        EventLogger eventLogger = recurringOrderFragment.getEventLogger();
        Screen protobufReviewScreen = INSTANCE.toProtobufReviewScreen(recurringOrderViewState.getInvestmentTarget().getTargetType());
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logType$default(eventLogger, UserInteractionEventData.Action.SET_RECURRING_AMOUNT, protobufReviewScreen, new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getRhyLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null), 8, null);
        return Unit.INSTANCE;
    }

    private final void logOrderSubmit() {
        Observable<RecurringOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.logOrderSubmit$lambda$41(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit logOrderSubmit$lambda$41(RecurringOrderFragment recurringOrderFragment, RecurringOrderViewState recurringOrderViewState) {
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logSwipe$default(recurringOrderFragment.getEventLogger(), UserInteractionEventData.Action.SUBMIT_ORDER, INSTANCE.toProtobufReviewScreen(recurringOrderViewState.getInvestmentTarget().getTargetType()), new Component(Component.ComponentType.RECURRING_SUMMARY_DIALOG, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getRhyLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    private final void logOrderFailure() {
        Observable<RecurringOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderFragment.logOrderFailure$lambda$42(this.f$0, (RecurringOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit logOrderFailure$lambda$42(RecurringOrderFragment recurringOrderFragment, RecurringOrderViewState recurringOrderViewState) {
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logSwipe$default(recurringOrderFragment.getEventLogger(), UserInteractionEventData.Action.EQUITY_ORDER_FAILURE, INSTANCE.toProtobufReviewScreen(recurringOrderViewState.getInvestmentTarget().getTargetType()), new Component(Component.ComponentType.RECURRING_SUMMARY_DIALOG, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recurringOrderViewState.getRhyLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -2049, -1, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderArgs;", "<init>", "()V", "LEARN_MORE_RESOURCE_PASSTHROUGH_KEY", "", "LEARN_MORE_EQUITY_URL", "toProtobufReviewScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderFragment, RecurringOrderArgs> {

        /* compiled from: RecurringOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiAssetType.values().length];
                try {
                    iArr[ApiAssetType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringOrderArgs getArgs(RecurringOrderFragment recurringOrderFragment) {
            return (RecurringOrderArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderFragment newInstance(RecurringOrderArgs recurringOrderArgs) {
            return (RecurringOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringOrderArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderFragment recurringOrderFragment, RecurringOrderArgs recurringOrderArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderFragment, recurringOrderArgs);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Screen toProtobufReviewScreen(ApiAssetType apiAssetType) {
            int i = apiAssetType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[apiAssetType.ordinal()];
            if (i == 1) {
                return new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null);
            }
            if (i == 2) {
                return new Screen(Screen.Name.CRYPTO_ORDER_ENTRY, null, null, null, 14, null);
            }
            if (i == 3) {
                return new Screen(Screen.Name.BROKERAGE_CASH_ORDER_ENTRY, null, null, null, 14, null);
            }
            return new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null);
        }
    }
}

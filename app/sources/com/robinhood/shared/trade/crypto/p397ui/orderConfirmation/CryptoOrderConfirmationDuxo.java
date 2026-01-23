package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.upsell.CryptoRecurringOrderUpsellManager;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.notification.data.ProductUpsellManager;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoPostOrderIacUpsellKillswitch;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.models.api.fee.FeeTierImpact;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.prefs.LongPreference;
import com.robinhood.rhc.upsells.RhcUpsellsService;
import com.robinhood.rhc.upsells.TouchPoint;
import com.robinhood.rhc.upsells.TouchPointData;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.shared.trade.crypto.dagger.FeeTierStatusLastTimeSeenMillisPref;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationViewState3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: CryptoOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 p2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001pB\u009b\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0001\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020-2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020807062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020-H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020-2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020-2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020-2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020-¢\u0006\u0004\bI\u0010<J\r\u0010J\u001a\u00020-¢\u0006\u0004\bJ\u0010<J\r\u0010K\u001a\u00020-¢\u0006\u0004\bK\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010RR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010UR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010WR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010XR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010YR\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0011\u0010o\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006q"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "iacUpsellStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "notificationUpsellManagerFactory", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "upsellManager", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierStore", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "feeTierNotificationProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/LongPreference;", "feeTierStatusLastTimeSeenMillisPref", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "res", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lj$/time/Clock;Lcom/robinhood/prefs/LongPreference;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$Standard;", "response", "", "onStandardOrderUpdated", "(Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response$Standard;)V", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "uiCryptoOrder", "fetchFeeTierInfoIfNeeded", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)V", "Ljava/util/UUID;", "currencyPairId", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "", "streamRewardForUserMicrogram", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "onCreate", "()V", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", Card.Icon.ORDER, "onOrderUpdated", "(Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;)V", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "action", "onOrderConfirmationRowClicked", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;)V", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;", "primaryButtonAction", "onReceiptPrimaryButtonClick", "(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent$Receipt$PrimaryButtonAction;)V", "viewOrder", "markUpsellViewCount", "setPrimaryButtonLoading", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "Lcom/robinhood/android/common/recurring/upsell/CryptoRecurringOrderUpsellManager;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/LongPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "notificationUpsellManager$delegate", "Lkotlin/Lazy;", "getNotificationUpsellManager", "()Lcom/robinhood/android/notification/data/ProductUpsellManager;", "notificationUpsellManager", "Lmicrogram/android/inject/MicrogramComponent;", "rhcUpsellsMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasOrderUpdated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mostRecentUiCryptoOrderFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderConfirmationDuxo extends BaseDuxo5<CryptoOrderConfirmationViewState, CryptoOrderConfirmationEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final Clock clock;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider;
    private final LongPreference feeTierStatusLastTimeSeenMillisPref;
    private final CryptoFeeTierStore feeTierStore;
    private final IacUpsellStore iacUpsellStore;
    private final StateFlow2<UiCryptoOrder> mostRecentUiCryptoOrderFlow;

    /* renamed from: notificationUpsellManager$delegate, reason: from kotlin metadata */
    private final Lazy notificationUpsellManager;
    private final ProductUpsellManagerFactory notificationUpsellManagerFactory;
    private final MicrogramComponent rhcUpsellsMicrogramApp;
    private final SavedStateHandle savedStateHandle;
    private final CryptoRecurringOrderUpsellManager upsellManager;
    private AtomicBoolean wasOrderUpdated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecurringOrderUpsellManager.RecurringUpsell.values().length];
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.PASSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.values().length];
            try {
                iArr2[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction.CONTINUE_TO_FEE_TIER_UPGRADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderConfirmationDuxo(AppType appType, ExperimentsStore experimentsStore, CryptoAccountStore cryptoAccountStore, AccountProvider accountProvider, CryptoExperimentsStore cryptoExperimentsStore, CurrencyPairV2Store currencyPairStore, IacUpsellStore iacUpsellStore, EventLogger eventLogger, ProductUpsellManagerFactory notificationUpsellManagerFactory, CryptoRecurringOrderUpsellManager upsellManager, CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, Clock clock, @FeeTierStatusLastTimeSeenMillisPref LongPreference feeTierStatusLastTimeSeenMillisPref, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle, Resources res, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(notificationUpsellManagerFactory, "notificationUpsellManagerFactory");
        Intrinsics.checkNotNullParameter(upsellManager, "upsellManager");
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(feeTierStatusLastTimeSeenMillisPref, "feeTierStatusLastTimeSeenMillisPref");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new CryptoOrderConfirmationViewState(res, null, null, false, null, null, null, false, appType, null, null, false, null, null, false, companion.shouldDisablePostTradeUpsell(((CryptoOrderConfirmationFragment.InitArgs) companion.getArgs(savedStateHandle)).getSource()), null, 98046, null), duxoBundle);
        this.appType = appType;
        this.experimentsStore = experimentsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.accountProvider = accountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.currencyPairStore = currencyPairStore;
        this.iacUpsellStore = iacUpsellStore;
        this.eventLogger = eventLogger;
        this.notificationUpsellManagerFactory = notificationUpsellManagerFactory;
        this.upsellManager = upsellManager;
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.clock = clock;
        this.feeTierStatusLastTimeSeenMillisPref = feeTierStatusLastTimeSeenMillisPref;
        this.savedStateHandle = savedStateHandle;
        this.notificationUpsellManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderConfirmationDuxo.notificationUpsellManager_delegate$lambda$0(this.f$0);
            }
        });
        this.rhcUpsellsMicrogramApp = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-rhc-upsells", null, 2, null), null, 4, null);
        this.wasOrderUpdated = new AtomicBoolean(false);
        this.mostRecentUiCryptoOrderFlow = StateFlow4.MutableStateFlow(null);
    }

    public final Screen getEventScreen() {
        CurrencyPair currencyPair;
        Screen.Name name = Screen.Name.CRYPTO_ORDER_RECEIPT;
        UiCryptoOrder uiCryptoOrder = getStateFlow().getValue().getUiCryptoOrder();
        return new Screen(name, null, String.valueOf((uiCryptoOrder == null || (currencyPair = uiCryptoOrder.getCurrencyPair()) == null) ? null : currencyPair.getId()), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductUpsellManager getNotificationUpsellManager() {
        return (ProductUpsellManager) this.notificationUpsellManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductUpsellManager notificationUpsellManager_delegate$lambda$0(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo) {
        return cryptoOrderConfirmationDuxo.notificationUpsellManagerFactory.create(ProductUpsellKey.INSTANCE.getUpsellNotificationPostCryptoTrade());
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1 */
    static final class C403301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403301(Continuation<? super C403301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C403301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoTradeBonusUsExperimentState = CryptoOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoTradeBonusUsExperimentState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoTradeBonusUsExperimentState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
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

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1$1$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507751 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507751(boolean z, Continuation<? super C507751> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507751 c507751 = new C507751(this.$it, continuation);
                    c507751.L$0 = obj;
                    return c507751;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((C507751) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, this.$it, null, null, null, false, null, null, false, false, null, 130943, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507751(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403301(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C403312(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C403323(null));
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2 */
    static final class C403312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403312(Continuation<? super C403312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C403312(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsVolumeTierEngagementExperiment = CryptoOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoUsVolumeTierEngagementExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoUsVolumeTierEngagementExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
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

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507761 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ boolean $isEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507761(boolean z, Continuation<? super C507761> continuation) {
                    super(2, continuation);
                    this.$isEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507761 c507761 = new C507761(this.$isEnabled, continuation);
                    c507761.L$0 = obj;
                    return c507761;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((C507761) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, null, this.$isEnabled, null, null, false, false, null, 129023, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.Z$0;
                    this.this$0.applyMutation(new C507761(z, null));
                    if (z) {
                        Long orNull = this.this$0.feeTierStatusLastTimeSeenMillisPref.getOrNull();
                        boolean z2 = false;
                        if (orNull != null) {
                            CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo = this.this$0;
                            if (cryptoOrderConfirmationDuxo.clock.millis() - orNull.longValue() < Duration.ofDays(7L).toMillis()) {
                                z2 = true;
                            }
                        }
                        this.this$0.applyMutation(new AnonymousClass2(z2, null));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ boolean $hasSeenWithin7Days;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(boolean z, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$hasSeenWithin7Days = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$hasSeenWithin7Days, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((AnonymousClass2) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, null, false, boxing.boxBoolean(this.$hasSeenWithin7Days), null, false, false, null, 126975, null);
                }
            }
        }
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3 */
    static final class C403323 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403323(Continuation<? super C403323> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C403323(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403323) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(FlowKt.filterNotNull(Operators.connectWhen$default(CryptoOrderConfirmationDuxo.this.mostRecentUiCryptoOrderFlow, CryptoOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null)), new C40325xc28e509a(null, CryptoOrderConfirmationDuxo.this)), new C40326xc28e509b(null, CryptoOrderConfirmationDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3$3", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3$3$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ Account $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, null, false, null, null, false, false, this.$it, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onOrderUpdated(CryptoOrderManager.Response order) {
        Intrinsics.checkNotNullParameter(order, "order");
        if (order instanceof CryptoOrderManager.Response.Standard) {
            onStandardOrderUpdated((CryptoOrderManager.Response.Standard) order);
        } else if (!(order instanceof CryptoOrderManager.Response.BillingOrderPending)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void onStandardOrderUpdated(CryptoOrderManager.Response.Standard response) {
        UiCryptoOrder order = response.getOrder();
        StateFlow2<UiCryptoOrder> stateFlow2 = this.mostRecentUiCryptoOrderFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), order)) {
        }
        applyMutation(new C403362(order, null));
        fetchFeeTierInfoIfNeeded(order);
        Observable<UiCurrencyPair> observableShare = this.currencyPairStore.streamCurrencyPair(order.getCurrencyPair().getId()).share();
        Intrinsics.checkNotNull(observableShare);
        LifecycleHost.DefaultImpls.bind$default(this, observableShare, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderConfirmationDuxo.onStandardOrderUpdated$lambda$2(this.f$0, (UiCurrencyPair) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403374(order, null), 3, null);
        if (this.appType == AppType.RHC) {
            Observable<R> observableFlatMap = observableShare.flatMap(new Function() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo.onStandardOrderUpdated.5
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Optional<String>> apply(UiCurrencyPair it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CryptoOrderConfirmationDuxo.this.streamRewardForUserMicrogram(it.getId());
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderConfirmationDuxo.onStandardOrderUpdated$lambda$3(this.f$0, (Optional) obj);
                }
            }, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderConfirmationDuxo.onStandardOrderUpdated$lambda$4((Throwable) obj);
                }
            }, null, null, 12, null);
        }
        if (this.wasOrderUpdated.get()) {
            return;
        }
        this.wasOrderUpdated = new AtomicBoolean(true);
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C403398(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderConfirmationDuxo.onStandardOrderUpdated$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Companion companion = INSTANCE;
        if (companion.shouldDisablePostTradeUpsell(((CryptoOrderConfirmationFragment.InitArgs) companion.getArgs((HasSavedState) this)).getSource())) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C4033510(order, null), 3, null);
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$2 */
    static final class C403362 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
        final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403362(UiCryptoOrder uiCryptoOrder, Continuation<? super C403362> continuation) {
            super(2, continuation);
            this.$uiCryptoOrder = uiCryptoOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403362 c403362 = new C403362(this.$uiCryptoOrder, continuation);
            c403362.L$0 = obj;
            return c403362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
            return ((C403362) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, this.$uiCryptoOrder, null, false, null, null, null, false, null, null, null, false, null, null, false, false, null, 131069, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStandardOrderUpdated$lambda$2(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, UiCurrencyPair uiCurrencyPair) {
        cryptoOrderConfirmationDuxo.applyMutation(new CryptoOrderConfirmationDuxo3(uiCurrencyPair, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$4", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$4 */
    static final class C403374 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403374(UiCryptoOrder uiCryptoOrder, Continuation<? super C403374> continuation) {
            super(2, continuation);
            this.$uiCryptoOrder = uiCryptoOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C403374(this.$uiCryptoOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403374) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$4$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
            final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, UiCryptoOrder uiCryptoOrder, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
                this.$uiCryptoOrder = uiCryptoOrder;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uiCryptoOrder, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                return ((AnonymousClass1) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object cryptoRecurringUpsell;
                CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState2 = (CryptoOrderConfirmationViewState) this.L$0;
                    CryptoRecurringOrderUpsellManager cryptoRecurringOrderUpsellManager = this.this$0.upsellManager;
                    UiCryptoOrder uiCryptoOrder = this.$uiCryptoOrder;
                    this.L$0 = cryptoOrderConfirmationViewState2;
                    this.label = 1;
                    cryptoRecurringUpsell = cryptoRecurringOrderUpsellManager.getCryptoRecurringUpsell(uiCryptoOrder, this);
                    if (cryptoRecurringUpsell == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoOrderConfirmationViewState = cryptoOrderConfirmationViewState2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState3 = (CryptoOrderConfirmationViewState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    cryptoRecurringUpsell = obj;
                    cryptoOrderConfirmationViewState = cryptoOrderConfirmationViewState3;
                }
                return CryptoOrderConfirmationViewState.copy$default(cryptoOrderConfirmationViewState, null, null, (RecurringOrderUpsellManager.RecurringUpsell) cryptoRecurringUpsell, false, null, null, null, false, null, null, null, false, null, null, false, false, null, 131067, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo = CryptoOrderConfirmationDuxo.this;
            cryptoOrderConfirmationDuxo.applyMutation(new AnonymousClass1(cryptoOrderConfirmationDuxo, this.$uiCryptoOrder, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStandardOrderUpdated$lambda$3(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Optional optional) {
        cryptoOrderConfirmationDuxo.applyMutation(new CryptoOrderConfirmationDuxo4(optional, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStandardOrderUpdated$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, true, null, 4, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$8", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$8 */
    static final class C403398 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C403398(Continuation<? super C403398> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C403398(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C403398) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ProductUpsellManager notificationUpsellManager = CryptoOrderConfirmationDuxo.this.getNotificationUpsellManager();
            this.label = 1;
            Object objIsUpsellAllowed = notificationUpsellManager.isUpsellAllowed(this);
            return objIsUpsellAllowed == coroutine_suspended ? coroutine_suspended : objIsUpsellAllowed;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStandardOrderUpdated$lambda$5(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, boolean z) {
        cryptoOrderConfirmationDuxo.applyMutation(new CryptoOrderConfirmationDuxo5(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10 */
    static final class C4033510 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4033510(UiCryptoOrder uiCryptoOrder, Continuation<? super C4033510> continuation) {
            super(2, continuation);
            this.$uiCryptoOrder = uiCryptoOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationDuxo.this.new C4033510(this.$uiCryptoOrder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4033510) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(CryptoOrderConfirmationDuxo.this.experimentsStore, new Experiment[]{CryptoPostOrderIacUpsellKillswitch.INSTANCE}, false, null, 6, null), new C40328xf1ce681e(null, CryptoOrderConfirmationDuxo.this, this.$uiCryptoOrder));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "upsell", "Lcom/robinhood/models/ui/IacUpsell;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IacUpsell, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IacUpsell iacUpsell, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(iacUpsell, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10$2$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onStandardOrderUpdated$10$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ IacUpsell $upsell;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IacUpsell iacUpsell, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$upsell = iacUpsell;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$upsell, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, null, false, null, this.$upsell, false, false, null, 122879, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IacUpsell) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1 */
    static final class C403291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCryptoOrder $uiCryptoOrder;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeeTierImpact.values().length];
                try {
                    iArr[FeeTierImpact.APPROACHING_NEXT_TIER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FeeTierImpact.UPGRADED_TO_NEXT_TIER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403291(UiCryptoOrder uiCryptoOrder, Continuation<? super C403291> continuation) {
            super(2, continuation);
            this.$uiCryptoOrder = uiCryptoOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403291 c403291 = CryptoOrderConfirmationDuxo.this.new C403291(this.$uiCryptoOrder, continuation);
            c403291.L$0 = obj;
            return c403291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                Flow<Boolean> flowStreamCryptoUsVolumeTierEngagementExperiment = CryptoOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoUsVolumeTierEngagementExperiment();
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flowStreamCryptoUsVolumeTierEngagementExperiment, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objFirstOrNull;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
            }
            boolean zAreEqual = Intrinsics.areEqual(obj, boxing.boxBoolean(true));
            FeeTierImpact feeTierImpact = this.$uiCryptoOrder.getCryptoOrder().getFeeTierImpact();
            int i2 = feeTierImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[feeTierImpact.ordinal()];
            if (i2 == -1) {
                z = false;
            } else if (i2 != 1 && i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (zAreEqual && z) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoOrderConfirmationDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoOrderConfirmationDuxo.this, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM22810getCryptoFeeTierInfoIoAF18A;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoFeeTierStore cryptoFeeTierStore = this.this$0.feeTierStore;
                    this.label = 1;
                    objM22810getCryptoFeeTierInfoIoAF18A = cryptoFeeTierStore.m22810getCryptoFeeTierInfoIoAF18A(this);
                    if (objM22810getCryptoFeeTierInfoIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM22810getCryptoFeeTierInfoIoAF18A = ((Result) obj).getValue();
                }
                if (Result.m28555isFailureimpl(objM22810getCryptoFeeTierInfoIoAF18A)) {
                    objM22810getCryptoFeeTierInfoIoAF18A = null;
                }
                this.this$0.applyMutation(new C507741((CryptoFeeTierInfo) objM22810getCryptoFeeTierInfoIoAF18A, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$1$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507741 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ CryptoFeeTierInfo $feeTierInfo;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507741(CryptoFeeTierInfo cryptoFeeTierInfo, Continuation<? super C507741> continuation) {
                    super(2, continuation);
                    this.$feeTierInfo = cryptoFeeTierInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507741 c507741 = new C507741(this.$feeTierInfo, continuation);
                    c507741.L$0 = obj;
                    return c507741;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((C507741) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, this.$feeTierInfo, null, false, null, null, null, false, null, null, false, false, null, 131039, null);
                }
            }
        }

        /* compiled from: CryptoOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM25807canSkipNotificationPromptIoAF18A;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = this.this$0.feeTierNotificationProvider;
                    this.label = 1;
                    objM25807canSkipNotificationPromptIoAF18A = cryptoFeeTierNotificationStatusProvider.m25807canSkipNotificationPromptIoAF18A(this);
                    if (objM25807canSkipNotificationPromptIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM25807canSkipNotificationPromptIoAF18A = ((Result) obj).getValue();
                }
                this.this$0.applyMutation(new AnonymousClass1(objM25807canSkipNotificationPromptIoAF18A, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoOrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$2$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$fetchFeeTierInfoIfNeeded$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
                final /* synthetic */ Object $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Object obj, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState = (CryptoOrderConfirmationViewState) this.L$0;
                    Object obj2 = this.$result;
                    if (Result.m28555isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    return CryptoOrderConfirmationViewState.copy$default(cryptoOrderConfirmationViewState, null, null, null, false, null, null, (Boolean) obj2, false, null, null, null, false, null, null, false, false, null, 131007, null);
                }
            }
        }
    }

    private final void fetchFeeTierInfoIfNeeded(UiCryptoOrder uiCryptoOrder) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403291(uiCryptoOrder, null), 3, null);
    }

    public final void onOrderConfirmationRowClicked(final CryptoOrderConfirmationRowState.TapAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderConfirmationDuxo.onOrderConfirmationRowClicked$lambda$6(action, this, (CryptoOrderConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderConfirmationRowClicked$lambda$6(CryptoOrderConfirmationRowState.TapAction tapAction, CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, CryptoOrderConfirmationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getUiCryptoOrder() == null) {
            return Unit.INSTANCE;
        }
        if (tapAction instanceof CryptoOrderConfirmationRowState.TapAction.ShowCostDetailBottomSheet) {
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.OpenCostDetail(it.getUiCryptoOrder()));
        } else if (tapAction instanceof CryptoOrderConfirmationRowState.TapAction.ShowFeeDefinitionBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(cryptoOrderConfirmationDuxo.eventLogger, null, cryptoOrderConfirmationDuxo.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "crypto_fees", null, 4, null), null, null, false, 57, null);
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.ShowFeeDefinitionBottomSheet(it.getUiCryptoOrder(), CryptoFeeDefinitionBottomSheetFragment.Args.INSTANCE.createArgs(it.getUiCryptoOrder(), cryptoOrderConfirmationDuxo.getEventScreen())));
        } else if (tapAction instanceof CryptoOrderConfirmationRowState.TapAction.ShowTradeBonusBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(cryptoOrderConfirmationDuxo.eventLogger, null, cryptoOrderConfirmationDuxo.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "crypto_trade_bonus", null, 4, null), null, null, false, 57, null);
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.ShowTradeBonusBottomSheet(it.getUiCryptoOrder(), ((CryptoOrderConfirmationRowState.TapAction.ShowTradeBonusBottomSheet) tapAction).isEstimate()));
        } else {
            throw new IllegalStateException("Unsupported tap action");
        }
        return Unit.INSTANCE;
    }

    public final void onReceiptPrimaryButtonClick(CryptoOrderConfirmationViewState3.Receipt.PrimaryButtonAction primaryButtonAction) {
        Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
        int i = WhenMappings.$EnumSwitchMapping$1[primaryButtonAction.ordinal()];
        if (i == 1) {
            withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderConfirmationDuxo.onReceiptPrimaryButtonClick$lambda$7(this.f$0, (CryptoOrderConfirmationViewState) obj);
                }
            });
        } else if (i == 2) {
            applyMutation(new C403332(null));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C403343(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReceiptPrimaryButtonClick$lambda$7(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, CryptoOrderConfirmationViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        IacUpsell iacUpsell = dataState.getIacUpsell();
        IacUpsell iacUpsell2 = dataState.getIacUpsell();
        String upsellDeeplink = iacUpsell2 != null ? iacUpsell2.getUpsellDeeplink() : null;
        Companion companion = INSTANCE;
        if (companion.shouldDisablePostTradeUpsell(((CryptoOrderConfirmationFragment.InitArgs) companion.getArgs((HasSavedState) cryptoOrderConfirmationDuxo)).getSource())) {
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.Close.Default(dataState.getUiCryptoOrder(), dataState.isOrderFilled()));
        } else if (dataState.isEligibleForNotificationUpsell()) {
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.Close.NotificationUpsell(dataState.getUiCryptoOrder(), dataState.isOrderFilled()));
        } else if (iacUpsell == null || upsellDeeplink == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[dataState.getRecurringUpsell().ordinal()];
            if (i == 1) {
                cryptoOrderConfirmationDuxo.markUpsellViewCount();
                cryptoOrderConfirmationDuxo.applyMutation(new CryptoOrderConfirmationDuxo2(null));
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dataState.getPostReceiptDeeplink() != null) {
                    cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.Close.Deeplink(dataState.getUiCryptoOrder(), dataState.isOrderFilled(), dataState.getPostReceiptDeeplink()));
                } else {
                    cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.Close.Default(dataState.getUiCryptoOrder(), dataState.isOrderFilled()));
                }
            }
        } else {
            cryptoOrderConfirmationDuxo.iacUpsellStore.postUpsellAsSeen(iacUpsell.getReceiptUuid());
            cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.Close.Deeplink(dataState.getUiCryptoOrder(), dataState.isOrderFilled(), upsellDeeplink));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onReceiptPrimaryButtonClick$2", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onReceiptPrimaryButtonClick$2 */
    static final class C403332 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C403332(Continuation<? super C403332> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403332 c403332 = new C403332(continuation);
            c403332.L$0 = obj;
            return c403332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
            return ((C403332) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, CryptoOrderConfirmationViewState2.FEE_TIER_STATUS, false, null, null, false, false, null, 130047, null);
        }
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onReceiptPrimaryButtonClick$3", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$onReceiptPrimaryButtonClick$3 */
    static final class C403343 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C403343(Continuation<? super C403343> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403343 c403343 = new C403343(continuation);
            c403343.L$0 = obj;
            return c403343;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
            return ((C403343) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, CryptoOrderConfirmationViewState2.FEE_TIER_UPGRADED, false, null, null, false, false, null, 130047, null);
        }
    }

    public final void viewOrder() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderConfirmationDuxo.viewOrder$lambda$8(this.f$0, (CryptoOrderConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewOrder$lambda$8(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo, CryptoOrderConfirmationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getUiCryptoOrder() == null) {
            return Unit.INSTANCE;
        }
        cryptoOrderConfirmationDuxo.submit(new CryptoOrderConfirmationEvent.OpenOrderDetail(it.getUiCryptoOrder()));
        return Unit.INSTANCE;
    }

    public final void markUpsellViewCount() {
        this.upsellManager.markUpsellViewCount();
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$setPrimaryButtonLoading$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$setPrimaryButtonLoading$1 */
    static final class C403401 extends ContinuationImpl7 implements Function2<CryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C403401(Continuation<? super C403401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403401 c403401 = new C403401(continuation);
            c403401.L$0 = obj;
            return c403401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super CryptoOrderConfirmationViewState> continuation) {
            return ((C403401) create(cryptoOrderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderConfirmationViewState.copy$default((CryptoOrderConfirmationViewState) this.L$0, null, null, null, false, null, null, null, false, null, null, null, false, null, null, true, false, null, 114687, null);
        }
    }

    public final void setPrimaryButtonLoading() {
        applyMutation(new C403401(null));
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$streamRewardForUserMicrogram$1", m3645f = "CryptoOrderConfirmationDuxo.kt", m3646l = {420, 427, 429}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationDuxo$streamRewardForUserMicrogram$1 */
    static final class C403411 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        final /* synthetic */ RhcUpsellsService $rhcUpsellsService;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403411(RhcUpsellsService rhcUpsellsService, UUID uuid, Continuation<? super C403411> continuation) {
            super(2, continuation);
            this.$rhcUpsellsService = rhcUpsellsService;
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C403411 c403411 = new C403411(this.$rhcUpsellsService, this.$currencyPairId, continuation);
            c403411.L$0 = obj;
            return c403411;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<String>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<String>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C403411) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                RhcUpsellsService rhcUpsellsService = this.$rhcUpsellsService;
                TouchPointData touchPointData = new TouchPointData(TouchPoint.TRADE_RECEIPT, (String) null, this.$currencyPairId.toString(), 2, (DefaultConstructorMarker) null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = rhcUpsellsService.shouldShowUpsell(touchPointData, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null && !StringsKt.isBlank(str)) {
                Optional optionalAsOptional = Optional3.asOptional(str);
                this.L$0 = null;
                this.label = 2;
            } else {
                Optional2 optional2 = Optional2.INSTANCE;
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Optional<String>> streamRewardForUserMicrogram(UUID currencyPairId) {
        return asObservable(FlowKt.flow(new C403411((RhcUpsellsService) this.rhcUpsellsMicrogramApp.getServiceLocator().getClient(RhcUpsellsService.class), currencyPairId, null)));
    }

    /* compiled from: CryptoOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$InitArgs;", "<init>", "()V", "shouldDisablePostTradeUpsell", "", "source", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderConfirmationDuxo, CryptoOrderConfirmationFragment.InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderConfirmationFragment.InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderConfirmationFragment.InitArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderConfirmationFragment.InitArgs getArgs(CryptoOrderConfirmationDuxo cryptoOrderConfirmationDuxo) {
            return (CryptoOrderConfirmationFragment.InitArgs) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderConfirmationDuxo);
        }

        public final boolean shouldDisablePostTradeUpsell(String source) {
            return Intrinsics.areEqual(source, CryptoOrderIntentKey.ENTRYPOINT_STAKING);
        }
    }
}

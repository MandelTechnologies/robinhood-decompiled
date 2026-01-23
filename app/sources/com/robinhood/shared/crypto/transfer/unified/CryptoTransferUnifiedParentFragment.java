package com.robinhood.shared.crypto.transfer.unified;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.transfer.GatewayDeepLinkIntent;
import com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment;
import com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionFragment;
import com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment;
import com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsFragment;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentEvent;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment;
import com.robinhood.shared.crypto.transfer.util.Sources;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTransferUnifiedParentFragment.kt */
@Metadata(m3635d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004fghiB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0016J>\u00101\u001a\u00020'2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<H\u0016J\u0018\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020'H\u0016J\u001a\u0010C\u001a\u00020'2\u0006\u00102\u001a\u0002032\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u000203H\u0016J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020'2\u0006\u0010L\u001a\u000203H\u0016J\u0010\u0010M\u001a\u00020'2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020'2\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020'H\u0016J\b\u0010Z\u001a\u00020'H\u0016J\b\u0010[\u001a\u00020'H\u0016J8\u0010\\\u001a\u00020'2\u0006\u00102\u001a\u0002032\u0006\u0010I\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010]\u001a\u00020^2\u0006\u0010D\u001a\u00020E2\u0006\u0010_\u001a\u00020JH\u0016J\t\u0010`\u001a\u00020\u000eH\u0096\u0001R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0018\u0010a\u001a\b\u0012\u0004\u0012\u00020c0bX\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006j"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/address/CryptoTransferSendAddressFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/memo/CryptoTransferSendMemoFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Callbacks;", "Lcom/robinhood/shared/crypto/transfer/skip/CryptoTransferSkipStepsFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "callbacks", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;", "state", "getState", "()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;", "setState", "(Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "duxo", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentDuxo;", "getDuxo", "()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "navigateToAddressEntry", PlaceTypes.ADDRESS, "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "submitWarningSheet", "addressTagConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "maxAddressLength", "", "navigateToEnrollment", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "navigateToQrScanner", "onContinueWithAddress", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "saveLastEnteredAddress", "enteredAddress", "onNetworkSelected", "network", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "continueWithAddressTag", "addressTag", "saveLastEnteredAmount", "amountState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "reviewWithdrawalDetails", "withdrawal", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "errorWithAddress", "errorWrapper", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "onSentSuccessfully", "completedWithdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "onEditAddress", "onTransferExpired", "onCompleted", "onSkipSteps", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "preselectedNetwork", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "State", "Args", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedParentFragment extends BaseFragment implements CryptoTransferUnifiedFragment.Callbacks, CryptoTransferSendAddressFragment.Callbacks, CryptoTransferNetworkSelectionFragment.Callbacks, CryptoTransferSendMemoFragment.Callbacks, CryptoTransferSendAmountFragment.Callbacks, CryptoTransferSendReviewFragment.Callbacks, CryptoTransferSendReceiptFragment.Callbacks, CryptoTransferSkipStepsFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTransferUnifiedParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CryptoTransferUnifiedParentFragment.class, "state", "getState()Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferUnifiedParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Callbacks;", "", "exitTransfers", "", "navigateToEnrollment", "enrollmentState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitTransfers();

        void navigateToEnrollment(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoTransferUnifiedParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CryptoTransferUnifiedParentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.state = (Interfaces3) BindSavedState2.savedParcelable(this, new State(null, null, uuidRandomUUID, null, null, null, null, null, null, null, null, null, false, 8187, null)).provideDelegate(this, $$delegatedProperties[1]);
        this.duxo = DuxosKt.duxo(this, CryptoTransferUnifiedParentDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[1], state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoTransferUnifiedParentDuxo getDuxo() {
        return (CryptoTransferUnifiedParentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getDuxo().startInitialNavigation();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            BaseFragment.collectDuxoState$default(this, null, new C384461(null), 1, null);
        }
    }

    /* compiled from: CryptoTransferUnifiedParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$onViewCreated$1", m3645f = "CryptoTransferUnifiedParentFragment.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$onViewCreated$1 */
    static final class C384461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C384461(Continuation<? super C384461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferUnifiedParentFragment.this.new C384461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C384461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoTransferUnifiedParentFragment.this.getDuxo().getEventFlow());
                final CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment = CryptoTransferUnifiedParentFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CryptoTransferUnifiedParentEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CryptoTransferUnifiedParentEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CryptoTransferUnifiedParentEvent> eventConsumerInvoke;
                        EventConsumer<CryptoTransferUnifiedParentEvent> eventConsumerInvoke2;
                        EventConsumer<CryptoTransferUnifiedParentEvent> eventConsumerInvoke3;
                        final CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment2 = cryptoTransferUnifiedParentFragment;
                        if ((event.getData() instanceof CryptoTransferUnifiedParentEvent.Navigate.AddressEntry) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25162invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25162invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoTransferUnifiedParentEvent.Navigate.AddressEntry addressEntry = (CryptoTransferUnifiedParentEvent.Navigate.AddressEntry) event.getData();
                                    CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment3 = cryptoTransferUnifiedParentFragment2;
                                    cryptoTransferUnifiedParentFragment3.setState(CryptoTransferUnifiedParentFragment.State.copy$default(cryptoTransferUnifiedParentFragment3.getState(), null, null, null, null, null, null, null, null, null, null, null, null, true, 4095, null));
                                    UiCurrencyPair uiCurrencyPair = addressEntry.getUiCurrencyPair();
                                    CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet = addressEntry.getSubmitWarningSheet();
                                    cryptoTransferUnifiedParentFragment2.navigateToAddressEntry("", uiCurrencyPair, addressEntry.getInitialWarningSheet(), submitWarningSheet, addressEntry.getAddressTagConfig(), addressEntry.getMaxAddressLength());
                                }
                            });
                        }
                        final CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment3 = cryptoTransferUnifiedParentFragment;
                        if ((event.getData() instanceof CryptoTransferUnifiedParentEvent.Navigate.Unified) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25163invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25163invoke(Object it) {
                                    Fragment fragmentNewInstance;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoTransferUnifiedParentEvent.Navigate.Unified unified = (CryptoTransferUnifiedParentEvent.Navigate.Unified) event.getData();
                                    CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment4 = cryptoTransferUnifiedParentFragment3;
                                    cryptoTransferUnifiedParentFragment4.setState(CryptoTransferUnifiedParentFragment.State.copy$default(cryptoTransferUnifiedParentFragment4.getState(), null, null, null, null, null, null, null, null, null, null, null, null, unified.getUseSavedAddressesFlow(), 4095, null));
                                    CryptoTransferUnifiedParentFragment.Companion companion = CryptoTransferUnifiedParentFragment.INSTANCE;
                                    CryptoTransferIntentKey.Source source = ((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getSource();
                                    if (Intrinsics.areEqual(source, CryptoTransferIntentKey.Source.CryptoFeesDepositIncentive.INSTANCE) || (source instanceof CryptoTransferIntentKey.Source.Default)) {
                                        fragmentNewInstance = CryptoTransferUnifiedFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferUnifiedFragment.Args(((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getCurrencyPairId(), ((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getAction(), cryptoTransferUnifiedParentFragment3.getState().getLoggingSessionId(), Sources.getNavigationType(((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getSource()), ((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getSource(), ((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getSendState(), cryptoTransferUnifiedParentFragment3.getState().getUseSavedAddressesFlow()));
                                    } else {
                                        if (!(source instanceof CryptoTransferIntentKey.Source.Gateway)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        CryptoTransferIntentKey.Source.Gateway gateway = (CryptoTransferIntentKey.Source.Gateway) source;
                                        fragmentNewInstance = CryptoTransferSkipStepsFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferSkipStepsFragment.Args(((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((Fragment) cryptoTransferUnifiedParentFragment3)).getCurrencyPairId(), gateway.getAddress(), gateway.getNetwork()));
                                    }
                                    cryptoTransferUnifiedParentFragment3.setFragment(C11048R.id.fragment_container, fragmentNewInstance);
                                }
                            });
                        }
                        final CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment4 = cryptoTransferUnifiedParentFragment;
                        if ((event.getData() instanceof CryptoTransferUnifiedParentEvent.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m25164invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25164invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CryptoTransferUnifiedParentEvent.Error error = (CryptoTransferUnifiedParentEvent.Error) event.getData();
                                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                                    FragmentActivity fragmentActivityRequireActivity = cryptoTransferUnifiedParentFragment4.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), true, true, 0, null, 48, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        boolean z = currentFragment instanceof CryptoTransferUnifiedFragment;
        if ((z && !getState().getUseSavedAddressesFlow()) || ((z && getState().getUseSavedAddressesFlow() && ((Args) INSTANCE.getArgs((Fragment) this)).getAction() == CryptoTransferAction.RECEIVE) || (((currentFragment instanceof CryptoTransferSendAmountFragment) && ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway()) || ((currentFragment instanceof CryptoTransferSendAddressFragment) && getState().getUseSavedAddressesFlow())))) {
            getCallbacks().exitTransfers();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(4);
    }

    @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment.Callbacks
    public void navigateToAddressEntry(String address, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet, CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet, CryptoTransferConfig.TransferAddressTag addressTagConfig, int maxAddressLength) {
        String str;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        if (getState().getSavedAddress() == null || address.length() > 0) {
            str = address;
        } else {
            String savedAddress = getState().getSavedAddress();
            Intrinsics.checkNotNull(savedAddress);
            str = savedAddress;
        }
        setState(State.copy$default(getState(), uiCurrencyPair, str, null, null, null, null, null, null, null, submitWarningSheet, null, addressTagConfig, false, 5628, null));
        replaceFragment(CryptoTransferSendAddressFragment.INSTANCE.newInstance((Parcelable) new CryptoTransferSendAddressFragment.Args(str, uiCurrencyPair, maxAddressLength, getState().getUseSavedAddressesFlow(), initialWarningSheet, getState().getLoggingSessionId())));
    }

    @Override // com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment.Callbacks
    public void navigateToEnrollment(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction action) {
        Intrinsics.checkNotNullParameter(enrollmentState, "enrollmentState");
        Intrinsics.checkNotNullParameter(action, "action");
        getCallbacks().navigateToEnrollment(enrollmentState, action);
    }

    @Override // com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment.Callbacks
    public void navigateToQrScanner() {
        if (!getState().getUseSavedAddressesFlow()) {
            popLastFragment();
            return;
        }
        CryptoTransferUnifiedFragment.Companion companion = CryptoTransferUnifiedFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferUnifiedFragment.Args(((Args) companion2.getArgs((Fragment) this)).getCurrencyPairId(), ((Args) companion2.getArgs((Fragment) this)).getAction(), getState().getLoggingSessionId(), Sources.getNavigationType(((Args) companion2.getArgs((Fragment) this)).getSource()), ((Args) companion2.getArgs((Fragment) this)).getSource(), ((Args) companion2.getArgs((Fragment) this)).getSendState(), getState().getUseSavedAddressesFlow())));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment.Callbacks
    public void onContinueWithAddress(String address, ApiCryptoSupportedNetworks supportedNetworks) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(address, "address");
        setState(State.copy$default(getState(), null, address, null, null, null, null, null, supportedNetworks, null, null, null, null, false, 8061, null));
        if (supportedNetworks != null && supportedNetworks.isMultiChain()) {
            CryptoTransferNetworkSelectionFragment.Companion companion = CryptoTransferNetworkSelectionFragment.INSTANCE;
            UiCurrencyPair uiCurrencyPair = getState().getUiCurrencyPair();
            Intrinsics.checkNotNull(uiCurrencyPair);
            fragmentNewInstance = companion.newInstance((Parcelable) new CryptoTransferNetworkSelectionFragment.Args(uiCurrencyPair, supportedNetworks));
        } else if (getState().getAddressTagConfig() != null) {
            CryptoTransferSendMemoFragment.Companion companion2 = CryptoTransferSendMemoFragment.INSTANCE;
            CryptoTransferConfig.TransferAddressTag addressTagConfig = getState().getAddressTagConfig();
            Intrinsics.checkNotNull(addressTagConfig);
            fragmentNewInstance = companion2.newInstance((Parcelable) new CryptoTransferSendMemoFragment.Args(addressTagConfig, getState().getAddressTag()));
        } else {
            CryptoTransferSendAmountFragment.Companion companion3 = CryptoTransferSendAmountFragment.INSTANCE;
            UiCurrencyPair uiCurrencyPair2 = getState().getUiCurrencyPair();
            Intrinsics.checkNotNull(uiCurrencyPair2);
            UUID loggingSessionId = getState().getLoggingSessionId();
            String savedAddress = getState().getSavedAddress();
            Intrinsics.checkNotNull(savedAddress);
            fragmentNewInstance = companion3.newInstance((Parcelable) new CryptoTransferSendAmountFragment.Args(uiCurrencyPair2, loggingSessionId, savedAddress, getState().getCryptoInputMode(), getState().getCryptoAmount(), getState().getFiatAmount(), getState().getAddressTag(), getState().getSelectedNetwork(), ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway()));
        }
        replaceFragment(fragmentNewInstance);
    }

    @Override // com.robinhood.shared.crypto.transfer.send.address.CryptoTransferSendAddressFragment.Callbacks
    public void saveLastEnteredAddress(String enteredAddress) {
        Intrinsics.checkNotNullParameter(enteredAddress, "enteredAddress");
        setState(State.copy$default(getState(), null, enteredAddress, null, null, null, null, null, null, null, null, null, null, false, 8189, null));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionFragment.Callbacks
    public void onNetworkSelected(ApiCryptoSupportedNetworks.CryptoNetwork network) {
        Intrinsics.checkNotNullParameter(network, "network");
        setState(State.copy$default(getState(), null, null, null, null, null, null, null, null, network, null, null, null, false, 7935, null));
        CryptoTransferSendAmountFragment.Companion companion = CryptoTransferSendAmountFragment.INSTANCE;
        UiCurrencyPair uiCurrencyPair = getState().getUiCurrencyPair();
        Intrinsics.checkNotNull(uiCurrencyPair);
        UUID loggingSessionId = getState().getLoggingSessionId();
        String savedAddress = getState().getSavedAddress();
        Intrinsics.checkNotNull(savedAddress);
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferSendAmountFragment.Args(uiCurrencyPair, loggingSessionId, savedAddress, getState().getCryptoInputMode(), getState().getCryptoAmount(), getState().getFiatAmount(), getState().getAddressTag(), getState().getSelectedNetwork(), ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway())));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.memo.CryptoTransferSendMemoFragment.Callbacks
    public void continueWithAddressTag(String addressTag) {
        Intrinsics.checkNotNullParameter(addressTag, "addressTag");
        setState(State.copy$default(getState(), null, null, null, null, null, null, null, null, null, null, addressTag, null, false, 7167, null));
        CryptoTransferSendAmountFragment.Companion companion = CryptoTransferSendAmountFragment.INSTANCE;
        UiCurrencyPair uiCurrencyPair = getState().getUiCurrencyPair();
        Intrinsics.checkNotNull(uiCurrencyPair);
        UUID loggingSessionId = getState().getLoggingSessionId();
        String savedAddress = getState().getSavedAddress();
        Intrinsics.checkNotNull(savedAddress);
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferSendAmountFragment.Args(uiCurrencyPair, loggingSessionId, savedAddress, getState().getCryptoInputMode(), getState().getCryptoAmount(), getState().getFiatAmount(), getState().getAddressTag(), getState().getSelectedNetwork(), ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway())));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.Callbacks
    public void saveLastEnteredAmount(CryptoTransferSendAmountViewState.AmountState amountState) {
        Intrinsics.checkNotNullParameter(amountState, "amountState");
        setState(State.copy$default(getState(), null, null, null, amountState.getCryptoInputMode(), amountState.getCryptoAmount(), amountState.getFiatAmount(), null, null, null, null, null, null, false, 8135, null));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.Callbacks
    public void reviewWithdrawalDetails(CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawal) {
        Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
        setState(State.copy$default(getState(), null, null, null, withdrawal.getCryptoInputMode(), null, null, Boolean.valueOf(withdrawal.isFullAmount()), null, null, null, null, null, false, 8119, null));
        CryptoTransferSendReviewFragment.Companion companion = CryptoTransferSendReviewFragment.INSTANCE;
        UiCurrencyPair uiCurrencyPair = getState().getUiCurrencyPair();
        Intrinsics.checkNotNull(uiCurrencyPair);
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferSendReviewFragment.Args(uiCurrencyPair, withdrawal.getWithdrawal(), withdrawal.getCryptoInputMode(), withdrawal.isFullAmount(), getState().getSelectedNetwork(), getState().getSubmitWarningSheet(), getState().getAddressTagConfig(), getState().getLoggingSessionId())));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment.Callbacks
    public void errorWithAddress(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper errorWrapper) {
        Intrinsics.checkNotNullParameter(errorWrapper, "errorWrapper");
        while (!(getCurrentFragment() instanceof CryptoTransferSendAddressFragment)) {
            getChildFragmentManager().popBackStackImmediate();
        }
        Fragment currentFragment = getCurrentFragment();
        CryptoTransferSendAddressFragment cryptoTransferSendAddressFragment = currentFragment instanceof CryptoTransferSendAddressFragment ? (CryptoTransferSendAddressFragment) currentFragment : null;
        if (cryptoTransferSendAddressFragment != null) {
            cryptoTransferSendAddressFragment.showAddressError(errorWrapper);
        }
    }

    @Override // com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.Callbacks
    public void onSentSuccessfully(CryptoTransferWithdrawal completedWithdrawal) {
        Intrinsics.checkNotNullParameter(completedWithdrawal, "completedWithdrawal");
        CryptoTransferSendReceiptFragment.Companion companion = CryptoTransferSendReceiptFragment.INSTANCE;
        UiCurrencyPair uiCurrencyPair = getState().getUiCurrencyPair();
        Intrinsics.checkNotNull(uiCurrencyPair);
        Boolean boolIsFullAmount = getState().isFullAmount();
        Intrinsics.checkNotNull(boolIsFullAmount);
        boolean zBooleanValue = boolIsFullAmount.booleanValue();
        CryptoInputMode cryptoInputMode = getState().getCryptoInputMode();
        Intrinsics.checkNotNull(cryptoInputMode);
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferSendReceiptFragment.Args(uiCurrencyPair, completedWithdrawal, zBooleanValue, cryptoInputMode, getState().getSelectedNetwork(), ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway(), getState().getLoggingSessionId())));
    }

    @Override // com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.Callbacks
    public void onEditAddress() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway()) {
            requireActivity().finish();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Contexts8.tryStartActivity(contextRequireContext, GatewayDeepLinkIntent.gatewayDeepLinkIntent$default(null, 1, null));
            return;
        }
        ApiCryptoSupportedNetworks supportedNetworks = getState().getSupportedNetworks();
        int i = 3;
        if ((supportedNetworks == null || !supportedNetworks.isMultiChain()) && getState().getAddressTagConfig() == null) {
            i = 2;
        }
        popFragments(i);
    }

    @Override // com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment.Callbacks
    public void onTransferExpired() {
        popLastFragment();
    }

    @Override // com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment.Callbacks
    public void onCompleted() {
        requireActivity().finish();
    }

    @Override // com.robinhood.shared.crypto.transfer.skip.CryptoTransferSkipStepsFragment.Callbacks
    public void onSkipSteps(String address, String network, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, ApiCryptoSupportedNetworks supportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork preselectedNetwork) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(cryptoTransferConfig, "cryptoTransferConfig");
        Intrinsics.checkNotNullParameter(supportedNetworks, "supportedNetworks");
        Intrinsics.checkNotNullParameter(preselectedNetwork, "preselectedNetwork");
        setState(State.copy$default(getState(), uiCurrencyPair, address, null, null, null, null, null, supportedNetworks, preselectedNetwork, null, null, cryptoTransferConfig.getAddressTag(), false, 5756, null));
        CryptoTransferSendAmountFragment.Companion companion = CryptoTransferSendAmountFragment.INSTANCE;
        UiCurrencyPair uiCurrencyPair2 = getState().getUiCurrencyPair();
        Intrinsics.checkNotNull(uiCurrencyPair2);
        UUID loggingSessionId = getState().getLoggingSessionId();
        String savedAddress = getState().getSavedAddress();
        Intrinsics.checkNotNull(savedAddress);
        replaceFragment(companion.newInstance((Parcelable) new CryptoTransferSendAmountFragment.Args(uiCurrencyPair2, loggingSessionId, savedAddress, getState().getCryptoInputMode(), getState().getCryptoAmount(), getState().getFiatAmount(), getState().getAddressTag(), getState().getSelectedNetwork(), ((Args) INSTANCE.getArgs((Fragment) this)).getSource().isFromGateway())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoTransferUnifiedParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J¦\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020CJ\u0013\u0010D\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020CHÖ\u0001J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020CR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\r\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006N"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;", "Landroid/os/Parcelable;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "savedAddress", "", "loggingSessionId", "Ljava/util/UUID;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoAmount", "Ljava/math/BigDecimal;", "fiatAmount", "isFullAmount", "", "supportedNetworks", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "submitWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "addressTag", "addressTagConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "useSavedAddressesFlow", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Ljava/lang/String;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Z)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSavedAddress", "()Ljava/lang/String;", "getLoggingSessionId", "()Ljava/util/UUID;", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCryptoAmount", "()Ljava/math/BigDecimal;", "getFiatAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportedNetworks", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;", "getSelectedNetwork", "()Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "getSubmitWarningSheet", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;", "getAddressTag", "getAddressTagConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;", "getUseSavedAddressesFlow", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;Ljava/lang/String;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferAddressTag;Z)Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$State;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        private final String addressTag;
        private final CryptoTransferConfig.TransferAddressTag addressTagConfig;
        private final BigDecimal cryptoAmount;
        private final CryptoInputMode cryptoInputMode;
        private final BigDecimal fiatAmount;
        private final Boolean isFullAmount;
        private final UUID loggingSessionId;
        private final String savedAddress;
        private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
        private final CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet;
        private final ApiCryptoSupportedNetworks supportedNetworks;
        private final UiCurrencyPair uiCurrencyPair;
        private final boolean useSavedAddressesFlow;

        /* compiled from: CryptoTransferUnifiedParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Boolean bool;
                BigDecimal bigDecimal;
                BigDecimal bigDecimal2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) parcel.readParcelable(State.class.getClassLoader());
                String string2 = parcel.readString();
                UUID uuid = (UUID) parcel.readSerializable();
                Boolean boolValueOf = null;
                CryptoInputMode cryptoInputModeValueOf = parcel.readInt() == 0 ? null : CryptoInputMode.valueOf(parcel.readString());
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                ApiCryptoSupportedNetworks apiCryptoSupportedNetworks = (ApiCryptoSupportedNetworks) parcel.readParcelable(State.class.getClassLoader());
                ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = (ApiCryptoSupportedNetworks.CryptoNetwork) parcel.readParcelable(State.class.getClassLoader());
                CryptoTransferConfig.TransferWarnings.Stage.Warning warning = (CryptoTransferConfig.TransferWarnings.Stage.Warning) parcel.readParcelable(State.class.getClassLoader());
                boolean z = false;
                String string3 = parcel.readString();
                CryptoTransferConfig.TransferAddressTag transferAddressTag = (CryptoTransferConfig.TransferAddressTag) parcel.readParcelable(State.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = boolValueOf;
                    bigDecimal = bigDecimal3;
                    bigDecimal2 = bigDecimal4;
                    z = true;
                } else {
                    bool = boolValueOf;
                    bigDecimal = bigDecimal3;
                    bigDecimal2 = bigDecimal4;
                }
                return new State(uiCurrencyPair, string2, uuid, cryptoInputModeValueOf, bigDecimal, bigDecimal2, bool, apiCryptoSupportedNetworks, cryptoNetwork, warning, string3, transferAddressTag, z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, UiCurrencyPair uiCurrencyPair, String str, UUID uuid, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, String str2, CryptoTransferConfig.TransferAddressTag transferAddressTag, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = state.uiCurrencyPair;
            }
            return state.copy(uiCurrencyPair, (i & 2) != 0 ? state.savedAddress : str, (i & 4) != 0 ? state.loggingSessionId : uuid, (i & 8) != 0 ? state.cryptoInputMode : cryptoInputMode, (i & 16) != 0 ? state.cryptoAmount : bigDecimal, (i & 32) != 0 ? state.fiatAmount : bigDecimal2, (i & 64) != 0 ? state.isFullAmount : bool, (i & 128) != 0 ? state.supportedNetworks : apiCryptoSupportedNetworks, (i & 256) != 0 ? state.selectedNetwork : cryptoNetwork, (i & 512) != 0 ? state.submitWarningSheet : warning, (i & 1024) != 0 ? state.addressTag : str2, (i & 2048) != 0 ? state.addressTagConfig : transferAddressTag, (i & 4096) != 0 ? state.useSavedAddressesFlow : z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component10, reason: from getter */
        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAddressTag() {
            return this.addressTag;
        }

        /* renamed from: component12, reason: from getter */
        public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
            return this.addressTagConfig;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSavedAddress() {
            return this.savedAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getCryptoAmount() {
            return this.cryptoAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getIsFullAmount() {
            return this.isFullAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }

        /* renamed from: component9, reason: from getter */
        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        public final State copy(UiCurrencyPair uiCurrencyPair, String savedAddress, UUID loggingSessionId, CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount, Boolean isFullAmount, ApiCryptoSupportedNetworks supportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet, String addressTag, CryptoTransferConfig.TransferAddressTag addressTagConfig, boolean useSavedAddressesFlow) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            return new State(uiCurrencyPair, savedAddress, loggingSessionId, cryptoInputMode, cryptoAmount, fiatAmount, isFullAmount, supportedNetworks, selectedNetwork, submitWarningSheet, addressTag, addressTagConfig, useSavedAddressesFlow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, state.uiCurrencyPair) && Intrinsics.areEqual(this.savedAddress, state.savedAddress) && Intrinsics.areEqual(this.loggingSessionId, state.loggingSessionId) && this.cryptoInputMode == state.cryptoInputMode && Intrinsics.areEqual(this.cryptoAmount, state.cryptoAmount) && Intrinsics.areEqual(this.fiatAmount, state.fiatAmount) && Intrinsics.areEqual(this.isFullAmount, state.isFullAmount) && Intrinsics.areEqual(this.supportedNetworks, state.supportedNetworks) && Intrinsics.areEqual(this.selectedNetwork, state.selectedNetwork) && Intrinsics.areEqual(this.submitWarningSheet, state.submitWarningSheet) && Intrinsics.areEqual(this.addressTag, state.addressTag) && Intrinsics.areEqual(this.addressTagConfig, state.addressTagConfig) && this.useSavedAddressesFlow == state.useSavedAddressesFlow;
        }

        public int hashCode() {
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
            String str = this.savedAddress;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.loggingSessionId.hashCode()) * 31;
            CryptoInputMode cryptoInputMode = this.cryptoInputMode;
            int iHashCode3 = (iHashCode2 + (cryptoInputMode == null ? 0 : cryptoInputMode.hashCode())) * 31;
            BigDecimal bigDecimal = this.cryptoAmount;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.fiatAmount;
            int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            Boolean bool = this.isFullAmount;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            ApiCryptoSupportedNetworks apiCryptoSupportedNetworks = this.supportedNetworks;
            int iHashCode7 = (iHashCode6 + (apiCryptoSupportedNetworks == null ? 0 : apiCryptoSupportedNetworks.hashCode())) * 31;
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
            int iHashCode8 = (iHashCode7 + (cryptoNetwork == null ? 0 : cryptoNetwork.hashCode())) * 31;
            CryptoTransferConfig.TransferWarnings.Stage.Warning warning = this.submitWarningSheet;
            int iHashCode9 = (iHashCode8 + (warning == null ? 0 : warning.hashCode())) * 31;
            String str2 = this.addressTag;
            int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CryptoTransferConfig.TransferAddressTag transferAddressTag = this.addressTagConfig;
            return ((iHashCode10 + (transferAddressTag != null ? transferAddressTag.hashCode() : 0)) * 31) + Boolean.hashCode(this.useSavedAddressesFlow);
        }

        public String toString() {
            return "State(uiCurrencyPair=" + this.uiCurrencyPair + ", savedAddress=" + this.savedAddress + ", loggingSessionId=" + this.loggingSessionId + ", cryptoInputMode=" + this.cryptoInputMode + ", cryptoAmount=" + this.cryptoAmount + ", fiatAmount=" + this.fiatAmount + ", isFullAmount=" + this.isFullAmount + ", supportedNetworks=" + this.supportedNetworks + ", selectedNetwork=" + this.selectedNetwork + ", submitWarningSheet=" + this.submitWarningSheet + ", addressTag=" + this.addressTag + ", addressTagConfig=" + this.addressTagConfig + ", useSavedAddressesFlow=" + this.useSavedAddressesFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCurrencyPair, flags);
            dest.writeString(this.savedAddress);
            dest.writeSerializable(this.loggingSessionId);
            CryptoInputMode cryptoInputMode = this.cryptoInputMode;
            if (cryptoInputMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cryptoInputMode.name());
            }
            dest.writeSerializable(this.cryptoAmount);
            dest.writeSerializable(this.fiatAmount);
            Boolean bool = this.isFullAmount;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeParcelable(this.supportedNetworks, flags);
            dest.writeParcelable(this.selectedNetwork, flags);
            dest.writeParcelable(this.submitWarningSheet, flags);
            dest.writeString(this.addressTag);
            dest.writeParcelable(this.addressTagConfig, flags);
            dest.writeInt(this.useSavedAddressesFlow ? 1 : 0);
        }

        public State(UiCurrencyPair uiCurrencyPair, String str, UUID loggingSessionId, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, String str2, CryptoTransferConfig.TransferAddressTag transferAddressTag, boolean z) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            this.uiCurrencyPair = uiCurrencyPair;
            this.savedAddress = str;
            this.loggingSessionId = loggingSessionId;
            this.cryptoInputMode = cryptoInputMode;
            this.cryptoAmount = bigDecimal;
            this.fiatAmount = bigDecimal2;
            this.isFullAmount = bool;
            this.supportedNetworks = apiCryptoSupportedNetworks;
            this.selectedNetwork = cryptoNetwork;
            this.submitWarningSheet = warning;
            this.addressTag = str2;
            this.addressTagConfig = transferAddressTag;
            this.useSavedAddressesFlow = z;
        }

        public /* synthetic */ State(UiCurrencyPair uiCurrencyPair, String str, UUID uuid, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, ApiCryptoSupportedNetworks apiCryptoSupportedNetworks, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, String str2, CryptoTransferConfig.TransferAddressTag transferAddressTag, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : str, uuid, (i & 8) != 0 ? null : cryptoInputMode, (i & 16) != 0 ? null : bigDecimal, (i & 32) != 0 ? null : bigDecimal2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : apiCryptoSupportedNetworks, (i & 256) != 0 ? null : cryptoNetwork, (i & 512) != 0 ? null : warning, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : transferAddressTag, (i & 4096) != 0 ? false : z);
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final String getSavedAddress() {
            return this.savedAddress;
        }

        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        public final BigDecimal getCryptoAmount() {
            return this.cryptoAmount;
        }

        public final BigDecimal getFiatAmount() {
            return this.fiatAmount;
        }

        public final Boolean isFullAmount() {
            return this.isFullAmount;
        }

        public final ApiCryptoSupportedNetworks getSupportedNetworks() {
            return this.supportedNetworks;
        }

        public final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
            return this.selectedNetwork;
        }

        public final CryptoTransferConfig.TransferWarnings.Stage.Warning getSubmitWarningSheet() {
            return this.submitWarningSheet;
        }

        public final String getAddressTag() {
            return this.addressTag;
        }

        public final CryptoTransferConfig.TransferAddressTag getAddressTagConfig() {
            return this.addressTagConfig;
        }

        public final boolean getUseSavedAddressesFlow() {
            return this.useSavedAddressesFlow;
        }
    }

    /* compiled from: CryptoTransferUnifiedParentFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "sendState", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "source", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getSendState", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$SendState;", "getSource", "()Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoTransferAction action;
        private final UUID currencyPairId;
        private final ApiCryptoTransferConfig.TransferStates.SendState sendState;
        private final CryptoTransferIntentKey.Source source;

        /* compiled from: CryptoTransferUnifiedParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), CryptoTransferAction.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ApiCryptoTransferConfig.TransferStates.SendState.valueOf(parcel.readString()), (CryptoTransferIntentKey.Source) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.action.name());
            ApiCryptoTransferConfig.TransferStates.SendState sendState = this.sendState;
            if (sendState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sendState.name());
            }
            dest.writeParcelable(this.source, flags);
        }

        public Args(UUID currencyPairId, CryptoTransferAction action, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(source, "source");
            this.currencyPairId = currencyPairId;
            this.action = action;
            this.sendState = sendState;
            this.source = source;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final CryptoTransferAction getAction() {
            return this.action;
        }

        public final ApiCryptoTransferConfig.TransferStates.SendState getSendState() {
            return this.sendState;
        }

        public /* synthetic */ Args(UUID uuid, CryptoTransferAction cryptoTransferAction, ApiCryptoTransferConfig.TransferStates.SendState sendState, CryptoTransferIntentKey.Source source, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, cryptoTransferAction, (i & 4) != 0 ? null : sendState, (i & 8) != 0 ? CryptoTransferIntentKey.Source.Default.INSTANCE : source);
        }

        public final CryptoTransferIntentKey.Source getSource() {
            return this.source;
        }
    }

    /* compiled from: CryptoTransferUnifiedParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTransferUnifiedParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferUnifiedParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTransferUnifiedParentFragment newInstance(Args args) {
            return (CryptoTransferUnifiedParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTransferUnifiedParentFragment cryptoTransferUnifiedParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTransferUnifiedParentFragment, args);
        }
    }
}

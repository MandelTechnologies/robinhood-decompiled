package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingLoadingFragment;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsed;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiLinkDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import com.robinhood.models.api.bonfire.paymentinstruments.VerificationMethod;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.stripe.android.model.CardParams;
import java.util.NoSuchElementException;
import java.util.UUID;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DebitCardLinkingLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u0002052\u0006\u00106\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020<H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "bonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "getBonfireApi", "()Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "setBonfireApi", "(Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;)V", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "getStripeStore", "()Lcom/robinhood/store/stripe/StripeStore;", "setStripeStore", "(Lcom/robinhood/store/stripe/StripeStore;)V", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "getPaymentMethodLastUsagesPref", "()Lcom/robinhood/prefs/StringToLongMapPreference;", "setPaymentMethodLastUsagesPref", "(Lcom/robinhood/prefs/StringToLongMapPreference;)V", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "onDestroyView", "onBackPressed", "", "handleLinkingResult", "instrument", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiPaymentInstrument;", "Callbacks", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardLinkingLoadingFragment extends AutoLoggableDebitCardLinkingFragment {
    public PaymentInstrumentBonfireApi bonfireApi;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    public EventLogger eventLogger;

    @PaymentMethodLastUsagesPref
    public StringToLongMapPreference paymentMethodLastUsagesPref;
    private final Screen.Name protoScreenName;
    public StripeStore stripeStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardLinkingLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardLinkingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Callbacks;", "", "onDebitCardLinked", "", "paymentInstrumentId", "Ljava/util/UUID;", "onDebitCardVerificationRequired", "onFailedToLinkDebitCard", "t", "", "launchDebitCardVerificationIntro", "instrumentId", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchDebitCardVerificationIntro(UUID instrumentId);

        void onDebitCardLinked(UUID paymentInstrumentId);

        void onDebitCardVerificationRequired(UUID paymentInstrumentId);

        void onFailedToLinkDebitCard(Throwable t);
    }

    /* compiled from: DebitCardLinkingLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethod.values().length];
            try {
                iArr[VerificationMethod.SETUP_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMethod.DYNAMIC_CODE_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMethod.DYNAMIC_CODE_VERIFICATION_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationMethod.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    public DebitCardLinkingLoadingFragment() {
        super(C13894R.layout.fragment_debit_card_linking_loading);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DebitCardLinkingLoadingFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.protoScreenName = Screen.Name.DEBIT_CARD_LINKING_LOADING;
    }

    public final PaymentInstrumentBonfireApi getBonfireApi() {
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.bonfireApi;
        if (paymentInstrumentBonfireApi != null) {
            return paymentInstrumentBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bonfireApi");
        return null;
    }

    public final void setBonfireApi(PaymentInstrumentBonfireApi paymentInstrumentBonfireApi) {
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "<set-?>");
        this.bonfireApi = paymentInstrumentBonfireApi;
    }

    public final DebitCardInstrumentStore getDebitCardInstrumentStore() {
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore;
        if (debitCardInstrumentStore != null) {
            return debitCardInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentStore");
        return null;
    }

    public final void setDebitCardInstrumentStore(DebitCardInstrumentStore debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "<set-?>");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
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

    public final StripeStore getStripeStore() {
        StripeStore stripeStore = this.stripeStore;
        if (stripeStore != null) {
            return stripeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stripeStore");
        return null;
    }

    public final void setStripeStore(StripeStore stripeStore) {
        Intrinsics.checkNotNullParameter(stripeStore, "<set-?>");
        this.stripeStore = stripeStore;
    }

    public final StringToLongMapPreference getPaymentMethodLastUsagesPref() {
        StringToLongMapPreference stringToLongMapPreference = this.paymentMethodLastUsagesPref;
        if (stringToLongMapPreference != null) {
            return stringToLongMapPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentMethodLastUsagesPref");
        return null;
    }

    public final void setPaymentMethodLastUsagesPref(StringToLongMapPreference stringToLongMapPreference) {
        Intrinsics.checkNotNullParameter(stringToLongMapPreference, "<set-?>");
        this.paymentMethodLastUsagesPref = stringToLongMapPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ActionBar supportActionBar;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null && (supportActionBar = baseActivity.getSupportActionBar()) != null) {
            supportActionBar.setHomeButtonEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C139042(null), 3, null);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /* compiled from: DebitCardLinkingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2", m3645f = "DebitCardLinkingLoadingFragment.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2 */
    static final class C139042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C139042(Continuation<? super C139042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardLinkingLoadingFragment.this.new C139042(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C139042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DebitCardLinkingLoadingFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2$1", m3645f = "DebitCardLinkingLoadingFragment.kt", m3646l = {81, 82}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment$onCreateView$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DebitCardLinkingLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = debitCardLinkingLoadingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
            
                if (r15 == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Exception e) {
                    this.this$0.getCallbacks().onFailedToLinkDebitCard(e);
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StripeStore stripeStore = this.this$0.getStripeStore();
                    CardParams cardParams = ((Args) DebitCardLinkingLoadingFragment.INSTANCE.getArgs((Fragment) this.this$0)).getCardParams();
                    this.label = 1;
                    obj = stripeStore.getTokenizedDebitCardRequest(cardParams, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getDebitCardInstrumentStore().refresh(true);
                    this.this$0.handleLinkingResult((ApiPaymentInstrument) obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                EventLogger eventLogger = this.this$0.getEventLogger();
                UserInteractionEventData userInteractionEventData = new UserInteractionEventData(null, null, null, null, this.this$0.getLoggingContext(), null, null, 111, null);
                DebitCardLinkingLoadingFragment2 debitCardLinkingLoadingFragment2 = new DebitCardLinkingLoadingFragment2(this.this$0, (ApiLinkDebitCardRequest) obj, null);
                NetworkContext.Tag tag = NetworkContext.Tag.LINK_DEBIT_CARD;
                this.label = 2;
                obj = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventData, debitCardLinkingLoadingFragment2, tag, this);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = DebitCardLinkingLoadingFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DebitCardLinkingLoadingFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ActionBar supportActionBar;
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null && (supportActionBar = baseActivity.getSupportActionBar()) != null) {
            supportActionBar.setHomeButtonEnabled(true);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLinkingResult(ApiPaymentInstrument instrument) {
        UUID instrument_id = instrument.getInstrument_id();
        if (((Args) INSTANCE.getArgs((Fragment) this)).getInRevampExperiment()) {
            ApiPaymentInstrumentDetails payment_instrument_details = instrument.getPayment_instrument_details();
            Intrinsics.checkNotNull(payment_instrument_details, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails.DebitCard");
            VerificationMethod verification_method = ((ApiPaymentInstrumentDetails.DebitCard) payment_instrument_details).getVerification_method();
            int i = verification_method == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verification_method.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    StringToLongMapPreference paymentMethodLastUsagesPref = getPaymentMethodLastUsagesPref();
                    String string2 = instrument_id.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(paymentMethodLastUsagesPref, string2);
                    getCallbacks().onDebitCardLinked(instrument_id);
                    return;
                }
                if (i == 2) {
                    getCallbacks().launchDebitCardVerificationIntro(instrument_id);
                    return;
                } else if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DebitCardLinkingLoadingFragment3(verification_method), false, null, 6, null);
            getCallbacks().onDebitCardLinked(instrument_id);
            return;
        }
        if (instrument.getPayment_instrument_status() == PaymentInstrumentStatus.PENDING_VERIFICATION) {
            getCallbacks().onDebitCardVerificationRequired(instrument_id);
            return;
        }
        StringToLongMapPreference paymentMethodLastUsagesPref2 = getPaymentMethodLastUsagesPref();
        String string3 = instrument_id.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        UpdatePaymentMethodLastUsed.updatePaymentMethodLastUsed(paymentMethodLastUsagesPref2, string3);
        getCallbacks().onDebitCardLinked(instrument_id);
    }

    /* compiled from: DebitCardLinkingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Args;", "Landroid/os/Parcelable;", "cardParams", "Lcom/stripe/android/model/CardParams;", "inRevampExperiment", "", "<init>", "(Lcom/stripe/android/model/CardParams;Z)V", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "getInRevampExperiment", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = CardParams.$stable;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CardParams cardParams;
        private final boolean inRevampExperiment;

        /* compiled from: DebitCardLinkingLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CardParams) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CardParams cardParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cardParams = args.cardParams;
            }
            if ((i & 2) != 0) {
                z = args.inRevampExperiment;
            }
            return args.copy(cardParams, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CardParams getCardParams() {
            return this.cardParams;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInRevampExperiment() {
            return this.inRevampExperiment;
        }

        public final Args copy(CardParams cardParams, boolean inRevampExperiment) {
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            return new Args(cardParams, inRevampExperiment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.cardParams, args.cardParams) && this.inRevampExperiment == args.inRevampExperiment;
        }

        public int hashCode() {
            return (this.cardParams.hashCode() * 31) + Boolean.hashCode(this.inRevampExperiment);
        }

        public String toString() {
            return "Args(cardParams=" + this.cardParams + ", inRevampExperiment=" + this.inRevampExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.cardParams, flags);
            dest.writeInt(this.inRevampExperiment ? 1 : 0);
        }

        public Args(CardParams cardParams, boolean z) {
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            this.cardParams = cardParams;
            this.inRevampExperiment = z;
        }

        public /* synthetic */ Args(CardParams cardParams, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cardParams, (i & 2) != 0 ? false : z);
        }

        public final CardParams getCardParams() {
            return this.cardParams;
        }

        public final boolean getInRevampExperiment() {
            return this.inRevampExperiment;
        }
    }

    /* compiled from: DebitCardLinkingLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Args;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardLinkingLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardLinkingLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardLinkingLoadingFragment newInstance(Args args) {
            return (DebitCardLinkingLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardLinkingLoadingFragment debitCardLinkingLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardLinkingLoadingFragment, args);
        }
    }
}

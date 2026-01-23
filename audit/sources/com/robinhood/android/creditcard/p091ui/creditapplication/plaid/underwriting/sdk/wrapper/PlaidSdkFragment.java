package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.link.FastOpenPlaidLink;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkResult;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationActivity;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkEvent;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.PlaidSdkRequestMetadata;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PlaidSdkFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u0003123B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020*H\u0002J\t\u0010+\u001a\u00020$H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/plaid/link/PlaidHandler;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkEvent;", "onCreate", "onDialogDismissed", "id", "", "onBackPressed", "", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "getSessionId", "Ljava/util/UUID;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlaidSdkFragment extends BaseFragment implements RegionGated {
    public static final String CREDIT_CARD_PLAID_SOURCE = "CC_PLAID_VERIFICATION_SCREEN";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<PlaidHandler> launcher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PlaidSdkFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\r\u001a\u00020\u0003H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", "", "onPlaidAccessTokenGranted", "", "originalAccountId", "", "updatedAccountId", "plaidAccessToken", "plaidMetadata", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/PlaidSdkRequestMetadata;", "plaidLinkAccounts", "", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "onPlaidExited", "onPlaidError", "cause", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPlaidAccessTokenGranted(String originalAccountId, String updatedAccountId, String plaidAccessToken, PlaidSdkRequestMetadata plaidMetadata, List<Account> plaidLinkAccounts);

        void onPlaidError(Throwable cause);

        void onPlaidExited();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public PlaidSdkFragment() {
        super(C12201R.layout.fragment_plaid_sdk);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PlaidSdkFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, PlaidSdkDuxo.class);
        ActivityResultLauncher<PlaidHandler> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new FastOpenPlaidLink(), new ActivityResultCallback() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$launcher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(LinkResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                PlaidSdkDuxo duxo = this.this$0.getDuxo();
                PlaidSdkFragment.Args args = (PlaidSdkFragment.Args) PlaidSdkFragment.INSTANCE.getArgs((Fragment) this.this$0);
                String string2 = this.this$0.getSessionId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                duxo.handlePlaidCallback(result, string2, args, this.this$0.getCallbacks());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<PlaidSdkEvent> event) {
        EventConsumer<PlaidSdkEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof PlaidSdkEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m12799invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12799invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                final PlaidSdkEvent plaidSdkEvent = (PlaidSdkEvent) event.getData();
                if (plaidSdkEvent instanceof PlaidSdkEvent.ErrorEvent) {
                    PlaidSdkEvent.ErrorEvent errorEvent = (PlaidSdkEvent.ErrorEvent) plaidSdkEvent;
                    if (!(errorEvent.getThrowable() instanceof ClassCastException)) {
                        this.getCallbacks().onPlaidError(errorEvent.getThrowable());
                        return;
                    }
                    throw errorEvent.getThrowable();
                }
                if (plaidSdkEvent instanceof PlaidSdkEvent.LinkTokenEvent) {
                    try {
                        ActivityResultLauncher activityResultLauncher = this.launcher;
                        Application application = this.requireActivity().getApplication();
                        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                        activityResultLauncher.launch(Plaid.create(application, PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1<LinkTokenConfiguration.Builder, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$handleEvent$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LinkTokenConfiguration.Builder builder) {
                                invoke2(builder);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LinkTokenConfiguration.Builder linkTokenConfiguration) {
                                Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
                                linkTokenConfiguration.setLogLevel(LinkLogLevel.DEBUG);
                                linkTokenConfiguration.setToken(((PlaidSdkEvent.LinkTokenEvent) plaidSdkEvent).getToken());
                            }
                        })));
                        return;
                    } catch (Throwable th) {
                        this.getDuxo().onPlaidError(th);
                        return;
                    }
                }
                throw new NoWhenBranchMatchedException();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidSdkDuxo getDuxo() {
        return (PlaidSdkDuxo) this.duxo.getValue();
    }

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$onViewCreated$1", m3645f = "PlaidSdkFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$onViewCreated$1 */
    static final class C125231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C125231(Continuation<? super C125231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidSdkFragment.this.new C125231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C125231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PlaidSdkFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PlaidSdkFragment $tmp0;

            AnonymousClass1(PlaidSdkFragment plaidSdkFragment) {
                this.$tmp0 = plaidSdkFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PlaidSdkFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<PlaidSdkEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C125231.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<PlaidSdkEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PlaidSdkFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PlaidSdkFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(PlaidSdkFragment plaidSdkFragment, Event event, Continuation continuation) {
            plaidSdkFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C125231(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getDuxo().onLinkToken(((Args) INSTANCE.getArgs((Fragment) this)).getLinkToken());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return CREDIT_CARD_PLAID_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getSessionId() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity");
        return ((CreditApplicationActivity) fragmentActivityRequireActivity).getSessionId$feature_credit_card_externalDebug();
    }

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Args;", "Landroid/os/Parcelable;", "linkToken", "", "originalAccountId", "updatedAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkToken", "()Ljava/lang/String;", "getOriginalAccountId", "getUpdatedAccountId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String linkToken;
        private final String originalAccountId;
        private final String updatedAccountId;

        /* compiled from: PlaidSdkFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.linkToken;
            }
            if ((i & 2) != 0) {
                str2 = args.originalAccountId;
            }
            if ((i & 4) != 0) {
                str3 = args.updatedAccountId;
            }
            return args.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLinkToken() {
            return this.linkToken;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOriginalAccountId() {
            return this.originalAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUpdatedAccountId() {
            return this.updatedAccountId;
        }

        public final Args copy(String linkToken, String originalAccountId, String updatedAccountId) {
            Intrinsics.checkNotNullParameter(linkToken, "linkToken");
            return new Args(linkToken, originalAccountId, updatedAccountId);
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
            return Intrinsics.areEqual(this.linkToken, args.linkToken) && Intrinsics.areEqual(this.originalAccountId, args.originalAccountId) && Intrinsics.areEqual(this.updatedAccountId, args.updatedAccountId);
        }

        public int hashCode() {
            int iHashCode = this.linkToken.hashCode() * 31;
            String str = this.originalAccountId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.updatedAccountId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(linkToken=" + this.linkToken + ", originalAccountId=" + this.originalAccountId + ", updatedAccountId=" + this.updatedAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.linkToken);
            dest.writeString(this.originalAccountId);
            dest.writeString(this.updatedAccountId);
        }

        public Args(String linkToken, String str, String str2) {
            Intrinsics.checkNotNullParameter(linkToken, "linkToken");
            this.linkToken = linkToken;
            this.originalAccountId = str;
            this.updatedAccountId = str2;
        }

        public final String getLinkToken() {
            return this.linkToken;
        }

        public final String getOriginalAccountId() {
            return this.originalAccountId;
        }

        public final String getUpdatedAccountId() {
            return this.updatedAccountId;
        }
    }

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Args;", "<init>", "()V", "CREDIT_CARD_PLAID_SOURCE", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PlaidSdkFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PlaidSdkFragment plaidSdkFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, plaidSdkFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PlaidSdkFragment newInstance(Args args) {
            return (PlaidSdkFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PlaidSdkFragment plaidSdkFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, plaidSdkFragment, args);
        }
    }
}

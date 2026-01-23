package com.robinhood.android.lib.trade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.regiongate.CarRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Launch;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: BaseOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 e*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u00032\u00020\u0004:\u0001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u00104\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000305H&J\u0012\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\b\u0010V\u001a\u00020SH\u0016J\"\u0010W\u001a\u00020S2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020SH\u0016J\b\u0010^\u001a\u00020SH\u0014J\b\u0010_\u001a\u00020SH\u0014J\b\u0010`\u001a\u00020SH\u0014J\n\u0010a\u001a\u0004\u0018\u00010bH\u0016J\b\u0010c\u001a\u00020SH\u0004J\u0006\u0010d\u001a\u00020SR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u0004\u0018\u00010)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u000201X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00108R\u0014\u00109\u001a\u000207X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u000e\u0010;\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010<\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0004\n\u0002\u0010=R\u0014\u0010>\u001a\u000207X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b?\u00108R+\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020A8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010I\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u00108R\u0014\u0010K\u001a\u000207X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bL\u00108R(\u0010M\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020P Q*\n\u0012\u0004\u0012\u00020P\u0018\u00010O0O0NX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "<init>", "()V", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "getOrderSingletons", "()Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "setOrderSingletons", "(Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "getCombinedQuestionnaireStore", "()Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "getDayTradeStore", "()Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "getSuitabilityStore", "()Lcom/robinhood/store/base/SuitabilityStore;", "analyticsErrorString", "", "getAnalyticsErrorString", "()Ljava/lang/String;", "orderManager", "getOrderManager", "()Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "accountNumberObs", "Lio/reactivex/Observable;", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "createOrderConfirmationFragment", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "isConfirmationScreen", "", "()Z", "skipForceSuitability", "getSkipForceSuitability", "carLaunched", "forceSuitability", "Ljava/lang/Boolean;", "skipConfirmation", "getSkipConfirmation", "<set-?>", "Ljava/util/UUID;", "orderUuid", "getOrderUuid", "()Ljava/util/UUID;", "setOrderUuid", "(Ljava/util/UUID;)V", "orderUuid$delegate", "Lkotlin/properties/ReadWriteProperty;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "submittingConfirmationCombined", "getSubmittingConfirmationCombined", "carLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/common/contracts/CarIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onSubmissionFailure", "showOrderConfirmationFragment", "onShowOrderConfirmation", "onOrderSubmitting", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "onOrderFlowFinished", "finish", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseOrderParentFragment<OrderManagerT extends OrderSubmissionManager<?, ?>> extends BaseFragment implements BaseOrderFragment.Callbacks {
    private static final String ERROR_RESPONSE_TITLE_KEY = "title";
    private static final int REQUEST_SUITABILITY = 1;
    public static final String TAG_ORDER_CREATE_FRAGMENT = "orderCreateFragment";
    private boolean carLaunched;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CarIntentKey>> carLauncher;
    private Boolean forceSuitability;
    public BaseOrderParentFragmentSingletons orderSingletons;

    /* renamed from: orderUuid$delegate, reason: from kotlin metadata */
    private final Interfaces3 orderUuid;
    private final boolean skipConfirmation;
    private final boolean skipForceSuitability;
    private final boolean submittingConfirmationCombined;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseOrderParentFragment.class, "orderUuid", "getOrderUuid()Ljava/util/UUID;", 0))};
    public static final int $stable = 8;

    public abstract BaseOrderConfirmationFragment<?, ?> createOrderConfirmationFragment();

    public abstract Observable<String> getAccountNumberObs();

    public abstract String getAnalyticsErrorString();

    public abstract CarSuitabilityType getCarSuitabilityType();

    public abstract OrderManagerT getOrderManager();

    public abstract OrderSide getSide();

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    protected void onOrderSubmitting() {
    }

    protected void onShowOrderConfirmation() {
    }

    public BaseOrderParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.orderUuid = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
        this.submittingConfirmationCombined = true;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new CarContract(new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new BaseOrderParentFragment2(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.carLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final BaseOrderParentFragmentSingletons getOrderSingletons() {
        BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons = this.orderSingletons;
        if (baseOrderParentFragmentSingletons != null) {
            return baseOrderParentFragmentSingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderSingletons");
        return null;
    }

    public final void setOrderSingletons(BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons) {
        Intrinsics.checkNotNullParameter(baseOrderParentFragmentSingletons, "<set-?>");
        this.orderSingletons = baseOrderParentFragmentSingletons;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsLogger getAnalytics() {
        return getOrderSingletons().getAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CombinedQuestionnaireStore getCombinedQuestionnaireStore() {
        return getOrderSingletons().getCombinedQuestionnaireStore();
    }

    private final TraderDayTradeStore getDayTradeStore() {
        return getOrderSingletons().getDayTradeStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RegionGateProvider getRegionGateProvider() {
        return getOrderSingletons().getRegionGateProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SuitabilityStore getSuitabilityStore() {
        return getOrderSingletons().getSuitabilityStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConfirmationScreen() {
        return getCurrentFragment() instanceof BaseOrderConfirmationFragment;
    }

    public boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    protected boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment.Callbacks
    public UUID getOrderUuid() {
        return (UUID) this.orderUuid.getValue(this, $$delegatedProperties[0]);
    }

    public void setOrderUuid(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.orderUuid.setValue(this, $$delegatedProperties[0], uuid);
    }

    public boolean getSubmittingConfirmationCombined() {
        return this.submittingConfirmationCombined;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Preconditions.checkNotNull(getOrderUuid());
        Timber.INSTANCE.mo3356i("Order activity UUID %s", getOrderUuid());
        OrderSide side = getSide();
        if (side == null || getSkipForceSuitability()) {
            return;
        }
        getLifecycleScope().launchWhenCreated(new C206431(this, side, null));
    }

    /* compiled from: BaseOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {108, 188, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1 */
    static final class C206431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderSide $side;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206431(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, OrderSide orderSide, Continuation<? super C206431> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderParentFragment;
            this.$side = orderSide;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206431 c206431 = new C206431(this.this$0, this.$side, continuation);
            c206431.L$0 = obj;
            return c206431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            if (r4.invoke((com.robinhood.android.lib.trade.BaseOrderParentFragment3) r11) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r5.invoke((com.robinhood.android.lib.trade.BaseOrderParentFragment4) r11) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            C206431 c206431;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                RegionGateProvider regionGateProvider = this.this$0.getRegionGateProvider();
                CarRegionGate carRegionGate = CarRegionGate.INSTANCE;
                this.L$0 = coroutineScope;
                this.label = 1;
                c206431 = this;
                obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, carRegionGate, false, c206431, 2, null);
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
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            c206431 = this;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            BaseOrderParentFragment3 baseOrderParentFragment3 = new BaseOrderParentFragment3(c206431.this$0, c206431.$side, null);
            BaseOrderParentFragment4 baseOrderParentFragment4 = new BaseOrderParentFragment4(c206431.this$0, c206431.$side, coroutineScope, null);
            if (zBooleanValue) {
                c206431.L$0 = null;
                c206431.label = 2;
            } else {
                c206431.L$0 = null;
                c206431.label = 3;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getOrderManager().orderStateChanges(getOrderUuid())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseOrderParentFragment.onResume$lambda$1(this.f$0, (OrderSubmissionManager.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(final BaseOrderParentFragment baseOrderParentFragment, OrderSubmissionManager.Result result) throws Throwable {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof OrderSubmissionManager.Result.Sending) {
            baseOrderParentFragment.onOrderSubmitting();
            if (baseOrderParentFragment.getSubmittingConfirmationCombined()) {
                baseOrderParentFragment.showOrderConfirmationFragment();
            }
        } else if (result instanceof OrderSubmissionManager.Result.Submitted) {
            baseOrderParentFragment.showOrderConfirmationFragment();
        } else {
            if (!(result instanceof OrderSubmissionManager.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            final Throwable throwable = ((OrderSubmissionManager.Result.Failure) result).getThrowable();
            Timber.INSTANCE.mo3355e(throwable, "got error!", new Object[0]);
            final FragmentActivity fragmentActivityRequireActivity = baseOrderParentFragment.requireActivity();
            if (!AbsErrorHandler.handleError$default(new ActivityErrorHandler<Object>(baseOrderParentFragment, throwable, fragmentActivityRequireActivity) { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$onResume$1$handled$1
                final /* synthetic */ Throwable $throwable;
                final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                    this.this$0 = baseOrderParentFragment;
                    Intrinsics.checkNotNull(fragmentActivityRequireActivity);
                }

                @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
                public boolean handleErrorResponse(ErrorResponse errorResponse) {
                    Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                    Context context = this.this$0.getContext();
                    AppCompatActivity appCompatActivityRequireActivityBaseContext = context != null ? BaseContexts.requireActivityBaseContext(context) : null;
                    if (appCompatActivityRequireActivityBaseContext == null || appCompatActivityRequireActivityBaseContext.isFinishing()) {
                        return super.handleErrorResponse(errorResponse);
                    }
                    String fieldError = errorResponse.getFieldError("title");
                    String displayMessage = errorResponse.getDisplayMessage();
                    Integer httpStatusCode = Throwables.getHttpStatusCode(this.$throwable);
                    boolean z = httpStatusCode != null && httpStatusCode.intValue() == 400;
                    if (fieldError != null && displayMessage != null && z) {
                        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext).setId(C11048R.id.dialog_id_generic_error).setTitle(fieldError).setMessage(displayMessage);
                        FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        RhDialogFragment.Builder.show$default(message, supportFragmentManager, "error", false, 4, null);
                        return true;
                    }
                    return super.handleErrorResponse(errorResponse);
                }

                @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
                protected void showShortError(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    showLongError(message);
                }

                @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
                protected void showLongError(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.this$0.getAnalytics().logError(this.this$0.getAnalyticsErrorString(), message);
                    super.showLongError(message);
                }
            }, throwable, false, 2, null)) {
                throw throwable;
            }
            baseOrderParentFragment.onSubmissionFailure();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1 || resultCode == -1) {
            return;
        }
        finish();
    }

    public void onSubmissionFailure() {
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
    }

    protected void showOrderConfirmationFragment() {
        if (getSkipConfirmation()) {
            onOrderFlowFinished();
            return;
        }
        if (!isConfirmationScreen()) {
            new ReplaceFragmentBuilder(createOrderConfirmationFragment()).setUseDefaultAnimation(false).buildAndExecute(this);
        }
        onShowOrderConfirmation();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public Fragment getCurrentFragment() {
        Fragment currentFragment = super.getCurrentFragment();
        return currentFragment == null ? getParentFragmentManager().findFragmentByTag("orderCreateFragment") : currentFragment;
    }

    /* compiled from: BaseOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onOrderFlowFinished$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, 302}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onOrderFlowFinished$1 */
    static final class C206461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206461(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, Continuation<? super C206461> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206461 c206461 = new C206461(this.this$0, continuation);
            c206461.L$0 = obj;
            return c206461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                Observable<String> accountNumberObs = this.this$0.getAccountNumberObs();
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(accountNumberObs, this);
                if (objAwaitFirst != coroutine_suspended) {
                    coroutineScope = coroutineScope2;
                    obj = objAwaitFirst;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = (String) obj;
                if (str2 != null) {
                    Launch.launchMainImmediate$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, str2, str, null), 3, null);
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str3 = (String) obj;
            SuitabilityStore suitabilityStore = this.this$0.getSuitabilityStore();
            Intrinsics.checkNotNull(str3);
            this.L$0 = coroutineScope;
            this.L$1 = str3;
            this.label = 2;
            Object suitabilityQuestionnaireContext = suitabilityStore.getSuitabilityQuestionnaireContext(str3, this);
            if (suitabilityQuestionnaireContext != coroutine_suspended) {
                str = str3;
                obj = suitabilityQuestionnaireContext;
                str2 = (String) obj;
                if (str2 != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: BaseOrderParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onOrderFlowFinished$1$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onOrderFlowFinished$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ String $questionnaireContext;
            int label;
            final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseOrderParentFragment;
                this.$questionnaireContext = str;
                this.$accountNumber = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$questionnaireContext, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Questionnaire(false, this.$questionnaireContext, this.$accountNumber, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, null, null, 60, null);
                this.this$0.finish();
                return Unit.INSTANCE;
            }
        }
    }

    protected final void onOrderFlowFinished() {
        if (Intrinsics.areEqual(this.forceSuitability, Boolean.TRUE)) {
            getLifecycleScope().launchWhenCreated(new C206461(this, null));
        } else {
            finish();
        }
    }

    public final void finish() {
        getDayTradeStore().refresh(true);
        requireActivity().finish();
    }
}

package com.robinhood.android.lib.trade;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.regiongate.CarRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.store.base.DayTradeStore;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Launch;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: BaseOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000 u*\u0012\b\u0000\u0010\u0001 \u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006:\u0002tuB\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010I\u001a\u00028\u0001H&¢\u0006\u0002\u00104J\u0010\u0010J\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030KH&J\u0012\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_H\u0014J\b\u0010`\u001a\u00020]H\u0014J!\u0010a\u001a\u00020]2\u0006\u0010b\u001a\u00020c2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020]2\u0006\u0010g\u001a\u00020_H\u0014J\"\u0010h\u001a\u00020]2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b2\b\u0010k\u001a\u0004\u0018\u00010lH\u0014J\u0006\u0010m\u001a\u00020]J\b\u0010n\u001a\u00020]H\u0014J\b\u0010o\u001a\u000209H\u0014J\b\u0010p\u001a\u00020]H\u0014J\n\u0010q\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010r\u001a\u00020]H\u0016J\b\u0010s\u001a\u00020]H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00102\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00108\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010:R\u0014\u0010;\u001a\u000209X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u000e\u0010=\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010>\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0004\n\u0002\u0010?R\u0014\u0010@\u001a\u000209X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0012\u0010B\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0012\u0010E\u001a\u00020FX¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0012\u0010L\u001a\u00020MX¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0018\u0010P\u001a\b\u0012\u0004\u0012\u00020M0QX¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0012\u0010T\u001a\u00020UX¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0YX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderActivity;", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "OrderCreateFragmentT", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "contentLayoutId", "", "<init>", "(I)V", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "getCombinedQuestionnaireStore", "()Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "setCombinedQuestionnaireStore", "(Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;)V", "dayTradeStore", "Lcom/robinhood/store/base/DayTradeStore;", "getDayTradeStore", "()Lcom/robinhood/store/base/DayTradeStore;", "setDayTradeStore", "(Lcom/robinhood/store/base/DayTradeStore;)V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "getSuitabilityStore", "()Lcom/robinhood/store/base/SuitabilityStore;", "setSuitabilityStore", "(Lcom/robinhood/store/base/SuitabilityStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "<set-?>", "Ljava/util/UUID;", "orderUuid", "getOrderUuid", "()Ljava/util/UUID;", "setOrderUuid", "(Ljava/util/UUID;)V", "orderUuid$delegate", "Lkotlin/properties/ReadWriteProperty;", "orderCreateFragment", "getOrderCreateFragment", "()Landroidx/fragment/app/Fragment;", "setOrderCreateFragment", "(Landroidx/fragment/app/Fragment;)V", "Landroidx/fragment/app/Fragment;", "isConfirmationScreen", "", "()Z", "skipForceSuitability", "getSkipForceSuitability", "carLaunched", "forceSuitability", "Ljava/lang/Boolean;", "finishActivityAfterSuitabilityQuestionnaire", "getFinishActivityAfterSuitabilityQuestionnaire", "orderManager", "getOrderManager", "()Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "createOrderCreateFragment", "createOrderConfirmationFragment", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "analyticsErrorString", "", "getAnalyticsErrorString", "()Ljava/lang/String;", "accountNumberObs", "Lio/reactivex/Observable;", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "carLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/common/contracts/CarIntentKey;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSubmissionFailure", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "errorDialogThemeOverride", "(Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;Ljava/lang/Integer;)V", "onSaveInstanceState", "outState", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "ensureOrderCreateFragment", "onOrderSendingOrSubmitted", "allowShowingOrderConfirmation", "onShowOrderConfirmation", "getCurrentFragment", "onOrderFlowFinished", "finish", "BaseOrderActivityEntryPoint", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class BaseOrderActivity<OrderManagerT extends OrderSubmissionManager<?, ?>, OrderCreateFragmentT extends Fragment> extends BaseActivity implements BaseOrderFragment.Callbacks {
    private static final int REQUEST_SUITABILITY = 1;
    private static final String SAVE_UUID = "uuid";
    public static final String TAG_ORDER_CREATE_FRAGMENT = "orderCreateFragment";
    public AnalyticsLogger analytics;
    private boolean carLaunched;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<CarIntentKey>> carLauncher;
    public CombinedQuestionnaireStore combinedQuestionnaireStore;
    public DayTradeStore dayTradeStore;
    private final boolean finishActivityAfterSuitabilityQuestionnaire;
    private Boolean forceSuitability;
    public OrderCreateFragmentT orderCreateFragment;

    /* renamed from: orderUuid$delegate, reason: from kotlin metadata */
    private final Interfaces3 orderUuid;
    public RegionGateProvider regionGateProvider;
    private final boolean skipForceSuitability;
    public SuitabilityStore suitabilityStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseOrderActivity.class, "orderUuid", "getOrderUuid()Ljava/util/UUID;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG_ORDER_CONFIRMATION_FRAGMENT = "orderConfirmationFragment";

    /* compiled from: BaseOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderActivity$BaseOrderActivityEntryPoint;", "", "combinedQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "dayTradeStore", "Lcom/robinhood/store/base/DayTradeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface BaseOrderActivityEntryPoint {
        AnalyticsLogger analytics();

        CombinedQuestionnaireStore combinedQuestionnaireStore();

        DayTradeStore dayTradeStore();

        RegionGateProvider regionGateProvider();

        SuitabilityStore suitabilityStore();
    }

    protected static final String getTAG_ORDER_CONFIRMATION_FRAGMENT() {
        return INSTANCE.getTAG_ORDER_CONFIRMATION_FRAGMENT();
    }

    public abstract BaseOrderConfirmationFragment<?, ?> createOrderConfirmationFragment();

    public abstract OrderCreateFragmentT createOrderCreateFragment();

    public abstract Observable<String> getAccountNumberObs();

    public abstract String getAnalyticsErrorString();

    public abstract CarSuitabilityType getCarSuitabilityType();

    public abstract OrderManagerT getOrderManager();

    public abstract OrderSide getSide();

    protected void onShowOrderConfirmation() {
    }

    public BaseOrderActivity(int i) {
        super(i);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.orderUuid = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
        this.finishActivityAfterSuitabilityQuestionnaire = true;
        this.carLauncher = registerForActivityResult(new CarContract(new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new BaseOrderActivity2(this));
    }

    public final CombinedQuestionnaireStore getCombinedQuestionnaireStore() {
        CombinedQuestionnaireStore combinedQuestionnaireStore = this.combinedQuestionnaireStore;
        if (combinedQuestionnaireStore != null) {
            return combinedQuestionnaireStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("combinedQuestionnaireStore");
        return null;
    }

    public final void setCombinedQuestionnaireStore(CombinedQuestionnaireStore combinedQuestionnaireStore) {
        Intrinsics.checkNotNullParameter(combinedQuestionnaireStore, "<set-?>");
        this.combinedQuestionnaireStore = combinedQuestionnaireStore;
    }

    public final DayTradeStore getDayTradeStore() {
        DayTradeStore dayTradeStore = this.dayTradeStore;
        if (dayTradeStore != null) {
            return dayTradeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayTradeStore");
        return null;
    }

    public final void setDayTradeStore(DayTradeStore dayTradeStore) {
        Intrinsics.checkNotNullParameter(dayTradeStore, "<set-?>");
        this.dayTradeStore = dayTradeStore;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    public final SuitabilityStore getSuitabilityStore() {
        SuitabilityStore suitabilityStore = this.suitabilityStore;
        if (suitabilityStore != null) {
            return suitabilityStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suitabilityStore");
        return null;
    }

    public final void setSuitabilityStore(SuitabilityStore suitabilityStore) {
        Intrinsics.checkNotNullParameter(suitabilityStore, "<set-?>");
        this.suitabilityStore = suitabilityStore;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final void setOrderUuid(UUID uuid) {
        this.orderUuid.setValue(this, $$delegatedProperties[0], uuid);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment.Callbacks
    public final UUID getOrderUuid() {
        return (UUID) this.orderUuid.getValue(this, $$delegatedProperties[0]);
    }

    public final OrderCreateFragmentT getOrderCreateFragment() {
        OrderCreateFragmentT ordercreatefragmentt = this.orderCreateFragment;
        if (ordercreatefragmentt != null) {
            return ordercreatefragmentt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderCreateFragment");
        return null;
    }

    public final void setOrderCreateFragment(OrderCreateFragmentT ordercreatefragmentt) {
        Intrinsics.checkNotNullParameter(ordercreatefragmentt, "<set-?>");
        this.orderCreateFragment = ordercreatefragmentt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isConfirmationScreen() {
        return getCurrentFragment() instanceof BaseOrderConfirmationFragment;
    }

    public boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    public boolean getFinishActivityAfterSuitabilityQuestionnaire() {
        return this.finishActivityAfterSuitabilityQuestionnaire;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        BaseOrderActivityEntryPoint baseOrderActivityEntryPoint = (BaseOrderActivityEntryPoint) ((ApplicationComponentManagerHolder) ((Application) applicationContext)).getComponentManager().get();
        setCombinedQuestionnaireStore(baseOrderActivityEntryPoint.combinedQuestionnaireStore());
        setDayTradeStore(baseOrderActivityEntryPoint.dayTradeStore());
        setRegionGateProvider(baseOrderActivityEntryPoint.regionGateProvider());
        setSuitabilityStore(baseOrderActivityEntryPoint.suitabilityStore());
        setAnalytics(baseOrderActivityEntryPoint.analytics());
        Preconditions.checkNotNull(getOrderUuid());
        Timber.INSTANCE.mo3356i("Order activity UUID %s", getOrderUuid());
        if (getSkipForceSuitability()) {
            return;
        }
        getLifecycleScope().launchWhenCreated(new C206261(this, null));
    }

    /* compiled from: BaseOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1", m3645f = "BaseOrderActivity.kt", m3646l = {118, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 201}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1 */
    static final class C206261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C206261(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, Continuation<? super C206261> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206261 c206261 = new C206261(this.this$0, continuation);
            c206261.L$0 = obj;
            return c206261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (r4.invoke((com.robinhood.android.lib.trade.BaseOrderActivity3) r11) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        
            if (r5.invoke((com.robinhood.android.lib.trade.BaseOrderActivity4) r11) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            C206261 c206261;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                RegionGateProvider regionGateProvider = this.this$0.getRegionGateProvider();
                CarRegionGate carRegionGate = CarRegionGate.INSTANCE;
                this.L$0 = coroutineScope;
                this.label = 1;
                c206261 = this;
                obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, carRegionGate, false, c206261, 2, null);
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
            c206261 = this;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            BaseOrderActivity3 baseOrderActivity3 = new BaseOrderActivity3(c206261.this$0, null);
            BaseOrderActivity4 baseOrderActivity4 = new BaseOrderActivity4(c206261.this$0, coroutineScope, null);
            if (zBooleanValue) {
                c206261.L$0 = null;
                c206261.label = 2;
            } else {
                c206261.L$0 = null;
                c206261.label = 3;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Observable map = getOrderManager().orderStateChangesAfterSwipeAnimation().map(new Function() { // from class: com.robinhood.android.lib.trade.BaseOrderActivity$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((OrderSubmissionManager.Result) ((Optional) it).getOrNull());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((BaseOrderActivity$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilter = ObservablesKt.filterIsPresent(map).filter(new Predicate(this) { // from class: com.robinhood.android.lib.trade.BaseOrderActivity.onResume.2
            final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Predicate
            public final boolean test(OrderSubmissionManager.Result<? extends Object, ? extends Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Intrinsics.areEqual(it.getUuid(), this.this$0.getOrderUuid());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.trade.BaseOrderActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseOrderActivity.onResume$lambda$2(this.f$0, (OrderSubmissionManager.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(BaseOrderActivity baseOrderActivity, OrderSubmissionManager.Result result) throws Throwable {
        if ((result instanceof OrderSubmissionManager.Result.Sending) || (result instanceof OrderSubmissionManager.Result.Submitted)) {
            baseOrderActivity.onOrderSendingOrSubmitted();
        } else {
            if (!(result instanceof OrderSubmissionManager.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            onSubmissionFailure$default(baseOrderActivity, (OrderSubmissionManager.Result.Failure) result, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onSubmissionFailure$default(BaseOrderActivity baseOrderActivity, OrderSubmissionManager.Result.Failure failure, Integer num, int i, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSubmissionFailure");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        baseOrderActivity.onSubmissionFailure(failure, num);
    }

    protected void onSubmissionFailure(OrderSubmissionManager.Result.Failure result, final Integer errorDialogThemeOverride) throws Throwable {
        Intrinsics.checkNotNullParameter(result, "result");
        Throwable throwable = result.getThrowable();
        Timber.INSTANCE.mo3355e(throwable, "got error!", new Object[0]);
        if (!AbsErrorHandler.handleError$default(new ActivityErrorHandler<OptionOrder>(this, errorDialogThemeOverride) { // from class: com.robinhood.android.lib.trade.BaseOrderActivity$onSubmissionFailure$handled$1
            final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
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
        popEntireFragmentBackstack();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable(SAVE_UUID, getOrderUuid());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1 || resultCode == -1) {
            return;
        }
        finish();
    }

    public final void ensureOrderCreateFragment() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("orderCreateFragment");
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = createOrderCreateFragment();
            getSupportFragmentManager().beginTransaction().add(C20649R.id.fragment_container, fragmentFindFragmentByTag, "orderCreateFragment").commitAllowingStateLoss();
        }
        setOrderCreateFragment(fragmentFindFragmentByTag);
    }

    protected void onOrderSendingOrSubmitted() {
        if (allowShowingOrderConfirmation()) {
            new ReplaceFragmentBuilder(createOrderConfirmationFragment()).setUseDefaultAnimation(false).setTag(TAG_ORDER_CONFIRMATION_FRAGMENT).buildAndExecute(this);
        }
        onShowOrderConfirmation();
    }

    protected boolean allowShowingOrderConfirmation() {
        return !(getCurrentFragment() instanceof BaseOrderConfirmationFragment);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public Fragment getCurrentFragment() {
        Fragment currentFragment = super.getCurrentFragment();
        return currentFragment == null ? getSupportFragmentManager().findFragmentByTag("orderCreateFragment") : currentFragment;
    }

    /* compiled from: BaseOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onOrderFlowFinished$1", m3645f = "BaseOrderActivity.kt", m3646l = {353, EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onOrderFlowFinished$1 */
    static final class C206291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C206291(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, Continuation<? super C206291> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206291 c206291 = new C206291(this.this$0, continuation);
            c206291.L$0 = obj;
            return c206291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: BaseOrderActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onOrderFlowFinished$1$1", m3645f = "BaseOrderActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onOrderFlowFinished$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ String $questionnaireContext;
            int label;
            final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseOrderActivity;
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
                Navigator.DefaultImpls.startActivity$default(this.this$0.getNavigator(), this.this$0, new Questionnaire(false, this.$questionnaireContext, this.$accountNumber, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, null, null, 60, null);
                if (this.this$0.getFinishActivityAfterSuitabilityQuestionnaire()) {
                    this.this$0.finish();
                }
                return Unit.INSTANCE;
            }
        }
    }

    public void onOrderFlowFinished() {
        if (Intrinsics.areEqual(this.forceSuitability, Boolean.TRUE)) {
            getLifecycleScope().launchWhenCreated(new C206291(this, null));
        } else if (getFinishActivityAfterSuitabilityQuestionnaire()) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        getDayTradeStore().refresh(true);
        super.finish();
    }

    /* compiled from: BaseOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\u00058\u0004X\u0085D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderActivity$Companion;", "", "<init>", "()V", "SAVE_UUID", "", "TAG_ORDER_CREATE_FRAGMENT", "TAG_ORDER_CONFIRMATION_FRAGMENT", "getTAG_ORDER_CONFIRMATION_FRAGMENT$annotations", "getTAG_ORDER_CONFIRMATION_FRAGMENT", "()Ljava/lang/String;", "REQUEST_SUITABILITY", "", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        protected static /* synthetic */ void getTAG_ORDER_CONFIRMATION_FRAGMENT$annotations() {
        }

        private Companion() {
        }

        protected final String getTAG_ORDER_CONFIRMATION_FRAGMENT() {
            return BaseOrderActivity.TAG_ORDER_CONFIRMATION_FRAGMENT;
        }
    }
}

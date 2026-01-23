package com.robinhood.android.trade.options.education;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.trade.options.OptionOrderLoggings;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOrderEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/education/OptionOrderEducationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "analyticsLogger", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStop", "recordOptionOrderEducationNeverShowAgain", "type", "Lcom/robinhood/models/db/OptionOrderEducationType;", "logMarketOrdersScreenContinueButton", "logMarketOrderScreenCloseButton", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderEducationDuxo extends BaseDuxo4<OptionOrderEducationViewState> implements HasSavedState {
    private final AnalyticsLogger analyticsLogger;
    private final EventLogger eventLogger;
    private final OptionOrderDiscoveryStore optionOrderDiscoveryStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderEducationDuxo(AnalyticsLogger analyticsLogger, EventLogger eventLogger, OptionOrderDiscoveryStore optionOrderDiscoveryStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionOrderEducationViewState(((OptionOrderEducationFragmentKey) INSTANCE.getArgs(savedStateHandle)).getType()), duxoBundle);
        Intrinsics.checkNotNullParameter(analyticsLogger, "analyticsLogger");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analyticsLogger = analyticsLogger;
        this.eventLogger = eventLogger;
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C298251(null));
    }

    /* compiled from: OptionOrderEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.education.OptionOrderEducationDuxo$onCreate$1", m3645f = "OptionOrderEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.education.OptionOrderEducationDuxo$onCreate$1 */
    static final class C298251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: OptionOrderEducationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.options.education.OptionOrderEducationDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionOrderEducationType.values().length];
                try {
                    iArr[OptionOrderEducationType.STOP_MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionOrderEducationType.MARKET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C298251(Continuation<? super C298251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderEducationDuxo.this.new C298251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C298251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[((OptionOrderEducationFragmentKey) OptionOrderEducationDuxo.INSTANCE.getArgs((HasSavedState) OptionOrderEducationDuxo.this)).getType().ordinal()];
            if (i == 1) {
                EventLogger.DefaultImpls.logScreenAppear$default(OptionOrderEducationDuxo.this.eventLogger, null, OptionOrderLoggings.getSTOP_MARKET_NUX_SCREEN(), null, null, null, 29, null);
            } else if (i == 2) {
                Analytics3.logScreenAppear$default(OptionOrderEducationDuxo.this.analyticsLogger, "MarketOrdersEducationScreen", null, 2, null);
                EventLogger.DefaultImpls.logScreenAppear$default(OptionOrderEducationDuxo.this.eventLogger, null, new Screen(null, null, "MarketOrdersEducationScreen", null, 11, null), null, null, null, 29, null);
                EventLogger.DefaultImpls.logAppear$default(OptionOrderEducationDuxo.this.eventLogger, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.CLOSE_BUTTON, "market-orders-education-close-button", null, 4, null), null, null, 26, null);
                EventLogger.DefaultImpls.logAppear$default(OptionOrderEducationDuxo.this.eventLogger, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, "market-orders-education-confirm-button", null, 4, null), null, null, 26, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, OptionOrderLoggings.getSTOP_MARKET_NUX_SCREEN(), null, null, null, 29, null);
    }

    public final void recordOptionOrderEducationNeverShowAgain(OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.optionOrderDiscoveryStore.recordOptionOrderEducationNeverShowAgain(type2);
    }

    public final void logMarketOrdersScreenContinueButton() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(null, null, "MarketOrdersEducationScreen", null, 11, null), new Component(Component.ComponentType.BUTTON, "market-orders-education-confirm-button", null, 4, null), null, null, false, 56, null);
    }

    public final void logMarketOrderScreenCloseButton() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(null, null, "MarketOrdersEducationScreen", null, 11, null), new Component(Component.ComponentType.CLOSE_BUTTON, "market-orders-education-close-button", null, 4, null), null, null, false, 56, null);
    }

    /* compiled from: OptionOrderEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/education/OptionOrderEducationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationDuxo;", "Lcom/robinhood/android/trade/options/education/OptionOrderEducationFragmentKey;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOrderEducationDuxo, OptionOrderEducationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderEducationFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionOrderEducationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderEducationFragmentKey getArgs(OptionOrderEducationDuxo optionOrderEducationDuxo) {
            return (OptionOrderEducationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionOrderEducationDuxo);
        }
    }
}

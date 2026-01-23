package com.robinhood.android.optionsupgrade;

import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertViewState2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionAlertOnboardingStore;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsResponse;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import options_product.service.UpsellAlertRequestMetadataDto;

/* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertEvent;", "optionAlertOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionAlertOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "markOptionAlertOnboardingShown", "", "turnOnOptionAlert", "setLoadingNextScreens", "loading", "", "action", "Loptions_product/service/UpsellAlertRequestMetadataDto$ActionDto;", "Lcom/robinhood/android/optionsupgrade/UpsellAlertAction;", "setSystemSettingsEnabled", "systemNotificationEnabled", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAlertDuxo extends BaseDuxo5<OptionOnboardingUpsellAlertViewState, OptionOnboardingUpsellAlertViewState2> {
    public static final int $stable = 8;
    private final OptionAlertOnboardingStore optionAlertOnboardingStore;

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpsellAlertRequestMetadataDto.ActionDto.values().length];
            try {
                iArr[UpsellAlertRequestMetadataDto.ActionDto.ACTION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpsellAlertRequestMetadataDto.ActionDto.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpsellAlertRequestMetadataDto.ActionDto.NOT_NOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOnboardingUpsellAlertDuxo(OptionAlertOnboardingStore optionAlertOnboardingStore, DuxoBundle duxoBundle) {
        super(new OptionOnboardingUpsellAlertViewState(false, false, false, false, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(optionAlertOnboardingStore, "optionAlertOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.optionAlertOnboardingStore = optionAlertOnboardingStore;
    }

    public final void markOptionAlertOnboardingShown() {
        this.optionAlertOnboardingStore.markOptionAlertOnboardingShown();
    }

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$1", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$1 */
    static final class C250481 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C250481(Continuation<? super C250481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250481 c250481 = new C250481(continuation);
            c250481.L$0 = obj;
            return c250481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState> continuation) {
            return ((C250481) create(optionOnboardingUpsellAlertViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellAlertViewState.copy$default((OptionOnboardingUpsellAlertViewState) this.L$0, true, false, false, false, 14, null);
        }
    }

    public final void turnOnOptionAlert() {
        applyMutation(new C250481(null));
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C250492(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingUpsellAlertDuxo.turnOnOptionAlert$lambda$0(this.f$0, (ApiToggleAllOptionsPriceMovementAlertsResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingUpsellAlertDuxo.turnOnOptionAlert$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$2", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$turnOnOptionAlert$2 */
    static final class C250492 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse>, Object> {
        int label;

        C250492(Continuation<? super C250492> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellAlertDuxo.this.new C250492(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse> continuation) {
            return ((C250492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionAlertOnboardingStore optionAlertOnboardingStore = OptionOnboardingUpsellAlertDuxo.this.optionAlertOnboardingStore;
            this.label = 1;
            Object objTurnOnAllOptionsPriceMovementAlerts = optionAlertOnboardingStore.turnOnAllOptionsPriceMovementAlerts(this);
            return objTurnOnAllOptionsPriceMovementAlerts == coroutine_suspended ? coroutine_suspended : objTurnOnAllOptionsPriceMovementAlerts;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnOptionAlert$lambda$0(OptionOnboardingUpsellAlertDuxo optionOnboardingUpsellAlertDuxo, ApiToggleAllOptionsPriceMovementAlertsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        optionOnboardingUpsellAlertDuxo.applyMutation(new OptionOnboardingUpsellAlertDuxo2(null));
        if (response.getFailed_toggles() != null && (!r3.isEmpty())) {
            optionOnboardingUpsellAlertDuxo.submit(new OptionOnboardingUpsellAlertViewState2.Failure(new OptionOnboardingUpsellAlertDuxo4()));
        } else {
            optionOnboardingUpsellAlertDuxo.submit(OptionOnboardingUpsellAlertViewState2.Success.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnOptionAlert$lambda$1(OptionOnboardingUpsellAlertDuxo optionOnboardingUpsellAlertDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        optionOnboardingUpsellAlertDuxo.applyMutation(new OptionOnboardingUpsellAlertDuxo3(null));
        optionOnboardingUpsellAlertDuxo.submit(new OptionOnboardingUpsellAlertViewState2.Failure(throwable));
        return Unit.INSTANCE;
    }

    public final void setLoadingNextScreens(boolean loading, UpsellAlertRequestMetadataDto.ActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Action unspecified");
        }
        if (i == 2) {
            applyMutation(new C250451(loading, null));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C250462(loading, null));
        }
    }

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setLoadingNextScreens$1", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setLoadingNextScreens$1 */
    static final class C250451 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState>, Object> {
        final /* synthetic */ boolean $loading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250451(boolean z, Continuation<? super C250451> continuation) {
            super(2, continuation);
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250451 c250451 = new C250451(this.$loading, continuation);
            c250451.L$0 = obj;
            return c250451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState> continuation) {
            return ((C250451) create(optionOnboardingUpsellAlertViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellAlertViewState.copy$default((OptionOnboardingUpsellAlertViewState) this.L$0, false, this.$loading, false, false, 13, null);
        }
    }

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setLoadingNextScreens$2", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setLoadingNextScreens$2 */
    static final class C250462 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState>, Object> {
        final /* synthetic */ boolean $loading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250462(boolean z, Continuation<? super C250462> continuation) {
            super(2, continuation);
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250462 c250462 = new C250462(this.$loading, continuation);
            c250462.L$0 = obj;
            return c250462;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState> continuation) {
            return ((C250462) create(optionOnboardingUpsellAlertViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellAlertViewState.copy$default((OptionOnboardingUpsellAlertViewState) this.L$0, false, false, this.$loading, false, 11, null);
        }
    }

    /* compiled from: OptionOnboardingUpsellAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setSystemSettingsEnabled$1", m3645f = "OptionOnboardingUpsellAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertDuxo$setSystemSettingsEnabled$1 */
    static final class C250471 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState>, Object> {
        final /* synthetic */ boolean $systemNotificationEnabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250471(boolean z, Continuation<? super C250471> continuation) {
            super(2, continuation);
            this.$systemNotificationEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250471 c250471 = new C250471(this.$systemNotificationEnabled, continuation);
            c250471.L$0 = obj;
            return c250471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Continuation<? super OptionOnboardingUpsellAlertViewState> continuation) {
            return ((C250471) create(optionOnboardingUpsellAlertViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellAlertViewState.copy$default((OptionOnboardingUpsellAlertViewState) this.L$0, false, false, false, this.$systemNotificationEnabled, 7, null);
        }
    }

    public final void setSystemSettingsEnabled(boolean systemNotificationEnabled) {
        applyMutation(new C250471(systemNotificationEnabled, null));
    }
}

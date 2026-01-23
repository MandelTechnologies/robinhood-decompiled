package com.robinhood.android.optionsupgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationViewState2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.models.p320db.Account;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import options_product.service.UpsellTradeOnExpirationRequestMetadataDto;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "turnOnTradeOnExpiration", "setLoadingNextScreens", "loading", "", "action", "Loptions_product/service/UpsellTradeOnExpirationRequestMetadataDto$ActionDto;", "Lcom/robinhood/android/optionsupgrade/UpsellTradeOnExpirationAction;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellTradeOnExpirationDuxo extends BaseDuxo5<OptionOnboardingUpsellTradeOnExpirationViewState, OptionOnboardingUpsellTradeOnExpirationViewState2> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final OptionSettingsStore optionSettingsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpsellTradeOnExpirationRequestMetadataDto.ActionDto.values().length];
            try {
                iArr[UpsellTradeOnExpirationRequestMetadataDto.ActionDto.ACTION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpsellTradeOnExpirationRequestMetadataDto.ActionDto.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpsellTradeOnExpirationRequestMetadataDto.ActionDto.NOT_NOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOnboardingUpsellTradeOnExpirationDuxo(AccountProvider accountProvider, OptionSettingsStore optionSettingsStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionOnboardingUpsellTradeOnExpirationViewState(false, false, false, false, null, 31, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.optionSettingsStore = optionSettingsStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAccount(((ScreenArgs.UpsellTradeOnExpiration) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingUpsellTradeOnExpirationDuxo.onStart$lambda$0(this.f$0, (Account) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C250732(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionOnboardingUpsellTradeOnExpirationDuxo optionOnboardingUpsellTradeOnExpirationDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        optionOnboardingUpsellTradeOnExpirationDuxo.applyMutation(new OptionOnboardingUpsellTradeOnExpirationDuxo2(account, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2 */
    static final class C250732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250732(Continuation<? super C250732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellTradeOnExpirationDuxo.this.new C250732(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionOnboardingUpsellTradeOnExpirationDuxo.this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOnboardingUpsellTradeOnExpirationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionOnboardingUpsellTradeOnExpirationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOnboardingUpsellTradeOnExpirationDuxo optionOnboardingUpsellTradeOnExpirationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingUpsellTradeOnExpirationDuxo;
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

            /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2$1$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504311 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState>, Object> {
                final /* synthetic */ boolean $isMember;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504311(boolean z, Continuation<? super C504311> continuation) {
                    super(2, continuation);
                    this.$isMember = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504311 c504311 = new C504311(this.$isMember, continuation);
                    c504311.L$0 = obj;
                    return c504311;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState> continuation) {
                    return ((C504311) create(optionOnboardingUpsellTradeOnExpirationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOnboardingUpsellTradeOnExpirationViewState.copy$default((OptionOnboardingUpsellTradeOnExpirationViewState) this.L$0, false, false, false, this.$isMember, null, 23, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504311(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$turnOnTradeOnExpiration$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$turnOnTradeOnExpiration$1 */
    static final class C250761 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C250761(Continuation<? super C250761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250761 c250761 = new C250761(continuation);
            c250761.L$0 = obj;
            return c250761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState> continuation) {
            return ((C250761) create(optionOnboardingUpsellTradeOnExpirationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellTradeOnExpirationViewState.copy$default((OptionOnboardingUpsellTradeOnExpirationViewState) this.L$0, true, false, false, false, null, 30, null);
        }
    }

    public final void turnOnTradeOnExpiration() {
        applyMutation(new C250761(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.optionSettingsStore.toggleFridayTradingCompletable(((ScreenArgs.UpsellTradeOnExpiration) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOnboardingUpsellTradeOnExpirationDuxo.turnOnTradeOnExpiration$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingUpsellTradeOnExpirationDuxo.turnOnTradeOnExpiration$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnTradeOnExpiration$lambda$1(OptionOnboardingUpsellTradeOnExpirationDuxo optionOnboardingUpsellTradeOnExpirationDuxo) {
        optionOnboardingUpsellTradeOnExpirationDuxo.applyMutation(new OptionOnboardingUpsellTradeOnExpirationDuxo3(null));
        optionOnboardingUpsellTradeOnExpirationDuxo.submit(OptionOnboardingUpsellTradeOnExpirationViewState2.Success.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnTradeOnExpiration$lambda$2(OptionOnboardingUpsellTradeOnExpirationDuxo optionOnboardingUpsellTradeOnExpirationDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        optionOnboardingUpsellTradeOnExpirationDuxo.applyMutation(new OptionOnboardingUpsellTradeOnExpirationDuxo4(null));
        optionOnboardingUpsellTradeOnExpirationDuxo.submit(new OptionOnboardingUpsellTradeOnExpirationViewState2.Failure(throwable));
        return Unit.INSTANCE;
    }

    public final void setLoadingNextScreens(boolean loading, UpsellTradeOnExpirationRequestMetadataDto.ActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Action unspecified");
        }
        if (i == 2) {
            applyMutation(new C250741(loading, null));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C250752(loading, null));
        }
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$setLoadingNextScreens$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$setLoadingNextScreens$1 */
    static final class C250741 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState>, Object> {
        final /* synthetic */ boolean $loading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250741(boolean z, Continuation<? super C250741> continuation) {
            super(2, continuation);
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250741 c250741 = new C250741(this.$loading, continuation);
            c250741.L$0 = obj;
            return c250741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState> continuation) {
            return ((C250741) create(optionOnboardingUpsellTradeOnExpirationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellTradeOnExpirationViewState.copy$default((OptionOnboardingUpsellTradeOnExpirationViewState) this.L$0, false, this.$loading, false, false, null, 29, null);
        }
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$setLoadingNextScreens$2", m3645f = "OptionOnboardingUpsellTradeOnExpirationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationDuxo$setLoadingNextScreens$2 */
    static final class C250752 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState>, Object> {
        final /* synthetic */ boolean $loading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250752(boolean z, Continuation<? super C250752> continuation) {
            super(2, continuation);
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250752 c250752 = new C250752(this.$loading, continuation);
            c250752.L$0 = obj;
            return c250752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, Continuation<? super OptionOnboardingUpsellTradeOnExpirationViewState> continuation) {
            return ((C250752) create(optionOnboardingUpsellTradeOnExpirationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingUpsellTradeOnExpirationViewState.copy$default((OptionOnboardingUpsellTradeOnExpirationViewState) this.L$0, false, false, this.$loading, false, null, 27, null);
        }
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationDuxo;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellTradeOnExpiration;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOnboardingUpsellTradeOnExpirationDuxo, ScreenArgs.UpsellTradeOnExpiration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.UpsellTradeOnExpiration getArgs(SavedStateHandle savedStateHandle) {
            return (ScreenArgs.UpsellTradeOnExpiration) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.UpsellTradeOnExpiration getArgs(OptionOnboardingUpsellTradeOnExpirationDuxo optionOnboardingUpsellTradeOnExpirationDuxo) {
            return (ScreenArgs.UpsellTradeOnExpiration) DuxoCompanion.DefaultImpls.getArgs(this, optionOnboardingUpsellTradeOnExpirationDuxo);
        }
    }
}

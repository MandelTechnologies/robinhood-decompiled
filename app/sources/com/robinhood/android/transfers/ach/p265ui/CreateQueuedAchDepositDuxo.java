package com.robinhood.android.transfers.ach.p265ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.Logger;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsPotentialMicrogramSduiConverters;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositFragment;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.IavAccount;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService;
import com.robinhood.onboarding.goldearningspotential.contracts.InitializeGoldEarningsCalculatorResponse;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.text.ParseException;
import kotlin.Metadata;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.service.protocol.ProtocolExceptions5;

/* compiled from: CreateQueuedAchDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0017J\b\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sduiConverters", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsPotentialSduiConverters;Lmicrogram/android/inject/MicrogramComponent$Factory;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "goldEarningsPotential", "Lmicrogram/android/inject/MicrogramComponent;", "goldEarningsPotentialService", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;", "onCreate", "", "updateGoldCalculationWhenDepositAmountChange", "amount", "Ljava/math/BigDecimal;", "resetDepositHintAmount", "updateGoldEarningsPotential", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateQueuedAchDepositDuxo extends BaseDuxo4<CreateQueuedAchDepositViewState> implements HasSavedState {
    public static final String DEFAULT_AMOUNT_HINT_ZERO = "0.00";
    private final ExperimentsStore experimentsStore;
    private final MicrogramComponent goldEarningsPotential;
    private final GoldEarningsPotentialService goldEarningsPotentialService;
    private final SavedStateHandle savedStateHandle;
    private final GoldEarningsPotentialMicrogramSduiConverters sduiConverters;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateQueuedAchDepositDuxo(ExperimentsStore experimentsStore, GoldEarningsPotentialMicrogramSduiConverters sduiConverters, MicrogramComponent.Factory microgramComponentFactory, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new CreateQueuedAchDepositViewState(false, null, null, null, null, false, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sduiConverters, "sduiConverters");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.sduiConverters = sduiConverters;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-gold-earnings-potential", null, 2, null), null, 4, null);
        this.goldEarningsPotential = microgramComponentCreate$default;
        this.goldEarningsPotentialService = (GoldEarningsPotentialService) microgramComponentCreate$default.getServiceLocator().getClient(GoldEarningsPotentialService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        IavAccount account;
        super.onCreate();
        applyMutation(new C300971(null));
        Companion companion = INSTANCE;
        CreateIavAccountData accountData = ((CreateQueuedAchDepositFragment.Args) companion.getArgs((HasSavedState) this)).getTransferContext().getAccountData();
        BigDecimal balanceBestGuess = (accountData == null || (account = accountData.getAccount()) == null) ? null : account.getBalanceBestGuess();
        IavSource iavSource = ((CreateQueuedAchDepositFragment.Args) companion.getArgs((HasSavedState) this)).getTransferContext().getIavSource();
        if (iavSource != null && iavSource.isFromOnboarding() && balanceBestGuess != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C300982(balanceBestGuess, null), 3, null);
        } else {
            applyMutation(new C300993(null));
        }
    }

    /* compiled from: CreateQueuedAchDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$1", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$1 */
    static final class C300971 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C300971(Continuation<? super C300971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C300971 c300971 = new C300971(continuation);
            c300971.L$0 = obj;
            return c300971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
            return ((C300971) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, null, null, null, null, true, 31, null);
        }
    }

    /* compiled from: CreateQueuedAchDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2 */
    static final class C300982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BigDecimal $balance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C300982(BigDecimal bigDecimal, Continuation<? super C300982> continuation) {
            super(2, continuation);
            this.$balance = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateQueuedAchDepositDuxo.this.new C300982(this.$balance, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Number number;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldEarningsPotentialService goldEarningsPotentialService = CreateQueuedAchDepositDuxo.this.goldEarningsPotentialService;
                    double dDoubleValue = this.$balance.doubleValue();
                    this.label = 1;
                    obj = goldEarningsPotentialService.initPotentialGoldEarningsCalculator(dDoubleValue, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse = (InitializeGoldEarningsCalculatorResponse) obj;
                boolean enabled = initializeGoldEarningsCalculatorResponse.getEnabled();
                CreateQueuedAchDepositDuxo.this.applyMutation(new AnonymousClass1(enabled, null));
                if (enabled) {
                    String placeholder = initializeGoldEarningsCalculatorResponse.getPlaceholder();
                    if (placeholder == null) {
                        placeholder = CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO;
                    }
                    try {
                        number = Formats.getCurrencyFormat().parse("$" + placeholder);
                    } catch (ParseException unused) {
                        number = null;
                    }
                    if (number != null) {
                        CreateQueuedAchDepositDuxo.this.applyMutation(new AnonymousClass2(placeholder, null));
                    }
                    CreateQueuedAchDepositDuxo.this.updateGoldEarningsPotential();
                }
            } catch (Throwable th) {
                Logger.INSTANCE.mo1681e("Error calling app-gold-earnings-potential initPotentialGoldEarningsCalculator: " + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                CreateQueuedAchDepositDuxo.this.applyMutation(new AnonymousClass3(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CreateQueuedAchDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$1", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
            final /* synthetic */ boolean $goldCalculatorEnabled;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$goldCalculatorEnabled = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$goldCalculatorEnabled, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
                return ((AnonymousClass1) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, this.$goldCalculatorEnabled, null, null, null, null, false, 30, null);
            }
        }

        /* compiled from: CreateQueuedAchDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$2", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
            final /* synthetic */ String $amountHint;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$amountHint = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$amountHint, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
                return ((AnonymousClass2) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, null, this.$amountHint, null, null, false, 59, null);
            }
        }

        /* compiled from: CreateQueuedAchDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$3", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
                return ((AnonymousClass3) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, null, null, null, null, false, 31, null);
            }
        }
    }

    /* compiled from: CreateQueuedAchDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$3", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$onCreate$3 */
    static final class C300993 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C300993(Continuation<? super C300993> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C300993 c300993 = new C300993(continuation);
            c300993.L$0 = obj;
            return c300993;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
            return ((C300993) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, null, null, null, null, false, 31, null);
        }
    }

    public final void updateGoldCalculationWhenDepositAmountChange(final BigDecimal amount) {
        IavSource iavSource = ((CreateQueuedAchDepositFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferContext().getIavSource();
        if (iavSource == null || !iavSource.isFromOnboarding()) {
            return;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateQueuedAchDepositDuxo.updateGoldCalculationWhenDepositAmountChange$lambda$0(this.f$0, amount, (CreateQueuedAchDepositViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGoldCalculationWhenDepositAmountChange$lambda$0(CreateQueuedAchDepositDuxo createQueuedAchDepositDuxo, BigDecimal bigDecimal, CreateQueuedAchDepositViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!state.getGoldPotentialCalculatorEnabled()) {
            return Unit.INSTANCE;
        }
        createQueuedAchDepositDuxo.applyMutation(new CreateQueuedAchDepositDuxo3(bigDecimal, null));
        createQueuedAchDepositDuxo.updateGoldEarningsPotential();
        return Unit.INSTANCE;
    }

    public final void resetDepositHintAmount() {
        IavSource iavSource = ((CreateQueuedAchDepositFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferContext().getIavSource();
        if (iavSource == null || !iavSource.isFromOnboarding()) {
            return;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateQueuedAchDepositDuxo.resetDepositHintAmount$lambda$1(this.f$0, (CreateQueuedAchDepositViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetDepositHintAmount$lambda$1(CreateQueuedAchDepositDuxo createQueuedAchDepositDuxo, CreateQueuedAchDepositViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!state.getGoldPotentialCalculatorEnabled()) {
            return Unit.INSTANCE;
        }
        createQueuedAchDepositDuxo.applyMutation(new CreateQueuedAchDepositDuxo2(null));
        createQueuedAchDepositDuxo.updateGoldEarningsPotential();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGoldEarningsPotential() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateQueuedAchDepositDuxo.updateGoldEarningsPotential$lambda$2(this.f$0, (CreateQueuedAchDepositViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGoldEarningsPotential$lambda$2(CreateQueuedAchDepositDuxo createQueuedAchDepositDuxo, CreateQueuedAchDepositViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!state.getGoldPotentialCalculatorEnabled()) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(createQueuedAchDepositDuxo.getLifecycleScope(), null, null, new CreateQueuedAchDepositDuxo4(state, createQueuedAchDepositDuxo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateQueuedAchDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositDuxo;", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositFragment$Args;", "<init>", "()V", "DEFAULT_AMOUNT_HINT_ZERO", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateQueuedAchDepositDuxo, CreateQueuedAchDepositFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateQueuedAchDepositFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CreateQueuedAchDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateQueuedAchDepositFragment.Args getArgs(CreateQueuedAchDepositDuxo createQueuedAchDepositDuxo) {
            return (CreateQueuedAchDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, createQueuedAchDepositDuxo);
        }
    }
}

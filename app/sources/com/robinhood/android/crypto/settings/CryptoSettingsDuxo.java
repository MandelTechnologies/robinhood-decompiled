package com.robinhood.android.crypto.settings;

import android.net.Uri;
import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.settings.CryptoSettingsDuxo;
import com.robinhood.android.crypto.settings.CryptoSettingsEvent;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.crypto.p315ui.transfer.HigherWithdrawalLimit;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Instant;

/* compiled from: CryptoSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsEvent;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "suvWorkflowManager", "Lcom/robinhood/android/crypto/settings/CryptoSettingsStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/crypto/settings/CryptoSettingsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lcom/robinhood/models/crypto/ui/transfer/HigherWithdrawalLimit;", "makeRequestForHigherLimit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onCreate", "()V", "", "enabled", "setAllowlistingStatus", "(Z)V", "requestHigherWithdrawalLimit", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "Lcom/robinhood/shared/store/history/HistoryStore;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "j$/time/Instant", "limitWindowSharedFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoSettingsDuxo extends BaseDuxo3<CryptoSettingsDataState, CryptoSettingsViewState, CryptoSettingsEvent> {
    public static final int $stable = 8;
    private final CryptoSavedAddressesStore cryptoSavedAddressesStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CryptoExperimentsStore experimentsStore;
    private final HistoryStore historyStore;
    private final StateFlow2<Instant> limitWindowSharedFlow;
    private final SuvWorkflowManager suvWorkflowManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoSettingsDuxo(CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, HistoryStore historyStore, CryptoExperimentsStore experimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoSettingsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoSettingsDataState(null, false, null, false, false, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.historyStore = historyStore;
        this.experimentsStore = experimentsStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.limitWindowSharedFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C129951(null));
    }

    /* compiled from: CryptoSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1 */
    static final class C129951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C129951(Continuation<? super C129951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C129951 c129951 = CryptoSettingsDuxo.this.new C129951(continuation);
            c129951.L$0 = obj;
            return c129951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSettingsDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<CryptoTransferLimits> flowStreamLimitsFlow = this.this$0.cryptoTransfersStore.streamLimitsFlow();
                    C497391 c497391 = new C497391(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamLimitsFlow, c497391, this) == coroutine_suspended) {
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

            /* compiled from: CryptoSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "limits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497391 extends ContinuationImpl7 implements Function2<CryptoTransferLimits, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497391(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super C497391> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSettingsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497391 c497391 = new C497391(this.this$0, continuation);
                    c497391.L$0 = obj;
                    return c497391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferLimits cryptoTransferLimits, Continuation<? super Unit> continuation) {
                    return ((C497391) create(cryptoTransferLimits, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    CryptoTransferLimits cryptoTransferLimits;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoTransferLimits cryptoTransferLimits2 = (CryptoTransferLimits) this.L$0;
                        StateFlow2 stateFlow2 = this.this$0.limitWindowSharedFlow;
                        Instant windowStartTime = cryptoTransferLimits2.getWindowStartTime();
                        this.L$0 = cryptoTransferLimits2;
                        this.label = 1;
                        if (stateFlow2.emit(windowStartTime, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cryptoTransferLimits = cryptoTransferLimits2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cryptoTransferLimits = (CryptoTransferLimits) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.applyMutation(new C497401(cryptoTransferLimits, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CryptoSettingsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1$1$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497401 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
                    final /* synthetic */ CryptoTransferLimits $limits;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497401(CryptoTransferLimits cryptoTransferLimits, Continuation<? super C497401> continuation) {
                        super(2, continuation);
                        this.$limits = cryptoTransferLimits;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497401 c497401 = new C497401(this.$limits, continuation);
                        c497401.L$0 = obj;
                        return c497401;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                        return ((C497401) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, null, false, false, this.$limits, 31, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoSettingsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoSettingsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoSettingsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CryptoSettingsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2", m3645f = "CryptoSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSettingsDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.limitWindowSharedFlow), new C12990x267d9970(null, this.this$0));
                    C497412 c497412 = new C497412(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c497412, this) == coroutine_suspended) {
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

            /* compiled from: CryptoSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$2", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C497412 extends ContinuationImpl7 implements Function2<PagedList<StatefulHistoryEvent<? extends HistoryEvent>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497412(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super C497412> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSettingsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497412 c497412 = new C497412(this.this$0, continuation);
                    c497412.L$0 = obj;
                    return c497412;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, Continuation<? super Unit> continuation) {
                    return ((C497412) create(pagedList, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(PagedList<StatefulHistoryEvent<? extends HistoryEvent>> pagedList, Continuation<? super Unit> continuation) {
                    return invoke2((PagedList<StatefulHistoryEvent<HistoryEvent>>) pagedList, continuation);
                }

                /* compiled from: CryptoSettingsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$2$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
                    final /* synthetic */ PagedList<StatefulHistoryEvent<HistoryEvent>> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = pagedList;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, this.$it, false, null, false, false, null, 62, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PagedList) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$3", m3645f = "CryptoSettingsDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowStreamCryptoVolumeTiersDiscoveryExperiment = this.this$0.experimentsStore.streamCryptoVolumeTiersDiscoveryExperiment();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowStreamCryptoVolumeTiersDiscoveryExperiment, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new AnonymousClass1(Intrinsics.areEqual(obj, boxing.boxBoolean(true)), null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$3$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
                final /* synthetic */ boolean $isVolumeTiersDiscoveryExperimentEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isVolumeTiersDiscoveryExperimentEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isVolumeTiersDiscoveryExperimentEnabled, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, this.$isVolumeTiersDiscoveryExperimentEnabled, null, false, false, null, 61, null);
                }
            }
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4", m3645f = "CryptoSettingsDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, null, true, false, null, 55, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    Flow flowTransformLatest = FlowKt.transformLatest(Operators.combine(this.this$0.experimentsStore.streamCryptoTransfersSavedAddressesExperiment(), this.this$0.experimentsStore.streamCryptoTransfersAddressAllowlistingExperiment()), new C12991xd4b97b2e(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: CryptoSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "allowlistStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$3", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AllowlistStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoSettingsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AllowlistStatus allowlistStatus, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(allowlistStatus, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoSettingsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$3$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
                    final /* synthetic */ AllowlistStatus $allowlistStatus;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AllowlistStatus allowlistStatus, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$allowlistStatus = allowlistStatus;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowlistStatus, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, this.$allowlistStatus, false, false, null, 51, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((AllowlistStatus) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1 */
    static final class C129971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C129971(boolean z, Continuation<? super C129971> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoSettingsDuxo.this.new C129971(this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                return ((AnonymousClass1) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, null, false, true, null, 47, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoSettingsDuxo cryptoSettingsDuxo;
            AnonymousClass3 anonymousClass3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoSettingsDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoSavedAddressesStore cryptoSavedAddressesStore = CryptoSettingsDuxo.this.cryptoSavedAddressesStore;
                    boolean z = this.$enabled;
                    this.label = 1;
                    obj = cryptoSavedAddressesStore.setAllowlistingStatus(z, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoSettingsDuxo.this.applyMutation(new AnonymousClass2((AllowlistStatus) obj, null));
                cryptoSettingsDuxo = CryptoSettingsDuxo.this;
                anonymousClass3 = new AnonymousClass3(null);
            } catch (Throwable th) {
                try {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    CryptoSettingsDuxo.this.submit(new CryptoSettingsEvent.Error(th));
                    cryptoSettingsDuxo = CryptoSettingsDuxo.this;
                    anonymousClass3 = new AnonymousClass3(null);
                } catch (Throwable th2) {
                    CryptoSettingsDuxo.this.applyMutation(new AnonymousClass3(null));
                    throw th2;
                }
            }
            cryptoSettingsDuxo.applyMutation(anonymousClass3);
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$2", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
            final /* synthetic */ AllowlistStatus $newAllowlistingStatus;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AllowlistStatus allowlistStatus, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$newAllowlistingStatus = allowlistStatus;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$newAllowlistingStatus, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                return ((AnonymousClass2) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, this.$newAllowlistingStatus, false, false, null, 59, null);
            }
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$3", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$setAllowlistingStatus$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoSettingsDataState, Continuation<? super CryptoSettingsDataState>, Object> {
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
            public final Object invoke(CryptoSettingsDataState cryptoSettingsDataState, Continuation<? super CryptoSettingsDataState> continuation) {
                return ((AnonymousClass3) create(cryptoSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoSettingsDataState.copy$default((CryptoSettingsDataState) this.L$0, null, false, null, false, false, null, 47, null);
            }
        }
    }

    public final void setAllowlistingStatus(boolean enabled) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129971(enabled, null), 3, null);
    }

    /* compiled from: CryptoSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1 */
    static final class C129961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129961(Continuation<? super C129961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoSettingsDuxo.this.new C129961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SuvWorkflowManager suvWorkflowManager = CryptoSettingsDuxo.this.suvWorkflowManager;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoSettingsDuxo.this, null);
                final CryptoSettingsDuxo cryptoSettingsDuxo = CryptoSettingsDuxo.this;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoSettingsDuxo.C129961.invokeSuspend$lambda$0(cryptoSettingsDuxo, (HigherWithdrawalLimit) obj2);
                    }
                };
                final CryptoSettingsDuxo cryptoSettingsDuxo2 = CryptoSettingsDuxo.this;
                Function1<? super Throwable, Unit> function12 = new Function1() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoSettingsDuxo.C129961.invokeSuspend$lambda$1(cryptoSettingsDuxo2, (Throwable) obj2);
                    }
                };
                final CryptoSettingsDuxo cryptoSettingsDuxo3 = CryptoSettingsDuxo.this;
                suvWorkflowManager.handleRequest(anonymousClass1, function1, function12, new Function2() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoSettingsDuxo.C129961.invokeSuspend$lambda$2(cryptoSettingsDuxo3, (UUID) obj2, ((Boolean) obj3).booleanValue());
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/ui/transfer/HigherWithdrawalLimit;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$requestHigherWithdrawalLimit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super HigherWithdrawalLimit>, Object> {
            int label;
            final /* synthetic */ CryptoSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoSettingsDuxo cryptoSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = cryptoSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super HigherWithdrawalLimit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                CryptoSettingsDuxo cryptoSettingsDuxo = this.this$0;
                this.label = 1;
                Object objMakeRequestForHigherLimit = cryptoSettingsDuxo.makeRequestForHigherLimit(this);
                return objMakeRequestForHigherLimit == coroutine_suspended ? coroutine_suspended : objMakeRequestForHigherLimit;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CryptoSettingsDuxo cryptoSettingsDuxo, HigherWithdrawalLimit higherWithdrawalLimit) {
            cryptoSettingsDuxo.submit(new CryptoSettingsEvent.Deeplink(Uri.parse(higherWithdrawalLimit.getDeeplink())));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CryptoSettingsDuxo cryptoSettingsDuxo, Throwable th) {
            cryptoSettingsDuxo.submit(new CryptoSettingsEvent.Error(th));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(CryptoSettingsDuxo cryptoSettingsDuxo, UUID uuid, boolean z) {
            cryptoSettingsDuxo.submit(new CryptoSettingsEvent.SuvRequired(uuid, z));
            return Unit.INSTANCE;
        }
    }

    public final void requestHigherWithdrawalLimit() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129961(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequestForHigherLimit(Continuation<? super HigherWithdrawalLimit> continuation) {
        return this.cryptoTransfersStore.requestHigherWithdrawalLimit(continuation);
    }
}

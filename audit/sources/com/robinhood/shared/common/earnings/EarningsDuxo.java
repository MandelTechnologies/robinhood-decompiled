package com.robinhood.shared.common.earnings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.equities.store.earning.EarningStore;
import equity_earnings.proto.p458v1.EquityEarningsService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: EarningsDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/common/earnings/EarningsDataState;", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/common/earnings/EarningsDuxo$InitArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/common/earnings/EarningsStateProvider;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "earningStore", "Lcom/robinhood/shared/equities/store/earning/EarningStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/common/earnings/EarningsStateProvider;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/shared/equities/store/earning/EarningStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "earningsService", "Lequity_earnings/proto/v1/EquityEarningsService;", "onCreate", "", "InitArgs", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EarningsDuxo extends BaseDuxo<EarningsDataState, EarningsViewState> implements HasArgs<InitArgs> {
    public static final int $stable = 8;
    private final EarningStore earningStore;
    private final EquityEarningsService earningsService;
    private final MicrogramManager2 microgramInstance;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsDuxo(DuxoBundle duxoBundle, EarningsStateProvider stateProvider, MicrogramManager microgramManager, EarningStore earningStore, SavedStateHandle savedStateHandle) {
        super(new EarningsDataState(null, false, null, null, false, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(earningStore, "earningStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.earningStore = earningStore;
        this.savedStateHandle = savedStateHandle;
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-equity-earnings", null, 2, null), null, 2, null), null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        this.earningsService = (EquityEarningsService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(EquityEarningsService.class);
    }

    /* compiled from: EarningsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1", m3645f = "EarningsDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1 */
    static final class C374491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C374491(Continuation<? super C374491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EarningsDuxo.this.new C374491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EarningStore earningStore = EarningsDuxo.this.earningStore;
                EarningsDuxo earningsDuxo = EarningsDuxo.this;
                Flow flowTransformLatest = FlowKt.transformLatest(earningStore.streamEarnings(((InitArgs) earningsDuxo.getArgs(earningsDuxo.getSavedStateHandle())).getInstrumentUuid()), new EarningsDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(null, EarningsDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EarningsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EarningsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lrh_server_driven_ui/v1/ChartGroupDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$2", m3645f = "EarningsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ChartGroupDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EarningsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EarningsDuxo earningsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = earningsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChartGroupDto chartGroupDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(chartGroupDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EarningsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/common/earnings/EarningsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$2$1", m3645f = "EarningsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EarningsDataState, Continuation<? super EarningsDataState>, Object> {
                final /* synthetic */ ChartGroupDto $chartData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ChartGroupDto chartGroupDto, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chartData = chartGroupDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EarningsDataState earningsDataState, Continuation<? super EarningsDataState> continuation) {
                    return ((AnonymousClass1) create(earningsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EarningsDataState earningsDataState = (EarningsDataState) this.L$0;
                    ChartGroupDto chartGroupDto = this.$chartData;
                    return EarningsDataState.copy$default(earningsDataState, null, false, null, chartGroupDto, chartGroupDto == null, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ChartGroupDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C374491(null));
    }

    /* compiled from: EarningsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/common/earnings/EarningsDuxo$InitArgs;", "Landroid/os/Parcelable;", "instrumentUuid", "Ljava/util/UUID;", "showHeader", "", "headerOverride", "", "<init>", "(Ljava/util/UUID;ZLjava/lang/String;)V", "getInstrumentUuid", "()Ljava/util/UUID;", "getShowHeader", "()Z", "getHeaderOverride", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-earnings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String headerOverride;
        private final UUID instrumentUuid;
        private final boolean showHeader;

        /* compiled from: EarningsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.instrumentUuid;
            }
            if ((i & 2) != 0) {
                z = initArgs.showHeader;
            }
            if ((i & 4) != 0) {
                str = initArgs.headerOverride;
            }
            return initArgs.copy(uuid, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentUuid() {
            return this.instrumentUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowHeader() {
            return this.showHeader;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeaderOverride() {
            return this.headerOverride;
        }

        public final InitArgs copy(UUID instrumentUuid, boolean showHeader, String headerOverride) {
            Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
            return new InitArgs(instrumentUuid, showHeader, headerOverride);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.instrumentUuid, initArgs.instrumentUuid) && this.showHeader == initArgs.showHeader && Intrinsics.areEqual(this.headerOverride, initArgs.headerOverride);
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentUuid.hashCode() * 31) + Boolean.hashCode(this.showHeader)) * 31;
            String str = this.headerOverride;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InitArgs(instrumentUuid=" + this.instrumentUuid + ", showHeader=" + this.showHeader + ", headerOverride=" + this.headerOverride + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentUuid);
            dest.writeInt(this.showHeader ? 1 : 0);
            dest.writeString(this.headerOverride);
        }

        public InitArgs(UUID instrumentUuid, boolean z, String str) {
            Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
            this.instrumentUuid = instrumentUuid;
            this.showHeader = z;
            this.headerOverride = str;
        }

        public final UUID getInstrumentUuid() {
            return this.instrumentUuid;
        }

        public final boolean getShowHeader() {
            return this.showHeader;
        }

        public final String getHeaderOverride() {
            return this.headerOverride;
        }
    }
}

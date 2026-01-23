package com.robinhood.android.isa.contributions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.isa.IsaContributionStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: IsaContributionBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0014\u0015B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo$InitArgs;", "contributionStore", "Lcom/robinhood/store/isa/IsaContributionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/isa/IsaContributionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaContributionBottomSheetDuxo extends BaseDuxo<IsaContributionBottomSheetDataState, IsaContributionBottomSheetViewState> implements HasArgs<InitArgs> {
    private final IsaContributionStore contributionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaContributionBottomSheetDuxo(IsaContributionStore contributionStore, SavedStateHandle savedStateHandle, IsaContributionBottomSheetDuxo3 stateProvider, DuxoBundle duxoBundle) {
        super(new IsaContributionBottomSheetDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.contributionStore = contributionStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C198751(((InitArgs) getArgs(getSavedStateHandle())).getTaxYear(), null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C198762(null));
    }

    /* compiled from: IsaContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$1", m3645f = "IsaContributionBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$1 */
    static final class C198751 extends ContinuationImpl7 implements Function2<IsaContributionBottomSheetDataState, Continuation<? super IsaContributionBottomSheetDataState>, Object> {
        final /* synthetic */ int $taxYear;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C198751(int i, Continuation<? super C198751> continuation) {
            super(2, continuation);
            this.$taxYear = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C198751 c198751 = new C198751(this.$taxYear, continuation);
            c198751.L$0 = obj;
            return c198751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IsaContributionBottomSheetDataState isaContributionBottomSheetDataState, Continuation<? super IsaContributionBottomSheetDataState> continuation) {
            return ((C198751) create(isaContributionBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IsaContributionBottomSheetDataState.copy$default((IsaContributionBottomSheetDataState) this.L$0, null, boxing.boxInt(this.$taxYear), 1, null);
        }
    }

    /* compiled from: IsaContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2", m3645f = "IsaContributionBottomSheetDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2 */
    static final class C198762 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C198762(Continuation<? super C198762> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaContributionBottomSheetDuxo.this.new C198762(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C198762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IsaContributionStore isaContributionStore = IsaContributionBottomSheetDuxo.this.contributionStore;
                IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo = IsaContributionBottomSheetDuxo.this;
                Flow<IsaContributions> flowStreamContributions = isaContributionStore.streamContributions(((InitArgs) isaContributionBottomSheetDuxo.getArgs(isaContributionBottomSheetDuxo.getSavedStateHandle())).getAccountNumber(), TransactionTypeDto.CONTRIBUTION_REGULAR);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IsaContributionBottomSheetDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamContributions, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IsaContributionBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contributions", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2$1", m3645f = "IsaContributionBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IsaContributions, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaContributionBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = isaContributionBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IsaContributions isaContributions, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(isaContributions, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IsaContributionBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2$1$1", m3645f = "IsaContributionBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502391 extends ContinuationImpl7 implements Function2<IsaContributionBottomSheetDataState, Continuation<? super IsaContributionBottomSheetDataState>, Object> {
                final /* synthetic */ IsaContributions $contributions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502391(IsaContributions isaContributions, Continuation<? super C502391> continuation) {
                    super(2, continuation);
                    this.$contributions = isaContributions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502391 c502391 = new C502391(this.$contributions, continuation);
                    c502391.L$0 = obj;
                    return c502391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaContributionBottomSheetDataState isaContributionBottomSheetDataState, Continuation<? super IsaContributionBottomSheetDataState> continuation) {
                    return ((C502391) create(isaContributionBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IsaContributionBottomSheetDataState.copy$default((IsaContributionBottomSheetDataState) this.L$0, this.$contributions, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502391((IsaContributions) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IsaContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo$InitArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "taxYear", "", "<init>", "(Ljava/lang/String;I)V", "getAccountNumber", "()Ljava/lang/String;", "getTaxYear", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String accountNumber;
        private final int taxYear;

        /* compiled from: IsaContributionBottomSheetDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = initArgs.accountNumber;
            }
            if ((i2 & 2) != 0) {
                i = initArgs.taxYear;
            }
            return initArgs.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTaxYear() {
            return this.taxYear;
        }

        public final InitArgs copy(String accountNumber, int taxYear) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new InitArgs(accountNumber, taxYear);
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
            return Intrinsics.areEqual(this.accountNumber, initArgs.accountNumber) && this.taxYear == initArgs.taxYear;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + Integer.hashCode(this.taxYear);
        }

        public String toString() {
            return "InitArgs(accountNumber=" + this.accountNumber + ", taxYear=" + this.taxYear + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.taxYear);
        }

        public InitArgs(String accountNumber, int i) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.taxYear = i;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final int getTaxYear() {
            return this.taxYear;
        }
    }

    /* compiled from: IsaContributionBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo;", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo$InitArgs;", "<init>", "()V", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<IsaContributionBottomSheetDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, isaContributionBottomSheetDuxo);
        }
    }
}

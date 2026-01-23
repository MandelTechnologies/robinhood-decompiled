package com.robinhood.shared.crypto.history.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionState;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHistorySectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u001a\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Args;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "cryptoAccountFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "getCryptoAccountFlow$lib_history_section_externalDebug$annotations", "()V", "getCryptoAccountFlow$lib_history_section_externalDebug", "()Lkotlinx/coroutines/flow/Flow;", "onCreate", "", "Args", "Companion", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoHistorySectionDuxo extends BaseDuxo4<CryptoHistorySectionState> implements HasArgs<Args> {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: getCryptoAccountFlow$lib_history_section_externalDebug$annotations */
    public static /* synthetic */ void m2771x596bf6e9() {
    }

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHistorySectionDuxo(CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(((Args) INSTANCE.getArgs(savedStateHandle)).getState(), duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final Flow<CryptoAccount> getCryptoAccountFlow$lib_history_section_externalDebug() {
        CryptoAccountSwitcherLocation location = ((Args) INSTANCE.getArgs((HasArgs) this)).getLocation();
        if (location instanceof CryptoAccountSwitcherLocation.WithCurrencyPair) {
            return this.cryptoAccountProvider.streamCryptoAccount(location);
        }
        if (location instanceof CryptoAccountSwitcherLocation.WithoutCurrencyPair) {
            return this.cryptoAccountProvider.streamCryptoAccount(location);
        }
        if (location != null) {
            throw new NoWhenBranchMatchedException();
        }
        return FlowKt.emptyFlow();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        CryptoAccountSwitcherLocation location = ((Args) companion.getArgs((HasArgs) this)).getLocation();
        if ((((Args) companion.getArgs((HasArgs) this)).getState() instanceof CryptoHistorySectionState.Perpetuals) || location == null) {
            return;
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C377051(null));
    }

    /* compiled from: CryptoHistorySectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1", m3645f = "CryptoHistorySectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1 */
    static final class C377051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C377051(Continuation<? super C377051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHistorySectionDuxo.this.new C377051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoHistorySectionDuxo.this.getCryptoAccountFlow$lib_history_section_externalDebug(), CryptoHistorySectionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHistorySectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHistorySectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/crypto/db/CryptoAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1$1", m3645f = "CryptoHistorySectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoAccount, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHistorySectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHistorySectionDuxo cryptoHistorySectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHistorySectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoAccount cryptoAccount, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoAccount, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHistorySectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1$1$1", m3645f = "CryptoHistorySectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506831 extends ContinuationImpl7 implements Function2<CryptoHistorySectionState, Continuation<? super CryptoHistorySectionState>, Object> {
                final /* synthetic */ CryptoAccount $account;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506831(CryptoAccount cryptoAccount, Continuation<? super C506831> continuation) {
                    super(2, continuation);
                    this.$account = cryptoAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506831 c506831 = new C506831(this.$account, continuation);
                    c506831.L$0 = obj;
                    return c506831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHistorySectionState cryptoHistorySectionState, Continuation<? super CryptoHistorySectionState> continuation) {
                    return ((C506831) create(cryptoHistorySectionState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    UUID uuid;
                    BrokerageAccountType accountType;
                    String id;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoHistorySectionState cryptoHistorySectionState = (CryptoHistorySectionState) this.L$0;
                    if (!(cryptoHistorySectionState instanceof CryptoHistorySectionState.Crypto)) {
                        return cryptoHistorySectionState;
                    }
                    CryptoHistorySectionState.Crypto crypto2 = (CryptoHistorySectionState.Crypto) cryptoHistorySectionState;
                    CryptoAccount cryptoAccount = this.$account;
                    if (cryptoAccount == null || (id = cryptoAccount.getId()) == null) {
                        uuid = null;
                    } else {
                        try {
                            uuid = StringsKt.toUuid(id);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    CryptoAccount cryptoAccount2 = this.$account;
                    if (cryptoAccount2 == null || (accountType = cryptoAccount2.getAccountType()) == null) {
                        accountType = BrokerageAccountType.UNKNOWN;
                    }
                    return CryptoHistorySectionState.Crypto.copy$default(crypto2, null, new HistoryStaticFilter.NummusAccountContext(uuid, accountType), 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506831((CryptoAccount) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoHistorySectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Args;", "Landroid/os/Parcelable;", "state", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "<init>", "(Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;)V", "getState", "()Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "getLocation", "()Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoAccountSwitcherLocation location;
        private final CryptoHistorySectionState state;

        /* compiled from: CryptoHistorySectionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CryptoHistorySectionState) parcel.readParcelable(Args.class.getClassLoader()), (CryptoAccountSwitcherLocation) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CryptoHistorySectionState cryptoHistorySectionState, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoHistorySectionState = args.state;
            }
            if ((i & 2) != 0) {
                cryptoAccountSwitcherLocation = args.location;
            }
            return args.copy(cryptoHistorySectionState, cryptoAccountSwitcherLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoHistorySectionState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoAccountSwitcherLocation getLocation() {
            return this.location;
        }

        public final Args copy(CryptoHistorySectionState state, CryptoAccountSwitcherLocation location) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Args(state, location);
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
            return Intrinsics.areEqual(this.state, args.state) && Intrinsics.areEqual(this.location, args.location);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation = this.location;
            return iHashCode + (cryptoAccountSwitcherLocation == null ? 0 : cryptoAccountSwitcherLocation.hashCode());
        }

        public String toString() {
            return "Args(state=" + this.state + ", location=" + this.location + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.state, flags);
            dest.writeParcelable(this.location, flags);
        }

        public Args(CryptoHistorySectionState state, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.location = cryptoAccountSwitcherLocation;
        }

        public final CryptoHistorySectionState getState() {
            return this.state;
        }

        public final CryptoAccountSwitcherLocation getLocation() {
            return this.location;
        }
    }

    /* compiled from: CryptoHistorySectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionDuxo$Args;", "<init>", "()V", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoHistorySectionDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(CryptoHistorySectionDuxo cryptoHistorySectionDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoHistorySectionDuxo);
        }
    }
}

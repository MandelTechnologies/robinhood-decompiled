package com.robinhood.shared.crypto.buttonBar;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualButtons;
import com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import com.robinhood.shared.security.auth.AuthManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.PackagePreloader;
import microgram.android.RemoteMicrogramApplication;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoButtonBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00016Bi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010#\u001a\u00020$H\u0016J\f\u0010%\u001a\u00020$*\u00020&H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0082@¢\u0006\u0002\u00100J\u001d\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/buttonBar/CryptoTradeBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "perpetualsButtonsStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsButtonsStore;", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/buttonBar/CryptoTradeBarStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/librobinhood/data/store/CryptobilityStore;Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/crypto/perpetuals/store/PerpetualsButtonsStore;Lmicrogram/android/PackagePreloader;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "onCreate", "", "loadHomeButtons", "Lkotlinx/coroutines/CoroutineScope;", "loadCryptoButtons", "cryptoArgs", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Crypto;", "setSelectedAccount", "accountNumber", "", "loadPerpetualButtons", "perpetualArgs", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Perpetuals;", "(Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Perpetuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLoading", AnnotatedPrivateKey.LABEL, "isLoading", "", "updateLoading$lib_crypto_button_bar_externalDebug", "Companion", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoButtonBarDuxo extends BaseDuxo<CryptoButtonBarDataState, CryptoButtonBarViewState> implements HasArgs<CryptoButtonBarArgs> {
    private final CryptoButtonBarArgs args;
    private final AuthManager authManager;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHomeStore cryptoHomeStore;
    private final CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore;
    private final CryptobilityStore cryptobilityStore;
    private final PackagePreloader packagePreloader;
    private final PerpetualsButtonsStore perpetualsButtonsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoButtonBarArgs getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoButtonBarArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoButtonBarDuxo(DuxoBundle duxoBundle, CryptoTradeBarStateProvider stateProvider, SavedStateHandle savedStateHandle, AuthManager authManager, CryptobilityStore cryptobilityStore, CryptoHomeStore cryptoHomeStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, PerpetualsButtonsStore perpetualsButtonsStore, PackagePreloader packagePreloader, CryptoExperimentsStore cryptoExperimentsStore) {
        super(new CryptoButtonBarDataState((CryptoButtonBarArgs) INSTANCE.getArgs(savedStateHandle), null, null, null, null, false, null, null, null, null, 1022, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(perpetualsButtonsStore, "perpetualsButtonsStore");
        Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.savedStateHandle = savedStateHandle;
        this.authManager = authManager;
        this.cryptobilityStore = cryptobilityStore;
        this.cryptoHomeStore = cryptoHomeStore;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoNonCurrencyPairAccountSwitcherStore = cryptoNonCurrencyPairAccountSwitcherStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.perpetualsButtonsStore = perpetualsButtonsStore;
        this.packagePreloader = packagePreloader;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.args = (CryptoButtonBarArgs) getArgs(getSavedStateHandle());
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1 */
    static final class C376121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C376121(Continuation<? super C376121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C376121 c376121 = CryptoButtonBarDuxo.this.new C376121(continuation);
            c376121.L$0 = obj;
            return c376121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (CryptoButtonBarDuxo.this.authManager.isLoggedIn()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoButtonBarDuxo.this, null), 3, null);
                    CryptoAccountSwitcherLocation location = CryptoButtonBarArgs2.getLocation(CryptoButtonBarDuxo.this.args);
                    if (location != null) {
                        CryptoButtonBarDuxo cryptoButtonBarDuxo = CryptoButtonBarDuxo.this;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoButtonBarDuxo2(cryptoButtonBarDuxo, location, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoButtonBarDuxo3(cryptoButtonBarDuxo, location, null), 3, null);
                    }
                    CryptoButtonBarArgs cryptoButtonBarArgs = CryptoButtonBarDuxo.this.args;
                    if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Home) {
                        CryptoButtonBarDuxo.this.loadHomeButtons(coroutineScope);
                    } else if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Crypto) {
                        CryptoButtonBarDuxo cryptoButtonBarDuxo2 = CryptoButtonBarDuxo.this;
                        cryptoButtonBarDuxo2.loadCryptoButtons((CryptoButtonBarArgs.Crypto) cryptoButtonBarDuxo2.args);
                    } else if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Perpetuals) {
                        CryptoButtonBarDuxo cryptoButtonBarDuxo3 = CryptoButtonBarDuxo.this;
                        CryptoButtonBarArgs.Perpetuals perpetuals = (CryptoButtonBarArgs.Perpetuals) cryptoButtonBarDuxo3.args;
                        this.label = 1;
                        if (cryptoButtonBarDuxo3.loadPerpetualButtons(perpetuals, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoButtonBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoButtonBarDuxo;
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
                    Flow<Boolean> flowStreamCryptoMibExperiment = this.this$0.cryptoExperimentsStore.streamCryptoMibExperiment();
                    C506811 c506811 = new C506811(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, c506811, this) == coroutine_suspended) {
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

            /* compiled from: CryptoButtonBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506811 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CryptoButtonBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506811(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super C506811> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoButtonBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506811 c506811 = new C506811(this.this$0, continuation);
                    c506811.Z$0 = ((Boolean) obj).booleanValue();
                    return c506811;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C506811) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoButtonBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C506821 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506821(boolean z, Continuation<? super C506821> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506821 c506821 = new C506821(this.$it, continuation);
                        c506821.L$0 = obj;
                        return c506821;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                        return ((C506821) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, null, null, this.$it, null, null, null, null, 991, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506821(this.Z$0, null));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C376121(null));
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1 */
    static final class C376091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C376091(Continuation<? super C376091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoButtonBarDuxo.this.new C376091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoButtonBarDuxo.this.cryptoHomeStore.streamCryptoHomeCtaButtons(), CryptoButtonBarDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoButtonBarDuxo.this, null);
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

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "homeButtons", "Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeCtaButtons, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoButtonBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoButtonBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoHomeCtaButtons cryptoHomeCtaButtons, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoHomeCtaButtons, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoButtonBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506791 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
                final /* synthetic */ CryptoHomeCtaButtons $homeButtons;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506791(CryptoHomeCtaButtons cryptoHomeCtaButtons, Continuation<? super C506791> continuation) {
                    super(2, continuation);
                    this.$homeButtons = cryptoHomeCtaButtons;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506791 c506791 = new C506791(this.$homeButtons, continuation);
                    c506791.L$0 = obj;
                    return c506791;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                    return ((C506791) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, this.$homeButtons, null, false, null, null, null, null, 1015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506791((CryptoHomeCtaButtons) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHomeButtons(CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C376091(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C376102(null), 3, null);
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2 */
    static final class C376102 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C376102(Continuation<? super C376102> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoButtonBarDuxo.this.new C376102(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376102) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoButtonBarDuxo.this.cryptoNonCurrencyPairAccountSwitcherStore.streamNonCurrencyPairAccountSwitcher(), CryptoButtonBarDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoButtonBarDuxo.this, null);
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

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoNonCurrencyPairAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoButtonBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoButtonBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoNonCurrencyPairAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoButtonBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadHomeButtons$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506801 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
                final /* synthetic */ CryptoNonCurrencyPairAccountSwitcher $accountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506801(CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher, Continuation<? super C506801> continuation) {
                    super(2, continuation);
                    this.$accountSwitcher = cryptoNonCurrencyPairAccountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506801 c506801 = new C506801(this.$accountSwitcher, continuation);
                    c506801.L$0 = obj;
                    return c506801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                    return ((C506801) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, null, null, false, null, this.$accountSwitcher, null, null, 895, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506801((CryptoNonCurrencyPairAccountSwitcher) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1 */
    static final class C376071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoButtonBarArgs.Crypto $cryptoArgs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C376071(CryptoButtonBarArgs.Crypto crypto2, Continuation<? super C376071> continuation) {
            super(2, continuation);
            this.$cryptoArgs = crypto2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoButtonBarDuxo.this.new C376071(this.$cryptoArgs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Cryptobility> flowPollCryptobility = CryptoButtonBarDuxo.this.cryptobilityStore.pollCryptobility(this.$cryptoArgs.getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoButtonBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollCryptobility, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "cryptobility", "Lcom/robinhood/models/crypto/db/Cryptobility;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Cryptobility, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoButtonBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoButtonBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Cryptobility cryptobility, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptobility, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoButtonBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506771 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
                final /* synthetic */ Cryptobility $cryptobility;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506771(Cryptobility cryptobility, Continuation<? super C506771> continuation) {
                    super(2, continuation);
                    this.$cryptobility = cryptobility;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506771 c506771 = new C506771(this.$cryptobility, continuation);
                    c506771.L$0 = obj;
                    return c506771;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                    return ((C506771) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, this.$cryptobility, null, null, null, false, null, null, null, null, 1021, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                List<GenericButton> tradeButtons;
                Uri uri;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Cryptobility cryptobility = (Cryptobility) this.L$0;
                    this.this$0.applyMutation(new C506771(cryptobility, null));
                    if (cryptobility != null && (tradeButtons = cryptobility.getTradeButtons()) != null) {
                        List<GenericButton> list = tradeButtons;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                GenericAction typedAction = ((GenericButton) it.next()).getTypedAction();
                                GenericAction.DeeplinkAction deeplinkAction = typedAction instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) typedAction : null;
                                if (Intrinsics.areEqual((deeplinkAction == null || (uri = deeplinkAction.getUri()) == null) ? null : uri.getEncodedAuthority(), "explore_rhw")) {
                                    PackagePreloader packagePreloader = this.this$0.packagePreloader;
                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-crypto-explainers", null, 2, null);
                                    this.label = 1;
                                    if (packagePreloader.mo28945preloadgIAlus(remoteMicrogramApplication, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).getValue();
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCryptoButtons(CryptoButtonBarArgs.Crypto cryptoArgs) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C376071(cryptoArgs, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C376082(cryptoArgs, null), 3, null);
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2 */
    static final class C376082 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoButtonBarArgs.Crypto $cryptoArgs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C376082(CryptoButtonBarArgs.Crypto crypto2, Continuation<? super C376082> continuation) {
            super(2, continuation);
            this.$cryptoArgs = crypto2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoButtonBarDuxo.this.new C376082(this.$cryptoArgs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C376082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoButtonBarDuxo.this.cryptoCurrencyPairAccountSwitcherStore.getAccountSwitcherForCurrencyPairQuery().asFlow(this.$cryptoArgs.getCurrencyPairId()), CryptoButtonBarDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoButtonBarDuxo.this, null);
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

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCurrencyPairAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoButtonBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoButtonBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoCurrencyPairAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoButtonBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadCryptoButtons$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506781 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
                final /* synthetic */ CryptoCurrencyPairAccountSwitcher $accountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506781(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super C506781> continuation) {
                    super(2, continuation);
                    this.$accountSwitcher = cryptoCurrencyPairAccountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506781 c506781 = new C506781(this.$accountSwitcher, continuation);
                    c506781.L$0 = obj;
                    return c506781;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                    return ((C506781) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, null, null, false, this.$accountSwitcher, null, null, null, 959, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506781((CryptoCurrencyPairAccountSwitcher) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setSelectedAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        CryptoAccountSwitcherLocation location = CryptoButtonBarArgs2.getLocation(this.args);
        if (location != null) {
            this.cryptoAccountProvider.mo15792setSelectedAccountNumber(location, accountNumber);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadPerpetualButtons(CryptoButtonBarArgs.Perpetuals perpetuals, Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.perpetualsButtonsStore.pollPerpetualButtons(perpetuals.getSourceScreen(), perpetuals.getPerpetualContractId()), new C376112(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "perpetualButtons", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualButtons;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadPerpetualButtons$2", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadPerpetualButtons$2 */
    static final class C376112 extends ContinuationImpl7 implements Function2<PerpetualButtons, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C376112(Continuation<? super C376112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C376112 c376112 = CryptoButtonBarDuxo.this.new C376112(continuation);
            c376112.L$0 = obj;
            return c376112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PerpetualButtons perpetualButtons, Continuation<? super Unit> continuation) {
            return ((C376112) create(perpetualButtons, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadPerpetualButtons$2$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$loadPerpetualButtons$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
            final /* synthetic */ PerpetualButtons $perpetualButtons;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PerpetualButtons perpetualButtons, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$perpetualButtons = perpetualButtons;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$perpetualButtons, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                return ((AnonymousClass1) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, this.$perpetualButtons, null, null, false, null, null, null, null, 1019, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoButtonBarDuxo.this.applyMutation(new AnonymousClass1((PerpetualButtons) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateLoading$lib_crypto_button_bar_externalDebug(String label, boolean isLoading) {
        Intrinsics.checkNotNullParameter(label, "label");
        applyMutation(new CryptoButtonBarDuxo4(isLoading, label, null));
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "<init>", "()V", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoButtonBarDuxo, CryptoButtonBarArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoButtonBarArgs getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoButtonBarArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoButtonBarArgs getArgs(CryptoButtonBarDuxo cryptoButtonBarDuxo) {
            return (CryptoButtonBarArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoButtonBarDuxo);
        }
    }
}

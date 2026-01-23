package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: CryptoFeeTierUpgradedDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0019\u001aB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0006\u0010\u0017\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDataState;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo$Args;", "feeTierStore", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "feeTierNotificationProvider", "Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeTierNotificationStatusProvider;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "onTryAgainClick", "fetchFeeTierInfo", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoFeeTierUpgradedDuxo extends BaseDuxo<CryptoFeeTierUpgradedDataState, CryptoFeeTierUpgradedViewState> implements HasArgs<Args> {
    private final CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider;
    private final CryptoFeeTierStore feeTierStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoFeeTierUpgradedDuxo(CryptoFeeTierStore feeTierStore, CryptoFeeTierNotificationStatusProvider feeTierNotificationProvider, CryptoFeeTierUpgradedDuxo2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        Intrinsics.checkNotNullParameter(feeTierNotificationProvider, "feeTierNotificationProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        CryptoFeeTierInfo feeTierInfo = ((Args) companion.getArgs(savedStateHandle)).getFeeTierInfo();
        Result resultM28549boximpl = feeTierInfo != null ? Result.m28549boximpl(Result.m28550constructorimpl(feeTierInfo)) : null;
        Boolean canSkipNotificationPrompt = ((Args) companion.getArgs(savedStateHandle)).getCanSkipNotificationPrompt();
        super(new CryptoFeeTierUpgradedDataState(resultM28549boximpl, canSkipNotificationPrompt != null ? Result.m28549boximpl(Result.m28550constructorimpl(canSkipNotificationPrompt)) : null), stateProvider, duxoBundle);
        this.feeTierStore = feeTierStore;
        this.feeTierNotificationProvider = feeTierNotificationProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C404111(null));
    }

    /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$onCreate$1", m3645f = "CryptoFeeTierUpgradedDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$onCreate$1 */
    static final class C404111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404111(Continuation<? super C404111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierUpgradedDuxo.this.new C404111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM25807canSkipNotificationPromptIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = CryptoFeeTierUpgradedDuxo.this.feeTierNotificationProvider;
                this.label = 1;
                objM25807canSkipNotificationPromptIoAF18A = cryptoFeeTierNotificationStatusProvider.m25807canSkipNotificationPromptIoAF18A(this);
                if (objM25807canSkipNotificationPromptIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM25807canSkipNotificationPromptIoAF18A = ((Result) obj).getValue();
            }
            CryptoFeeTierUpgradedDuxo.this.applyMutation(new AnonymousClass1(objM25807canSkipNotificationPromptIoAF18A, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$onCreate$1$1", m3645f = "CryptoFeeTierUpgradedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState>, Object> {
            final /* synthetic */ Object $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Object obj, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierUpgradedDataState cryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierUpgradedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierUpgradedDataState.copy$default((CryptoFeeTierUpgradedDataState) this.L$0, null, Result.m28549boximpl(this.$result), 1, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoFeeTierUpgradedDuxo.onStart$lambda$2(this.f$0, (CryptoFeeTierUpgradedDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo, CryptoFeeTierUpgradedDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.m25897getFeeTierInfoResultxLWZpok() == null) {
            cryptoFeeTierUpgradedDuxo.fetchFeeTierInfo();
        }
        return Unit.INSTANCE;
    }

    public final void onTryAgainClick() {
        fetchFeeTierInfo();
    }

    /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1", m3645f = "CryptoFeeTierUpgradedDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1 */
    static final class C404101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404101(Continuation<? super C404101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierUpgradedDuxo.this.new C404101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1$1", m3645f = "CryptoFeeTierUpgradedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState>, Object> {
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
            public final Object invoke(CryptoFeeTierUpgradedDataState cryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierUpgradedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierUpgradedDataState.copy$default((CryptoFeeTierUpgradedDataState) this.L$0, null, null, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM22810getCryptoFeeTierInfoIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoFeeTierUpgradedDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoFeeTierStore cryptoFeeTierStore = CryptoFeeTierUpgradedDuxo.this.feeTierStore;
                this.label = 1;
                objM22810getCryptoFeeTierInfoIoAF18A = cryptoFeeTierStore.m22810getCryptoFeeTierInfoIoAF18A(this);
                if (objM22810getCryptoFeeTierInfoIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22810getCryptoFeeTierInfoIoAF18A = ((Result) obj).getValue();
            }
            CryptoFeeTierUpgradedDuxo.this.applyMutation(new AnonymousClass2(objM22810getCryptoFeeTierInfoIoAF18A, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1$2", m3645f = "CryptoFeeTierUpgradedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedDuxo$fetchFeeTierInfo$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState>, Object> {
            final /* synthetic */ Object $feeTierInfo;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Object obj, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$feeTierInfo = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$feeTierInfo, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierUpgradedDataState cryptoFeeTierUpgradedDataState, Continuation<? super CryptoFeeTierUpgradedDataState> continuation) {
                return ((AnonymousClass2) create(cryptoFeeTierUpgradedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoFeeTierUpgradedDataState.copy$default((CryptoFeeTierUpgradedDataState) this.L$0, Result.m28549boximpl(this.$feeTierInfo), null, 2, null);
            }
        }
    }

    private final void fetchFeeTierInfo() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C404101(null), 3, null);
    }

    /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo$Args;", "Landroid/os/Parcelable;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPrompt", "", "<init>", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)V", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "getCanSkipNotificationPrompt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;Ljava/lang/Boolean;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo$Args;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Boolean canSkipNotificationPrompt;
        private final CryptoFeeTierInfo feeTierInfo;

        /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) parcel.readParcelable(Args.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Args(cryptoFeeTierInfo, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoFeeTierInfo = args.feeTierInfo;
            }
            if ((i & 2) != 0) {
                bool = args.canSkipNotificationPrompt;
            }
            return args.copy(cryptoFeeTierInfo, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }

        public final Args copy(CryptoFeeTierInfo feeTierInfo, Boolean canSkipNotificationPrompt) {
            return new Args(feeTierInfo, canSkipNotificationPrompt);
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
            return Intrinsics.areEqual(this.feeTierInfo, args.feeTierInfo) && Intrinsics.areEqual(this.canSkipNotificationPrompt, args.canSkipNotificationPrompt);
        }

        public int hashCode() {
            CryptoFeeTierInfo cryptoFeeTierInfo = this.feeTierInfo;
            int iHashCode = (cryptoFeeTierInfo == null ? 0 : cryptoFeeTierInfo.hashCode()) * 31;
            Boolean bool = this.canSkipNotificationPrompt;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Args(feeTierInfo=" + this.feeTierInfo + ", canSkipNotificationPrompt=" + this.canSkipNotificationPrompt + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.feeTierInfo, flags);
            Boolean bool = this.canSkipNotificationPrompt;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public Args(CryptoFeeTierInfo cryptoFeeTierInfo, Boolean bool) {
            this.feeTierInfo = cryptoFeeTierInfo;
            this.canSkipNotificationPrompt = bool;
        }

        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        public final Boolean getCanSkipNotificationPrompt() {
            return this.canSkipNotificationPrompt;
        }
    }

    /* compiled from: CryptoFeeTierUpgradedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDuxo$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoFeeTierUpgradedDuxo, Args> {
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
        public Args getArgs(CryptoFeeTierUpgradedDuxo cryptoFeeTierUpgradedDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoFeeTierUpgradedDuxo);
        }
    }
}

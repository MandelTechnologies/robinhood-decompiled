package com.robinhood.android.crypto.authorize.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo2;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: AuthorizeWalletDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0014\u0015B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletViewState;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo$Args;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Args", "Companion", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AuthorizeWalletDuxo extends BaseDuxo5<AuthorizeWalletViewState, AuthorizeWalletDuxo2> implements HasArgs<Args> {
    private static final String KEY_ALREADY_NAVIGATED_TO_GOLD = "key_already_navigated_to_gold";
    private final BffCryptoTradingStore bffCryptoTradingStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeWalletDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MarginSubscriptionStore marginSubscriptionStore, BffCryptoTradingStore bffCryptoTradingStore) {
        super(new AuthorizeWalletViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        this.savedStateHandle = savedStateHandle;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.bffCryptoTradingStore = bffCryptoTradingStore;
    }

    /* compiled from: AuthorizeWalletDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1", m3645f = "AuthorizeWalletDuxo.kt", m3646l = {87, 52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1 */
    static final class C127681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C127681(Continuation<? super C127681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthorizeWalletDuxo.this.new C127681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C127681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r11 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MarginSubscription3 plan;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                AuthorizeWalletDuxo.this.submit(new AuthorizeWalletDuxo2.Error(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (StringsKt.isBlank(AuthorizeWalletDuxo.this.getStateFlow().getValue().getToken())) {
                    AuthorizeWalletDuxo.this.applyMutation(new AnonymousClass1(null));
                    Single singleCheckCurrentMarginSubscription$default = MarginSubscriptionStore.checkCurrentMarginSubscription$default(AuthorizeWalletDuxo.this.marginSubscriptionStore, false, 1, null);
                    this.label = 1;
                    obj = RxAwait3.await(singleCheckCurrentMarginSubscription$default, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AuthorizeWalletDuxo.this.applyMutation(new AnonymousClass2((String) obj, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MarginSubscription marginSubscription = (MarginSubscription) ((Optional) obj).getOrNull();
            if (marginSubscription != null && (plan = marginSubscription.getPlan()) != null && plan.is24Karat()) {
                BffCryptoTradingStore bffCryptoTradingStore = AuthorizeWalletDuxo.this.bffCryptoTradingStore;
                AuthorizeWalletDuxo authorizeWalletDuxo = AuthorizeWalletDuxo.this;
                String deviceId = ((Args) authorizeWalletDuxo.getArgs(authorizeWalletDuxo.getSavedStateHandle())).getDeviceId();
                this.label = 2;
                obj = bffCryptoTradingStore.fetchRhwTokenForDeviceId(deviceId, this);
            } else {
                if (Intrinsics.areEqual(AuthorizeWalletDuxo.this.getSavedStateHandle().get(AuthorizeWalletDuxo.KEY_ALREADY_NAVIGATED_TO_GOLD), boxing.boxBoolean(true))) {
                    AuthorizeWalletDuxo.this.submit(AuthorizeWalletDuxo2.Finish.INSTANCE);
                } else {
                    AuthorizeWalletDuxo.this.getSavedStateHandle().set(AuthorizeWalletDuxo.KEY_ALREADY_NAVIGATED_TO_GOLD, boxing.boxBoolean(true));
                    AuthorizeWalletDuxo.this.submit(new AuthorizeWalletDuxo2.NavigateToGoldUpgrade(new GoldUpgradeIntentKey("authorize_wallet", GoldFeature.GOLD_MONTH2025_CRYPTO_ZERO_NETWORK_FEE, "dismiss", null, null, false, 56, null)));
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AuthorizeWalletDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1$1", m3645f = "AuthorizeWalletDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AuthorizeWalletViewState, Continuation<? super AuthorizeWalletViewState>, Object> {
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
            public final Object invoke(AuthorizeWalletViewState authorizeWalletViewState, Continuation<? super AuthorizeWalletViewState> continuation) {
                return ((AnonymousClass1) create(authorizeWalletViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AuthorizeWalletViewState.copy$default((AuthorizeWalletViewState) this.L$0, true, null, 2, null);
            }
        }

        /* compiled from: AuthorizeWalletDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1$2", m3645f = "AuthorizeWalletDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AuthorizeWalletViewState, Continuation<? super AuthorizeWalletViewState>, Object> {
            final /* synthetic */ String $token;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$token = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$token, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AuthorizeWalletViewState authorizeWalletViewState, Continuation<? super AuthorizeWalletViewState> continuation) {
                return ((AnonymousClass2) create(authorizeWalletViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((AuthorizeWalletViewState) this.L$0).copy(false, this.$token);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C127681(null));
    }

    /* compiled from: AuthorizeWalletDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletDuxo$Args;", "Landroid/os/Parcelable;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "<init>", "(Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String deviceId;

        /* compiled from: AuthorizeWalletDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.deviceId;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final Args copy(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new Args(deviceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.deviceId, ((Args) other).deviceId);
        }

        public int hashCode() {
            return this.deviceId.hashCode();
        }

        public String toString() {
            return "Args(deviceId=" + this.deviceId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.deviceId);
        }

        public Args(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.deviceId = deviceId;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }
    }
}

package com.robinhood.shared.discover.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.security.auth.AuthManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DiscoverSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0016\u0017B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/discover/section/DiscoverSectionDataState;", "Lcom/robinhood/shared/discover/section/DiscoverSectionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo$InitArgs;", "stateProvider", "Lcom/robinhood/shared/discover/section/DiscoverSectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "<init>", "(Lcom/robinhood/shared/discover/section/DiscoverSectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DiscoverSectionDuxo extends BaseDuxo<DiscoverSectionDataState, DiscoverSectionViewState> implements HasArgs<InitArgs> {
    private final CryptoTradingOptionsStore cryptoTradingOptionsStore;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public DiscoverSectionDuxo(DiscoverSectionStateProvider stateProvider, DuxoBundle duxoBundle, AuthManager authManager, SavedStateHandle savedStateHandle, CryptoTradingOptionsStore cryptoTradingOptionsStore) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        Companion companion = INSTANCE;
        super(new DiscoverSectionDataState(((InitArgs) companion.getArgs(savedStateHandle)).getAssetType(), ((InitArgs) companion.getArgs(savedStateHandle)).getType(), null, authManager.isLoggedIn(), ((InitArgs) companion.getArgs(savedStateHandle)).getTabForCdpDeepLink(), 4, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C387301(null));
    }

    /* compiled from: DiscoverSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1", m3645f = "DiscoverSectionDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1 */
    static final class C387301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C387301(Continuation<? super C387301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DiscoverSectionDuxo.this.new C387301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingOptionsStore cryptoTradingOptionsStore = DiscoverSectionDuxo.this.cryptoTradingOptionsStore;
                Companion companion = DiscoverSectionDuxo.INSTANCE;
                Flow flowStreamTradingOptions$default = CryptoTradingOptionsStore.streamTradingOptions$default(cryptoTradingOptionsStore, DiscoverSectionDuxo2.getTradingOptionsLocation(((InitArgs) companion.getArgs((HasArgs) DiscoverSectionDuxo.this)).getType()), DiscoverSectionDuxo2.getCryptoTradingAssetType(((InitArgs) companion.getArgs((HasArgs) DiscoverSectionDuxo.this)).getAssetType()), ((InitArgs) companion.getArgs((HasArgs) DiscoverSectionDuxo.this)).getServerCategory(), null, ((InitArgs) companion.getArgs((HasArgs) DiscoverSectionDuxo.this)).getPreviewCount(), 8, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DiscoverSectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTradingOptions$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: DiscoverSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1$1", m3645f = "DiscoverSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTradingOptions, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DiscoverSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DiscoverSectionDuxo discoverSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = discoverSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTradingOptions cryptoTradingOptions, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoTradingOptions, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DiscoverSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/discover/section/DiscoverSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1$1$1", m3645f = "DiscoverSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.discover.section.DiscoverSectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507251 extends ContinuationImpl7 implements Function2<DiscoverSectionDataState, Continuation<? super DiscoverSectionDataState>, Object> {
                final /* synthetic */ CryptoTradingOptions $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507251(CryptoTradingOptions cryptoTradingOptions, Continuation<? super C507251> continuation) {
                    super(2, continuation);
                    this.$it = cryptoTradingOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507251 c507251 = new C507251(this.$it, continuation);
                    c507251.L$0 = obj;
                    return c507251;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DiscoverSectionDataState discoverSectionDataState, Continuation<? super DiscoverSectionDataState> continuation) {
                    return ((C507251) create(discoverSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DiscoverSectionDataState.copy$default((DiscoverSectionDataState) this.L$0, null, null, this.$it, false, null, 27, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507251((CryptoTradingOptions) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: DiscoverSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u000bJ\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo$InitArgs;", "Landroid/os/Parcelable;", "assetType", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "type", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;", "serverCategory", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "tabForCdpDeepLink", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "previewCount", "", "<init>", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;Lcom/robinhood/android/navigation/keys/FragmentTab;Ljava/lang/Integer;)V", "getAssetType", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;", "getType", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;", "getServerCategory", "()Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;", "getTabForCdpDeepLink", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "getPreviewCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreAssetType;Lcom/robinhood/models/crypto/db/explore/CryptoExploreComponentType;Lcom/robinhood/models/api/trading/CryptoTradingOptionsCategory;Lcom/robinhood/android/navigation/keys/FragmentTab;Ljava/lang/Integer;)Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo$InitArgs;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final CryptoExploreState3 assetType;
        private final Integer previewCount;
        private final CryptoTradingOptionsCategory serverCategory;
        private final FragmentTab tabForCdpDeepLink;
        private final CryptoExploreState4 type;

        /* compiled from: DiscoverSectionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(CryptoExploreState3.valueOf(parcel.readString()), CryptoExploreState4.valueOf(parcel.readString()), (CryptoTradingOptionsCategory) parcel.readParcelable(InitArgs.class.getClassLoader()), FragmentTab.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, CryptoExploreState3 cryptoExploreState3, CryptoExploreState4 cryptoExploreState4, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, FragmentTab fragmentTab, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoExploreState3 = initArgs.assetType;
            }
            if ((i & 2) != 0) {
                cryptoExploreState4 = initArgs.type;
            }
            if ((i & 4) != 0) {
                cryptoTradingOptionsCategory = initArgs.serverCategory;
            }
            if ((i & 8) != 0) {
                fragmentTab = initArgs.tabForCdpDeepLink;
            }
            if ((i & 16) != 0) {
                num = initArgs.previewCount;
            }
            Integer num2 = num;
            CryptoTradingOptionsCategory cryptoTradingOptionsCategory2 = cryptoTradingOptionsCategory;
            return initArgs.copy(cryptoExploreState3, cryptoExploreState4, cryptoTradingOptionsCategory2, fragmentTab, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoExploreState3 getAssetType() {
            return this.assetType;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoExploreState4 getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoTradingOptionsCategory getServerCategory() {
            return this.serverCategory;
        }

        /* renamed from: component4, reason: from getter */
        public final FragmentTab getTabForCdpDeepLink() {
            return this.tabForCdpDeepLink;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPreviewCount() {
            return this.previewCount;
        }

        public final InitArgs copy(CryptoExploreState3 assetType, CryptoExploreState4 type2, CryptoTradingOptionsCategory serverCategory, FragmentTab tabForCdpDeepLink, Integer previewCount) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(serverCategory, "serverCategory");
            Intrinsics.checkNotNullParameter(tabForCdpDeepLink, "tabForCdpDeepLink");
            return new InitArgs(assetType, type2, serverCategory, tabForCdpDeepLink, previewCount);
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
            return this.assetType == initArgs.assetType && this.type == initArgs.type && Intrinsics.areEqual(this.serverCategory, initArgs.serverCategory) && this.tabForCdpDeepLink == initArgs.tabForCdpDeepLink && Intrinsics.areEqual(this.previewCount, initArgs.previewCount);
        }

        public int hashCode() {
            int iHashCode = ((((((this.assetType.hashCode() * 31) + this.type.hashCode()) * 31) + this.serverCategory.hashCode()) * 31) + this.tabForCdpDeepLink.hashCode()) * 31;
            Integer num = this.previewCount;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "InitArgs(assetType=" + this.assetType + ", type=" + this.type + ", serverCategory=" + this.serverCategory + ", tabForCdpDeepLink=" + this.tabForCdpDeepLink + ", previewCount=" + this.previewCount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.assetType.name());
            dest.writeString(this.type.name());
            dest.writeParcelable(this.serverCategory, flags);
            dest.writeString(this.tabForCdpDeepLink.name());
            Integer num = this.previewCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public InitArgs(CryptoExploreState3 assetType, CryptoExploreState4 type2, CryptoTradingOptionsCategory serverCategory, FragmentTab tabForCdpDeepLink, Integer num) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(serverCategory, "serverCategory");
            Intrinsics.checkNotNullParameter(tabForCdpDeepLink, "tabForCdpDeepLink");
            this.assetType = assetType;
            this.type = type2;
            this.serverCategory = serverCategory;
            this.tabForCdpDeepLink = tabForCdpDeepLink;
            this.previewCount = num;
        }

        public /* synthetic */ InitArgs(CryptoExploreState3 cryptoExploreState3, CryptoExploreState4 cryptoExploreState4, CryptoTradingOptionsCategory cryptoTradingOptionsCategory, FragmentTab fragmentTab, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoExploreState3, cryptoExploreState4, cryptoTradingOptionsCategory, fragmentTab, (i & 16) != 0 ? null : num);
        }

        public final CryptoExploreState3 getAssetType() {
            return this.assetType;
        }

        public final CryptoExploreState4 getType() {
            return this.type;
        }

        public final CryptoTradingOptionsCategory getServerCategory() {
            return this.serverCategory;
        }

        public final FragmentTab getTabForCdpDeepLink() {
            return this.tabForCdpDeepLink;
        }

        public final Integer getPreviewCount() {
            return this.previewCount;
        }
    }

    /* compiled from: DiscoverSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo;", "Lcom/robinhood/shared/discover/section/DiscoverSectionDuxo$InitArgs;", "<init>", "()V", "lib-discover_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<DiscoverSectionDuxo, InitArgs> {
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
        public InitArgs getArgs(DiscoverSectionDuxo discoverSectionDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, discoverSectionDuxo);
        }
    }
}

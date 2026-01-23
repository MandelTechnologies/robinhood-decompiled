package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeRewardsCardBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDataState;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetViewState;", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetEvent;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsCardBottomSheetDuxo extends BaseDuxo3<CryptoHomeRewardsCardBottomSheetDataState, CryptoHomeRewardsCardBottomSheetViewState, CryptoHomeRewardsCardBottomSheetEvent> {
    public static final String contentId = "4AyQ8mSHB67uFeJWAtAcTX";
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeRewardsCardBottomSheetDuxo(StaticContentStore staticContentStore, CryptoHomeRewardsCardBottomSheetStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeRewardsCardBottomSheetDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C132191(null), 3, null);
    }

    /* compiled from: CryptoHomeRewardsCardBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetDuxo$onStart$1", m3645f = "CryptoHomeRewardsCardBottomSheetDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetDuxo$onStart$1 */
    static final class C132191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132191(Continuation<? super C132191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeRewardsCardBottomSheetDuxo.this.new C132191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C132191 c132191;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    StaticContentStore staticContentStore = CryptoHomeRewardsCardBottomSheetDuxo.this.staticContentStore;
                    this.label = 1;
                    c132191 = this;
                    try {
                        obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CryptoHomeRewardsCardBottomSheetDuxo.contentId, null, c132191, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        CryptoHomeRewardsCardBottomSheetDuxo.this.submit(new CryptoHomeRewardsCardBottomSheetEvent.Error(th));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c132191 = this;
                    th = th;
                    CryptoHomeRewardsCardBottomSheetDuxo.this.submit(new CryptoHomeRewardsCardBottomSheetEvent.Error(th));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c132191 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c132191 = this;
                    CryptoHomeRewardsCardBottomSheetDuxo.this.submit(new CryptoHomeRewardsCardBottomSheetEvent.Error(th));
                    return Unit.INSTANCE;
                }
            }
            CryptoHomeRewardsCardBottomSheetDuxo.this.applyMutation(new AnonymousClass1((EntryResource) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoHomeRewardsCardBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetDuxo$onStart$1$1", m3645f = "CryptoHomeRewardsCardBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.CryptoHomeRewardsCardBottomSheetDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeRewardsCardBottomSheetDataState, Continuation<? super CryptoHomeRewardsCardBottomSheetDataState>, Object> {
            final /* synthetic */ EntryResource<Disclosure> $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EntryResource<Disclosure> entryResource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = entryResource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoHomeRewardsCardBottomSheetDataState cryptoHomeRewardsCardBottomSheetDataState, Continuation<? super CryptoHomeRewardsCardBottomSheetDataState> continuation) {
                return ((AnonymousClass1) create(cryptoHomeRewardsCardBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoHomeRewardsCardBottomSheetDataState) this.L$0).copy(this.$content.getValue());
            }
        }
    }

    /* compiled from: CryptoHomeRewardsCardBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/card/sheet/CryptoHomeRewardsCardBottomSheetDuxo$Companion;", "", "<init>", "()V", "contentId", "", "getContentId$feature_crypto_tab_externalDebug$annotations", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getContentId$feature_crypto_tab_externalDebug$annotations() {
        }

        private Companion() {
        }
    }
}

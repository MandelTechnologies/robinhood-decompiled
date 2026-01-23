package com.robinhood.android.crypto.tab.p093ui.disclosures;

import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeBottomDisclosuresDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/disclosures/CryptoHomeBottomDisclosuresDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/crypto/tab/ui/disclosures/CryptoHomeBottomDisclosuresViewState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeBottomDisclosuresDuxo extends BaseDuxo4<CryptoHomeBottomDisclosuresViewState> {
    private static final String HOME_CONTENTFUL_ID = "Su71qXBEchXJ95fPzdOh8";
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeBottomDisclosuresDuxo(StaticContentStore staticContentStore, DuxoBundle duxoBundle) {
        super(new CryptoHomeBottomDisclosuresViewState(StringResource.INSTANCE.invoke(C13013R.string.crypto_home_disclosure, new Object[0])), duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C130631(null));
    }

    /* compiled from: CryptoHomeBottomDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeBottomDisclosuresDuxo$onCreate$1", m3645f = "CryptoHomeBottomDisclosuresDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeBottomDisclosuresDuxo$onCreate$1 */
    static final class C130631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C130631(Continuation<? super C130631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeBottomDisclosuresDuxo.this.new C130631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C130631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C130631 c130631;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = CryptoHomeBottomDisclosuresDuxo.this.staticContentStore;
                this.label = 1;
                c130631 = this;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CryptoHomeBottomDisclosuresDuxo.HOME_CONTENTFUL_ID, null, c130631, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c130631 = this;
            }
            CryptoHomeBottomDisclosuresDuxo.this.applyMutation(new AnonymousClass1((EntryResource) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoHomeBottomDisclosuresDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/disclosures/CryptoHomeBottomDisclosuresViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeBottomDisclosuresDuxo$onCreate$1$1", m3645f = "CryptoHomeBottomDisclosuresDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeBottomDisclosuresDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeBottomDisclosuresViewState, Continuation<? super CryptoHomeBottomDisclosuresViewState>, Object> {
            final /* synthetic */ EntryResource<Disclosure> $disclosure;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EntryResource<Disclosure> entryResource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosure = entryResource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosure, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoHomeBottomDisclosuresViewState cryptoHomeBottomDisclosuresViewState, Continuation<? super CryptoHomeBottomDisclosuresViewState> continuation) {
                return ((AnonymousClass1) create(cryptoHomeBottomDisclosuresViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoHomeBottomDisclosuresViewState) this.L$0).copy(StringResource.INSTANCE.invoke(this.$disclosure.getValue().getContent().getRaw()));
            }
        }
    }
}

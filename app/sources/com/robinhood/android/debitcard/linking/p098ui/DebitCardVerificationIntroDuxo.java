package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationIntroDuxo;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: DebitCardVerificationIntroDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroViewState;", "markwon", "Lio/noties/markwon/Markwon;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "<init>", "(Lio/noties/markwon/Markwon;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;)V", "onCreate", "", "prepareDebitCardForVerification", "instrumentId", "", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardVerificationIntroDuxo extends OldBaseDuxo<DebitCardVerificationIntroViewState> {
    public static final String VERIFY_DEBIT_CARD_INTRO_CONTENTFUL_ID = "2yMQJ6dih0NwPfUKixt7af";
    private final Markwon markwon;
    private final PlaidConnectApi plaidConnectApi;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebitCardVerificationIntroDuxo(Markwon markwon, StaticContentStore staticContentStore, PlaidConnectApi plaidConnectApi) {
        super(new DebitCardVerificationIntroViewState(false, null, null, false, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        this.markwon = markwon;
        this.staticContentStore = staticContentStore;
        this.plaidConnectApi = plaidConnectApi;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new C139161(null), 1, null);
        final C139172 c139172 = new PropertyReference1Impl() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo.onCreate.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EntryResource) obj).getValue();
            }
        };
        Single singleDoOnSubscribe = singleRxSingle$default.map(new Function(c139172) { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c139172, "function");
                this.function = c139172;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).doOnSubscribe(new C139183());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationIntroDuxo.onCreate$lambda$1(this.f$0, (ProductMarketing.Feature) obj);
            }
        });
    }

    /* compiled from: DebitCardVerificationIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$onCreate$1", m3645f = "DebitCardVerificationIntroDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$onCreate$1 */
    static final class C139161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super EntryResource<ProductMarketing.Feature>>, Object> {
        int label;

        C139161(Continuation<? super C139161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardVerificationIntroDuxo.this.new C139161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EntryResource<ProductMarketing.Feature>> continuation) {
            return ((C139161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            StaticContentStore staticContentStore = DebitCardVerificationIntroDuxo.this.staticContentStore;
            this.label = 1;
            Object objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, DebitCardVerificationIntroDuxo.VERIFY_DEBIT_CARD_INTRO_CONTENTFUL_ID, null, this, 2, null);
            return objLoadEntry$default == coroutine_suspended ? coroutine_suspended : objLoadEntry$default;
        }
    }

    /* compiled from: DebitCardVerificationIntroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$onCreate$3 */
    static final class C139183<T> implements Consumer {
        C139183() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DebitCardVerificationIntroDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$onCreate$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DebitCardVerificationIntroDuxo.C139183.accept$lambda$0((DebitCardVerificationIntroViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DebitCardVerificationIntroViewState accept$lambda$0(DebitCardVerificationIntroViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DebitCardVerificationIntroViewState.copy$default(applyMutation, true, null, null, false, null, null, 62, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final DebitCardVerificationIntroDuxo debitCardVerificationIntroDuxo, final ProductMarketing.Feature feature) {
        debitCardVerificationIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationIntroDuxo.onCreate$lambda$1$lambda$0(feature, debitCardVerificationIntroDuxo, (DebitCardVerificationIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebitCardVerificationIntroViewState onCreate$lambda$1$lambda$0(ProductMarketing.Feature feature, DebitCardVerificationIntroDuxo debitCardVerificationIntroDuxo, DebitCardVerificationIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DebitCardVerificationIntroViewState.copy$default(applyMutation, false, feature.getTitle(), Markwons.toSpanned$default(debitCardVerificationIntroDuxo.markwon, feature.getContent(), null, 2, null), false, null, null, 56, null);
    }

    /* compiled from: DebitCardVerificationIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$prepareDebitCardForVerification$1", m3645f = "DebitCardVerificationIntroDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$prepareDebitCardForVerification$1 */
    static final class C139191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139191(String str, Continuation<? super C139191> continuation) {
            super(2, continuation);
            this.$instrumentId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C139191 c139191 = DebitCardVerificationIntroDuxo.this.new C139191(this.$instrumentId, continuation);
            c139191.L$0 = obj;
            return c139191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C139191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DebitCardVerificationIntroDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$prepareDebitCardForVerification$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DebitCardVerificationIntroDuxo.C139191.invokeSuspend$lambda$0((DebitCardVerificationIntroViewState) obj2);
                        }
                    });
                    DebitCardVerificationIntroDuxo debitCardVerificationIntroDuxo = DebitCardVerificationIntroDuxo.this;
                    String str = this.$instrumentId;
                    Result.Companion companion = Result.INSTANCE;
                    PlaidConnectApi plaidConnectApi = debitCardVerificationIntroDuxo.plaidConnectApi;
                    PreparePaymentInstrumentRequest preparePaymentInstrumentRequest = new PreparePaymentInstrumentRequest(new PreparePaymentInstrumentRequest2.DebitCardRequestDetails(str), PaymentInstrumentType.DEBIT_CARD.getServerValue());
                    this.label = 1;
                    obj = plaidConnectApi.prepare(preparePaymentInstrumentRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((Response) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            DebitCardVerificationIntroDuxo debitCardVerificationIntroDuxo2 = DebitCardVerificationIntroDuxo.this;
            final String str2 = this.$instrumentId;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                debitCardVerificationIntroDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$prepareDebitCardForVerification$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DebitCardVerificationIntroDuxo.C139191.invokeSuspend$lambda$3$lambda$2(str2, (DebitCardVerificationIntroViewState) obj2);
                    }
                });
            } else {
                debitCardVerificationIntroDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroDuxo$prepareDebitCardForVerification$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DebitCardVerificationIntroDuxo.C139191.invokeSuspend$lambda$5$lambda$4(thM28553exceptionOrNullimpl, (DebitCardVerificationIntroViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DebitCardVerificationIntroViewState invokeSuspend$lambda$0(DebitCardVerificationIntroViewState debitCardVerificationIntroViewState) {
            return DebitCardVerificationIntroViewState.copy$default(debitCardVerificationIntroViewState, false, null, null, true, null, null, 55, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DebitCardVerificationIntroViewState invokeSuspend$lambda$3$lambda$2(String str, DebitCardVerificationIntroViewState debitCardVerificationIntroViewState) {
            return DebitCardVerificationIntroViewState.copy$default(debitCardVerificationIntroViewState, false, null, null, false, new UiEvent(str), null, 39, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DebitCardVerificationIntroViewState invokeSuspend$lambda$5$lambda$4(Throwable th, DebitCardVerificationIntroViewState debitCardVerificationIntroViewState) {
            return DebitCardVerificationIntroViewState.copy$default(debitCardVerificationIntroViewState, false, null, null, false, null, new UiEvent(th), 23, null);
        }
    }

    public final void prepareDebitCardForVerification(String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C139191(instrumentId, null), 3, null);
    }
}

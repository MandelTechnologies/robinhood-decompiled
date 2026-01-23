package com.robinhood.android.doc.p109ui.residency;

import com.robinhood.android.doc.p109ui.residency.DocUploadVerifyResidencyDuxo;
import com.robinhood.android.doc.p109ui.residency.DocUploadVerifyResidencyViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: DocUploadVerifyResidencyDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/AddressStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;)V", "onResume", "", "onContinueClicked", "getResultFromCryptoAccount", "Lio/reactivex/Observable;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result;", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "getResultFromActivation", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadVerifyResidencyDuxo extends OldBaseDuxo<DocUploadVerifyResidencyViewState> {
    public static final int $stable = 8;
    private final AddressStore addressStore;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoUpgradeStore cryptoUpgradeStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadVerifyResidencyDuxo(AddressStore addressStore, CryptoAccountStore cryptoAccountStore, CryptoUpgradeStore cryptoUpgradeStore) {
        super(DocUploadVerifyResidencyViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        this.addressStore = addressStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.addressStore.refreshResidentialAddress(true);
        this.cryptoAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(asObservable(this.cryptoAccountStore.streamAccountOptional()), this.addressStore.streamResidentialAddress()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onResume$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(DocUploadVerifyResidencyDuxo docUploadVerifyResidencyDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Optional optional = (Optional) tuples2.component1();
        final ResidentialAddress residentialAddress = (ResidentialAddress) tuples2.component2();
        final boolean z = optional.getOrNull() != null;
        docUploadVerifyResidencyDuxo.mutate(new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onResume$lambda$1$lambda$0(z, residentialAddress, (DocUploadVerifyResidencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadVerifyResidencyViewState onResume$lambda$1$lambda$0(boolean z, ResidentialAddress residentialAddress, DocUploadVerifyResidencyViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DocUploadVerifyResidencyViewState.Loaded(z, residentialAddress);
    }

    public final void onContinueClicked() {
        Observable observableFlatMap = asObservable(this.cryptoAccountStore.streamAccountOptional()).doOnSubscribe(new C144181<>()).flatMap(new Function() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo.onContinueClicked.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DocUploadVerifyResidencyViewState.Result> apply(Optional<CryptoAccount> optional) {
                Observable resultFromCryptoAccount;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CryptoAccount cryptoAccountComponent1 = optional.component1();
                return (cryptoAccountComponent1 == null || (resultFromCryptoAccount = DocUploadVerifyResidencyDuxo.this.getResultFromCryptoAccount(cryptoAccountComponent1)) == null) ? DocUploadVerifyResidencyDuxo.this.getResultFromActivation() : resultFromCryptoAccount;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onContinueClicked$lambda$3(this.f$0, (DocUploadVerifyResidencyViewState.Result) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onContinueClicked$lambda$5(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: DocUploadVerifyResidencyDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$onContinueClicked$1 */
    static final class C144181<T> implements Consumer {
        C144181() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DocUploadVerifyResidencyDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$onContinueClicked$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadVerifyResidencyDuxo.C144181.accept$lambda$0((DocUploadVerifyResidencyViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DocUploadVerifyResidencyViewState accept$lambda$0(DocUploadVerifyResidencyViewState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DocUploadVerifyResidencyViewState.Loading.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueClicked$lambda$3(DocUploadVerifyResidencyDuxo docUploadVerifyResidencyDuxo, final DocUploadVerifyResidencyViewState.Result result) {
        docUploadVerifyResidencyDuxo.mutate(new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onContinueClicked$lambda$3$lambda$2(result, (DocUploadVerifyResidencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadVerifyResidencyViewState onContinueClicked$lambda$3$lambda$2(DocUploadVerifyResidencyViewState.Result result, DocUploadVerifyResidencyViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DocUploadVerifyResidencyViewState.VerifyResult(new UiEvent(result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueClicked$lambda$5(DocUploadVerifyResidencyDuxo docUploadVerifyResidencyDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        docUploadVerifyResidencyDuxo.mutate(new Function1() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadVerifyResidencyDuxo.onContinueClicked$lambda$5$lambda$4(error, (DocUploadVerifyResidencyViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadVerifyResidencyViewState onContinueClicked$lambda$5$lambda$4(Throwable th, DocUploadVerifyResidencyViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DocUploadVerifyResidencyViewState.Error(new UiEvent(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<? extends DocUploadVerifyResidencyViewState.Result> getResultFromCryptoAccount(CryptoAccount cryptoAccount) {
        if (Intrinsics.areEqual(cryptoAccount.getStatusReasonCode(), "ineligible_jurisdiction")) {
            Observable map = this.addressStore.streamResidentialAddress().map(new Function() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo.getResultFromCryptoAccount.1
                @Override // io.reactivex.functions.Function
                public final DocUploadVerifyResidencyViewState.Result.Ineligible apply(ResidentialAddress p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return new DocUploadVerifyResidencyViewState.Result.Ineligible(p0);
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        Observable<? extends DocUploadVerifyResidencyViewState.Result> observableJust = Observable.just(DocUploadVerifyResidencyViewState.Result.Continue.INSTANCE);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* compiled from: DocUploadVerifyResidencyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoActivation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$getResultFromActivation$1", m3645f = "DocUploadVerifyResidencyDuxo.kt", m3646l = {79, 79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo$getResultFromActivation$1 */
    static final class C144141 extends ContinuationImpl7 implements Function2<Produce4<? super PaginatedResult<? extends ApiCryptoActivation>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C144141(Continuation<? super C144141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144141 c144141 = DocUploadVerifyResidencyDuxo.this.new C144141(continuation);
            c144141.L$0 = obj;
            return c144141;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super PaginatedResult<? extends ApiCryptoActivation>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super PaginatedResult<ApiCryptoActivation>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super PaginatedResult<ApiCryptoActivation>> produce4, Continuation<? super Unit> continuation) {
            return ((C144141) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r1.send(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                CryptoUpgradeStore cryptoUpgradeStore = DocUploadVerifyResidencyDuxo.this.cryptoUpgradeStore;
                this.L$0 = produce4;
                this.label = 1;
                obj = cryptoUpgradeStore.fetchActivations(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<? extends DocUploadVerifyResidencyViewState.Result> getResultFromActivation() {
        Observable<? extends DocUploadVerifyResidencyViewState.Result> observableFlatMap = RxFactory.DefaultImpls.rxObservable$default(this, null, new C144141(null), 1, null).map(new Function() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo.getResultFromActivation.2
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(PaginatedResult<ApiCryptoActivation> activationsResponse) {
                T next;
                Intrinsics.checkNotNullParameter(activationsResponse, "activationsResponse");
                Iterator<T> it = activationsResponse.getResults().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    ApiCryptoActivation apiCryptoActivation = (ApiCryptoActivation) next;
                    if (apiCryptoActivation.getInReview() && !apiCryptoActivation.getSpeculative()) {
                        break;
                    }
                }
                ApiCryptoActivation apiCryptoActivation2 = next;
                return Optional3.asOptional(apiCryptoActivation2 != null ? apiCryptoActivation2.getExternal_status_code() : null);
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo.getResultFromActivation.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DocUploadVerifyResidencyViewState.Result> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (Intrinsics.areEqual(strComponent1, "ineligible_jurisdiction2") || Intrinsics.areEqual(strComponent1, "ineligible_jurisdiction3")) {
                    return Observable.just(DocUploadVerifyResidencyViewState.Result.Continue.INSTANCE);
                }
                return DocUploadVerifyResidencyDuxo.this.addressStore.streamResidentialAddress().map(new Function() { // from class: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyDuxo.getResultFromActivation.3.1
                    @Override // io.reactivex.functions.Function
                    public final DocUploadVerifyResidencyViewState.Result.Ineligible apply(ResidentialAddress p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return new DocUploadVerifyResidencyViewState.Result.Ineligible(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }
}

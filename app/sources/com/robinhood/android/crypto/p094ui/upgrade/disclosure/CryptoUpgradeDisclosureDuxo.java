package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeResult;
import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureDataState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureEvent;
import com.robinhood.android.crypto.util.ApiResidencyDocumentExtensions;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0019B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureViewState;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureStateProvider;)V", "onStart", "", "onTermsAccepted", "onNext", "result", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeResult;", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureDuxo extends BaseDuxo3<CryptoUpgradeDisclosureDataState, CryptoUpgradeDisclosureViewState, CryptoUpgradeDisclosureEvent> {
    public static final String CRYPTO_AGREEMENT_NAME = "crypto_user_agreement";
    private final AgreementsStore agreementsStore;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoResidencyDocumentStore cryptoResidencyDocumentStore;
    private final CryptoUpgradeStore cryptoUpgradeStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoUpgradeDisclosureDuxo(AgreementsStore agreementsStore, CryptoAccountStore cryptoAccountStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoUpgradeStore cryptoUpgradeStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider stateProvider) {
        super(CryptoUpgradeDisclosureDataState.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.agreementsStore = agreementsStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onStart$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onStart$1 */
    static final class C135621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135621(Continuation<? super C135621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135621 c135621 = CryptoUpgradeDisclosureDuxo.this.new C135621(continuation);
            c135621.L$0 = obj;
            return c135621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = CryptoUpgradeDisclosureDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    AgreementsStore agreementsStore = cryptoUpgradeDisclosureDuxo.agreementsStore;
                    this.label = 1;
                    obj = agreementsStore.getAgreementWithContent("crypto_user_agreement", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo2 = CryptoUpgradeDisclosureDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                cryptoUpgradeDisclosureDuxo2.applyMutation(new CryptoUpgradeDisclosureDuxo$onStart$1$2$1((UiAgreementWithContent) objM28550constructorimpl, null));
            } else {
                cryptoUpgradeDisclosureDuxo2.submit(new CryptoUpgradeDisclosureEvent.ShowError(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C135621(null), 3, null);
    }

    public final void onTermsAccepted() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDisclosureDuxo.onTermsAccepted$lambda$1(this.f$0, (CryptoUpgradeDisclosureDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTermsAccepted$lambda$1(final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CryptoUpgradeDisclosureDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (!(dataState instanceof CryptoUpgradeDisclosureDataState.Loaded)) {
            if (dataState instanceof CryptoUpgradeDisclosureDataState.Loading) {
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        Single singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(cryptoUpgradeDisclosureDuxo, null, new CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$1(cryptoUpgradeDisclosureDuxo, dataState, null), 1, null).flatMap(new Function() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2

            /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoActivation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$1 */
            static final class C135631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoActivation>, Object> {
                int label;
                final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C135631(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Continuation<? super C135631> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoUpgradeDisclosureDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C135631(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoActivation> continuation) {
                    return ((C135631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    CryptoUpgradeStore cryptoUpgradeStore = this.this$0.cryptoUpgradeStore;
                    this.label = 1;
                    Object objCreateActivation = cryptoUpgradeStore.createActivation(this);
                    return objCreateActivation == coroutine_suspended ? coroutine_suspended : objCreateActivation;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends CryptoUpgradeResult> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo2 = this.this$0;
                Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(cryptoUpgradeDisclosureDuxo2, null, new C135631(cryptoUpgradeDisclosureDuxo2, null), 1, null);
                final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo3 = this.this$0;
                return singleRxSingle$default.flatMap(new Function() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2.2
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends CryptoUpgradeResult> apply(final ApiCryptoActivation activation) {
                        Intrinsics.checkNotNullParameter(activation, "activation");
                        Singles singles = Singles.INSTANCE;
                        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo4 = cryptoUpgradeDisclosureDuxo3;
                        Single singleRxSingle$default2 = RxFactory.DefaultImpls.rxSingle$default(cryptoUpgradeDisclosureDuxo4, null, new AnonymousClass1(cryptoUpgradeDisclosureDuxo4, null), 1, null);
                        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo5 = cryptoUpgradeDisclosureDuxo3;
                        Single singleZip = Single.zip(singleRxSingle$default2, RxFactory.DefaultImpls.rxSingle$default(cryptoUpgradeDisclosureDuxo5, null, new AnonymousClass2(cryptoUpgradeDisclosureDuxo5, null), 1, null), new BiFunction<PaginatedResult<? extends ApiResidencyDocument>, Optional<? extends CryptoAccount>, R>() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$2$apply$$inlined$zip$1
                            @Override // io.reactivex.functions.BiFunction
                            public final R apply(PaginatedResult<? extends ApiResidencyDocument> t, Optional<? extends CryptoAccount> u) {
                                Intrinsics.checkParameterIsNotNull(t, "t");
                                Intrinsics.checkParameterIsNotNull(u, "u");
                                List<? extends ApiResidencyDocument> results = t.getResults();
                                Intrinsics.checkNotNull(activation);
                                return (R) new CryptoUpgradeResult(activation, results);
                            }
                        });
                        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
                        return singleZip;
                    }

                    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiResidencyDocument;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$2$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>>, Object> {
                        int label;
                        final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = cryptoUpgradeDisclosureDuxo;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>> continuation) {
                            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiResidencyDocument>>) continuation);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiResidencyDocument>> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.this$0.cryptoResidencyDocumentStore;
                            this.label = 1;
                            Object residencyDocuments$default = CryptoResidencyDocumentStore.getResidencyDocuments$default(cryptoResidencyDocumentStore, null, this, 1, null);
                            return residencyDocuments$default == coroutine_suspended ? coroutine_suspended : residencyDocuments$default;
                        }
                    }

                    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$2$2", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$2$2$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends CryptoAccount>>, Object> {
                        int label;
                        final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = cryptoUpgradeDisclosureDuxo;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends CryptoAccount>> continuation) {
                            return invoke2(coroutineScope, (Continuation<? super Optional<CryptoAccount>>) continuation);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<CryptoAccount>> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                CryptoAccountStore cryptoAccountStore = this.this$0.cryptoAccountStore;
                                this.label = 1;
                                obj = cryptoAccountStore.fetchCryptoAccount(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Optional3.asOptional(obj);
                        }
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(cryptoUpgradeDisclosureDuxo, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new CryptoUpgradeDisclosureDuxo$onTermsAccepted$1$3(cryptoUpgradeDisclosureDuxo), new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDisclosureDuxo.onTermsAccepted$lambda$1$lambda$0(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTermsAccepted$lambda$1$lambda$0(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        cryptoUpgradeDisclosureDuxo.submit(new CryptoUpgradeDisclosureEvent.ShowError(throwable));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNext(CryptoUpgradeResult result) {
        ApiCryptoActivation activation = result.getActivation();
        ApiResidencyDocument pendingDocument = ApiResidencyDocumentExtensions.getPendingDocument(result.getResidencyDocument());
        if (Intrinsics.areEqual(activation.getState(), "approved")) {
            submit(CryptoUpgradeDisclosureEvent.OnUpgradeSucceeded.INSTANCE);
        } else if (activation.getInReview() && activation.getUnsupportedJurisdiction2or3() && pendingDocument != null) {
            submit(new CryptoUpgradeDisclosureEvent.OnUpgradePendingResidencyDocument(pendingDocument.getId()));
        } else {
            submit(CryptoUpgradeDisclosureEvent.OnUpgradeUnderReview.INSTANCE);
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDuxo$Companion;", "", "<init>", "()V", "CRYPTO_AGREEMENT_NAME", "", "getCRYPTO_AGREEMENT_NAME$feature_crypto_externalDebug$annotations", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCRYPTO_AGREEMENT_NAME$feature_crypto_externalDebug$annotations */
        public static /* synthetic */ void m1913x70e267af() {
        }

        private Companion() {
        }
    }
}

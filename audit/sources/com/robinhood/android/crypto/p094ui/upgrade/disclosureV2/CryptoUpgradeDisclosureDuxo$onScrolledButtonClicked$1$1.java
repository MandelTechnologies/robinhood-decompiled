package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.ApiSignAgreementRequest;
import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeResult;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureEvent;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {101, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ GetCryptoUserAgreementsResponseDto $getCryptoUserAgreementsResponseDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1(GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, int i, Continuation<? super CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1> continuation) {
        super(2, continuation);
        this.$getCryptoUserAgreementsResponseDto = getCryptoUserAgreementsResponseDto;
        this.this$0 = cryptoUpgradeDisclosureDuxo;
        this.$currentIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1 cryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1 = new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1(this.$getCryptoUserAgreementsResponseDto, this.this$0, this.$currentIndex, continuation);
        cryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1.L$0 = obj;
        return cryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:23:0x005d, B:61:0x0180, B:63:0x0186, B:58:0x0163, B:60:0x0169, B:67:0x01bf, B:57:0x0157), top: B:102:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:23:0x005d, B:61:0x0180, B:63:0x0186, B:58:0x0163, B:60:0x0169, B:67:0x01bf, B:57:0x0157), top: B:102:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:23:0x005d, B:61:0x0180, B:63:0x0186, B:58:0x0163, B:60:0x0169, B:67:0x01bf, B:57:0x0157), top: B:102:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221 A[Catch: all -> 0x0027, PHI: r0 r5
      0x0221: PHI (r0v33 com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo) = 
      (r0v23 com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo)
      (r0v64 com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo)
     binds: [B:79:0x021e, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v7 java.lang.Object) binds: [B:79:0x021e, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0027, blocks: (B:10:0x0022, B:89:0x024e, B:17:0x003a, B:85:0x0239, B:20:0x0046, B:81:0x0221, B:78:0x020a), top: B:102:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0297  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0169 -> B:61:0x0180). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object objM28550constructorimpl2;
        Object objM28550constructorimpl3;
        CoroutineScope coroutineScope;
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo;
        Iterator it;
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo2;
        Object objCreateActivation;
        Object residencyDocuments$default;
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo3;
        ApiCryptoActivation apiCryptoActivation;
        CryptoAccountStore cryptoAccountStore;
        ApiCryptoActivation apiCryptoActivation2;
        PaginatedResult paginatedResult;
        Throwable thM28553exceptionOrNullimpl;
        Iterator it2;
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl3 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th3));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (this.$getCryptoUserAgreementsResponseDto.getSign_agreements_individually()) {
                this.this$0.applyMutation(new C135931(null));
                GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = this.$getCryptoUserAgreementsResponseDto;
                int i2 = this.$currentIndex;
                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo5 = this.this$0;
                Result.Companion companion4 = Result.INSTANCE;
                it2 = getCryptoUserAgreementsResponseDto.getCrypto_agreements().get(i2).getSignable_agreements().iterator();
                cryptoUpgradeDisclosureDuxo4 = cryptoUpgradeDisclosureDuxo5;
            }
            if (this.$currentIndex >= CollectionsKt.getLastIndex(this.$getCryptoUserAgreementsResponseDto.getCrypto_agreements())) {
                this.this$0.applyMutation(new C135955(null));
                return Unit.INSTANCE;
            }
            if (!this.$getCryptoUserAgreementsResponseDto.getSign_agreements_individually()) {
                this.this$0.applyMutation(new C135966(null));
                GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto2 = this.$getCryptoUserAgreementsResponseDto;
                cryptoUpgradeDisclosureDuxo = this.this$0;
                Result.Companion companion5 = Result.INSTANCE;
                it = getCryptoUserAgreementsResponseDto2.getCrypto_agreements().iterator();
                if (it.hasNext()) {
                }
            }
            this.this$0.applyMutation(new C1359410(null));
            cryptoUpgradeDisclosureDuxo2 = this.this$0;
            Result.Companion companion6 = Result.INSTANCE;
            CryptoUpgradeStore cryptoUpgradeStore = cryptoUpgradeDisclosureDuxo2.cryptoUpgradeStore;
            this.L$0 = cryptoUpgradeDisclosureDuxo2;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            objCreateActivation = cryptoUpgradeStore.createActivation(this);
            if (objCreateActivation == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            it2 = (Iterator) this.L$2;
            cryptoUpgradeDisclosureDuxo4 = (CryptoUpgradeDisclosureDuxo) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    cryptoUpgradeDisclosureDuxo2 = (CryptoUpgradeDisclosureDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objCreateActivation = obj;
                    ApiCryptoActivation apiCryptoActivation3 = (ApiCryptoActivation) objCreateActivation;
                    CryptoResidencyDocumentStore cryptoResidencyDocumentStore = cryptoUpgradeDisclosureDuxo2.cryptoResidencyDocumentStore;
                    this.L$0 = cryptoUpgradeDisclosureDuxo2;
                    this.L$1 = apiCryptoActivation3;
                    this.label = 4;
                    residencyDocuments$default = CryptoResidencyDocumentStore.getResidencyDocuments$default(cryptoResidencyDocumentStore, null, this, 1, null);
                    if (residencyDocuments$default != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoUpgradeDisclosureDuxo3 = cryptoUpgradeDisclosureDuxo2;
                    apiCryptoActivation = apiCryptoActivation3;
                    PaginatedResult paginatedResult2 = (PaginatedResult) residencyDocuments$default;
                    cryptoAccountStore = cryptoUpgradeDisclosureDuxo3.cryptoAccountStore;
                    this.L$0 = apiCryptoActivation;
                    this.L$1 = paginatedResult2;
                    this.label = 5;
                    if (cryptoAccountStore.fetchCryptoAccount(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paginatedResult = (PaginatedResult) this.L$1;
                    apiCryptoActivation2 = (ApiCryptoActivation) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objM28550constructorimpl = Result.m28550constructorimpl(new CryptoUpgradeResult(apiCryptoActivation2, paginatedResult.getResults()));
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo6 = this.this$0;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        cryptoUpgradeDisclosureDuxo6.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$12$1(null));
                        cryptoUpgradeDisclosureDuxo6.processActivationResult((CryptoUpgradeResult) objM28550constructorimpl);
                    }
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo7 = this.this$0;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl == null) {
                        cryptoUpgradeDisclosureDuxo7.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$13$1(null));
                        cryptoUpgradeDisclosureDuxo7.submit(new CryptoUpgradeDisclosureEvent.ShowError(thM28553exceptionOrNullimpl));
                        return Unit.INSTANCE;
                    }
                    Result.m28549boximpl(objM28550constructorimpl);
                    return Unit.INSTANCE;
                }
                apiCryptoActivation = (ApiCryptoActivation) this.L$1;
                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo8 = (CryptoUpgradeDisclosureDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                cryptoUpgradeDisclosureDuxo3 = cryptoUpgradeDisclosureDuxo8;
                residencyDocuments$default = obj;
                PaginatedResult paginatedResult22 = (PaginatedResult) residencyDocuments$default;
                cryptoAccountStore = cryptoUpgradeDisclosureDuxo3.cryptoAccountStore;
                this.L$0 = apiCryptoActivation;
                this.L$1 = paginatedResult22;
                this.label = 5;
                if (cryptoAccountStore.fetchCryptoAccount(this) != coroutine_suspended) {
                    apiCryptoActivation2 = apiCryptoActivation;
                    paginatedResult = paginatedResult22;
                    objM28550constructorimpl = Result.m28550constructorimpl(new CryptoUpgradeResult(apiCryptoActivation2, paginatedResult.getResults()));
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo62 = this.this$0;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo72 = this.this$0;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl == null) {
                    }
                }
                return coroutine_suspended;
            }
            Iterator it3 = (Iterator) this.L$3;
            Iterator it4 = (Iterator) this.L$2;
            CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo9 = (CryptoUpgradeDisclosureDuxo) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (it3.hasNext()) {
                GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto signableAgreementDto = (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto) it3.next();
                AgreementsStore agreementsStore = cryptoUpgradeDisclosureDuxo9.agreementsStore;
                ApiSignAgreementRequest apiSignAgreementRequest = new ApiSignAgreementRequest(StringsKt.toUuid(signableAgreementDto.getAgreement_id()), signableAgreementDto.getAgreement_sha256(), null, null, 12, null);
                this.L$0 = coroutineScope2;
                this.L$1 = cryptoUpgradeDisclosureDuxo9;
                this.L$2 = it4;
                this.L$3 = it3;
                this.label = 2;
                if (agreementsStore.signAgreementWithRequest(apiSignAgreementRequest, this) == coroutine_suspended) {
                    break;
                }
            }
            it = it4;
            cryptoUpgradeDisclosureDuxo = cryptoUpgradeDisclosureDuxo9;
            coroutineScope = coroutineScope2;
            if (it.hasNext()) {
                CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo10 = cryptoUpgradeDisclosureDuxo;
                it4 = it;
                it3 = ((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto) it.next()).getSignable_agreements().iterator();
                coroutineScope2 = coroutineScope;
                cryptoUpgradeDisclosureDuxo9 = cryptoUpgradeDisclosureDuxo10;
                while (it3.hasNext()) {
                }
                it = it4;
                cryptoUpgradeDisclosureDuxo = cryptoUpgradeDisclosureDuxo9;
                coroutineScope = coroutineScope2;
                if (it.hasNext()) {
                    objM28550constructorimpl3 = Result.m28550constructorimpl(Unit.INSTANCE);
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo11 = this.this$0;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl3)) {
                        cryptoUpgradeDisclosureDuxo11.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$8$1(null));
                    }
                    CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo12 = this.this$0;
                    Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl3);
                    if (thM28553exceptionOrNullimpl2 != null) {
                        cryptoUpgradeDisclosureDuxo12.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$9$1(null));
                        cryptoUpgradeDisclosureDuxo12.submit(new CryptoUpgradeDisclosureEvent.ShowError(thM28553exceptionOrNullimpl2));
                        return Unit.INSTANCE;
                    }
                    this.this$0.applyMutation(new C1359410(null));
                    cryptoUpgradeDisclosureDuxo2 = this.this$0;
                    Result.Companion companion62 = Result.INSTANCE;
                    CryptoUpgradeStore cryptoUpgradeStore2 = cryptoUpgradeDisclosureDuxo2.cryptoUpgradeStore;
                    this.L$0 = cryptoUpgradeDisclosureDuxo2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objCreateActivation = cryptoUpgradeStore2.createActivation(this);
                    if (objCreateActivation == coroutine_suspended) {
                        ApiCryptoActivation apiCryptoActivation32 = (ApiCryptoActivation) objCreateActivation;
                        CryptoResidencyDocumentStore cryptoResidencyDocumentStore2 = cryptoUpgradeDisclosureDuxo2.cryptoResidencyDocumentStore;
                        this.L$0 = cryptoUpgradeDisclosureDuxo2;
                        this.L$1 = apiCryptoActivation32;
                        this.label = 4;
                        residencyDocuments$default = CryptoResidencyDocumentStore.getResidencyDocuments$default(cryptoResidencyDocumentStore2, null, this, 1, null);
                        if (residencyDocuments$default != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
        while (it2.hasNext()) {
            GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto signableAgreementDto2 = (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto) it2.next();
            AgreementsStore agreementsStore2 = cryptoUpgradeDisclosureDuxo4.agreementsStore;
            ApiSignAgreementRequest apiSignAgreementRequest2 = new ApiSignAgreementRequest(StringsKt.toUuid(signableAgreementDto2.getAgreement_id()), signableAgreementDto2.getAgreement_sha256(), null, null, 12, null);
            this.L$0 = coroutineScope;
            this.L$1 = cryptoUpgradeDisclosureDuxo4;
            this.L$2 = it2;
            this.label = 1;
            if (agreementsStore2.signAgreementWithRequest(apiSignAgreementRequest2, this) == coroutine_suspended) {
                break;
            }
        }
        objM28550constructorimpl2 = Result.m28550constructorimpl(Unit.INSTANCE);
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo13 = this.this$0;
        if (Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
            cryptoUpgradeDisclosureDuxo13.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$3$1(null));
        }
        CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo14 = this.this$0;
        Throwable thM28553exceptionOrNullimpl3 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
        if (thM28553exceptionOrNullimpl3 != null) {
            cryptoUpgradeDisclosureDuxo14.applyMutation(new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$4$1(null));
            cryptoUpgradeDisclosureDuxo14.submit(new CryptoUpgradeDisclosureEvent.ShowError(thM28553exceptionOrNullimpl3));
            return Unit.INSTANCE;
        }
        if (this.$currentIndex >= CollectionsKt.getLastIndex(this.$getCryptoUserAgreementsResponseDto.getCrypto_agreements())) {
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$1 */
    static final class C135931 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135931(Continuation<? super C135931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135931 c135931 = new C135931(continuation);
            c135931.L$0 = obj;
            return c135931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C135931) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoUpgradeDisclosureDataState.copy$default((CryptoUpgradeDisclosureDataState) this.L$0, null, 0, null, null, true, 15, null);
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$5", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$5 */
    static final class C135955 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135955(Continuation<? super C135955> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135955 c135955 = new C135955(continuation);
            c135955.L$0 = obj;
            return c135955;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C135955) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState = (CryptoUpgradeDisclosureDataState) this.L$0;
            return CryptoUpgradeDisclosureDataState.copy$default(cryptoUpgradeDisclosureDataState, null, cryptoUpgradeDisclosureDataState.getCurrentDisclosureIndex() + 1, null, null, false, 29, null);
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$6", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$6 */
    static final class C135966 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135966(Continuation<? super C135966> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135966 c135966 = new C135966(continuation);
            c135966.L$0 = obj;
            return c135966;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C135966) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoUpgradeDisclosureDataState.copy$default((CryptoUpgradeDisclosureDataState) this.L$0, null, 0, null, null, true, 15, null);
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$10", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1$10 */
    static final class C1359410 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C1359410(Continuation<? super C1359410> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1359410 c1359410 = new C1359410(continuation);
            c1359410.L$0 = obj;
            return c1359410;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C1359410) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoUpgradeDisclosureDataState.copy$default((CryptoUpgradeDisclosureDataState) this.L$0, null, 0, null, null, true, 15, null);
        }
    }
}

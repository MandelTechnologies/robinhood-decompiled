package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeResult;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureEvent;
import com.robinhood.android.crypto.util.ApiResidencyDocumentExtensions;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoAgreementsStore;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiResidencyDocument;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureViewState;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureEvent;", "cryptoAgreementsStore", "Lcom/robinhood/librobinhood/data/store/CryptoAgreementsStore;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "cryptoUpgradeStore", "Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAgreementsStore;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/librobinhood/data/store/CryptoUpgradeStore;Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureStateProvider;)V", "onCreate", "", "onScrolledToBottom", "onCheckboxChanged", "agreementId", "Ljava/util/UUID;", "checkboxId", "", "isChecked", "", "onNavButtonClicked", "onScrolledButtonClicked", "processActivationResult", "result", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeResult;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureDuxo extends BaseDuxo3<CryptoUpgradeDisclosureDataState, CryptoUpgradeDisclosureViewState, CryptoUpgradeDisclosureEvent> {
    public static final int $stable = 8;
    private final AgreementsStore agreementsStore;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoAgreementsStore cryptoAgreementsStore;
    private final CryptoResidencyDocumentStore cryptoResidencyDocumentStore;
    private final CryptoUpgradeStore cryptoUpgradeStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoUpgradeDisclosureDuxo(CryptoAgreementsStore cryptoAgreementsStore, AgreementsStore agreementsStore, CryptoUpgradeStore cryptoUpgradeStore, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, CryptoAccountStore cryptoAccountStore, DuxoBundle duxoBundle, CryptoUpgradeDisclosureStateProvider stateProvider) {
        super(new CryptoUpgradeDisclosureDataState(null, 0, null, null, false, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoAgreementsStore, "cryptoAgreementsStore");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(cryptoUpgradeStore, "cryptoUpgradeStore");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoAgreementsStore = cryptoAgreementsStore;
        this.agreementsStore = agreementsStore;
        this.cryptoUpgradeStore = cryptoUpgradeStore;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.cryptoAccountStore = cryptoAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C135921(null), 3, null);
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCreate$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCreate$1 */
    static final class C135921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C135921(Continuation<? super C135921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoUpgradeDisclosureDuxo.this.new C135921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCreate$1$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoUpgradeDisclosureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoUpgradeDisclosureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
                return ((AnonymousClass1) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState2 = (CryptoUpgradeDisclosureDataState) this.L$0;
                    CryptoAgreementsStore cryptoAgreementsStore = this.this$0.cryptoAgreementsStore;
                    this.L$0 = cryptoUpgradeDisclosureDataState2;
                    this.label = 1;
                    Object cryptoAgreements = cryptoAgreementsStore.getCryptoAgreements(this);
                    if (cryptoAgreements == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoUpgradeDisclosureDataState = cryptoUpgradeDisclosureDataState2;
                    obj = cryptoAgreements;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoUpgradeDisclosureDataState = (CryptoUpgradeDisclosureDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return CryptoUpgradeDisclosureDataState.copy$default(cryptoUpgradeDisclosureDataState, (GetCryptoUserAgreementsResponseDto) obj, 0, null, null, false, 30, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = CryptoUpgradeDisclosureDuxo.this;
            cryptoUpgradeDisclosureDuxo.applyMutation(new AnonymousClass1(cryptoUpgradeDisclosureDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledToBottom$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onScrolledToBottom$1 */
    static final class C135971 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135971(Continuation<? super C135971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135971 c135971 = new C135971(continuation);
            c135971.L$0 = obj;
            return c135971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C135971) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState = (CryptoUpgradeDisclosureDataState) this.L$0;
            return CryptoUpgradeDisclosureDataState.copy$default(cryptoUpgradeDisclosureDataState, null, 0, SetsKt.plus(cryptoUpgradeDisclosureDataState.getScrolledToBottomAgreementIndices(), boxing.boxInt(cryptoUpgradeDisclosureDataState.getCurrentDisclosureIndex())), null, false, 27, null);
        }
    }

    public final void onScrolledToBottom() {
        applyMutation(new C135971(null));
    }

    /* compiled from: CryptoUpgradeDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCheckboxChanged$1", m3645f = "CryptoUpgradeDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$onCheckboxChanged$1 */
    static final class C135911 extends ContinuationImpl7 implements Function2<CryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState>, Object> {
        final /* synthetic */ UUID $agreementId;
        final /* synthetic */ String $checkboxId;
        final /* synthetic */ boolean $isChecked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C135911(UUID uuid, boolean z, String str, Continuation<? super C135911> continuation) {
            super(2, continuation);
            this.$agreementId = uuid;
            this.$isChecked = z;
            this.$checkboxId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135911 c135911 = new C135911(this.$agreementId, this.$isChecked, this.$checkboxId, continuation);
            c135911.L$0 = obj;
            return c135911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, Continuation<? super CryptoUpgradeDisclosureDataState> continuation) {
            return ((C135911) create(cryptoUpgradeDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set setMinus;
            Map mapPlus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState = (CryptoUpgradeDisclosureDataState) this.L$0;
            Set<String> setEmptySet = cryptoUpgradeDisclosureDataState.getCheckedCheckboxes().get(this.$agreementId);
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
            if (this.$isChecked) {
                setMinus = SetsKt.plus(setEmptySet, this.$checkboxId);
            } else {
                setMinus = SetsKt.minus(setEmptySet, this.$checkboxId);
            }
            if (setMinus.isEmpty()) {
                mapPlus = MapsKt.minus(cryptoUpgradeDisclosureDataState.getCheckedCheckboxes(), this.$agreementId);
            } else {
                mapPlus = MapsKt.plus(cryptoUpgradeDisclosureDataState.getCheckedCheckboxes(), Tuples4.m3642to(this.$agreementId, setMinus));
            }
            return CryptoUpgradeDisclosureDataState.copy$default(cryptoUpgradeDisclosureDataState, null, 0, null, mapPlus, false, 23, null);
        }
    }

    public final void onCheckboxChanged(UUID agreementId, String checkboxId, boolean isChecked) {
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(checkboxId, "checkboxId");
        applyMutation(new C135911(agreementId, isChecked, checkboxId, null));
    }

    public final void onNavButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDisclosureDuxo.onNavButtonClicked$lambda$0(this.f$0, (CryptoUpgradeDisclosureDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavButtonClicked$lambda$0(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CryptoUpgradeDisclosureDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getCurrentDisclosureIndex() > 0) {
            cryptoUpgradeDisclosureDuxo.applyMutation(new CryptoUpgradeDisclosureDuxo$onNavButtonClicked$1$1(null));
        } else {
            cryptoUpgradeDisclosureDuxo.submit(CryptoUpgradeDisclosureEvent.NavigateBack.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public final void onScrolledButtonClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoUpgradeDisclosureDuxo.onScrolledButtonClicked$lambda$1(this.f$0, (CryptoUpgradeDisclosureDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScrolledButtonClicked$lambda$1(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CryptoUpgradeDisclosureDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = it.getGetCryptoUserAgreementsResponseDto();
        if (getCryptoUserAgreementsResponseDto == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(cryptoUpgradeDisclosureDuxo.getLifecycleScope(), null, null, new CryptoUpgradeDisclosureDuxo$onScrolledButtonClicked$1$1(getCryptoUserAgreementsResponseDto, cryptoUpgradeDisclosureDuxo, it.getCurrentDisclosureIndex(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processActivationResult(CryptoUpgradeResult result) {
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
}

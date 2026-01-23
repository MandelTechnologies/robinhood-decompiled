package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCreateUtils;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$2$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {474, 493}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransferDuxo8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Money $amount;
    final /* synthetic */ InternationalTransferDataState $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ InternationalTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferDuxo8(InternationalTransferDuxo internationalTransferDuxo, InternationalTransferDataState internationalTransferDataState, Money money, Continuation<? super InternationalTransferDuxo8> continuation) {
        super(2, continuation);
        this.this$0 = internationalTransferDuxo;
        this.$state = internationalTransferDataState;
        this.$amount = money;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternationalTransferDuxo8(this.this$0, this.$state, this.$amount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternationalTransferDuxo8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context eventContext;
        InternationalTransferDuxo internationalTransferDuxo;
        Object objCreateTransferRequest;
        StringPreference stringPreference;
        TransferDirection transferDirection;
        TransfersBonfireApi transfersBonfireApi;
        LazyMoshi lazyMoshi;
        Object objCreateTransfer;
        ApiCreateTransferRequest apiCreateTransferRequest;
        Context context;
        Response response;
        String id;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory = this.this$0.internationalCreateTransferRequestFactory;
            StringPreference stringPreference2 = this.this$0.defaultUkExternalTransferAccountPref;
            TransferDirection transferDirection2 = this.$state.getTransferDirection();
            if (!Intrinsics.areEqual(this.$state.getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                throw new IllegalStateException(("Unsupported locality: " + this.$state.getLocality()).toString());
            }
            TransferAccount externalAccount = this.$state.getExternalAccount();
            String accountId = externalAccount != null ? externalAccount.getAccountId() : null;
            Money money = this.$amount;
            ApiFxQuote fxQuote = this.$state.getFxQuote();
            Intrinsics.checkNotNull(fxQuote);
            TransfersBonfireApi transfersBonfireApi2 = this.this$0.transfersBonfireApi;
            InternationalTransferDuxo internationalTransferDuxo2 = this.this$0;
            LazyMoshi lazyMoshi2 = internationalTransferDuxo2.moshi;
            eventContext = this.$state.getEventContext();
            try {
                InternationalCreateTransferRequestFactory.TransferData transferData = new InternationalCreateTransferRequestFactory.TransferData(money, accountId, fxQuote, transferDirection2);
                this.L$0 = stringPreference2;
                this.L$1 = transferDirection2;
                this.L$2 = transfersBonfireApi2;
                this.L$3 = internationalTransferDuxo2;
                this.L$4 = lazyMoshi2;
                this.L$5 = eventContext;
                this.label = 1;
                objCreateTransferRequest = internationalCreateTransferRequestFactory.createTransferRequest(transferData, this);
                if (objCreateTransferRequest != coroutine_suspended) {
                    stringPreference = stringPreference2;
                    transferDirection = transferDirection2;
                    transfersBonfireApi = transfersBonfireApi2;
                    internationalTransferDuxo = internationalTransferDuxo2;
                    lazyMoshi = lazyMoshi2;
                }
                return coroutine_suspended;
            } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused) {
                internationalTransferDuxo = internationalTransferDuxo2;
                StringResource.Companion companion = StringResource.INSTANCE;
                internationalTransferDuxo.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
                this.this$0.applyMutation(new C307501(null));
                return Unit.INSTANCE;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiCreateTransferRequest = (ApiCreateTransferRequest) this.L$5;
            context = (Context) this.L$4;
            lazyMoshi = (LazyMoshi) this.L$3;
            internationalTransferDuxo = (InternationalTransferDuxo) this.L$2;
            TransferDirection transferDirection3 = (TransferDirection) this.L$1;
            StringPreference stringPreference3 = (StringPreference) this.L$0;
            ResultKt.throwOnFailure(obj);
            stringPreference = stringPreference3;
            transferDirection = transferDirection3;
            objCreateTransfer = obj;
            response = (Response) objCreateTransfer;
            ApiCreateTransferResponse apiCreateTransferResponse = (ApiCreateTransferResponse) response.body();
            if (response.isSuccessful() || apiCreateTransferResponse == null) {
                InternationalTransferCreateUtils.handleUnsuccessfulTransferCreationResponse(response, internationalTransferDuxo, lazyMoshi, context);
            } else {
                int i2 = InternationalTransferCreateUtils.WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
                if (i2 == 1) {
                    id = apiCreateTransferRequest.getSource().getId();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id = apiCreateTransferRequest.getSink().getId();
                }
                stringPreference.set(id);
                internationalTransferDuxo.submit(new InternationalTransferEvent.NavigateAfterTransferCreation(apiCreateTransferResponse));
            }
            this.this$0.applyMutation(new C307501(null));
            return Unit.INSTANCE;
        }
        Context context2 = (Context) this.L$5;
        lazyMoshi = (LazyMoshi) this.L$4;
        internationalTransferDuxo = (InternationalTransferDuxo) this.L$3;
        transfersBonfireApi = (TransfersBonfireApi) this.L$2;
        transferDirection = (TransferDirection) this.L$1;
        stringPreference = (StringPreference) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            eventContext = context2;
            objCreateTransferRequest = obj;
        } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused2) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            internationalTransferDuxo.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion2.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion2.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion2.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
            this.this$0.applyMutation(new C307501(null));
            return Unit.INSTANCE;
        }
        ApiCreateTransferRequest apiCreateTransferRequest2 = (ApiCreateTransferRequest) objCreateTransferRequest;
        this.L$0 = stringPreference;
        this.L$1 = transferDirection;
        this.L$2 = internationalTransferDuxo;
        this.L$3 = lazyMoshi;
        this.L$4 = eventContext;
        this.L$5 = apiCreateTransferRequest2;
        this.label = 2;
        objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest2, this);
        if (objCreateTransfer != coroutine_suspended) {
            apiCreateTransferRequest = apiCreateTransferRequest2;
            context = eventContext;
            response = (Response) objCreateTransfer;
            ApiCreateTransferResponse apiCreateTransferResponse2 = (ApiCreateTransferResponse) response.body();
            if (response.isSuccessful()) {
                InternationalTransferCreateUtils.handleUnsuccessfulTransferCreationResponse(response, internationalTransferDuxo, lazyMoshi, context);
            }
            this.this$0.applyMutation(new C307501(null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$2$1$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$2$1$1 */
    static final class C307501 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C307501(Continuation<? super C307501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307501 c307501 = new C307501(continuation);
            c307501.L$0 = obj;
            return c307501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307501) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388095, null);
        }
    }
}

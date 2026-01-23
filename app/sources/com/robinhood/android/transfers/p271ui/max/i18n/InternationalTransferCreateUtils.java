package com.robinhood.android.transfers.p271ui.max.i18n;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: InternationalTransferCreateUtils.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0080H¢\u0006\u0002\u0010\u0017\u001a2\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002¨\u0006\u001c"}, m3636d2 = {"createTransfer", "", "createTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "defaultUkExternalTransferAccountPref", "Lcom/robinhood/prefs/StringPreference;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "externalAccountId", "", "amount", "Lcom/robinhood/models/util/Money;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "(Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/models/db/TransferDirection;Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/api/ApiFxQuote;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUnsuccessfulTransferCreationResponse", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCreateUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferCreateUtils {

    /* compiled from: InternationalTransferCreateUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCreateUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: InternationalTransferCreateUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCreateUtilsKt", m3645f = "InternationalTransferCreateUtils.kt", m3646l = {40, 59}, m3647m = "createTransfer")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCreateUtilsKt$createTransfer$1 */
    static final class C307341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C307341(Continuation<? super C307341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternationalTransferCreateUtils.createTransfer(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createTransfer(InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, StringPreference stringPreference, TransferDirection transferDirection, String str, Money money, ApiFxQuote apiFxQuote, TransfersBonfireApi transfersBonfireApi, InternationalTransferDuxo internationalTransferDuxo, LazyMoshi lazyMoshi, Context context, Continuation<? super Unit> continuation) {
        C307341 c307341;
        InternationalTransferDuxo internationalTransferDuxo2;
        LazyMoshi lazyMoshi2;
        TransfersBonfireApi transfersBonfireApi2;
        Context context2;
        Object objCreateTransfer;
        StringPreference stringPreference2;
        TransferDirection transferDirection2;
        LazyMoshi lazyMoshi3;
        Context context3;
        ApiCreateTransferRequest apiCreateTransferRequest;
        InternationalTransferDuxo internationalTransferDuxo3;
        Response response;
        String id;
        if (continuation instanceof C307341) {
            c307341 = (C307341) continuation;
            int i = c307341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c307341.label = i - Integer.MIN_VALUE;
            } else {
                c307341 = new C307341(continuation);
            }
        }
        Object objCreateTransferRequest = c307341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c307341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateTransferRequest);
            try {
                InternationalCreateTransferRequestFactory.TransferData transferData = new InternationalCreateTransferRequestFactory.TransferData(money, str, apiFxQuote, transferDirection);
                c307341.L$0 = stringPreference;
                c307341.L$1 = transferDirection;
                c307341.L$2 = transfersBonfireApi;
                internationalTransferDuxo2 = internationalTransferDuxo;
                try {
                    c307341.L$3 = internationalTransferDuxo2;
                    lazyMoshi2 = lazyMoshi;
                    c307341.L$4 = lazyMoshi2;
                    c307341.L$5 = context;
                    c307341.label = 1;
                    objCreateTransferRequest = internationalCreateTransferRequestFactory.createTransferRequest(transferData, c307341);
                    if (objCreateTransferRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transfersBonfireApi2 = transfersBonfireApi;
                    context2 = context;
                    ApiCreateTransferRequest apiCreateTransferRequest2 = (ApiCreateTransferRequest) objCreateTransferRequest;
                    c307341.L$0 = stringPreference;
                    c307341.L$1 = transferDirection;
                    c307341.L$2 = internationalTransferDuxo2;
                    c307341.L$3 = lazyMoshi2;
                    c307341.L$4 = context2;
                    c307341.L$5 = apiCreateTransferRequest2;
                    c307341.label = 2;
                    objCreateTransfer = transfersBonfireApi2.createTransfer(apiCreateTransferRequest2, c307341);
                    if (objCreateTransfer != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    internationalTransferDuxo2.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
                    return Unit.INSTANCE;
                }
            } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused2) {
                internationalTransferDuxo2 = internationalTransferDuxo;
                StringResource.Companion companion2 = StringResource.INSTANCE;
                internationalTransferDuxo2.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion2.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion2.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion2.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
                return Unit.INSTANCE;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiCreateTransferRequest = (ApiCreateTransferRequest) c307341.L$5;
            context3 = (Context) c307341.L$4;
            lazyMoshi3 = (LazyMoshi) c307341.L$3;
            internationalTransferDuxo3 = (InternationalTransferDuxo) c307341.L$2;
            transferDirection2 = (TransferDirection) c307341.L$1;
            stringPreference2 = (StringPreference) c307341.L$0;
            ResultKt.throwOnFailure(objCreateTransferRequest);
            response = (Response) objCreateTransferRequest;
            ApiCreateTransferResponse apiCreateTransferResponse = (ApiCreateTransferResponse) response.body();
            if (response.isSuccessful() || apiCreateTransferResponse == null) {
                handleUnsuccessfulTransferCreationResponse(response, internationalTransferDuxo3, lazyMoshi3, context3);
            } else {
                int i3 = WhenMappings.$EnumSwitchMapping$0[transferDirection2.ordinal()];
                if (i3 == 1) {
                    id = apiCreateTransferRequest.getSource().getId();
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id = apiCreateTransferRequest.getSink().getId();
                }
                stringPreference2.set(id);
                internationalTransferDuxo3.submit(new InternationalTransferEvent.NavigateAfterTransferCreation(apiCreateTransferResponse));
            }
            return Unit.INSTANCE;
        }
        context2 = (Context) c307341.L$5;
        LazyMoshi lazyMoshi4 = (LazyMoshi) c307341.L$4;
        InternationalTransferDuxo internationalTransferDuxo4 = (InternationalTransferDuxo) c307341.L$3;
        transfersBonfireApi2 = (TransfersBonfireApi) c307341.L$2;
        TransferDirection transferDirection3 = (TransferDirection) c307341.L$1;
        StringPreference stringPreference3 = (StringPreference) c307341.L$0;
        try {
            ResultKt.throwOnFailure(objCreateTransferRequest);
            lazyMoshi2 = lazyMoshi4;
            stringPreference = stringPreference3;
            internationalTransferDuxo2 = internationalTransferDuxo4;
            transferDirection = transferDirection3;
            ApiCreateTransferRequest apiCreateTransferRequest22 = (ApiCreateTransferRequest) objCreateTransferRequest;
            c307341.L$0 = stringPreference;
            c307341.L$1 = transferDirection;
            c307341.L$2 = internationalTransferDuxo2;
            c307341.L$3 = lazyMoshi2;
            c307341.L$4 = context2;
            c307341.L$5 = apiCreateTransferRequest22;
            c307341.label = 2;
            objCreateTransfer = transfersBonfireApi2.createTransfer(apiCreateTransferRequest22, c307341);
            if (objCreateTransfer != coroutine_suspended) {
                stringPreference2 = stringPreference;
                transferDirection2 = transferDirection;
                lazyMoshi3 = lazyMoshi2;
                context3 = context2;
                apiCreateTransferRequest = apiCreateTransferRequest22;
                objCreateTransferRequest = objCreateTransfer;
                internationalTransferDuxo3 = internationalTransferDuxo2;
                response = (Response) objCreateTransferRequest;
                ApiCreateTransferResponse apiCreateTransferResponse2 = (ApiCreateTransferResponse) response.body();
                if (response.isSuccessful()) {
                    handleUnsuccessfulTransferCreationResponse(response, internationalTransferDuxo3, lazyMoshi3, context3);
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused3) {
            internationalTransferDuxo2 = internationalTransferDuxo4;
            StringResource.Companion companion22 = StringResource.INSTANCE;
            internationalTransferDuxo2.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion22.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion22.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion22.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
            return Unit.INSTANCE;
        }
    }

    private static final Object createTransfer$$forInline(InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, StringPreference stringPreference, TransferDirection transferDirection, String str, Money money, ApiFxQuote apiFxQuote, TransfersBonfireApi transfersBonfireApi, InternationalTransferDuxo internationalTransferDuxo, LazyMoshi lazyMoshi, Context context, Continuation<? super Unit> continuation) {
        String id;
        try {
            InternationalCreateTransferRequestFactory.TransferData transferData = new InternationalCreateTransferRequestFactory.TransferData(money, str, apiFxQuote, transferDirection);
            InlineMarker.mark(0);
            Object objCreateTransferRequest = internationalCreateTransferRequestFactory.createTransferRequest(transferData, continuation);
            InlineMarker.mark(1);
            ApiCreateTransferRequest apiCreateTransferRequest = (ApiCreateTransferRequest) objCreateTransferRequest;
            InlineMarker.mark(0);
            Object objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, continuation);
            InlineMarker.mark(1);
            Response response = (Response) objCreateTransfer;
            ApiCreateTransferResponse apiCreateTransferResponse = (ApiCreateTransferResponse) response.body();
            if (!response.isSuccessful() || apiCreateTransferResponse == null) {
                handleUnsuccessfulTransferCreationResponse(response, internationalTransferDuxo, lazyMoshi, context);
            } else {
                int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
                if (i == 1) {
                    id = apiCreateTransferRequest.getSource().getId();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    id = apiCreateTransferRequest.getSink().getId();
                }
                stringPreference.set(id);
                internationalTransferDuxo.submit(new InternationalTransferEvent.NavigateAfterTransferCreation(apiCreateTransferResponse));
            }
            return Unit.INSTANCE;
        } catch (InternationalCreateTransferRequestFactory.MissingBrokerageAccountException unused) {
            StringResource.Companion companion = StringResource.INSTANCE;
            internationalTransferDuxo.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_title, new Object[0]), companion.invoke(C30065R.string.uk_withdrawal_brokerage_account_restricted_detail, new Object[0]), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.android.transfers.ui.max.i18n.InternationalTransferEvent$ShowTransferCreationGenericError] */
    public static final void handleUnsuccessfulTransferCreationResponse(Response<ApiCreateTransferResponse> response, InternationalTransferDuxo internationalTransferDuxo, LazyMoshi lazyMoshi, Context context) {
        ErrorResponse errorResponse;
        String error_message;
        String strExtractErrorBodyString;
        InternationalTransferEvent.ShowTransferCreationAlertError showTransferCreationGenericError = null;
        try {
            strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response);
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new InternationalTransferCreateUtils2(th), false, null, 6, null);
        }
        if (strExtractErrorBodyString != null) {
            Types types = Types.INSTANCE;
            errorResponse = (ErrorResponse) lazyMoshi.adapter(new TypeToken<ErrorResponse>() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCreateUtilsKt$handleUnsuccessfulTransferCreationResponse$lambda$0$$inlined$getAdapter$1
            }.getType()).fromJson(strExtractErrorBodyString);
        } else {
            errorResponse = null;
        }
        if (errorResponse instanceof GenericAlertErrorResponse) {
            GenericAlertErrorResponse genericAlertErrorResponse = (GenericAlertErrorResponse) errorResponse;
            showTransferCreationGenericError = new InternationalTransferEvent.ShowTransferCreationAlertError(genericAlertErrorResponse.getAlert(), genericAlertErrorResponse.getError_code(), context);
        } else if ((errorResponse instanceof GenericErrorResponse) && (error_message = ((GenericErrorResponse) errorResponse).getError_message()) != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            showTransferCreationGenericError = new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion.invoke(C11048R.string.general_error_title, new Object[0]), companion.invoke(error_message), null, null, 25, null);
        }
        if (showTransferCreationGenericError != null) {
            internationalTransferDuxo.submit(showTransferCreationGenericError);
        }
    }
}

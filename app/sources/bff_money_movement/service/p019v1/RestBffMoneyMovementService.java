package bff_money_movement.service.p019v1;

import accio.service.p003v1.ListAccountsSettingDto;
import accio.service.p003v1.ProviderDto;
import accio.service.p003v1.SpanDto;
import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.FXAcctSchemaDto;
import cashier_protos.payment_intents.p047v1.FXTransferCreationDetailsDto;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: RestBffMoneyMovementService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\rJ\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00180\u000bH\u0096@¢\u0006\u0004\b\u001a\u0010\rJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bH\u0096@¢\u0006\u0004\b\u001e\u0010\rJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020 0\u000bH\u0096@¢\u0006\u0004\b\"\u0010\rJ\u0018\u0010&\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020$H\u0096@¢\u0006\u0004\b&\u0010'J$\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020$0\u000bH\u0096@¢\u0006\u0004\b&\u0010\rJ\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J$\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020(0\u000bH\u0096@¢\u0006\u0004\b*\u0010\rJ\u0018\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/J$\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020,0\u000bH\u0096@¢\u0006\u0004\b.\u0010\rJ\u0018\u00101\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u000200H\u0096@¢\u0006\u0004\b1\u00102J$\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002000\u000bH\u0096@¢\u0006\u0004\b1\u0010\rJ\u0018\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J$\u00105\u001a\b\u0012\u0004\u0012\u0002040\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002030\u000bH\u0096@¢\u0006\u0004\b5\u0010\rJ\u0018\u00109\u001a\u0002082\u0006\u0010\u0007\u001a\u000207H\u0096@¢\u0006\u0004\b9\u0010:J$\u00109\u001a\b\u0012\u0004\u0012\u0002080\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002070\u000bH\u0096@¢\u0006\u0004\b9\u0010\rJ\u0018\u0010=\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020;H\u0096@¢\u0006\u0004\b=\u0010>J$\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020;0\u000bH\u0096@¢\u0006\u0004\b=\u0010\rJ\u0018\u0010@\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020?H\u0096@¢\u0006\u0004\b@\u0010AJ$\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020?0\u000bH\u0096@¢\u0006\u0004\b@\u0010\rJ\u0018\u0010D\u001a\u00020C2\u0006\u0010\u0007\u001a\u00020BH\u0096@¢\u0006\u0004\bD\u0010EJ$\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020B0\u000bH\u0096@¢\u0006\u0004\bD\u0010\rJ\u0018\u0010H\u001a\u00020G2\u0006\u0010\u0007\u001a\u00020FH\u0096@¢\u0006\u0004\bH\u0010IJ$\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020F0\u000bH\u0096@¢\u0006\u0004\bH\u0010\rJ\u0018\u0010K\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020JH\u0096@¢\u0006\u0004\bK\u0010LJ$\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020J0\u000bH\u0096@¢\u0006\u0004\bK\u0010\rJ\u0018\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020MH\u0096@¢\u0006\u0004\bO\u0010PJ$\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020M0\u000bH\u0096@¢\u0006\u0004\bO\u0010\rJ\u0018\u0010R\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020QH\u0096@¢\u0006\u0004\bR\u0010SJ$\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020Q0\u000bH\u0096@¢\u0006\u0004\bR\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010T¨\u0006U"}, m3636d2 = {"Lbff_money_movement/service/v1/RestBffMoneyMovementService;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "Lbff_money_movement/service/v1/BffMoneyMovementServiceRetrofit;", "retrofit", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementServiceRetrofit;)V", "Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;", "request", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto;", "GetTransferEligibility", "(Lbff_money_movement/service/v1/GetTransferEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetSubscriptionPaymentMethodRequestDto;", "Lbff_money_movement/service/v1/GetSubscriptionPaymentMethodResponseDto;", "GetSubscriptionPaymentMethod", "Lbff_money_movement/service/v1/CreateOrUpdatePaymentPreferenceRequestDto;", "", "CreateOrUpdatePaymentPreference", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "GetNonOriginatedTransferInfo", "(Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetTransferValidationRequestDto;", "Lbff_money_movement/service/v1/GetTransferValidationResponseDto;", "GetTransferValidation", "(Lbff_money_movement/service/v1/GetTransferValidationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetPaymentIntentsRequestDto;", "Lbff_money_movement/service/v1/GetPaymentIntentsResponseDto;", "GetPaymentIntents", "(Lbff_money_movement/service/v1/GetPaymentIntentsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto;", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "GetServiceFee", "(Lbff_money_movement/service/v1/GetServiceFeeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/CreateBillRequestDto;", "Lbff_money_movement/service/v1/CreateBillResponseDto;", "CreateBill", "(Lbff_money_movement/service/v1/CreateBillRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsRequestDto;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "GetCryptoBillDetails", "(Lbff_money_movement/service/v1/GetCryptoBillDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsRequestDto;", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "FetchCryptoBillingAccounts", "(Lbff_money_movement/service/v1/FetchCryptoBillingAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/UpdateDepositScheduleRequestDto;", "UpdateDepositSchedule", "(Lbff_money_movement/service/v1/UpdateDepositScheduleRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto;", "Lbff_money_movement/service/v1/PrepareLinkResponseDto;", "PrepareLink", "(Lbff_money_movement/service/v1/PrepareLinkRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequestDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "InvestmentsTrackerGetPage", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetPageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/LinkAccountsRequestDto;", "Lbff_money_movement/service/v1/LinkAccountsResponseDto;", "LinkAccounts", "(Lbff_money_movement/service/v1/LinkAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/UnlinkInstitutionRequestDto;", "UnlinkInstitution", "(Lbff_money_movement/service/v1/UnlinkInstitutionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetAccioAccountRequestDto;", "Lbff_money_movement/service/v1/GetAccioAccountResponseDto;", "GetAccioAccount", "(Lbff_money_movement/service/v1/GetAccioAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAccountsRequestDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAccountsResponseDto;", "InvestmentsTrackerGetAccounts", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;", "LinkAccountsForUpdateMode", "(Lbff_money_movement/service/v1/LinkAccountsForUpdateModeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/GetAgreementRequestDto;", "Lbff_money_movement/service/v1/GetAgreementResponseDto;", "GetAgreement", "(Lbff_money_movement/service/v1/GetAgreementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/SignAgreementRequestDto;", "SignAgreement", "(Lbff_money_movement/service/v1/SignAgreementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_money_movement/service/v1/BffMoneyMovementServiceRetrofit;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBffMoneyMovementService implements BffMoneyMovementService {
    private final BffMoneyMovementServiceRetrofit retrofit;

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "CreateBill")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$CreateBill$1 */
    static final class C34431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34431(Continuation<? super C34431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.CreateBill((CreateBillRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "CreateBill")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$CreateBill$2 */
    static final class C34442 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34442(Continuation<? super C34442> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.CreateBill((Request<CreateBillRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {78}, m3647m = "CreateOrUpdatePaymentPreference")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$CreateOrUpdatePaymentPreference$2 */
    static final class C34452 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34452(Continuation<? super C34452> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.CreateOrUpdatePaymentPreference(null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "FetchCryptoBillingAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$FetchCryptoBillingAccounts$1 */
    static final class C34461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34461(Continuation<? super C34461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.FetchCryptoBillingAccounts((FetchCryptoBillingAccountsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {211}, m3647m = "FetchCryptoBillingAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$FetchCryptoBillingAccounts$2 */
    static final class C34472 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34472(Continuation<? super C34472> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.FetchCryptoBillingAccounts((Request<FetchCryptoBillingAccountsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "GetAccioAccount")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetAccioAccount$1 */
    static final class C34481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34481(Continuation<? super C34481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetAccioAccount((GetAccioAccountRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "GetAccioAccount")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetAccioAccount$2 */
    static final class C34492 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34492(Continuation<? super C34492> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetAccioAccount((Request<GetAccioAccountRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {355}, m3647m = "GetAgreement")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetAgreement$1 */
    static final class C34501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34501(Continuation<? super C34501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetAgreement((GetAgreementRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {361}, m3647m = "GetAgreement")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetAgreement$2 */
    static final class C34512 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34512(Continuation<? super C34512> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetAgreement((Request<GetAgreementRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "GetCryptoBillDetails")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetCryptoBillDetails$1 */
    static final class C34521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34521(Continuation<? super C34521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetCryptoBillDetails((GetCryptoBillDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "GetCryptoBillDetails")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetCryptoBillDetails$2 */
    static final class C34532 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34532(Continuation<? super C34532> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetCryptoBillDetails((Request<GetCryptoBillDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {88}, m3647m = "GetNonOriginatedTransferInfo")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetNonOriginatedTransferInfo$1 */
    static final class C34541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34541(Continuation<? super C34541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetNonOriginatedTransferInfo((GetNonOriginatedTransferInfoRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {94}, m3647m = "GetNonOriginatedTransferInfo")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetNonOriginatedTransferInfo$2 */
    static final class C34552 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34552(Continuation<? super C34552> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetNonOriginatedTransferInfo((Request<GetNonOriginatedTransferInfoRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "GetPaymentIntents")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetPaymentIntents$1 */
    static final class C34561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34561(Continuation<? super C34561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetPaymentIntents((GetPaymentIntentsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "GetPaymentIntents")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetPaymentIntents$2 */
    static final class C34572 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34572(Continuation<? super C34572> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetPaymentIntents((Request<GetPaymentIntentsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "GetServiceFee")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetServiceFee$1 */
    static final class C34581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34581(Continuation<? super C34581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetServiceFee((GetServiceFeeRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {155}, m3647m = "GetServiceFee")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetServiceFee$2 */
    static final class C34592 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34592(Continuation<? super C34592> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetServiceFee((Request<GetServiceFeeRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {62}, m3647m = "GetSubscriptionPaymentMethod")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetSubscriptionPaymentMethod$2 */
    static final class C34602 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34602(Continuation<? super C34602> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetSubscriptionPaymentMethod(null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {29}, m3647m = "GetTransferEligibility")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetTransferEligibility$1 */
    static final class C34611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34611(Continuation<? super C34611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetTransferEligibility((GetTransferEligibilityRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {35}, m3647m = "GetTransferEligibility")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetTransferEligibility$2 */
    static final class C34622 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34622(Continuation<? super C34622> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetTransferEligibility((Request<GetTransferEligibilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {107}, m3647m = "GetTransferValidation")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetTransferValidation$1 */
    static final class C34631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34631(Continuation<? super C34631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetTransferValidation((GetTransferValidationRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {113}, m3647m = "GetTransferValidation")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$GetTransferValidation$2 */
    static final class C34642 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34642(Continuation<? super C34642> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.GetTransferValidation((Request<GetTransferValidationRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "InvestmentsTrackerGetAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$InvestmentsTrackerGetAccounts$1 */
    static final class C34651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34651(Continuation<? super C34651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.InvestmentsTrackerGetAccounts((InvestmentsTrackerGetAccountsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {330}, m3647m = "InvestmentsTrackerGetAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$InvestmentsTrackerGetAccounts$2 */
    static final class C34662 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34662(Continuation<? super C34662> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.InvestmentsTrackerGetAccounts((Request<InvestmentsTrackerGetAccountsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "InvestmentsTrackerGetPage")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$InvestmentsTrackerGetPage$1 */
    static final class C34671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34671(Continuation<? super C34671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.InvestmentsTrackerGetPage((InvestmentsTrackerGetPageRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m3647m = "InvestmentsTrackerGetPage")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$InvestmentsTrackerGetPage$2 */
    static final class C34682 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34682(Continuation<? super C34682> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.InvestmentsTrackerGetPage((Request<InvestmentsTrackerGetPageRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m3647m = "LinkAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$LinkAccounts$1 */
    static final class C34691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34691(Continuation<? super C34691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.LinkAccounts((LinkAccountsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "LinkAccounts")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$LinkAccounts$2 */
    static final class C34702 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34702(Continuation<? super C34702> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.LinkAccounts((Request<LinkAccountsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {339}, m3647m = "LinkAccountsForUpdateMode")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$LinkAccountsForUpdateMode$1 */
    static final class C34711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34711(Continuation<? super C34711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.LinkAccountsForUpdateMode((LinkAccountsForUpdateModeRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {345}, m3647m = "LinkAccountsForUpdateMode")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$LinkAccountsForUpdateMode$2 */
    static final class C34722 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34722(Continuation<? super C34722> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.LinkAccountsForUpdateMode((Request<LinkAccountsForUpdateModeRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "PrepareLink")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$PrepareLink$1 */
    static final class C34731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34731(Continuation<? super C34731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.PrepareLink((PrepareLinkRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "PrepareLink")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$PrepareLink$2 */
    static final class C34742 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34742(Continuation<? super C34742> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.PrepareLink((Request<PrepareLinkRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {371}, m3647m = "SignAgreement")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$SignAgreement$1 */
    static final class C34751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34751(Continuation<? super C34751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.SignAgreement((SignAgreementRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {377}, m3647m = "SignAgreement")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$SignAgreement$2 */
    static final class C34762 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34762(Continuation<? super C34762> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.SignAgreement((Request<SignAgreementRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m3647m = "UnlinkInstitution")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$UnlinkInstitution$1 */
    static final class C34771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34771(Continuation<? super C34771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.UnlinkInstitution((UnlinkInstitutionRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "UnlinkInstitution")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$UnlinkInstitution$2 */
    static final class C34782 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34782(Continuation<? super C34782> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.UnlinkInstitution((Request<UnlinkInstitutionRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "UpdateDepositSchedule")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$UpdateDepositSchedule$1 */
    static final class C34791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34791(Continuation<? super C34791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.UpdateDepositSchedule((UpdateDepositScheduleRequestDto) null, this);
        }
    }

    /* compiled from: RestBffMoneyMovementService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_money_movement.service.v1.RestBffMoneyMovementService", m3645f = "RestBffMoneyMovementService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "UpdateDepositSchedule")
    /* renamed from: bff_money_movement.service.v1.RestBffMoneyMovementService$UpdateDepositSchedule$2 */
    static final class C34802 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C34802(Continuation<? super C34802> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffMoneyMovementService.this.UpdateDepositSchedule((Request<UpdateDepositScheduleRequestDto>) null, this);
        }
    }

    public RestBffMoneyMovementService(BffMoneyMovementServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferEligibility(GetTransferEligibilityRequestDto getTransferEligibilityRequestDto, Continuation<? super GetTransferEligibilityResponseDto> continuation) {
        C34611 c34611;
        if (continuation instanceof C34611) {
            c34611 = (C34611) continuation;
            int i = c34611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34611.label = i - Integer.MIN_VALUE;
            } else {
                c34611 = new C34611(continuation);
            }
        }
        Object objGetTransferEligibility = c34611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferEligibility);
            Request<GetTransferEligibilityRequestDto> request = new Request<>(getTransferEligibilityRequestDto, null, 2, null);
            c34611.label = 1;
            objGetTransferEligibility = GetTransferEligibility(request, c34611);
            if (objGetTransferEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferEligibility);
        }
        return ((Response) objGetTransferEligibility).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferEligibility(Request<GetTransferEligibilityRequestDto> request, Continuation<? super Response<GetTransferEligibilityResponseDto>> continuation) {
        C34622 c34622;
        MoneyDto amount;
        MoneyDto amount2;
        CreateTransferAccountDto sink;
        CreateTransferAccountDto sink2;
        CreateTransferAccountDto sink3;
        CreateTransferAccountDto source;
        CreateTransferAccountDto source2;
        CreateTransferAccountDto source3;
        if (continuation instanceof C34622) {
            c34622 = (C34622) continuation;
            int i = c34622.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34622.label = i - Integer.MIN_VALUE;
            } else {
                c34622 = new C34622(continuation);
            }
        }
        C34622 c346222 = c34622;
        Object objGetTransferEligibility = c346222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferEligibility);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            TransferTypeDto transfer_type = request.getData().getTransfer_type() != TransferTypeDto.INSTANCE.getZeroValue() ? request.getData().getTransfer_type() : null;
            CreateTransferAccountDto source4 = request.getData().getSource();
            String id = (Intrinsics.areEqual(source4 != null ? source4.getId() : null, "") || (source3 = request.getData().getSource()) == null) ? null : source3.getId();
            CreateTransferAccountDto source5 = request.getData().getSource();
            TransferAccountTypeDto type2 = source5 != null ? source5.getType() : null;
            TransferAccountTypeDto.Companion companion = TransferAccountTypeDto.INSTANCE;
            TransferAccountTypeDto type3 = (type2 == companion.getZeroValue() || (source2 = request.getData().getSource()) == null) ? null : source2.getType();
            CreateTransferAccountDto source6 = request.getData().getSource();
            String access_token = (Intrinsics.areEqual(source6 != null ? source6.getAccess_token() : null, "") || (source = request.getData().getSource()) == null) ? null : source.getAccess_token();
            CreateTransferAccountDto sink4 = request.getData().getSink();
            String id2 = (Intrinsics.areEqual(sink4 != null ? sink4.getId() : null, "") || (sink3 = request.getData().getSink()) == null) ? null : sink3.getId();
            CreateTransferAccountDto sink5 = request.getData().getSink();
            TransferAccountTypeDto type4 = ((sink5 != null ? sink5.getType() : null) == companion.getZeroValue() || (sink2 = request.getData().getSink()) == null) ? null : sink2.getType();
            CreateTransferAccountDto sink6 = request.getData().getSink();
            String access_token2 = (Intrinsics.areEqual(sink6 != null ? sink6.getAccess_token() : null, "") || (sink = request.getData().getSink()) == null) ? null : sink.getAccess_token();
            MoneyDto amount3 = request.getData().getAmount();
            IdlDecimal amount4 = (Intrinsics.areEqual(amount3 != null ? amount3.getAmount() : null, new IdlDecimal("")) || (amount2 = request.getData().getAmount()) == null) ? null : amount2.getAmount();
            MoneyDto amount5 = request.getData().getAmount();
            CurrencyDto currency = ((amount5 != null ? amount5.getCurrency() : null) == CurrencyDto.INSTANCE.getZeroValue() || (amount = request.getData().getAmount()) == null) ? null : amount.getCurrency();
            TransferFrequencyDto frequency = request.getData().getFrequency() != TransferFrequencyDto.INSTANCE.getZeroValue() ? request.getData().getFrequency() : null;
            c346222.label = 1;
            objGetTransferEligibility = bffMoneyMovementServiceRetrofit.GetTransferEligibility(metadata, transfer_type, id, type3, access_token, id2, type4, access_token2, amount4, currency, frequency, c346222);
            if (objGetTransferEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferEligibility);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTransferEligibility);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetSubscriptionPaymentMethod(Request<GetSubscriptionPaymentMethodRequestDto> request, Continuation<? super Response<GetSubscriptionPaymentMethodResponseDto>> continuation) {
        C34602 c34602;
        if (continuation instanceof C34602) {
            c34602 = (C34602) continuation;
            int i = c34602.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34602.label = i - Integer.MIN_VALUE;
            } else {
                c34602 = new C34602(continuation);
            }
        }
        Object objGetSubscriptionPaymentMethod = c34602.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34602.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SubscriptionTypeDto payment_preference_type = request.getData().getPayment_preference_type() != SubscriptionTypeDto.INSTANCE.getZeroValue() ? request.getData().getPayment_preference_type() : null;
            c34602.label = 1;
            objGetSubscriptionPaymentMethod = bffMoneyMovementServiceRetrofit.GetSubscriptionPaymentMethod(metadata, payment_preference_type, c34602);
            if (objGetSubscriptionPaymentMethod == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetSubscriptionPaymentMethod);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetSubscriptionPaymentMethod);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateOrUpdatePaymentPreference(Request<CreateOrUpdatePaymentPreferenceRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C34452 c34452;
        if (continuation instanceof C34452) {
            c34452 = (C34452) continuation;
            int i = c34452.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34452.label = i - Integer.MIN_VALUE;
            } else {
                c34452 = new C34452(continuation);
            }
        }
        Object objCreateOrUpdatePaymentPreference = c34452.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34452.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateOrUpdatePaymentPreference);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateOrUpdatePaymentPreferenceRequestDto data = request.getData();
            c34452.label = 1;
            objCreateOrUpdatePaymentPreference = bffMoneyMovementServiceRetrofit.CreateOrUpdatePaymentPreference(metadata, data, c34452);
            if (objCreateOrUpdatePaymentPreference == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateOrUpdatePaymentPreference);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateOrUpdatePaymentPreference);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNonOriginatedTransferInfo(GetNonOriginatedTransferInfoRequestDto getNonOriginatedTransferInfoRequestDto, Continuation<? super GetNonOriginatedTransferInfoResponseDto> continuation) {
        C34541 c34541;
        if (continuation instanceof C34541) {
            c34541 = (C34541) continuation;
            int i = c34541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34541.label = i - Integer.MIN_VALUE;
            } else {
                c34541 = new C34541(continuation);
            }
        }
        Object objGetNonOriginatedTransferInfo = c34541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNonOriginatedTransferInfo);
            Request<GetNonOriginatedTransferInfoRequestDto> request = new Request<>(getNonOriginatedTransferInfoRequestDto, null, 2, null);
            c34541.label = 1;
            objGetNonOriginatedTransferInfo = GetNonOriginatedTransferInfo(request, c34541);
            if (objGetNonOriginatedTransferInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNonOriginatedTransferInfo);
        }
        return ((Response) objGetNonOriginatedTransferInfo).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetNonOriginatedTransferInfo(Request<GetNonOriginatedTransferInfoRequestDto> request, Continuation<? super Response<GetNonOriginatedTransferInfoResponseDto>> continuation) {
        C34552 c34552;
        RobinhoodAccountDto robinhood_account;
        RobinhoodAccountDto robinhood_account2;
        if (continuation instanceof C34552) {
            c34552 = (C34552) continuation;
            int i = c34552.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34552.label = i - Integer.MIN_VALUE;
            } else {
                c34552 = new C34552(continuation);
            }
        }
        C34552 c345522 = c34552;
        Object objGetNonOriginatedTransferInfo = c345522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetNonOriginatedTransferInfo);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            TransferAccountTypeDto account_type = null;
            NonOriginatedTransferTypeDto transfer_type = request.getData().getTransfer_type() != NonOriginatedTransferTypeDto.INSTANCE.getZeroValue() ? request.getData().getTransfer_type() : null;
            CurrencyDto currency = request.getData().getCurrency() != CurrencyDto.INSTANCE.getZeroValue() ? request.getData().getCurrency() : null;
            RobinhoodAccountDto robinhood_account3 = request.getData().getRobinhood_account();
            String account_id = (Intrinsics.areEqual(robinhood_account3 != null ? robinhood_account3.getAccount_id() : null, "") || (robinhood_account2 = request.getData().getRobinhood_account()) == null) ? null : robinhood_account2.getAccount_id();
            RobinhoodAccountDto robinhood_account4 = request.getData().getRobinhood_account();
            if ((robinhood_account4 != null ? robinhood_account4.getAccount_type() : null) != TransferAccountTypeDto.INSTANCE.getZeroValue() && (robinhood_account = request.getData().getRobinhood_account()) != null) {
                account_type = robinhood_account.getAccount_type();
            }
            c345522.label = 1;
            objGetNonOriginatedTransferInfo = bffMoneyMovementServiceRetrofit.GetNonOriginatedTransferInfo(metadata, transfer_type, currency, account_id, account_type, c345522);
            if (objGetNonOriginatedTransferInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetNonOriginatedTransferInfo);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetNonOriginatedTransferInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferValidation(GetTransferValidationRequestDto getTransferValidationRequestDto, Continuation<? super GetTransferValidationResponseDto> continuation) {
        C34631 c34631;
        if (continuation instanceof C34631) {
            c34631 = (C34631) continuation;
            int i = c34631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34631.label = i - Integer.MIN_VALUE;
            } else {
                c34631 = new C34631(continuation);
            }
        }
        Object objGetTransferValidation = c34631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferValidation);
            Request<GetTransferValidationRequestDto> request = new Request<>(getTransferValidationRequestDto, null, 2, null);
            c34631.label = 1;
            objGetTransferValidation = GetTransferValidation(request, c34631);
            if (objGetTransferValidation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferValidation);
        }
        return ((Response) objGetTransferValidation).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTransferValidation(Request<GetTransferValidationRequestDto> request, Continuation<? super Response<GetTransferValidationResponseDto>> continuation) {
        C34642 c34642;
        CreateTransferAccountDto sink;
        CreateTransferAccountDto sink2;
        CreateTransferAccountDto sink3;
        CreateTransferAccountDto source;
        CreateTransferAccountDto source2;
        CreateTransferAccountDto source3;
        MoneyDto amount;
        MoneyDto amount2;
        if (continuation instanceof C34642) {
            c34642 = (C34642) continuation;
            int i = c34642.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34642.label = i - Integer.MIN_VALUE;
            } else {
                c34642 = new C34642(continuation);
            }
        }
        C34642 c346422 = c34642;
        Object objGetTransferValidation = c346422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTransferValidation);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            TransferStateDto state = request.getData().getState() != TransferStateDto.INSTANCE.getZeroValue() ? request.getData().getState() : null;
            TransferDirectionDto direction = request.getData().getDirection() != TransferDirectionDto.INSTANCE.getZeroValue() ? request.getData().getDirection() : null;
            MoneyDto amount3 = request.getData().getAmount();
            IdlDecimal amount4 = (Intrinsics.areEqual(amount3 != null ? amount3.getAmount() : null, new IdlDecimal("")) || (amount2 = request.getData().getAmount()) == null) ? null : amount2.getAmount();
            MoneyDto amount5 = request.getData().getAmount();
            CurrencyDto currency = ((amount5 != null ? amount5.getCurrency() : null) == CurrencyDto.INSTANCE.getZeroValue() || (amount = request.getData().getAmount()) == null) ? null : amount.getCurrency();
            CreateTransferAccountDto source4 = request.getData().getSource();
            String id = (Intrinsics.areEqual(source4 != null ? source4.getId() : null, "") || (source3 = request.getData().getSource()) == null) ? null : source3.getId();
            CreateTransferAccountDto source5 = request.getData().getSource();
            TransferAccountTypeDto type2 = source5 != null ? source5.getType() : null;
            TransferAccountTypeDto.Companion companion = TransferAccountTypeDto.INSTANCE;
            TransferAccountTypeDto type3 = (type2 == companion.getZeroValue() || (source2 = request.getData().getSource()) == null) ? null : source2.getType();
            CreateTransferAccountDto source6 = request.getData().getSource();
            String access_token = (Intrinsics.areEqual(source6 != null ? source6.getAccess_token() : null, "") || (source = request.getData().getSource()) == null) ? null : source.getAccess_token();
            CreateTransferAccountDto sink4 = request.getData().getSink();
            String id2 = (Intrinsics.areEqual(sink4 != null ? sink4.getId() : null, "") || (sink3 = request.getData().getSink()) == null) ? null : sink3.getId();
            CreateTransferAccountDto sink5 = request.getData().getSink();
            TransferAccountTypeDto type4 = ((sink5 != null ? sink5.getType() : null) == companion.getZeroValue() || (sink2 = request.getData().getSink()) == null) ? null : sink2.getType();
            CreateTransferAccountDto sink6 = request.getData().getSink();
            String access_token2 = (Intrinsics.areEqual(sink6 != null ? sink6.getAccess_token() : null, "") || (sink = request.getData().getSink()) == null) ? null : sink.getAccess_token();
            c346422.label = 1;
            objGetTransferValidation = bffMoneyMovementServiceRetrofit.GetTransferValidation(metadata, state, direction, amount4, currency, id, type3, access_token, id2, type4, access_token2, c346422);
            if (objGetTransferValidation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTransferValidation);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTransferValidation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPaymentIntents(GetPaymentIntentsRequestDto getPaymentIntentsRequestDto, Continuation<? super GetPaymentIntentsResponseDto> continuation) {
        C34561 c34561;
        if (continuation instanceof C34561) {
            c34561 = (C34561) continuation;
            int i = c34561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34561.label = i - Integer.MIN_VALUE;
            } else {
                c34561 = new C34561(continuation);
            }
        }
        Object objGetPaymentIntents = c34561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPaymentIntents);
            Request<GetPaymentIntentsRequestDto> request = new Request<>(getPaymentIntentsRequestDto, null, 2, null);
            c34561.label = 1;
            objGetPaymentIntents = GetPaymentIntents(request, c34561);
            if (objGetPaymentIntents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPaymentIntents);
        }
        return ((Response) objGetPaymentIntents).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPaymentIntents(Request<GetPaymentIntentsRequestDto> request, Continuation<? super Response<GetPaymentIntentsResponseDto>> continuation) {
        C34572 c34572;
        if (continuation instanceof C34572) {
            c34572 = (C34572) continuation;
            int i = c34572.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34572.label = i - Integer.MIN_VALUE;
            } else {
                c34572 = new C34572(continuation);
            }
        }
        Object objGetPaymentIntents = c34572.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34572.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPaymentIntents);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Integer numBoxInt = request.getData().getPage_size() != 0 ? boxing.boxInt(request.getData().getPage_size()) : null;
            c34572.label = 1;
            objGetPaymentIntents = bffMoneyMovementServiceRetrofit.GetPaymentIntents(metadata, cursor, numBoxInt, c34572);
            if (objGetPaymentIntents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPaymentIntents);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPaymentIntents);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetServiceFee(GetServiceFeeRequestDto getServiceFeeRequestDto, Continuation<? super GetServiceFeeResponseDto> continuation) {
        C34581 c34581;
        if (continuation instanceof C34581) {
            c34581 = (C34581) continuation;
            int i = c34581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34581.label = i - Integer.MIN_VALUE;
            } else {
                c34581 = new C34581(continuation);
            }
        }
        Object objGetServiceFee = c34581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetServiceFee);
            Request<GetServiceFeeRequestDto> request = new Request<>(getServiceFeeRequestDto, null, 2, null);
            c34581.label = 1;
            objGetServiceFee = GetServiceFee(request, c34581);
            if (objGetServiceFee == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetServiceFee);
        }
        return ((Response) objGetServiceFee).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetServiceFee(Request<GetServiceFeeRequestDto> request, Continuation<? super Response<GetServiceFeeResponseDto>> continuation) {
        C34592 c34592;
        FXTransferCreationDetailsDto fx_transfer_creation_details;
        FXTransferCreationDetailsDto fx_transfer_creation_details2;
        FXTransferCreationDetailsDto fx_transfer_creation_details3;
        FXTransferCreationDetailsDto fx_transfer_creation_details4;
        FXTransferCreationDetailsDto fx_transfer_creation_details5;
        if (continuation instanceof C34592) {
            c34592 = (C34592) continuation;
            int i = c34592.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34592.label = i - Integer.MIN_VALUE;
            } else {
                c34592 = new C34592(continuation);
            }
        }
        C34592 c345922 = c34592;
        Object objGetServiceFee = c345922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c345922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetServiceFee);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String amount = request.getData().getAmount();
            CurrencyDto currency = request.getData().getCurrency();
            CurrencyDto.Companion companion = CurrencyDto.INSTANCE;
            CurrencyDto currency2 = currency != companion.getZeroValue() ? request.getData().getCurrency() : null;
            DirectionDto direction = request.getData().getDirection() != DirectionDto.INSTANCE.getZeroValue() ? request.getData().getDirection() : null;
            PurposeDto purpose = request.getData().getPurpose() != PurposeDto.INSTANCE.getZeroValue() ? request.getData().getPurpose() : null;
            FXTransferCreationDetailsDto fx_transfer_creation_details6 = request.getData().getFx_transfer_creation_details();
            IdlDecimal target_amount = (Intrinsics.areEqual(fx_transfer_creation_details6 != null ? fx_transfer_creation_details6.getTarget_amount() : null, new IdlDecimal("")) || (fx_transfer_creation_details5 = request.getData().getFx_transfer_creation_details()) == null) ? null : fx_transfer_creation_details5.getTarget_amount();
            FXTransferCreationDetailsDto fx_transfer_creation_details7 = request.getData().getFx_transfer_creation_details();
            CurrencyDto target_currency = ((fx_transfer_creation_details7 != null ? fx_transfer_creation_details7.getTarget_currency() : null) == companion.getZeroValue() || (fx_transfer_creation_details4 = request.getData().getFx_transfer_creation_details()) == null) ? null : fx_transfer_creation_details4.getTarget_currency();
            FXTransferCreationDetailsDto fx_transfer_creation_details8 = request.getData().getFx_transfer_creation_details();
            String target_fx_rate = (Intrinsics.areEqual(fx_transfer_creation_details8 != null ? fx_transfer_creation_details8.getTarget_fx_rate() : null, "") || (fx_transfer_creation_details3 = request.getData().getFx_transfer_creation_details()) == null) ? null : fx_transfer_creation_details3.getTarget_fx_rate();
            FXTransferCreationDetailsDto fx_transfer_creation_details9 = request.getData().getFx_transfer_creation_details();
            String target_fx_rate_id = (Intrinsics.areEqual(fx_transfer_creation_details9 != null ? fx_transfer_creation_details9.getTarget_fx_rate_id() : null, "") || (fx_transfer_creation_details2 = request.getData().getFx_transfer_creation_details()) == null) ? null : fx_transfer_creation_details2.getTarget_fx_rate_id();
            FXTransferCreationDetailsDto fx_transfer_creation_details10 = request.getData().getFx_transfer_creation_details();
            FXAcctSchemaDto fx_acct_schema = ((fx_transfer_creation_details10 != null ? fx_transfer_creation_details10.getFx_acct_schema() : null) == FXAcctSchemaDto.INSTANCE.getZeroValue() || (fx_transfer_creation_details = request.getData().getFx_transfer_creation_details()) == null) ? null : fx_transfer_creation_details.getFx_acct_schema();
            c345922.label = 1;
            objGetServiceFee = bffMoneyMovementServiceRetrofit.GetServiceFee(metadata, amount, currency2, direction, purpose, target_amount, target_currency, target_fx_rate, target_fx_rate_id, fx_acct_schema, c345922);
            if (objGetServiceFee == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetServiceFee);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetServiceFee);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateBill(CreateBillRequestDto createBillRequestDto, Continuation<? super CreateBillResponseDto> continuation) {
        C34431 c34431;
        if (continuation instanceof C34431) {
            c34431 = (C34431) continuation;
            int i = c34431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34431.label = i - Integer.MIN_VALUE;
            } else {
                c34431 = new C34431(continuation);
            }
        }
        Object objCreateBill = c34431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateBill);
            Request<CreateBillRequestDto> request = new Request<>(createBillRequestDto, null, 2, null);
            c34431.label = 1;
            objCreateBill = CreateBill(request, c34431);
            if (objCreateBill == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateBill);
        }
        return ((Response) objCreateBill).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateBill(Request<CreateBillRequestDto> request, Continuation<? super Response<CreateBillResponseDto>> continuation) {
        C34442 c34442;
        if (continuation instanceof C34442) {
            c34442 = (C34442) continuation;
            int i = c34442.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34442.label = i - Integer.MIN_VALUE;
            } else {
                c34442 = new C34442(continuation);
            }
        }
        Object objCreateBill = c34442.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34442.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateBill);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateBillRequestDto data = request.getData();
            c34442.label = 1;
            objCreateBill = bffMoneyMovementServiceRetrofit.CreateBill(metadata, data, c34442);
            if (objCreateBill == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateBill);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateBill);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoBillDetails(GetCryptoBillDetailsRequestDto getCryptoBillDetailsRequestDto, Continuation<? super GetCryptoBillDetailsResponseDto> continuation) {
        C34521 c34521;
        if (continuation instanceof C34521) {
            c34521 = (C34521) continuation;
            int i = c34521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34521.label = i - Integer.MIN_VALUE;
            } else {
                c34521 = new C34521(continuation);
            }
        }
        Object objGetCryptoBillDetails = c34521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoBillDetails);
            Request<GetCryptoBillDetailsRequestDto> request = new Request<>(getCryptoBillDetailsRequestDto, null, 2, null);
            c34521.label = 1;
            objGetCryptoBillDetails = GetCryptoBillDetails(request, c34521);
            if (objGetCryptoBillDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoBillDetails);
        }
        return ((Response) objGetCryptoBillDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoBillDetails(Request<GetCryptoBillDetailsRequestDto> request, Continuation<? super Response<GetCryptoBillDetailsResponseDto>> continuation) {
        C34532 c34532;
        if (continuation instanceof C34532) {
            c34532 = (C34532) continuation;
            int i = c34532.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34532.label = i - Integer.MIN_VALUE;
            } else {
                c34532 = new C34532(continuation);
            }
        }
        Object objGetCryptoBillDetails = c34532.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34532.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoBillDetails);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String bill_id = !Intrinsics.areEqual(request.getData().getBill_id(), "") ? request.getData().getBill_id() : null;
            c34532.label = 1;
            objGetCryptoBillDetails = bffMoneyMovementServiceRetrofit.GetCryptoBillDetails(metadata, bill_id, c34532);
            if (objGetCryptoBillDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoBillDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoBillDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchCryptoBillingAccounts(FetchCryptoBillingAccountsRequestDto fetchCryptoBillingAccountsRequestDto, Continuation<? super FetchCryptoBillingAccountsResponseDto> continuation) {
        C34461 c34461;
        if (continuation instanceof C34461) {
            c34461 = (C34461) continuation;
            int i = c34461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34461.label = i - Integer.MIN_VALUE;
            } else {
                c34461 = new C34461(continuation);
            }
        }
        Object objFetchCryptoBillingAccounts = c34461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchCryptoBillingAccounts);
            Request<FetchCryptoBillingAccountsRequestDto> request = new Request<>(fetchCryptoBillingAccountsRequestDto, null, 2, null);
            c34461.label = 1;
            objFetchCryptoBillingAccounts = FetchCryptoBillingAccounts(request, c34461);
            if (objFetchCryptoBillingAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchCryptoBillingAccounts);
        }
        return ((Response) objFetchCryptoBillingAccounts).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FetchCryptoBillingAccounts(Request<FetchCryptoBillingAccountsRequestDto> request, Continuation<? super Response<FetchCryptoBillingAccountsResponseDto>> continuation) {
        C34472 c34472;
        if (continuation instanceof C34472) {
            c34472 = (C34472) continuation;
            int i = c34472.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34472.label = i - Integer.MIN_VALUE;
            } else {
                c34472 = new C34472(continuation);
            }
        }
        Object objFetchCryptoBillingAccounts = c34472.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34472.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchCryptoBillingAccounts);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            String currency_code = Intrinsics.areEqual(request.getData().getCurrency_code(), "") ? null : request.getData().getCurrency_code();
            c34472.label = 1;
            objFetchCryptoBillingAccounts = bffMoneyMovementServiceRetrofit.FetchCryptoBillingAccounts(metadata, account_number, currency_code, c34472);
            if (objFetchCryptoBillingAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchCryptoBillingAccounts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFetchCryptoBillingAccounts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateDepositSchedule(UpdateDepositScheduleRequestDto updateDepositScheduleRequestDto, Continuation<Object> continuation) {
        C34791 c34791;
        if (continuation instanceof C34791) {
            c34791 = (C34791) continuation;
            int i = c34791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34791.label = i - Integer.MIN_VALUE;
            } else {
                c34791 = new C34791(continuation);
            }
        }
        Object objUpdateDepositSchedule = c34791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateDepositSchedule);
            Request<UpdateDepositScheduleRequestDto> request = new Request<>(updateDepositScheduleRequestDto, null, 2, null);
            c34791.label = 1;
            objUpdateDepositSchedule = UpdateDepositSchedule(request, c34791);
            if (objUpdateDepositSchedule == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateDepositSchedule);
        }
        return ((Response) objUpdateDepositSchedule).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateDepositSchedule(Request<UpdateDepositScheduleRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C34802 c34802;
        if (continuation instanceof C34802) {
            c34802 = (C34802) continuation;
            int i = c34802.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34802.label = i - Integer.MIN_VALUE;
            } else {
                c34802 = new C34802(continuation);
            }
        }
        Object objUpdateDepositSchedule = c34802.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34802.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateDepositSchedule);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UpdateDepositScheduleRequestDto data = request.getData();
            c34802.label = 1;
            objUpdateDepositSchedule = bffMoneyMovementServiceRetrofit.UpdateDepositSchedule(metadata, data, c34802);
            if (objUpdateDepositSchedule == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateDepositSchedule);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateDepositSchedule);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PrepareLink(PrepareLinkRequestDto prepareLinkRequestDto, Continuation<? super PrepareLinkResponseDto> continuation) {
        C34731 c34731;
        if (continuation instanceof C34731) {
            c34731 = (C34731) continuation;
            int i = c34731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34731.label = i - Integer.MIN_VALUE;
            } else {
                c34731 = new C34731(continuation);
            }
        }
        Object objPrepareLink = c34731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPrepareLink);
            Request<PrepareLinkRequestDto> request = new Request<>(prepareLinkRequestDto, null, 2, null);
            c34731.label = 1;
            objPrepareLink = PrepareLink(request, c34731);
            if (objPrepareLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPrepareLink);
        }
        return ((Response) objPrepareLink).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PrepareLink(Request<PrepareLinkRequestDto> request, Continuation<? super Response<PrepareLinkResponseDto>> continuation) {
        C34742 c34742;
        if (continuation instanceof C34742) {
            c34742 = (C34742) continuation;
            int i = c34742.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34742.label = i - Integer.MIN_VALUE;
            } else {
                c34742 = new C34742(continuation);
            }
        }
        Object objPrepareLink = c34742.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34742.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPrepareLink);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            PrepareLinkRequestDto data = request.getData();
            c34742.label = 1;
            objPrepareLink = bffMoneyMovementServiceRetrofit.PrepareLink(metadata, data, c34742);
            if (objPrepareLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPrepareLink);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objPrepareLink);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InvestmentsTrackerGetPage(InvestmentsTrackerGetPageRequestDto investmentsTrackerGetPageRequestDto, Continuation<? super InvestmentsTrackerGetPageResponseDto> continuation) {
        C34671 c34671;
        if (continuation instanceof C34671) {
            c34671 = (C34671) continuation;
            int i = c34671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34671.label = i - Integer.MIN_VALUE;
            } else {
                c34671 = new C34671(continuation);
            }
        }
        Object objInvestmentsTrackerGetPage = c34671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
            Request<InvestmentsTrackerGetPageRequestDto> request = new Request<>(investmentsTrackerGetPageRequestDto, null, 2, null);
            c34671.label = 1;
            objInvestmentsTrackerGetPage = InvestmentsTrackerGetPage(request, c34671);
            if (objInvestmentsTrackerGetPage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
        }
        return ((Response) objInvestmentsTrackerGetPage).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InvestmentsTrackerGetPage(Request<InvestmentsTrackerGetPageRequestDto> request, Continuation<? super Response<InvestmentsTrackerGetPageResponseDto>> continuation) {
        C34682 c34682;
        if (continuation instanceof C34682) {
            c34682 = (C34682) continuation;
            int i = c34682.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34682.label = i - Integer.MIN_VALUE;
            } else {
                c34682 = new C34682(continuation);
            }
        }
        C34682 c346822 = c34682;
        Object objInvestmentsTrackerGetPage = c346822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            InvestmentsTrackerPageTypeDto page_type = request.getData().getPage_type() != InvestmentsTrackerPageTypeDto.INSTANCE.getZeroValue() ? request.getData().getPage_type() : null;
            SpanDto span = request.getData().getSpan() != SpanDto.INSTANCE.getZeroValue() ? request.getData().getSpan() : null;
            String timezone = Intrinsics.areEqual(request.getData().getTimezone(), "") ? null : request.getData().getTimezone();
            String account_id = request.getData().getAccount_id();
            c346822.label = 1;
            objInvestmentsTrackerGetPage = bffMoneyMovementServiceRetrofit.InvestmentsTrackerGetPage(metadata, page_type, span, timezone, account_id, c346822);
            if (objInvestmentsTrackerGetPage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvestmentsTrackerGetPage);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objInvestmentsTrackerGetPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LinkAccounts(LinkAccountsRequestDto linkAccountsRequestDto, Continuation<? super LinkAccountsResponseDto> continuation) {
        C34691 c34691;
        if (continuation instanceof C34691) {
            c34691 = (C34691) continuation;
            int i = c34691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34691.label = i - Integer.MIN_VALUE;
            } else {
                c34691 = new C34691(continuation);
            }
        }
        Object objLinkAccounts = c34691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkAccounts);
            Request<LinkAccountsRequestDto> request = new Request<>(linkAccountsRequestDto, null, 2, null);
            c34691.label = 1;
            objLinkAccounts = LinkAccounts(request, c34691);
            if (objLinkAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLinkAccounts);
        }
        return ((Response) objLinkAccounts).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LinkAccounts(Request<LinkAccountsRequestDto> request, Continuation<? super Response<LinkAccountsResponseDto>> continuation) {
        C34702 c34702;
        if (continuation instanceof C34702) {
            c34702 = (C34702) continuation;
            int i = c34702.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34702.label = i - Integer.MIN_VALUE;
            } else {
                c34702 = new C34702(continuation);
            }
        }
        Object objLinkAccounts = c34702.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34702.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkAccounts);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            LinkAccountsRequestDto data = request.getData();
            c34702.label = 1;
            objLinkAccounts = bffMoneyMovementServiceRetrofit.LinkAccounts(metadata, data, c34702);
            if (objLinkAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLinkAccounts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objLinkAccounts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UnlinkInstitution(UnlinkInstitutionRequestDto unlinkInstitutionRequestDto, Continuation<Object> continuation) {
        C34771 c34771;
        if (continuation instanceof C34771) {
            c34771 = (C34771) continuation;
            int i = c34771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34771.label = i - Integer.MIN_VALUE;
            } else {
                c34771 = new C34771(continuation);
            }
        }
        Object objUnlinkInstitution = c34771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUnlinkInstitution);
            Request<UnlinkInstitutionRequestDto> request = new Request<>(unlinkInstitutionRequestDto, null, 2, null);
            c34771.label = 1;
            objUnlinkInstitution = UnlinkInstitution(request, c34771);
            if (objUnlinkInstitution == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnlinkInstitution);
        }
        return ((Response) objUnlinkInstitution).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UnlinkInstitution(Request<UnlinkInstitutionRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C34782 c34782;
        if (continuation instanceof C34782) {
            c34782 = (C34782) continuation;
            int i = c34782.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34782.label = i - Integer.MIN_VALUE;
            } else {
                c34782 = new C34782(continuation);
            }
        }
        Object objUnlinkInstitution = c34782.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34782.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUnlinkInstitution);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UnlinkInstitutionRequestDto data = request.getData();
            c34782.label = 1;
            objUnlinkInstitution = bffMoneyMovementServiceRetrofit.UnlinkInstitution(metadata, data, c34782);
            if (objUnlinkInstitution == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnlinkInstitution);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUnlinkInstitution);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccioAccount(GetAccioAccountRequestDto getAccioAccountRequestDto, Continuation<? super GetAccioAccountResponseDto> continuation) {
        C34481 c34481;
        if (continuation instanceof C34481) {
            c34481 = (C34481) continuation;
            int i = c34481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34481.label = i - Integer.MIN_VALUE;
            } else {
                c34481 = new C34481(continuation);
            }
        }
        Object objGetAccioAccount = c34481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccioAccount);
            Request<GetAccioAccountRequestDto> request = new Request<>(getAccioAccountRequestDto, null, 2, null);
            c34481.label = 1;
            objGetAccioAccount = GetAccioAccount(request, c34481);
            if (objGetAccioAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccioAccount);
        }
        return ((Response) objGetAccioAccount).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccioAccount(Request<GetAccioAccountRequestDto> request, Continuation<? super Response<GetAccioAccountResponseDto>> continuation) {
        C34492 c34492;
        if (continuation instanceof C34492) {
            c34492 = (C34492) continuation;
            int i = c34492.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34492.label = i - Integer.MIN_VALUE;
            } else {
                c34492 = new C34492(continuation);
            }
        }
        C34492 c344922 = c34492;
        Object objGetAccioAccount = c344922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccioAccount);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            ProviderDto provider = request.getData().getProvider() != ProviderDto.INSTANCE.getZeroValue() ? request.getData().getProvider() : null;
            accio.service.p003v1.PurposeDto purpose = request.getData().getPurpose() != accio.service.p003v1.PurposeDto.INSTANCE.getZeroValue() ? request.getData().getPurpose() : null;
            List<ListAccountsSettingDto> settings = request.getData().getSettings();
            c344922.label = 1;
            objGetAccioAccount = bffMoneyMovementServiceRetrofit.GetAccioAccount(metadata, account_id, provider, purpose, settings, c344922);
            if (objGetAccioAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccioAccount);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccioAccount);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InvestmentsTrackerGetAccounts(InvestmentsTrackerGetAccountsRequestDto investmentsTrackerGetAccountsRequestDto, Continuation<? super InvestmentsTrackerGetAccountsResponseDto> continuation) {
        C34651 c34651;
        if (continuation instanceof C34651) {
            c34651 = (C34651) continuation;
            int i = c34651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34651.label = i - Integer.MIN_VALUE;
            } else {
                c34651 = new C34651(continuation);
            }
        }
        Object objInvestmentsTrackerGetAccounts = c34651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvestmentsTrackerGetAccounts);
            Request<InvestmentsTrackerGetAccountsRequestDto> request = new Request<>(investmentsTrackerGetAccountsRequestDto, null, 2, null);
            c34651.label = 1;
            objInvestmentsTrackerGetAccounts = InvestmentsTrackerGetAccounts(request, c34651);
            if (objInvestmentsTrackerGetAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvestmentsTrackerGetAccounts);
        }
        return ((Response) objInvestmentsTrackerGetAccounts).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object InvestmentsTrackerGetAccounts(Request<InvestmentsTrackerGetAccountsRequestDto> request, Continuation<? super Response<InvestmentsTrackerGetAccountsResponseDto>> continuation) {
        C34662 c34662;
        if (continuation instanceof C34662) {
            c34662 = (C34662) continuation;
            int i = c34662.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34662.label = i - Integer.MIN_VALUE;
            } else {
                c34662 = new C34662(continuation);
            }
        }
        Object objInvestmentsTrackerGetAccounts = c34662.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34662.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvestmentsTrackerGetAccounts);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c34662.label = 1;
            objInvestmentsTrackerGetAccounts = bffMoneyMovementServiceRetrofit.InvestmentsTrackerGetAccounts(metadata, c34662);
            if (objInvestmentsTrackerGetAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvestmentsTrackerGetAccounts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objInvestmentsTrackerGetAccounts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LinkAccountsForUpdateMode(LinkAccountsForUpdateModeRequestDto linkAccountsForUpdateModeRequestDto, Continuation<Object> continuation) {
        C34711 c34711;
        if (continuation instanceof C34711) {
            c34711 = (C34711) continuation;
            int i = c34711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34711.label = i - Integer.MIN_VALUE;
            } else {
                c34711 = new C34711(continuation);
            }
        }
        Object objLinkAccountsForUpdateMode = c34711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkAccountsForUpdateMode);
            Request<LinkAccountsForUpdateModeRequestDto> request = new Request<>(linkAccountsForUpdateModeRequestDto, null, 2, null);
            c34711.label = 1;
            objLinkAccountsForUpdateMode = LinkAccountsForUpdateMode(request, c34711);
            if (objLinkAccountsForUpdateMode == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLinkAccountsForUpdateMode);
        }
        return ((Response) objLinkAccountsForUpdateMode).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LinkAccountsForUpdateMode(Request<LinkAccountsForUpdateModeRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C34722 c34722;
        if (continuation instanceof C34722) {
            c34722 = (C34722) continuation;
            int i = c34722.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34722.label = i - Integer.MIN_VALUE;
            } else {
                c34722 = new C34722(continuation);
            }
        }
        Object objLinkAccountsForUpdateMode = c34722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkAccountsForUpdateMode);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            LinkAccountsForUpdateModeRequestDto data = request.getData();
            c34722.label = 1;
            objLinkAccountsForUpdateMode = bffMoneyMovementServiceRetrofit.LinkAccountsForUpdateMode(metadata, data, c34722);
            if (objLinkAccountsForUpdateMode == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLinkAccountsForUpdateMode);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objLinkAccountsForUpdateMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAgreement(GetAgreementRequestDto getAgreementRequestDto, Continuation<? super GetAgreementResponseDto> continuation) {
        C34501 c34501;
        if (continuation instanceof C34501) {
            c34501 = (C34501) continuation;
            int i = c34501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34501.label = i - Integer.MIN_VALUE;
            } else {
                c34501 = new C34501(continuation);
            }
        }
        Object objGetAgreement = c34501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreement);
            Request<GetAgreementRequestDto> request = new Request<>(getAgreementRequestDto, null, 2, null);
            c34501.label = 1;
            objGetAgreement = GetAgreement(request, c34501);
            if (objGetAgreement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAgreement);
        }
        return ((Response) objGetAgreement).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAgreement(Request<GetAgreementRequestDto> request, Continuation<? super Response<GetAgreementResponseDto>> continuation) {
        C34512 c34512;
        if (continuation instanceof C34512) {
            c34512 = (C34512) continuation;
            int i = c34512.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34512.label = i - Integer.MIN_VALUE;
            } else {
                c34512 = new C34512(continuation);
            }
        }
        Object objGetAgreement = c34512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreement);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            InvestmentsTrackerAgreementTypeDto agreement_type = request.getData().getAgreement_type() != InvestmentsTrackerAgreementTypeDto.INSTANCE.getZeroValue() ? request.getData().getAgreement_type() : null;
            c34512.label = 1;
            objGetAgreement = bffMoneyMovementServiceRetrofit.GetAgreement(metadata, agreement_type, c34512);
            if (objGetAgreement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAgreement);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAgreement);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_money_movement.service.p019v1.BffMoneyMovementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignAgreement(SignAgreementRequestDto signAgreementRequestDto, Continuation<Object> continuation) {
        C34751 c34751;
        if (continuation instanceof C34751) {
            c34751 = (C34751) continuation;
            int i = c34751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34751.label = i - Integer.MIN_VALUE;
            } else {
                c34751 = new C34751(continuation);
            }
        }
        Object objSignAgreement = c34751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignAgreement);
            Request<SignAgreementRequestDto> request = new Request<>(signAgreementRequestDto, null, 2, null);
            c34751.label = 1;
            objSignAgreement = SignAgreement(request, c34751);
            if (objSignAgreement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignAgreement);
        }
        return ((Response) objSignAgreement).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SignAgreement(Request<SignAgreementRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C34762 c34762;
        if (continuation instanceof C34762) {
            c34762 = (C34762) continuation;
            int i = c34762.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34762.label = i - Integer.MIN_VALUE;
            } else {
                c34762 = new C34762(continuation);
            }
        }
        Object objSignAgreement = c34762.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34762.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSignAgreement);
            BffMoneyMovementServiceRetrofit bffMoneyMovementServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SignAgreementRequestDto data = request.getData();
            c34762.label = 1;
            objSignAgreement = bffMoneyMovementServiceRetrofit.SignAgreement(metadata, data, c34762);
            if (objSignAgreement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSignAgreement);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSignAgreement);
    }
}

package com.robinhood.android.apitestdata.api;

import android.annotation.SuppressLint;
import com.robinhood.android.apitestdata.models.ApiAddBeneficiaryRequest;
import com.robinhood.android.apitestdata.models.ApiAllocateIpoSharesRequest;
import com.robinhood.android.apitestdata.models.ApiCreateCobRequest;
import com.robinhood.android.apitestdata.models.ApiCreateIoiRequest;
import com.robinhood.android.apitestdata.models.ApiCreateIpoAccessInstrumentRequest;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.apitestdata.models.ApiCreateUserResponse;
import com.robinhood.android.apitestdata.models.ApiDocumentBulkCreateRequest;
import com.robinhood.android.apitestdata.models.ApiDocumentBulkCreateResponse;
import com.robinhood.android.apitestdata.models.ApiDocumentRequestResponse;
import com.robinhood.android.apitestdata.models.ApiFillAllocationRequest;
import com.robinhood.android.apitestdata.models.ApiRecipe;
import com.robinhood.android.apitestdata.models.ApiSetInstrumentPublicRequest;
import com.robinhood.android.apitestdata.models.ApiSetInterestRate;
import com.robinhood.android.apitestdata.models.ApiSetIpoPriceFinalizedRequest;
import com.robinhood.android.apitestdata.models.ApiSetIpoPriceRangeRequest;
import com.robinhood.android.apitestdata.models.ApiTestUser;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiIssue;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.shared.debug.recipes.models.ApiExecuteRecipeRequest;
import com.robinhood.shared.debug.recipes.models.ApiGenericRecipe;
import com.robinhood.shared.debug.recipes.models.ApiRecipeRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: TestDataApi.kt */
@Metadata(m3635d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\b\u0001\u0010\b\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u0015\u001a\u00020\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020!H§@¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\u00112\b\b\u0001\u0010&\u001a\u00020'H§@¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020*H§@¢\u0006\u0002\u0010+J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020,H§@¢\u0006\u0002\u0010-J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u000200H§@¢\u0006\u0002\u00101J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u000202H§@¢\u0006\u0002\u00103J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u000204H§@¢\u0006\u0002\u00105J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u000206H§@¢\u0006\u0002\u00107J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u000208H§@¢\u0006\u0002\u00109J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020:H§@¢\u0006\u0002\u0010;J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020<H§@¢\u0006\u0002\u0010=J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020>H§@¢\u0006\u0002\u0010?J\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020@H§@¢\u0006\u0002\u0010AJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020BH§@¢\u0006\u0002\u0010CJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020DH§@¢\u0006\u0002\u0010EJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020FH§@¢\u0006\u0002\u0010GJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020HH§@¢\u0006\u0002\u0010IJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020JH§@¢\u0006\u0002\u0010KJ\u0018\u0010)\u001a\u00020L2\b\b\u0001\u0010\u0016\u001a\u00020MH§@¢\u0006\u0002\u0010NJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\u0016\u001a\u00020OH§@¢\u0006\u0002\u0010PJ\u0018\u0010)\u001a\u00020$2\b\b\u0001\u0010\b\u001a\u00020QH§@¢\u0006\u0002\u0010RJ\u0018\u0010S\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020TH§@¢\u0006\u0002\u0010UJ\u0018\u0010V\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020WH§@¢\u0006\u0002\u0010XJ\u0018\u0010Y\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020WH§@¢\u0006\u0002\u0010XJ\u0018\u0010Z\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020[H§@¢\u0006\u0002\u0010\\J\u0018\u0010]\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020^H§@¢\u0006\u0002\u0010_J\u0018\u0010`\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020aH§@¢\u0006\u0002\u0010bJ\u0018\u0010c\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020dH§@¢\u0006\u0002\u0010eJ\u0018\u0010f\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020gH§@¢\u0006\u0002\u0010hJ\u0018\u0010i\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020jH§@¢\u0006\u0002\u0010kJ\u001e\u0010l\u001a\b\u0012\u0004\u0012\u00020n0m2\b\b\u0001\u0010\u0016\u001a\u00020oH§@¢\u0006\u0002\u0010pJ\u0018\u0010q\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020rH§@¢\u0006\u0002\u0010s¨\u0006t"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/api/TestDataApi;", "", "getTestUsers", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/apitestdata/models/ApiTestUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTestUser", "Lcom/robinhood/android/apitestdata/models/ApiCreateUserResponse;", "request", "Lcom/robinhood/android/apitestdata/models/ApiCreateUserRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiCreateUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSweepsInterestRate", "", "Lcom/robinhood/android/apitestdata/models/ApiSetInterestRate;", "(Lcom/robinhood/android/apitestdata/models/ApiSetInterestRate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "", "", "Lcom/robinhood/shared/debug/recipes/models/ApiGenericRecipe;", "Lcom/robinhood/shared/debug/recipes/models/ApiRecipeRequest;", "(Lcom/robinhood/shared/debug/recipes/models/ApiRecipeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitCxVoiceRecipe", "recipe", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$EnableOrDisableOutOfHours;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$EnableOrDisableOutOfHours;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$CreateAllVoiceExperiments;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$CreateAllVoiceExperiments;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiIssue;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$CreateVoiceIssue;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$CreateVoiceIssue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$UpdateVoiceIssue;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$CxVoice$UpdateVoiceIssue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "overrideMarketHours", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$Market$OverrideMarketHours;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$Market$OverrideMarketHours;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeUserRecipe", "Lcom/robinhood/models/api/sheriff/ApiUser;", "recipeRoute", "arguments", "Lcom/robinhood/shared/debug/recipes/models/ApiExecuteRecipeRequest;", "(Ljava/lang/String;Lcom/robinhood/shared/debug/recipes/models/ApiExecuteRecipeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitUserRecipe", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCashManagement;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCashManagement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDayTrades;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDayTrades;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDefault;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDefault;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGold;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGold;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGoldUsingMargin;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGoldUsingMargin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGoldAndSweep;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithGoldAndSweep;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMarginCall;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMarginCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMoney;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMoney;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMoneyAndEquity;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMoneyAndEquity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithRecurring;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithRecurring;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithAggregateOptionPosition;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithAggregateOptionPosition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithSingleLegOption;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithSingleLegOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithSingleShortLegOption;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithSingleShortLegOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCitizenship;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCitizenship;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithRevokedInstantEligibility;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithRevokedInstantEligibility;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithFirstTradeRecommendationsEligibility;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithFirstTradeRecommendationsEligibility;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDeviceApprovalEnabledDevice;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDeviceApprovalEnabledDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiDocumentRequestResponse;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDocumentRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMarginInvesting;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithMarginInvesting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCryptoInEu;", "(Lcom/robinhood/android/apitestdata/models/ApiRecipe$User$WithCryptoInEu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateIpoAccessInstrument", "Lcom/robinhood/android/apitestdata/models/ApiCreateIpoAccessInstrumentRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiCreateIpoAccessInstrumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setIpoPriceRange", "Lcom/robinhood/android/apitestdata/models/ApiSetIpoPriceRangeRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiSetIpoPriceRangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupIpoPriceRangeChanged", "setIpoPriceFinalized", "Lcom/robinhood/android/apitestdata/models/ApiSetIpoPriceFinalizedRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiSetIpoPriceFinalizedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIoi", "Lcom/robinhood/android/apitestdata/models/ApiCreateIoiRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiCreateIoiRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCob", "Lcom/robinhood/android/apitestdata/models/ApiCreateCobRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiCreateCobRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allocateIpoShares", "Lcom/robinhood/android/apitestdata/models/ApiAllocateIpoSharesRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiAllocateIpoSharesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInstrumentPublic", "Lcom/robinhood/android/apitestdata/models/ApiSetInstrumentPublicRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiSetInstrumentPublicRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerFillAllocation", "Lcom/robinhood/android/apitestdata/models/ApiFillAllocationRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiFillAllocationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bulkCreateDocumentRequest", "", "Lcom/robinhood/android/apitestdata/models/ApiDocumentBulkCreateResponse;", "Lcom/robinhood/android/apitestdata/models/ApiDocumentBulkCreateRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiDocumentBulkCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addBeneficiary", "Lcom/robinhood/android/apitestdata/models/ApiAddBeneficiaryRequest;", "(Lcom/robinhood/android/apitestdata/models/ApiAddBeneficiaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface TestDataApi {
    @POST("recipes/beneficiaries/add_beneficiary")
    Object addBeneficiary(@Body ApiAddBeneficiaryRequest apiAddBeneficiaryRequest, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/allocate_ipo_shares")
    Object allocateIpoShares(@Body ApiAllocateIpoSharesRequest apiAllocateIpoSharesRequest, Continuation<? super Unit> continuation);

    @POST("document_request/bulk_create/")
    Object bulkCreateDocumentRequest(@Body ApiDocumentBulkCreateRequest apiDocumentBulkCreateRequest, Continuation<? super List<ApiDocumentBulkCreateResponse>> continuation);

    @POST("recipes/ipo/create_cob")
    Object createCob(@Body ApiCreateCobRequest apiCreateCobRequest, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/create_ioi")
    Object createIoi(@Body ApiCreateIoiRequest apiCreateIoiRequest, Continuation<? super Unit> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 120", "X-Write-Timeout-Seconds-Override: 120"})
    @POST("users/create_user/")
    Object createTestUser(@Body ApiCreateUserRequest apiCreateUserRequest, Continuation<? super ApiCreateUserResponse> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 120", "X-Write-Timeout-Seconds-Override: 120"})
    @POST("{recipeRoute}")
    Object executeUserRecipe(@Path(encoded = true, value = "recipeRoute") String str, @Body ApiExecuteRecipeRequest apiExecuteRecipeRequest, Continuation<? super ApiUser> continuation);

    @POST("recipes/ipo/create_ipo_access_instrument")
    Object getOrCreateIpoAccessInstrument(@Body ApiCreateIpoAccessInstrumentRequest apiCreateIpoAccessInstrumentRequest, Continuation<? super Unit> continuation);

    @POST("recipes/")
    Object getRecipes(@Body ApiRecipeRequest apiRecipeRequest, Continuation<? super Map<String, ApiGenericRecipe>> continuation);

    @POST("recipes/get_test_users")
    Object getTestUsers(Continuation<? super PaginatedResult<ApiTestUser>> continuation);

    @POST("recipes/market/override_market_hours")
    Object overrideMarketHours(@Body ApiRecipe.Market.OverrideMarketHours overrideMarketHours, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/setup_instrument_public")
    Object setInstrumentPublic(@Body ApiSetInstrumentPublicRequest apiSetInstrumentPublicRequest, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/setup_price_finalized")
    Object setIpoPriceFinalized(@Body ApiSetIpoPriceFinalizedRequest apiSetIpoPriceFinalizedRequest, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/instrument/set_ipo_price_range")
    Object setIpoPriceRange(@Body ApiSetIpoPriceRangeRequest apiSetIpoPriceRangeRequest, Continuation<? super Unit> continuation);

    @POST("cash_management/create_sweep_interest_rate/")
    Object setSweepsInterestRate(@Body ApiSetInterestRate apiSetInterestRate, Continuation<? super Unit> continuation);

    @POST("recipes/ipo/setup_price_changed")
    Object setupIpoPriceRangeChanged(@Body ApiSetIpoPriceRangeRequest apiSetIpoPriceRangeRequest, Continuation<? super Unit> continuation);

    @POST("recipes/cxvoice/create_all_voice_experiments")
    Object submitCxVoiceRecipe(@Body ApiRecipe.CxVoice.CreateAllVoiceExperiments createAllVoiceExperiments, Continuation<? super Unit> continuation);

    @POST("recipes/cxvoice/create_voice_issue")
    Object submitCxVoiceRecipe(@Body ApiRecipe.CxVoice.CreateVoiceIssue createVoiceIssue, Continuation<? super ApiIssue> continuation);

    @POST("recipes/cxvoice/enable_or_disable_ooh")
    Object submitCxVoiceRecipe(@Body ApiRecipe.CxVoice.EnableOrDisableOutOfHours enableOrDisableOutOfHours, Continuation<? super Unit> continuation);

    @POST("recipes/cxvoice/update_voice_issue")
    Object submitCxVoiceRecipe(@Body ApiRecipe.CxVoice.UpdateVoiceIssue updateVoiceIssue, Continuation<? super Unit> continuation);

    @POST("recipes/user/options/user_with_aggregate_option_position")
    Object submitUserRecipe(@Body ApiRecipe.User.WithAggregateOptionPosition withAggregateOptionPosition, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/cash/user_with_cashmanagement")
    Object submitUserRecipe(@Body ApiRecipe.User.WithCashManagement withCashManagement, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/user_with_new_account_state_link_bank_account")
    Object submitUserRecipe(@Body ApiRecipe.User.WithCitizenship withCitizenship, Continuation<? super ApiUser> continuation);

    @POST("/recipes/crypto/user/create_crypto_eu_user_with_crypto")
    @SuppressLint({"LeadingSlashInPath"})
    Object submitUserRecipe(@Body ApiRecipe.User.WithCryptoInEu withCryptoInEu, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/equity/user_with_day_trades")
    Object submitUserRecipe(@Body ApiRecipe.User.WithDayTrades withDayTrades, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/user_with_default")
    Object submitUserRecipe(@Body ApiRecipe.User.WithDefault withDefault, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/sheriff/user_with_device_approval_enabled_device")
    Object submitUserRecipe(@Body ApiRecipe.User.WithDeviceApprovalEnabledDevice withDeviceApprovalEnabledDevice, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/user_with_document_request")
    Object submitUserRecipe(@Body ApiRecipe.User.WithDocumentRequest withDocumentRequest, Continuation<? super ApiDocumentRequestResponse> continuation);

    @POST("recipes/user/recommendations/user_eligible_for_first_trade_recommendations")
    Object submitUserRecipe(@Body ApiRecipe.User.WithFirstTradeRecommendationsEligibility withFirstTradeRecommendationsEligibility, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/gold/user_with_gold")
    Object submitUserRecipe(@Body ApiRecipe.User.WithGold withGold, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/gold/user_with_gold_and_sweep")
    Object submitUserRecipe(@Body ApiRecipe.User.WithGoldAndSweep withGoldAndSweep, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/gold/user_with_gold_using_margin")
    Object submitUserRecipe(@Body ApiRecipe.User.WithGoldUsingMargin withGoldUsingMargin, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/gold/user_with_margin_call")
    Object submitUserRecipe(@Body ApiRecipe.User.WithMarginCall withMarginCall, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/margin/user_with_decoupled_margin_investing")
    Object submitUserRecipe(@Body ApiRecipe.User.WithMarginInvesting withMarginInvesting, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/user_with_money")
    Object submitUserRecipe(@Body ApiRecipe.User.WithMoney withMoney, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/equity/user_with_money_and_equity")
    Object submitUserRecipe(@Body ApiRecipe.User.WithMoneyAndEquity withMoneyAndEquity, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/recurring/user_with_recurring")
    Object submitUserRecipe(@Body ApiRecipe.User.WithRecurring withRecurring, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/user_revoked_instant")
    Object submitUserRecipe(@Body ApiRecipe.User.WithRevokedInstantEligibility withRevokedInstantEligibility, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/options/user_with_single_leg_option")
    Object submitUserRecipe(@Body ApiRecipe.User.WithSingleLegOption withSingleLegOption, Continuation<? super ApiUser> continuation);

    @POST("recipes/user/options/user_with_single_short_leg_option")
    Object submitUserRecipe(@Body ApiRecipe.User.WithSingleShortLegOption withSingleShortLegOption, Continuation<? super ApiUser> continuation);

    @POST("recipes/ipo/fill_allocations")
    Object triggerFillAllocation(@Body ApiFillAllocationRequest apiFillAllocationRequest, Continuation<? super Unit> continuation);
}

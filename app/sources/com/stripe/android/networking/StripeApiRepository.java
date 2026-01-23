package com.stripe.android.networking;

import android.content.Context;
import android.net.http.HttpResponseCache;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo;
import com.robinhood.utils.http.HttpStatusCode;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Stripe;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.cards.Bin;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.ExceptionUtils2;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.ResponseJson;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.parsers.CardMetadataJsonParser;
import com.stripe.android.model.parsers.FinancialConnectionsSessionJsonParser;
import com.stripe.android.model.parsers.FpxBankStatusesJsonParser;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.parsers.RadarSessionWithHCaptchaJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: StripeApiRepository.kt */
@Metadata(m3635d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Û\u00012\u00020\u0001:\u0004Û\u0001Ü\u0001B¯\u0001\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 BS\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\"J:\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001d\u00101\u001a\u0002002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050.H\u0002¢\u0006\u0004\b1\u00102Jm\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000)\"\b\b\u0000\u00104*\u0002032\u0006\u00106\u001a\u0002052\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072/\b\u0002\u0010=\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050.0)¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020009H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0002002\u0006\u0010D\u001a\u00020AH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000200H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u0002002\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ1\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020O0N2\u0006\u0010M\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\bP\u0010QJ+\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050S2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\bT\u0010UJE\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020O0N2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020O0N2\b\u0010X\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b[\u0010\\J(\u0010_\u001a\b\u0012\u0004\u0012\u00020#0)*\u00020#2\u0006\u0010&\u001a\u00020%H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J:\u0010c\u001a\b\u0012\u0004\u0012\u00020`0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ:\u0010e\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010,J:\u0010g\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010bJ,\u0010j\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ,\u0010m\u001a\b\u0012\u0004\u0012\u00020k0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010iJ4\u0010r\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010n\u001a\u00020\u00052\u0006\u0010o\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJ:\u0010w\u001a\b\u0012\u0004\u0012\u00020k0)2\u0006\u0010t\u001a\u00020s2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u0010vJ:\u0010y\u001a\b\u0012\u0004\u0012\u00020k0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010bJ4\u0010|\u001a\b\u0012\u0004\u0012\u00020k0)2\u0006\u0010z\u001a\u00020\u00052\u0006\u0010o\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b{\u0010qJ-\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020}0)2\u0006\u0010X\u001a\u00020W2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJ2\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010)2\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J(\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010)2\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J2\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010)2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010&\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J3\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010)2\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0093\u0001\u001a\u00020%H\u0097@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J0\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010)2\u0006\u0010o\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0098\u0001\u0010iJ)\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010)2\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u0089\u0001JF\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010)2\u0007\u0010\u009d\u0001\u001a\u00020\u00052\u0007\u0010\u009e\u0001\u001a\u00020\u00052\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00052\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J2\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010)2\u0007\u0010V\u001a\u00030£\u00012\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J:\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010)2\u0006\u0010n\u001a\u00020\u00052\u0007\u0010V\u001a\u00030¨\u00012\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J:\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010)2\u0006\u0010z\u001a\u00020\u00052\u0007\u0010V\u001a\u00030¨\u00012\u0007\u0010\u0093\u0001\u001a\u00020%H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¬\u0001\u0010ª\u0001J\u001a\u0010°\u0001\u001a\u00020\u00052\u0006\u0010n\u001a\u00020\u0005H\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001a\u0010²\u0001\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u0005H\u0001¢\u0006\u0006\b±\u0001\u0010¯\u0001JO\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010n\u001a\u00020\u00052\u0007\u0010³\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001JO\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020k0)2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u00052\u0007\u0010³\u0001\u001a\u00020\u00052\u0007\u0010\u0093\u0001\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b·\u0001\u0010µ\u0001J?\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010)2\u0007\u0010\u0093\u0001\u001a\u00020%2\u0014\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010NH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001JP\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050.2\u0006\u00106\u001a\u0002052-\u0010=\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050.0)¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020009H\u0081@¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010K\u001a\u0002002\u0007\u0010V\u001a\u00030À\u0001H\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J \u0010Ã\u0001\u001a\u00020\u00052\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Å\u0001R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010Æ\u0001R\u0017\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Ç\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010È\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010É\u0001R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ê\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ë\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010Ì\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Í\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010Î\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010Ï\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010Ð\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R)\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050.0)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Ý\u0001"}, m3636d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "Lcom/stripe/android/networking/StripeRepository;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "publishableKeyProvider", "Lcom/stripe/android/core/AppInfo;", "appInfo", "Lcom/stripe/android/core/Logger;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "", "productUsageTokens", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/FraudDetectionDataRepository;", "fraudDetectionDataRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "fraudDetectionDataParamsUtils", "Lcom/stripe/android/StripeApiBeta;", "betas", "apiVersion", "sdkVersion", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "appContext", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "options", "", "expandFields", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntentInternal-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntentInternal", "Lcom/stripe/android/core/networking/StripeResponse;", "response", "", "handleApiError", "(Lcom/stripe/android/core/networking/StripeResponse;)V", "Lcom/stripe/android/core/model/StripeModel;", "ModelType", "Lcom/stripe/android/core/networking/ApiRequest;", "apiRequest", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "jsonParser", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "onResponse", "fetchStripeModelResult-BWLJW6A", "(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStripeModelResult", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "disableDnsCache", "()Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "dnsCacheData", "resetDnsCache", "(Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;)V", "fireFraudDetectionDataRequest", "()V", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "fireAnalyticsRequest", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V", "clientSecret", "", "", "createClientSecretParam", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", "attribution", "Lkotlin/Pair;", "buildPaymentUserAgentPair", "(Ljava/util/Set;)Lkotlin/Pair;", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "maybeAddPaymentUserAgent", "(Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/SourceParams;)Ljava/util/Map;", "maybeForDashboard-0E7RQCE", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeForDashboard", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "confirmPaymentIntent-BWLJW6A", "confirmPaymentIntent", "retrievePaymentIntent-BWLJW6A", "retrievePaymentIntent", "refreshPaymentIntent-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshPaymentIntent", "Lcom/stripe/android/model/SetupIntent;", "refreshSetupIntent-0E7RQCE", "refreshSetupIntent", "paymentIntentId", "sourceId", "cancelPaymentIntentSource-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentIntentSource", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "confirmSetupIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "retrieveSetupIntent-BWLJW6A", "retrieveSetupIntent", "setupIntentId", "cancelSetupIntentSource-BWLJW6A", "cancelSetupIntentSource", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod-0E7RQCE", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "Lcom/stripe/android/model/Token;", "createToken-0E7RQCE", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus-gIAlu-s", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/model/CardMetadata;", "getCardMetadata-0E7RQCE", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "authParams", "requestOptions", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "start3ds2Auth-0E7RQCE", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Auth", "complete3ds2Auth-0E7RQCE", "complete3ds2Auth", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "createRadarSession-gIAlu-s", "createRadarSession", "radarSessionToken", "hcaptchaToken", "hcaptchaEKey", "attachHCaptchaToRadarSession-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachHCaptchaToRadarSession", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "Lcom/stripe/android/model/FinancialConnectionsSession;", "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE", "(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFinancialConnectionsSessionForDeferredPayments", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession-BWLJW6A", "createSetupIntentFinancialConnectionsSession", "getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "getPaymentIntentFinancialConnectionsSessionUrl", "getSetupIntentFinancialConnectionsSessionUrl$payments_core_release", "getSetupIntentFinancialConnectionsSessionUrl", "financialConnectionsSessionId", "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToPaymentIntent", "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk", "attachFinancialConnectionsSessionToSetupIntent", "Lcom/stripe/android/model/MobileCardElementConfig;", "retrieveCardElementConfig-0E7RQCE", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCardElementConfig", "makeApiRequest$payments_core_release", "(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeApiRequest", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "fireAnalyticsRequest$payments_core_release", "(Lcom/stripe/android/core/networking/AnalyticsRequest;)V", "buildPaymentUserAgent", "(Ljava/util/Set;)Ljava/lang/String;", "Landroid/content/Context;", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/core/AppInfo;", "Lcom/stripe/android/core/Logger;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/Set;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/FraudDetectionDataRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "Lcom/stripe/android/networking/FraudDetectionData;", "getFraudDetectionData", "()Lcom/stripe/android/networking/FraudDetectionData;", "fraudDetectionData", "getErrorMessage", "(Ljava/lang/Object;)Ljava/lang/String;", "errorMessage", "Companion", "DnsCacheData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class StripeApiRepository implements StripeRepository {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final ApiRequest.Factory apiRequestFactory;
    private final AppInfo appInfo;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final Context context;
    private final FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Set<String> productUsageTokens;
    private final Function0<String> publishableKeyProvider;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmOverloads
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion, String sdkVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.context = context;
        this.publishableKeyProvider = publishableKeyProvider;
        this.appInfo = appInfo;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
        this.stripeNetworkClient = stripeNetworkClient;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils;
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
        fireFraudDetectionDataRequest();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(workContext), null, null, new C425452(null), 3, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StripeApiRepository(android.content.Context r17, kotlin.jvm.functions.Function0 r18, com.stripe.android.core.AppInfo r19, com.stripe.android.core.Logger r20, kotlin.coroutines.CoroutineContext r21, java.util.Set r22, com.stripe.android.core.networking.StripeNetworkClient r23, com.stripe.android.core.networking.AnalyticsRequestExecutor r24, com.stripe.android.FraudDetectionDataRepository r25, com.stripe.android.cards.CardAccountRangeRepository.Factory r26, com.stripe.android.networking.PaymentAnalyticsRequestFactory r27, com.stripe.android.networking.FraudDetectionDataParamsUtils r28, java.util.Set r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.<init>(android.content.Context, kotlin.jvm.functions.Function0, com.stripe.android.core.AppInfo, com.stripe.android.core.Logger, kotlin.coroutines.CoroutineContext, java.util.Set, com.stripe.android.core.networking.StripeNetworkClient, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.FraudDetectionDataRepository, com.stripe.android.cards.CardAccountRangeRepository$Factory, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.networking.FraudDetectionDataParamsUtils, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context appContext, Function0<String> publishableKeyProvider, CoroutineContext workContext, Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    private final FraudDetectionData getFraudDetectionData() {
        return this.fraudDetectionDataRepository.getCached();
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.networking.StripeApiRepository$2", m3645f = "StripeApiRepository.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.networking.StripeApiRepository$2 */
    static final class C425452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425452(Continuation<? super C425452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeApiRepository.this.new C425452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HttpResponseCache.install(new File(StripeApiRepository.this.context.getCacheDir(), "stripe_api_repository_cache"), SddrPdfUploadDuxo.FILE_SIZE_LIMIT);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26887retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends StripeIntent>> continuation) {
        StripeApiRepository$retrieveStripeIntent$1 stripeApiRepository$retrieveStripeIntent$1;
        if (continuation instanceof StripeApiRepository$retrieveStripeIntent$1) {
            stripeApiRepository$retrieveStripeIntent$1 = (StripeApiRepository$retrieveStripeIntent$1) continuation;
            int i = stripeApiRepository$retrieveStripeIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveStripeIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveStripeIntent$1 = new StripeApiRepository$retrieveStripeIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveStripeIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$retrieveStripeIntent$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        if (PaymentIntent.ClientSecret.INSTANCE.isMatch(str)) {
            stripeApiRepository$retrieveStripeIntent$1.label = 1;
            Object objMo26885retrievePaymentIntentBWLJW6A = mo26885retrievePaymentIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
            if (objMo26885retrievePaymentIntentBWLJW6A != coroutine_suspended) {
                return objMo26885retrievePaymentIntentBWLJW6A;
            }
        } else if (SetupIntent.ClientSecret.INSTANCE.isMatch(str)) {
            stripeApiRepository$retrieveStripeIntent$1.label = 2;
            Object objMo26886retrieveSetupIntentBWLJW6A = mo26886retrieveSetupIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
            if (objMo26886retrieveSetupIntentBWLJW6A != coroutine_suspended) {
                return objMo26886retrieveSetupIntentBWLJW6A;
            }
        } else {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new IllegalStateException("Invalid client secret.")));
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: confirmPaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26872confirmPaymentIntentBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$confirmPaymentIntent$1 stripeApiRepository$confirmPaymentIntent$1;
        Object objM26865maybeForDashboard0E7RQCE;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$confirmPaymentIntent$1) {
            stripeApiRepository$confirmPaymentIntent$1 = (StripeApiRepository$confirmPaymentIntent$1) continuation;
            int i = stripeApiRepository$confirmPaymentIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmPaymentIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmPaymentIntent$1 = new StripeApiRepository$confirmPaymentIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$confirmPaymentIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$confirmPaymentIntent$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            stripeApiRepository$confirmPaymentIntent$1.L$0 = this;
            stripeApiRepository$confirmPaymentIntent$1.L$1 = options;
            stripeApiRepository$confirmPaymentIntent$1.L$2 = list;
            stripeApiRepository$confirmPaymentIntent$1.label = 1;
            objM26865maybeForDashboard0E7RQCE = m26865maybeForDashboard0E7RQCE(confirmPaymentIntentParams, options, stripeApiRepository$confirmPaymentIntent$1);
            if (objM26865maybeForDashboard0E7RQCE != coroutine_suspended) {
                stripeApiRepository = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        list = (List) stripeApiRepository$confirmPaymentIntent$1.L$2;
        options = (ApiRequest.Options) stripeApiRepository$confirmPaymentIntent$1.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$confirmPaymentIntent$1.L$0;
        ResultKt.throwOnFailure(obj);
        objM26865maybeForDashboard0E7RQCE = ((Result) obj).getValue();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26865maybeForDashboard0E7RQCE);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        stripeApiRepository$confirmPaymentIntent$1.L$0 = null;
        stripeApiRepository$confirmPaymentIntent$1.L$1 = null;
        stripeApiRepository$confirmPaymentIntent$1.L$2 = null;
        stripeApiRepository$confirmPaymentIntent$1.label = 2;
        Object objM26862confirmPaymentIntentInternalBWLJW6A = stripeApiRepository.m26862confirmPaymentIntentInternalBWLJW6A((ConfirmPaymentIntentParams) objM26865maybeForDashboard0E7RQCE, options, list, stripeApiRepository$confirmPaymentIntent$1);
        return objM26862confirmPaymentIntentInternalBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26862confirmPaymentIntentInternalBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: confirmPaymentIntentInternal-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26862confirmPaymentIntentInternalBWLJW6A(final ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$1;
        Object objM28550constructorimpl;
        if (continuation instanceof StripeApiRepository$confirmPaymentIntentInternal$1) {
            stripeApiRepository$confirmPaymentIntentInternal$1 = (StripeApiRepository$confirmPaymentIntentInternal$1) continuation;
            int i = stripeApiRepository$confirmPaymentIntentInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmPaymentIntentInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmPaymentIntentInternal$1 = new StripeApiRepository$confirmPaymentIntentInternal$1(this, continuation);
            }
        }
        StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$12 = stripeApiRepository$confirmPaymentIntentInternal$1;
        Object obj = stripeApiRepository$confirmPaymentIntentInternal$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$confirmPaymentIntentInternal$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmPaymentIntentParams.toParamMap();
        if (options.getApiKeyIsUserKey()) {
            paramMap = MapsKt.minus(paramMap, "client_secret");
        }
        Map<String, ?> mapAddFraudDetectionData$payments_core_release = fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(MapsKt.plus(maybeAddPaymentUserAgent(paramMap, confirmPaymentIntentParams.getPaymentMethodCreateParams(), confirmPaymentIntentParams.getSourceParams()), INSTANCE.createExpandParam(list)), getFraudDetectionData());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getConfirmPaymentIntentUrl$payments_core_release((String) objM28550constructorimpl), options, mapAddFraudDetectionData$payments_core_release, false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$confirmPaymentIntentInternal$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26893invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26893invoke(Object obj2) {
                String type2;
                PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
                if (paymentMethodCreateParams == null || (type2 = paymentMethodCreateParams.getTypeCode()) == null) {
                    SourceParams sourceParams = confirmPaymentIntentParams.getSourceParams();
                    type2 = sourceParams != null ? sourceParams.getType() : null;
                }
                StripeApiRepository stripeApiRepository = this;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(type2, this.getErrorMessage(obj2)));
            }
        };
        stripeApiRepository$confirmPaymentIntentInternal$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$confirmPaymentIntentInternal$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrievePaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26885retrievePaymentIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$retrievePaymentIntent$1 stripeApiRepository$retrievePaymentIntent$1;
        Object objM28550constructorimpl;
        Map<String, Object> mapCreateClientSecretParam;
        if (continuation instanceof StripeApiRepository$retrievePaymentIntent$1) {
            stripeApiRepository$retrievePaymentIntent$1 = (StripeApiRepository$retrievePaymentIntent$1) continuation;
            int i = stripeApiRepository$retrievePaymentIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrievePaymentIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrievePaymentIntent$1 = new StripeApiRepository$retrievePaymentIntent$1(this, continuation);
            }
        }
        StripeApiRepository$retrievePaymentIntent$1 stripeApiRepository$retrievePaymentIntent$12 = stripeApiRepository$retrievePaymentIntent$1;
        Object obj = stripeApiRepository$retrievePaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$retrievePaymentIntent$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        String str2 = (String) objM28550constructorimpl;
        if (!options.getApiKeyIsUserKey()) {
            mapCreateClientSecretParam = createClientSecretParam(str, list);
        } else {
            mapCreateClientSecretParam = INSTANCE.createExpandParam(list);
        }
        Map<String, Object> map = mapCreateClientSecretParam;
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrievePaymentIntentUrl$payments_core_release(str2), options, map, false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$retrievePaymentIntent$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26905invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26905invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRetrieve, null, null, null, null, null, 62, null));
            }
        };
        stripeApiRepository$retrievePaymentIntent$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, paymentIntentJsonParser, function1, stripeApiRepository$retrievePaymentIntent$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: refreshPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26882refreshPaymentIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$refreshPaymentIntent$1 stripeApiRepository$refreshPaymentIntent$1;
        Object objM28550constructorimpl;
        if (continuation instanceof StripeApiRepository$refreshPaymentIntent$1) {
            stripeApiRepository$refreshPaymentIntent$1 = (StripeApiRepository$refreshPaymentIntent$1) continuation;
            int i = stripeApiRepository$refreshPaymentIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$refreshPaymentIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$refreshPaymentIntent$1 = new StripeApiRepository$refreshPaymentIntent$1(this, continuation);
            }
        }
        StripeApiRepository$refreshPaymentIntent$1 stripeApiRepository$refreshPaymentIntent$12 = stripeApiRepository$refreshPaymentIntent$1;
        Object obj = stripeApiRepository$refreshPaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$refreshPaymentIntent$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRefreshPaymentIntentUrl$payments_core_release((String) objM28550constructorimpl), options, createClientSecretParam(str, CollectionsKt.emptyList()), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$refreshPaymentIntent$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26903invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26903invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRefresh, null, null, null, null, null, 62, null));
            }
        };
        stripeApiRepository$refreshPaymentIntent$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$refreshPaymentIntent$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: refreshSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26883refreshSetupIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$refreshSetupIntent$1 stripeApiRepository$refreshSetupIntent$1;
        Object objM28550constructorimpl;
        if (continuation instanceof StripeApiRepository$refreshSetupIntent$1) {
            stripeApiRepository$refreshSetupIntent$1 = (StripeApiRepository$refreshSetupIntent$1) continuation;
            int i = stripeApiRepository$refreshSetupIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$refreshSetupIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$refreshSetupIntent$1 = new StripeApiRepository$refreshSetupIntent$1(this, continuation);
            }
        }
        StripeApiRepository$refreshSetupIntent$1 stripeApiRepository$refreshSetupIntent$12 = stripeApiRepository$refreshSetupIntent$1;
        Object obj = stripeApiRepository$refreshSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$refreshSetupIntent$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRefreshSetupIntentUrl$payments_core_release((String) objM28550constructorimpl), options, createClientSecretParam(str, CollectionsKt.emptyList()), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$refreshSetupIntent$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26904invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26904invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRefresh, null, null, null, null, null, 62, null));
            }
        };
        stripeApiRepository$refreshSetupIntent$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$refreshSetupIntent$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: cancelPaymentIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26869cancelPaymentIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$cancelPaymentIntentSource$1 stripeApiRepository$cancelPaymentIntentSource$1;
        if (continuation instanceof StripeApiRepository$cancelPaymentIntentSource$1) {
            stripeApiRepository$cancelPaymentIntentSource$1 = (StripeApiRepository$cancelPaymentIntentSource$1) continuation;
            int i = stripeApiRepository$cancelPaymentIntentSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$cancelPaymentIntentSource$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$cancelPaymentIntentSource$1 = new StripeApiRepository$cancelPaymentIntentSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$cancelPaymentIntentSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$cancelPaymentIntentSource$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getCancelPaymentIntentSourceUrl$payments_core_release(str), options, MapsKt.mapOf(Tuples4.m3642to("source", str2)), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$cancelPaymentIntentSource$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26891invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26891invoke(Object obj2) {
                this.this$0.fireAnalyticsRequest(PaymentAnalyticsEvent.PaymentIntentCancelSource);
            }
        };
        stripeApiRepository$cancelPaymentIntentSource$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$cancelPaymentIntentSource$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: confirmSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26873confirmSetupIntentBWLJW6A(final ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$confirmSetupIntent$1 stripeApiRepository$confirmSetupIntent$1;
        Object objM28550constructorimpl;
        if (continuation instanceof StripeApiRepository$confirmSetupIntent$1) {
            stripeApiRepository$confirmSetupIntent$1 = (StripeApiRepository$confirmSetupIntent$1) continuation;
            int i = stripeApiRepository$confirmSetupIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmSetupIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmSetupIntent$1 = new StripeApiRepository$confirmSetupIntent$1(this, continuation);
            }
        }
        StripeApiRepository$confirmSetupIntent$1 stripeApiRepository$confirmSetupIntent$12 = stripeApiRepository$confirmSetupIntent$1;
        Object obj = stripeApiRepository$confirmSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$confirmSetupIntent$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion3 = INSTANCE;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion3.getConfirmSetupIntentUrl$payments_core_release((String) objM28550constructorimpl), options, this.fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(MapsKt.plus(maybeAddPaymentUserAgent$default(this, confirmSetupIntentParams.toParamMap(), confirmSetupIntentParams.getPaymentMethodCreateParams(), null, 4, null), companion3.createExpandParam(list)), getFraudDetectionData()), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$confirmSetupIntent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26894invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26894invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
                PaymentMethodCreateParams paymentMethodCreateParams = confirmSetupIntentParams.getPaymentMethodCreateParams();
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createSetupIntentConfirmation$payments_core_release(paymentMethodCreateParams != null ? paymentMethodCreateParams.getTypeCode() : null, this.this$0.getErrorMessage(obj2)));
            }
        };
        stripeApiRepository$confirmSetupIntent$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$confirmSetupIntent$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26886retrieveSetupIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$retrieveSetupIntent$1 stripeApiRepository$retrieveSetupIntent$1;
        Object objM28550constructorimpl;
        if (continuation instanceof StripeApiRepository$retrieveSetupIntent$1) {
            stripeApiRepository$retrieveSetupIntent$1 = (StripeApiRepository$retrieveSetupIntent$1) continuation;
            int i = stripeApiRepository$retrieveSetupIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveSetupIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveSetupIntent$1 = new StripeApiRepository$retrieveSetupIntent$1(this, continuation);
            }
        }
        StripeApiRepository$retrieveSetupIntent$1 stripeApiRepository$retrieveSetupIntent$12 = stripeApiRepository$retrieveSetupIntent$1;
        Object obj = stripeApiRepository$retrieveSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$retrieveSetupIntent$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            return Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrieveSetupIntentUrl$payments_core_release((String) objM28550constructorimpl), options, createClientSecretParam(str, list), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$retrieveSetupIntent$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26906invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26906invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRetrieve, null, null, null, null, null, 62, null));
            }
        };
        stripeApiRepository$retrieveSetupIntent$12.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, setupIntentJsonParser, function1, stripeApiRepository$retrieveSetupIntent$12);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: cancelSetupIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26870cancelSetupIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$cancelSetupIntentSource$1 stripeApiRepository$cancelSetupIntentSource$1;
        if (continuation instanceof StripeApiRepository$cancelSetupIntentSource$1) {
            stripeApiRepository$cancelSetupIntentSource$1 = (StripeApiRepository$cancelSetupIntentSource$1) continuation;
            int i = stripeApiRepository$cancelSetupIntentSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$cancelSetupIntentSource$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$cancelSetupIntentSource$1 = new StripeApiRepository$cancelSetupIntentSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$cancelSetupIntentSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$cancelSetupIntentSource$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getCancelSetupIntentSourceUrl$payments_core_release(str), options, MapsKt.mapOf(Tuples4.m3642to("source", str2)), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$cancelSetupIntentSource$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26892invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26892invoke(Object obj2) {
                this.this$0.fireAnalyticsRequest(PaymentAnalyticsEvent.SetupIntentCancelSource);
            }
        };
        stripeApiRepository$cancelSetupIntentSource$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$cancelSetupIntentSource$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26876createPaymentMethod0E7RQCE(final PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) {
        StripeApiRepository$createPaymentMethod$1 stripeApiRepository$createPaymentMethod$1;
        if (continuation instanceof StripeApiRepository$createPaymentMethod$1) {
            stripeApiRepository$createPaymentMethod$1 = (StripeApiRepository$createPaymentMethod$1) continuation;
            int i = stripeApiRepository$createPaymentMethod$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createPaymentMethod$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createPaymentMethod$1 = new StripeApiRepository$createPaymentMethod$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$createPaymentMethod$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String paymentMethodsUrl$payments_core_release = INSTANCE.getPaymentMethodsUrl$payments_core_release();
        Map mapPlus = MapsKt.plus(paymentMethodCreateParams.toParamMap(), buildPaymentUserAgentPair(paymentMethodCreateParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, paymentMethodsUrl$payments_core_release, options, MapsKt.plus(mapPlus, params), false, 8, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createPaymentMethod$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26897invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26897invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createPaymentMethodCreation$payments_core_release(paymentMethodCreateParams.getCode(), paymentMethodCreateParams.getAttribution()));
            }
        };
        stripeApiRepository$createPaymentMethod$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$createPaymentMethod$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createToken-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26879createToken0E7RQCE(final TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Result<Token>> continuation) {
        StripeApiRepository$createToken$1 stripeApiRepository$createToken$1;
        if (continuation instanceof StripeApiRepository$createToken$1) {
            stripeApiRepository$createToken$1 = (StripeApiRepository$createToken$1) continuation;
            int i = stripeApiRepository$createToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createToken$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createToken$1 = new StripeApiRepository$createToken$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createToken$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$createToken$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String tokensUrl$payments_core_release = INSTANCE.getTokensUrl$payments_core_release();
        Map mapPlus = MapsKt.plus(tokenParams.toParamMap(), buildPaymentUserAgentPair(tokenParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, tokensUrl$payments_core_release, options, MapsKt.plus(mapPlus, params), false, 8, null);
        TokenJsonParser tokenJsonParser = new TokenJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createToken$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26900invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26900invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createTokenCreation$payments_core_release(tokenParams.getAttribution(), tokenParams.getTokenType()));
            }
        };
        stripeApiRepository$createToken$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, tokenJsonParser, function1, stripeApiRepository$createToken$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: getFpxBankStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26881getFpxBankStatusgIAlus(ApiRequest.Options options, Continuation<? super Result<BankStatuses>> continuation) {
        StripeApiRepository$getFpxBankStatus$1 stripeApiRepository$getFpxBankStatus$1;
        if (continuation instanceof StripeApiRepository$getFpxBankStatus$1) {
            stripeApiRepository$getFpxBankStatus$1 = (StripeApiRepository$getFpxBankStatus$1) continuation;
            int i = stripeApiRepository$getFpxBankStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getFpxBankStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$getFpxBankStatus$1 = new StripeApiRepository$getFpxBankStatus$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$getFpxBankStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$getFpxBankStatus$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getApiUrl("fpx/bank_statuses"), ApiRequest.Options.copy$default(options, null, null, null, 5, null), MapsKt.mapOf(Tuples4.m3642to("account_holder_type", "individual")), false, 8, null);
        FpxBankStatusesJsonParser fpxBankStatusesJsonParser = new FpxBankStatusesJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26902invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26902invoke(Object obj2) {
                this.this$0.fireAnalyticsRequest(PaymentAnalyticsEvent.FpxBankStatusesRetrieve);
            }
        };
        stripeApiRepository$getFpxBankStatus$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, fpxBankStatusesJsonParser, function1, stripeApiRepository$getFpxBankStatus$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: getCardMetadata-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26880getCardMetadata0E7RQCE(Bin bin, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation) {
        StripeApiRepository$getCardMetadata$1 stripeApiRepository$getCardMetadata$1;
        Object objM26864fetchStripeModelResultBWLJW6A$default;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$getCardMetadata$1) {
            stripeApiRepository$getCardMetadata$1 = (StripeApiRepository$getCardMetadata$1) continuation;
            int i = stripeApiRepository$getCardMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getCardMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$getCardMetadata$1 = new StripeApiRepository$getCardMetadata$1(this, continuation);
            }
        }
        StripeApiRepository$getCardMetadata$1 stripeApiRepository$getCardMetadata$12 = stripeApiRepository$getCardMetadata$1;
        Object obj = stripeApiRepository$getCardMetadata$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$getCardMetadata$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getEdgeUrl("card-metadata"), ApiRequest.Options.copy$default(options, null, null, null, 5, null), MapsKt.mapOf(Tuples4.m3642to("key", options.getApiKey()), Tuples4.m3642to("bin_prefix", bin.getValue())), false, 8, null);
            CardMetadataJsonParser cardMetadataJsonParser = new CardMetadataJsonParser(bin);
            stripeApiRepository$getCardMetadata$12.L$0 = this;
            stripeApiRepository$getCardMetadata$12.label = 1;
            objM26864fetchStripeModelResultBWLJW6A$default = m26864fetchStripeModelResultBWLJW6A$default(this, apiRequestCreateGet$default, cardMetadataJsonParser, null, stripeApiRepository$getCardMetadata$12, 4, null);
            if (objM26864fetchStripeModelResultBWLJW6A$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            stripeApiRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StripeApiRepository stripeApiRepository2 = (StripeApiRepository) stripeApiRepository$getCardMetadata$12.L$0;
            ResultKt.throwOnFailure(obj);
            objM26864fetchStripeModelResultBWLJW6A$default = ((Result) obj).getValue();
            stripeApiRepository = stripeApiRepository2;
        }
        if (Result.m28553exceptionOrNullimpl(objM26864fetchStripeModelResultBWLJW6A$default) != null) {
            stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.CardMetadataLoadFailure);
        }
        return objM26864fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: start3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26888start3ds2Auth0E7RQCE(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        StripeApiRepository$start3ds2Auth$1 stripeApiRepository$start3ds2Auth$1;
        if (continuation instanceof StripeApiRepository$start3ds2Auth$1) {
            stripeApiRepository$start3ds2Auth$1 = (StripeApiRepository$start3ds2Auth$1) continuation;
            int i = stripeApiRepository$start3ds2Auth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$start3ds2Auth$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$start3ds2Auth$1 = new StripeApiRepository$start3ds2Auth$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$start3ds2Auth$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$start3ds2Auth$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getApiUrl("3ds2/authenticate"), options, stripe3ds2AuthParams.toParamMap(), false, 8, null);
        Stripe3ds2AuthResultJsonParser stripe3ds2AuthResultJsonParser = new Stripe3ds2AuthResultJsonParser();
        Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$start3ds2Auth$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26907invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26907invoke(Object obj2) {
                StripeApiRepository stripeApiRepository = this.this$0;
                stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Start, null, null, null, null, null, 62, null));
            }
        };
        stripeApiRepository$start3ds2Auth$1.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, stripe3ds2AuthResultJsonParser, function1, stripeApiRepository$start3ds2Auth$1);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: complete3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26871complete3ds2Auth0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        StripeApiRepository$complete3ds2Auth$1 stripeApiRepository$complete3ds2Auth$1;
        if (continuation instanceof StripeApiRepository$complete3ds2Auth$1) {
            stripeApiRepository$complete3ds2Auth$1 = (StripeApiRepository$complete3ds2Auth$1) continuation;
            int i = stripeApiRepository$complete3ds2Auth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$complete3ds2Auth$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$complete3ds2Auth$1 = new StripeApiRepository$complete3ds2Auth$1(this, continuation);
            }
        }
        StripeApiRepository$complete3ds2Auth$1 stripeApiRepository$complete3ds2Auth$12 = stripeApiRepository$complete3ds2Auth$1;
        Object obj = stripeApiRepository$complete3ds2Auth$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$complete3ds2Auth$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getApiUrl("3ds2/challenge_complete"), options, MapsKt.mapOf(Tuples4.m3642to("source", str)), false, 8, null);
        Stripe3ds2AuthResultJsonParser stripe3ds2AuthResultJsonParser = new Stripe3ds2AuthResultJsonParser();
        stripeApiRepository$complete3ds2Auth$12.label = 1;
        Object objM26864fetchStripeModelResultBWLJW6A$default = m26864fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, stripe3ds2AuthResultJsonParser, null, stripeApiRepository$complete3ds2Auth$12, 4, null);
        return objM26864fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM26864fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (r13 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #1 {all -> 0x004d, blocks: (B:20:0x0049, B:32:0x006e, B:34:0x0076, B:35:0x007d), top: B:58:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:20:0x0049, B:32:0x006e, B:34:0x0076, B:35:0x007d), top: B:58:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002a, B:46:0x00d2, B:43:0x009a), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createRadarSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26877createRadarSessiongIAlus(ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation) {
        StripeApiRepository$createRadarSession$1 stripeApiRepository$createRadarSession$1;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        final StripeApiRepository stripeApiRepository;
        Object objM28550constructorimpl2;
        Object objM26863fetchStripeModelResultBWLJW6A;
        if (continuation instanceof StripeApiRepository$createRadarSession$1) {
            stripeApiRepository$createRadarSession$1 = (StripeApiRepository$createRadarSession$1) continuation;
            int i = stripeApiRepository$createRadarSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createRadarSession$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createRadarSession$1 = new StripeApiRepository$createRadarSession$1(this, continuation);
            }
        }
        StripeApiRepository$createRadarSession$1 stripeApiRepository$createRadarSession$12 = stripeApiRepository$createRadarSession$1;
        Object latest = stripeApiRepository$createRadarSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$createRadarSession$12.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(latest);
            try {
                Result.Companion companion2 = Result.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                stripeApiRepository = this;
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                ApiRequest.Options options2 = options;
                if (Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
                }
            }
            if (!Stripe.INSTANCE.getAdvancedFraudSignalsEnabled()) {
                throw new IllegalArgumentException("Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session.");
            }
            FraudDetectionDataRepository fraudDetectionDataRepository = this.fraudDetectionDataRepository;
            stripeApiRepository$createRadarSession$12.L$0 = this;
            stripeApiRepository$createRadarSession$12.L$1 = options;
            stripeApiRepository$createRadarSession$12.label = 1;
            latest = fraudDetectionDataRepository.getLatest(stripeApiRepository$createRadarSession$12);
            if (latest != coroutine_suspended) {
                stripeApiRepository = this;
                if (latest == null) {
                }
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latest);
            objM26863fetchStripeModelResultBWLJW6A = ((Result) latest).getValue();
            objM28550constructorimpl = Result.m28550constructorimpl(Result.m28549boximpl(objM26863fetchStripeModelResultBWLJW6A));
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                objM28550constructorimpl = Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(StripeException.INSTANCE.create(thM28553exceptionOrNullimpl))));
            }
            return ((Result) objM28550constructorimpl).getValue();
        }
        options = (ApiRequest.Options) stripeApiRepository$createRadarSession$12.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$createRadarSession$12.L$0;
        try {
            ResultKt.throwOnFailure(latest);
            if (latest == null) {
                objM28550constructorimpl2 = Result.m28550constructorimpl((FraudDetectionData) latest);
            } else {
                throw new IllegalArgumentException("Could not obtain fraud data required to create a Radar Session.");
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion32 = Result.INSTANCE;
            objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
            ApiRequest.Options options22 = options;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
            }
        }
        ApiRequest.Options options222 = options;
        if (Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(stripeApiRepository.apiRequestFactory, INSTANCE.getApiUrl("radar/session"), options222, MapsKt.plus(((FraudDetectionData) objM28550constructorimpl2).getParams(), buildPaymentUserAgentPair$default(stripeApiRepository, null, 1, null)), false, 8, null);
            RadarSessionWithHCaptchaJsonParser radarSessionWithHCaptchaJsonParser = new RadarSessionWithHCaptchaJsonParser();
            Function1<Result<? extends StripeResponse<String>>, Unit> function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createRadarSession$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                    m26898invoke(result.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26898invoke(Object obj) {
                    StripeApiRepository stripeApiRepository2 = this.this$0;
                    stripeApiRepository2.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository2.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.RadarSessionCreate, null, null, null, null, null, 62, null));
                }
            };
            stripeApiRepository$createRadarSession$12.L$0 = null;
            stripeApiRepository$createRadarSession$12.L$1 = null;
            stripeApiRepository$createRadarSession$12.label = 2;
            objM26863fetchStripeModelResultBWLJW6A = stripeApiRepository.m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, radarSessionWithHCaptchaJsonParser, function1, stripeApiRepository$createRadarSession$12);
        } else {
            objM28550constructorimpl = Result.m28550constructorimpl(objM28550constructorimpl2);
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
            return ((Result) objM28550constructorimpl).getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachHCaptchaToRadarSession-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26868attachHCaptchaToRadarSessionyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation) {
        StripeApiRepository$attachHCaptchaToRadarSession$1 stripeApiRepository$attachHCaptchaToRadarSession$1;
        Map mapEmptyMap;
        if (continuation instanceof StripeApiRepository$attachHCaptchaToRadarSession$1) {
            stripeApiRepository$attachHCaptchaToRadarSession$1 = (StripeApiRepository$attachHCaptchaToRadarSession$1) continuation;
            int i = stripeApiRepository$attachHCaptchaToRadarSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$attachHCaptchaToRadarSession$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$attachHCaptchaToRadarSession$1 = new StripeApiRepository$attachHCaptchaToRadarSession$1(this, continuation);
            }
        }
        StripeApiRepository$attachHCaptchaToRadarSession$1 stripeApiRepository$attachHCaptchaToRadarSession$12 = stripeApiRepository$attachHCaptchaToRadarSession$1;
        Object obj = stripeApiRepository$attachHCaptchaToRadarSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$attachHCaptchaToRadarSession$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        String apiUrl = INSTANCE.getApiUrl("radar/session/%s/attach_hcaptcha_token", str);
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("passive_captcha_token", str2));
        if (str3 == null || (mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to("passive_captcha_ekey", str3))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, apiUrl, options, MapsKt.plus(mapMapOf, mapEmptyMap), false, 8, null);
        RadarSessionWithHCaptchaJsonParser radarSessionWithHCaptchaJsonParser = new RadarSessionWithHCaptchaJsonParser();
        stripeApiRepository$attachHCaptchaToRadarSession$12.label = 1;
        Object objM26864fetchStripeModelResultBWLJW6A$default = m26864fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, radarSessionWithHCaptchaJsonParser, null, stripeApiRepository$attachHCaptchaToRadarSession$12, 4, null);
        return objM26864fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM26864fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createFinancialConnectionsSessionForDeferredPayments-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        C42550xeff0df61 c42550xeff0df61;
        if (continuation instanceof C42550xeff0df61) {
            c42550xeff0df61 = (C42550xeff0df61) continuation;
            int i = c42550xeff0df61.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42550xeff0df61.label = i - Integer.MIN_VALUE;
            } else {
                c42550xeff0df61 = new C42550xeff0df61(this, continuation);
            }
        }
        Object obj = c42550xeff0df61.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42550xeff0df61.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getDeferredFinancialConnectionsSessionUrl$payments_core_release(), options, createFinancialConnectionsSessionForDeferredPaymentParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        C42551xeff0df62 c42551xeff0df62 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26895invoke(Object obj2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26895invoke(result.getValue());
                return Unit.INSTANCE;
            }
        };
        c42550xeff0df61.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, c42551xeff0df62, c42550xeff0df61);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createPaymentIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        C42552x68e7465e c42552x68e7465e;
        if (continuation instanceof C42552x68e7465e) {
            c42552x68e7465e = (C42552x68e7465e) continuation;
            int i = c42552x68e7465e.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42552x68e7465e.label = i - Integer.MIN_VALUE;
            } else {
                c42552x68e7465e = new C42552x68e7465e(this, continuation);
            }
        }
        Object obj = c42552x68e7465e.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42552x68e7465e.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, m3158x96f9dba6(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        C42553x68e7465f c42553x68e7465f = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createPaymentIntentFinancialConnectionsSession$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26896invoke(Object obj2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26896invoke(result.getValue());
                return Unit.INSTANCE;
            }
        };
        c42552x68e7465e.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, c42553x68e7465f, c42552x68e7465e);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createSetupIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26878createSetupIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        C42554x3fe640c7 c42554x3fe640c7;
        if (continuation instanceof C42554x3fe640c7) {
            c42554x3fe640c7 = (C42554x3fe640c7) continuation;
            int i = c42554x3fe640c7.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42554x3fe640c7.label = i - Integer.MIN_VALUE;
            } else {
                c42554x3fe640c7 = new C42554x3fe640c7(this, continuation);
            }
        }
        Object obj = c42554x3fe640c7.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42554x3fe640c7.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, m3159x5bc85bdd(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        C42555x3fe640c8 c42555x3fe640c8 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$createSetupIntentFinancialConnectionsSession$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26899invoke(Object obj2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26899invoke(result.getValue());
                return Unit.INSTANCE;
            }
        };
        c42554x3fe640c7.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, c42555x3fe640c8, c42554x3fe640c7);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* renamed from: getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release */
    public final /* synthetic */ String m3158x96f9dba6(String paymentIntentId) {
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        return INSTANCE.getApiUrl("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    /* renamed from: getSetupIntentFinancialConnectionsSessionUrl$payments_core_release */
    public final /* synthetic */ String m3159x5bc85bdd(String setupIntentId) {
        Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
        return INSTANCE.getApiUrl("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        C42546xdc89549c c42546xdc89549c;
        if (continuation instanceof C42546xdc89549c) {
            c42546xdc89549c = (C42546xdc89549c) continuation;
            int i = c42546xdc89549c.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42546xdc89549c.label = i - Integer.MIN_VALUE;
            } else {
                c42546xdc89549c = new C42546xdc89549c(this, continuation);
            }
        }
        Object obj = c42546xdc89549c.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42546xdc89549c.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = INSTANCE;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion.m3160x3818cccc(str2, str3), options, MapsKt.plus(MapsKt.mapOf(Tuples4.m3642to("client_secret", str)), companion.createExpandParam(list)), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        C42547xdc89549d c42547xdc89549d = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26889invoke(Object obj2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26889invoke(result.getValue());
                return Unit.INSTANCE;
            }
        };
        c42546xdc89549c.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, c42547xdc89549d, c42546xdc89549c);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachFinancialConnectionsSessionToSetupIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        C42548x126ea553 c42548x126ea553;
        if (continuation instanceof C42548x126ea553) {
            c42548x126ea553 = (C42548x126ea553) continuation;
            int i = c42548x126ea553.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c42548x126ea553.label = i - Integer.MIN_VALUE;
            } else {
                c42548x126ea553 = new C42548x126ea553(this, continuation);
            }
        }
        Object obj = c42548x126ea553.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c42548x126ea553.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = INSTANCE;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion.m3161x1508b7f5(str2, str3), options, MapsKt.plus(MapsKt.mapOf(Tuples4.m3642to("client_secret", str)), companion.createExpandParam(list)), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        C42549x126ea554 c42549x126ea554 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26890invoke(Object obj2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                m26890invoke(result.getValue());
                return Unit.INSTANCE;
            }
        };
        c42548x126ea553.label = 1;
        Object objM26863fetchStripeModelResultBWLJW6A = m26863fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, c42549x126ea554, c42548x126ea553);
        return objM26863fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM26863fetchStripeModelResultBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveCardElementConfig-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26884retrieveCardElementConfig0E7RQCE(ApiRequest.Options options, Map<String, String> map, Continuation<? super Result<MobileCardElementConfig>> continuation) {
        StripeApiRepository$retrieveCardElementConfig$1 stripeApiRepository$retrieveCardElementConfig$1;
        if (continuation instanceof StripeApiRepository$retrieveCardElementConfig$1) {
            stripeApiRepository$retrieveCardElementConfig$1 = (StripeApiRepository$retrieveCardElementConfig$1) continuation;
            int i = stripeApiRepository$retrieveCardElementConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveCardElementConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveCardElementConfig$1 = new StripeApiRepository$retrieveCardElementConfig$1(this, continuation);
            }
        }
        StripeApiRepository$retrieveCardElementConfig$1 stripeApiRepository$retrieveCardElementConfig$12 = stripeApiRepository$retrieveCardElementConfig$1;
        Object obj = stripeApiRepository$retrieveCardElementConfig$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$retrieveCardElementConfig$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getMobileCardElementConfigUrl$payments_core_release(), options, map, false, 8, null);
        MobileCardElementConfigParser mobileCardElementConfigParser = new MobileCardElementConfigParser();
        stripeApiRepository$retrieveCardElementConfig$12.label = 1;
        Object objM26864fetchStripeModelResultBWLJW6A$default = m26864fetchStripeModelResultBWLJW6A$default(this, apiRequestCreateGet$default, mobileCardElementConfigParser, null, stripeApiRepository$retrieveCardElementConfig$12, 4, null);
        return objM26864fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM26864fetchStripeModelResultBWLJW6A$default;
    }

    private final void handleApiError(StripeResponse<String> response) throws CardException, InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        RequestId requestId = response.getRequestId();
        String value = requestId != null ? requestId.getValue() : null;
        int code = response.getCode();
        StripeError stripeErrorWithLocalizedMessage = StripeErrorMapping.withLocalizedMessage(new StripeErrorJsonParser().parse(ResponseJson.responseJson(response)), this.context);
        if (code != 429) {
            switch (code) {
                case 400:
                case 404:
                    throw new InvalidRequestException(stripeErrorWithLocalizedMessage, value, code, null, null, 24, null);
                case 401:
                    throw new AuthenticationException(stripeErrorWithLocalizedMessage, value);
                case 402:
                    throw new CardException(stripeErrorWithLocalizedMessage, value);
                case HttpStatusCode.FORBIDDEN /* 403 */:
                    throw new PermissionException(stripeErrorWithLocalizedMessage, value);
                default:
                    throw new APIException(stripeErrorWithLocalizedMessage, value, code, null, null, 24, null);
            }
        }
        throw new RateLimitException(stripeErrorWithLocalizedMessage, value, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: fetchStripeModelResult-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ModelType extends StripeModel> Object m26863fetchStripeModelResultBWLJW6A(ApiRequest apiRequest, ModelJsonParser<? extends ModelType> modelJsonParser, Function1<? super Result<StripeResponse<String>>, Unit> function1, Continuation<? super Result<? extends ModelType>> continuation) {
        StripeApiRepository$fetchStripeModelResult$1 stripeApiRepository$fetchStripeModelResult$1;
        if (continuation instanceof StripeApiRepository$fetchStripeModelResult$1) {
            stripeApiRepository$fetchStripeModelResult$1 = (StripeApiRepository$fetchStripeModelResult$1) continuation;
            int i = stripeApiRepository$fetchStripeModelResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$fetchStripeModelResult$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$fetchStripeModelResult$1 = new StripeApiRepository$fetchStripeModelResult$1(this, continuation);
            }
        }
        Object objMakeApiRequest$payments_core_release = stripeApiRepository$fetchStripeModelResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$fetchStripeModelResult$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
                Result.Companion companion = Result.INSTANCE;
                stripeApiRepository$fetchStripeModelResult$1.L$0 = modelJsonParser;
                stripeApiRepository$fetchStripeModelResult$1.label = 1;
                objMakeApiRequest$payments_core_release = makeApiRequest$payments_core_release(apiRequest, function1, stripeApiRepository$fetchStripeModelResult$1);
                if (objMakeApiRequest$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                modelJsonParser = (ModelJsonParser) stripeApiRepository$fetchStripeModelResult$1.L$0;
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
            }
            StripeModel stripeModel = modelJsonParser.parse(ResponseJson.responseJson((StripeResponse) objMakeApiRequest$payments_core_release));
            if (stripeModel != null) {
                return Result.m28550constructorimpl(stripeModel);
            }
            throw new APIException(null, null, 0, "Unable to parse response with " + modelJsonParser.getClass().getSimpleName(), null, 23, null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: fetchStripeModelResult-BWLJW6A$default, reason: not valid java name */
    static /* synthetic */ Object m26864fetchStripeModelResultBWLJW6A$default(StripeApiRepository stripeApiRepository, ApiRequest apiRequest, ModelJsonParser modelJsonParser, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1<Result<? extends StripeResponse<String>>, Unit>() { // from class: com.stripe.android.networking.StripeApiRepository$fetchStripeModelResult$2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26901invoke(Object obj2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends StripeResponse<String>> result) {
                    m26901invoke(result.getValue());
                    return Unit.INSTANCE;
                }
            };
        }
        return stripeApiRepository.m26863fetchStripeModelResultBWLJW6A(apiRequest, modelJsonParser, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeApiRequest$payments_core_release(ApiRequest apiRequest, Function1<? super Result<StripeResponse<String>>, Unit> function1, Continuation<? super StripeResponse<String>> continuation) throws Throwable {
        StripeApiRepository$makeApiRequest$1 stripeApiRepository$makeApiRequest$1;
        DnsCacheData dnsCacheDataDisableDnsCache;
        StripeApiRepository stripeApiRepository;
        Object objExecuteRequest;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$makeApiRequest$1) {
            stripeApiRepository$makeApiRequest$1 = (StripeApiRepository$makeApiRequest$1) continuation;
            int i = stripeApiRepository$makeApiRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$makeApiRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$makeApiRequest$1 = new StripeApiRepository$makeApiRequest$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$makeApiRequest$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$makeApiRequest$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            dnsCacheDataDisableDnsCache = disableDnsCache();
            try {
                Result.Companion companion = Result.INSTANCE;
                StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
                stripeApiRepository$makeApiRequest$1.L$0 = this;
                stripeApiRepository$makeApiRequest$1.L$1 = apiRequest;
                stripeApiRepository$makeApiRequest$1.L$2 = function1;
                stripeApiRepository$makeApiRequest$1.L$3 = dnsCacheDataDisableDnsCache;
                stripeApiRepository$makeApiRequest$1.label = 1;
                objExecuteRequest = stripeNetworkClient.executeRequest(apiRequest, stripeApiRepository$makeApiRequest$1);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeApiRepository = this;
                objM28550constructorimpl = Result.m28550constructorimpl((StripeResponse) objExecuteRequest);
            } catch (Throwable th) {
                th = th;
                stripeApiRepository = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                function1.invoke(Result.m28549boximpl(objM28550constructorimpl));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DnsCacheData dnsCacheData = (DnsCacheData) stripeApiRepository$makeApiRequest$1.L$3;
            function1 = (Function1) stripeApiRepository$makeApiRequest$1.L$2;
            ApiRequest apiRequest2 = (ApiRequest) stripeApiRepository$makeApiRequest$1.L$1;
            StripeApiRepository stripeApiRepository2 = (StripeApiRepository) stripeApiRepository$makeApiRequest$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                dnsCacheDataDisableDnsCache = dnsCacheData;
                apiRequest = apiRequest2;
                stripeApiRepository = stripeApiRepository2;
                objExecuteRequest = obj;
                try {
                    objM28550constructorimpl = Result.m28550constructorimpl((StripeResponse) objExecuteRequest);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    function1.invoke(Result.m28549boximpl(objM28550constructorimpl));
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl == null) {
                    }
                }
            } catch (Throwable th3) {
                dnsCacheDataDisableDnsCache = dnsCacheData;
                apiRequest = apiRequest2;
                stripeApiRepository = stripeApiRepository2;
                th = th3;
                Result.Companion companion222 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                function1.invoke(Result.m28549boximpl(objM28550constructorimpl));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl == null) {
                }
            }
        }
        function1.invoke(Result.m28549boximpl(objM28550constructorimpl));
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            if (thM28553exceptionOrNullimpl instanceof IOException) {
                throw APIConnectionException.INSTANCE.create((IOException) thM28553exceptionOrNullimpl, apiRequest.getBaseUrl());
            }
            throw thM28553exceptionOrNullimpl;
        }
        StripeResponse<String> stripeResponse = (StripeResponse) objM28550constructorimpl;
        if (stripeResponse.getIsError()) {
            stripeApiRepository.handleApiError(stripeResponse);
        }
        stripeApiRepository.resetDnsCache(dnsCacheDataDisableDnsCache);
        return stripeResponse;
    }

    private final DnsCacheData disableDnsCache() {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = Security.getProperty("networkaddress.cache.ttl");
            Security.setProperty("networkaddress.cache.ttl", "0");
            objM28550constructorimpl = Result.m28550constructorimpl(new DnsCacheData.Success(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        DnsCacheData.Failure failure = DnsCacheData.Failure.INSTANCE;
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = failure;
        }
        return (DnsCacheData) objM28550constructorimpl;
    }

    private final void resetDnsCache(DnsCacheData dnsCacheData) {
        if (dnsCacheData instanceof DnsCacheData.Success) {
            String originalDnsCacheTtl = ((DnsCacheData.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty("networkaddress.cache.ttl", originalDnsCacheTtl);
        }
    }

    private final void fireFraudDetectionDataRequest() {
        this.fraudDetectionDataRepository.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireAnalyticsRequest(PaymentAnalyticsEvent event) {
        fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, event, null, null, null, null, null, 62, null));
    }

    public final void fireAnalyticsRequest$payments_core_release(AnalyticsRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.analyticsRequestExecutor.executeAsync(params);
    }

    private final Map<String, Object> createClientSecretParam(String clientSecret, List<String> expandFields) {
        return MapsKt.plus(MapsKt.mapOf(Tuples4.m3642to("client_secret", clientSecret)), INSTANCE.createExpandParam(expandFields));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Tuples2 buildPaymentUserAgentPair$default(StripeApiRepository stripeApiRepository, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt.emptySet();
        }
        return stripeApiRepository.buildPaymentUserAgentPair(set);
    }

    private final Tuples2<String, String> buildPaymentUserAgentPair(Set<String> attribution) {
        return Tuples4.m3642to("payment_user_agent", buildPaymentUserAgent(attribution));
    }

    public String buildPaymentUserAgent(Set<String> attribution) {
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        return CollectionsKt.joinToString$default(SetsKt.plus(SetsKt.plus(SetsKt.setOf("stripe-android/20.50.0"), (Iterable) this.productUsageTokens), (Iterable) attribution), ";", null, null, 0, null, null, 62, null);
    }

    static /* synthetic */ Map maybeAddPaymentUserAgent$default(StripeApiRepository stripeApiRepository, Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams, int i, Object obj) {
        if ((i & 4) != 0) {
            sourceParams = null;
        }
        return stripeApiRepository.maybeAddPaymentUserAgent(map, paymentMethodCreateParams, sourceParams);
    }

    private final Map<String, Object> maybeAddPaymentUserAgent(Map<String, ? extends Object> params, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Set<String> setEmptySet;
        Set setEmptySet2;
        Object obj = params.get("payment_method_data");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            if (paymentMethodCreateParams == null || (setEmptySet2 = paymentMethodCreateParams.getAttribution()) == null) {
                setEmptySet2 = SetsKt.emptySet();
            }
            Map<String, Object> mapPlus = MapsKt.plus(params, Tuples4.m3642to("payment_method_data", MapsKt.plus(map, buildPaymentUserAgentPair(setEmptySet2))));
            if (mapPlus != null) {
                return mapPlus;
            }
        }
        Object obj2 = params.get("source_data");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 == null) {
            return params;
        }
        if (sourceParams == null || (setEmptySet = sourceParams.getAttribution$payments_core_release()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        return MapsKt.plus(params, Tuples4.m3642to("source_data", MapsKt.plus(map2, buildPaymentUserAgentPair(setEmptySet))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: maybeForDashboard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26865maybeForDashboard0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<ConfirmPaymentIntentParams>> continuation) {
        StripeApiRepository$maybeForDashboard$1 stripeApiRepository$maybeForDashboard$1;
        Object objMo26876createPaymentMethod0E7RQCE;
        if (continuation instanceof StripeApiRepository$maybeForDashboard$1) {
            stripeApiRepository$maybeForDashboard$1 = (StripeApiRepository$maybeForDashboard$1) continuation;
            int i = stripeApiRepository$maybeForDashboard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$maybeForDashboard$1.label = i - Integer.MIN_VALUE;
            } else {
                stripeApiRepository$maybeForDashboard$1 = new StripeApiRepository$maybeForDashboard$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$maybeForDashboard$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$maybeForDashboard$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!options.getApiKeyIsUserKey() || confirmPaymentIntentParams.getPaymentMethodCreateParams() == null) {
                return Result.m28550constructorimpl(confirmPaymentIntentParams);
            }
            PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
            stripeApiRepository$maybeForDashboard$1.L$0 = confirmPaymentIntentParams;
            stripeApiRepository$maybeForDashboard$1.label = 1;
            objMo26876createPaymentMethod0E7RQCE = mo26876createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, stripeApiRepository$maybeForDashboard$1);
            if (objMo26876createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmPaymentIntentParams = (ConfirmPaymentIntentParams) stripeApiRepository$maybeForDashboard$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo26876createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        if (!Result.m28556isSuccessimpl(objMo26876createPaymentMethod0E7RQCE)) {
            return Result.m28550constructorimpl(objMo26876createPaymentMethod0E7RQCE);
        }
        try {
            ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.INSTANCE;
            String clientSecret = confirmPaymentIntentParams.getClientSecret();
            String str = ((PaymentMethod) objMo26876createPaymentMethod0E7RQCE).id;
            Intrinsics.checkNotNull(str);
            return Result.m28550constructorimpl(companion.createForDashboard$payments_core_release(clientSecret, str, confirmPaymentIntentParams.getPaymentMethodOptions()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getErrorMessage(Object obj) {
        Object objM28550constructorimpl;
        StripeResponse<String> stripeResponse = (StripeResponse) (Result.m28555isFailureimpl(obj) ? null : obj);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl != null) {
            return ExceptionUtils2.getSafeAnalyticsMessage(thM28553exceptionOrNullimpl);
        }
        if (stripeResponse == null || !stripeResponse.getIsError()) {
            return null;
        }
        try {
            handleApiError(stripeResponse);
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl2 != null) {
            return ExceptionUtils2.getSafeAnalyticsMessage(thM28553exceptionOrNullimpl2);
        }
        return null;
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "()V", "Failure", "Success", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static abstract class DnsCacheData {
        public /* synthetic */ DnsCacheData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DnsCacheData() {
        }

        /* compiled from: StripeApiRepository.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "originalDnsCacheTtl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOriginalDnsCacheTtl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Success extends DnsCacheData {
            private final String originalDnsCacheTtl;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.originalDnsCacheTtl, ((Success) other).originalDnsCacheTtl);
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.originalDnsCacheTtl + ")";
            }

            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public Success(String str) {
                super(null);
                this.originalDnsCacheTtl = str;
            }
        }

        /* compiled from: StripeApiRepository.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends DnsCacheData {
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failure);
            }

            public int hashCode() {
                return 2054089437;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
                super(null);
            }
        }
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b'\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\nJ/\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010\nJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\"\u0010\nJ\u001f\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0001¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0001¢\u0006\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u00100\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0014\u00102\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00104¨\u00066"}, m3636d2 = {"Lcom/stripe/android/networking/StripeApiRepository$Companion;", "", "<init>", "()V", "", "path", "", "args", "getApiUrl", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "getEdgeUrl", "getMerchantUiUrl", "", "expandFields", "", "createExpandParam", "(Ljava/util/List;)Ljava/util/Map;", "paymentIntentId", "getRetrievePaymentIntentUrl$payments_core_release", "getRetrievePaymentIntentUrl", "getRefreshPaymentIntentUrl$payments_core_release", "getRefreshPaymentIntentUrl", "getRefreshSetupIntentUrl$payments_core_release", "getRefreshSetupIntentUrl", "getConfirmPaymentIntentUrl$payments_core_release", "getConfirmPaymentIntentUrl", "getCancelPaymentIntentSourceUrl$payments_core_release", "getCancelPaymentIntentSourceUrl", "setupIntentId", "getRetrieveSetupIntentUrl$payments_core_release", "getRetrieveSetupIntentUrl", "getConfirmSetupIntentUrl$payments_core_release", "getConfirmSetupIntentUrl", "getCancelSetupIntentSourceUrl$payments_core_release", "getCancelSetupIntentSourceUrl", "financialConnectionsSessionId", "getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getAttachFinancialConnectionsSessionToPaymentIntentUrl", "getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release", "getAttachFinancialConnectionsSessionToSetupIntentUrl", "getTokensUrl$payments_core_release", "()Ljava/lang/String;", "tokensUrl", "getPaymentMethodsUrl$payments_core_release", "paymentMethodsUrl", "getDeferredFinancialConnectionsSessionUrl$payments_core_release", "deferredFinancialConnectionsSessionUrl", "getMobileCardElementConfigUrl$payments_core_release", "mobileCardElementConfigUrl", "DNS_CACHE_TTL_PROPERTY_NAME", "Ljava/lang/String;", "PAYMENT_USER_AGENT", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ String getTokensUrl$payments_core_release() {
            return getApiUrl("tokens");
        }

        public final /* synthetic */ String getPaymentMethodsUrl$payments_core_release() {
            return getApiUrl("payment_methods");
        }

        public final /* synthetic */ String getDeferredFinancialConnectionsSessionUrl$payments_core_release() {
            return getApiUrl("connections/link_account_sessions_for_deferred_payment");
        }

        public final String getMobileCardElementConfigUrl$payments_core_release() {
            return getMerchantUiUrl("mobile-card-element-config");
        }

        public final /* synthetic */ String getRetrievePaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String getRefreshPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getRefreshSetupIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getConfirmPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String getCancelPaymentIntentSourceUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String getConfirmSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String getCancelSetupIntentSourceUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/source_cancel", setupIntentId);
        }

        /* renamed from: getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release */
        public final /* synthetic */ String m3160x3818cccc(String paymentIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        /* renamed from: getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release */
        public final /* synthetic */ String m3161x1508b7f5(String setupIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String path, Object... args) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ENGLISH;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(locale, path, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return getApiUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String path) {
            return "https://api.stripe.com/v1/" + path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEdgeUrl(String path) {
            return "https://api.stripe.com/edge-internal/" + path;
        }

        private final String getMerchantUiUrl(String path) {
            return "https://merchant-ui-api.stripe.com/elements/" + path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, List<String>> createExpandParam(List<String> expandFields) {
            if (expandFields.isEmpty()) {
                expandFields = null;
            }
            Map<String, List<String>> mapMapOf = expandFields != null ? MapsKt.mapOf(Tuples4.m3642to(AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_EXPAND, expandFields)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }
    }
}

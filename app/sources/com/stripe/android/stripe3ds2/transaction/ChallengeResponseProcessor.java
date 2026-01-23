package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.robinhood.models.api.ErrorResponse;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChallengeResponseProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ChallengeResponseProcessor {
    Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeResponseProcessor.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0015H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "secretKey", "Ljavax/crypto/SecretKey;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljavax/crypto/SecretKey;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "createErrorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "code", "", "description", "", ErrorResponse.DETAIL, "getResponsePayload", "Lorg/json/JSONObject;", "responseBody", "isMessageVersionCorrect", "", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "isValidChallengeResponse", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processPayload", "payload", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Default implements ChallengeResponseProcessor {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;
        private final SecretKey secretKey;

        public Default(MessageTransformer messageTransformer, SecretKey secretKey, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.secretKey = secretKey;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor
        public Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation) {
            Object objM28550constructorimpl;
            if (httpResponse.getIsJsonContentType()) {
                JSONObject jSONObject = new JSONObject(httpResponse.getContent());
                ErrorData.Companion companion = ErrorData.INSTANCE;
                if (companion.isErrorMessage$3ds2sdk_release(jSONObject)) {
                    return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(jSONObject));
                }
                return new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(getResponsePayload(httpResponse.getContent()));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                this.errorReporter.reportError(new RuntimeException(StringsKt.trimIndent("\n                            Failed to process challenge response.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                            "), thM28553exceptionOrNullimpl));
            }
            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl2 == null) {
                return processPayload(challengeRequestData, (JSONObject) objM28550constructorimpl);
            }
            ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
            int code = protocolError.getCode();
            String description = protocolError.getDescription();
            String message = thM28553exceptionOrNullimpl2.getMessage();
            if (message == null) {
                message = "";
            }
            return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, code, description, message));
        }

        public final ChallengeRequestResult processPayload(ChallengeRequestData creqData, JSONObject payload) {
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(payload, "payload");
            ErrorData.Companion companion = ErrorData.INSTANCE;
            if (companion.isErrorMessage$3ds2sdk_release(payload)) {
                return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(payload));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ChallengeResponseData.INSTANCE.fromJson$3ds2sdk_release(payload));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) objM28550constructorimpl;
                if (!isValidChallengeResponse(creqData, challengeResponseData)) {
                    ProtocolError protocolError = ProtocolError.InvalidTransactionId;
                    return new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError.getCode(), protocolError.getDescription(), "The Transaction ID received was invalid."));
                }
                if (!isMessageVersionCorrect(creqData, challengeResponseData)) {
                    ProtocolError protocolError2 = ProtocolError.UnsupportedMessageVersion;
                    return new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError2.getCode(), protocolError2.getDescription(), creqData.getMessageVersion()));
                }
                return new ChallengeRequestResult.Success(creqData, challengeResponseData, this.creqExecutorConfig);
            }
            if (thM28553exceptionOrNullimpl instanceof ChallengeResponseParseException) {
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) thM28553exceptionOrNullimpl;
                return new ChallengeRequestResult.ProtocolError(createErrorData(creqData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            }
            return new ChallengeRequestResult.RuntimeError(thM28553exceptionOrNullimpl);
        }

        private final boolean isValidChallengeResponse(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return Intrinsics.areEqual(creqData.getSdkTransId(), cresData.getSdkTransId()) && Intrinsics.areEqual(creqData.getThreeDsServerTransId(), cresData.getServerTransId()) && Intrinsics.areEqual(creqData.getAcsTransId(), cresData.getAcsTransId());
        }

        private final boolean isMessageVersionCorrect(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return Intrinsics.areEqual(creqData.getMessageVersion(), cresData.getMessageVersion());
        }

        private final JSONObject getResponsePayload(String responseBody) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException {
            return this.messageTransformer.decrypt(responseBody, this.secretKey);
        }

        private final ErrorData createErrorData(ChallengeRequestData creqData, int code, String description, String detail) {
            String strValueOf = String.valueOf(code);
            ErrorData.ErrorComponent errorComponent = ErrorData.ErrorComponent.ThreeDsSdk;
            return new ErrorData(creqData.getThreeDsServerTransId(), creqData.getAcsTransId(), null, strValueOf, errorComponent, description, detail, "CRes", creqData.getMessageVersion(), creqData.getSdkTransId(), 4, null);
        }
    }
}

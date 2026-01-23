package com.twilio.util;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.singular.sdk.internal.Constants;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.DefaultResponseValidation4;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVM5;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Timeout6;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: InternalUtils.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f\u001a \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0018\u001a\u00020\f\u001a+\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u001b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020 0\u001bH\u0086\b\u001a&\u0010!\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\"2\u0006\u0010#\u001a\u00020$H\u0086H¢\u0006\u0002\u0010%\u001a:\u0010!\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0'H\u0086H¢\u0006\u0002\u0010)\u001a?\u0010*\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\"2\u0006\u0010#\u001a\u00020$2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020 0'H\u0086\bø\u0001\u0001¢\u0006\u0002\u0010+\u001a\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\"*\u00020-H\u0086\b¢\u0006\u0002\u0010.\u001a\u001c\u0010/\u001a\u00020(*\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020$H\u0086@¢\u0006\u0002\u00100\u001a\u0014\u00101\u001a\u00020(*\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\u0082\u0002\u000e\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u00062"}, m3636d2 = {"EmptyJsonObject", "Lkotlinx/serialization/json/JsonObject;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "isClientShutdown", "", "", "(Ljava/lang/Throwable;)Z", "emptyJsonObject", "generateSID", "", "prefix", AnalyticsStrings.MAX_WELCOME_TAG, "Lkotlin/time/Duration;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "max-QTBD994", "(JJ)J", "min", "min-QTBD994", "splitCertificates", "", "certificatesString", "await", "T", "Lkotlinx/coroutines/CompletableDeferred;", "timeout", "await-8Mi8wO0", "(Lkotlinx/coroutines/CompletableDeferred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "getOrThrowTwilioException", "Lkotlin/Result;", "defaultReason", "Lcom/twilio/util/ErrorReason;", "(Ljava/lang/Object;Lcom/twilio/util/ErrorReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAlso", "Lkotlin/Function1;", "Lcom/twilio/util/TwilioException;", "(Ljava/lang/Object;Lcom/twilio/util/ErrorReason;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrThrowTwilioExceptionSync", "(Ljava/lang/Object;Lcom/twilio/util/ErrorReason;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "success", "Lkotlin/Result$Companion;", "(Lkotlin/Result$Companion;)Ljava/lang/Object;", "toTwilioException", "(Ljava/lang/Throwable;Lcom/twilio/util/ErrorReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toTwilioExceptionSync", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.util.InternalUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class InternalUtils3 {
    private static final Json json = Json6.Json$default(null, new Function1<Json4, Unit>() { // from class: com.twilio.util.InternalUtilsKt$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Json4 json4) {
            invoke2(json4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setCoerceInputValues(true);
        }
    }, 1, null);
    private static final JsonElement6 EmptyJsonObject = new JsonElementBuilders2().build();

    /* compiled from: InternalUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.twilio.util.InternalUtilsKt", m3645f = "InternalUtils.kt", m3646l = {123}, m3647m = "getOrThrowTwilioException")
    @SourceDebugExtension
    /* renamed from: com.twilio.util.InternalUtilsKt$getOrThrowTwilioException$1 */
    static final class C435221<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C435221(Continuation<? super C435221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalUtils3.getOrThrowTwilioException(null, null, this);
        }
    }

    /* compiled from: InternalUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.twilio.util.InternalUtilsKt", m3645f = "InternalUtils.kt", m3646l = {109}, m3647m = "getOrThrowTwilioException")
    @SourceDebugExtension
    /* renamed from: com.twilio.util.InternalUtilsKt$getOrThrowTwilioException$3 */
    static final class C435233<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C435233(Continuation<? super C435233> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalUtils3.getOrThrowTwilioException(null, null, null, this);
        }
    }

    /* compiled from: InternalUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.util.InternalUtilsKt", m3645f = "InternalUtils.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "toTwilioException")
    /* renamed from: com.twilio.util.InternalUtilsKt$toTwilioException$1 */
    static final class C435251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C435251(Continuation<? super C435251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalUtils3.toTwilioException(null, null, this);
        }
    }

    public static final Json getJson() {
        return json;
    }

    public static final JsonElement6 emptyJsonObject() {
        return EmptyJsonObject;
    }

    public static final List<String> splitCertificates(String certificatesString) {
        Intrinsics.checkNotNullParameter(certificatesString, "certificatesString");
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim(certificatesString).toString(), new String[]{"-----END CERTIFICATE-----"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.substringAfter$default((String) it.next(), "-----BEGIN CERTIFICATE-----", (String) null, 2, (Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add("-----BEGIN CERTIFICATE-----" + ((String) it2.next()) + "-----END CERTIFICATE-----");
        }
        return arrayList3;
    }

    public static final String generateSID(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return prefix + StringsKt.replace$default(commonUtilsAndroid.generateUUID(), "-", "", false, 4, (Object) null);
    }

    /* renamed from: min-QTBD994, reason: not valid java name */
    public static final long m27242minQTBD994(long j, long j2) {
        return Duration.m28727compareToLRDsOJo(j, j2) < 0 ? j : j2;
    }

    /* renamed from: max-QTBD994, reason: not valid java name */
    public static final long m27241maxQTBD994(long j, long j2) {
        return Duration.m28727compareToLRDsOJo(j, j2) > 0 ? j : j2;
    }

    public static final Object success(Result.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return Result.m28550constructorimpl(Unit.INSTANCE);
    }

    public static final boolean complete(CompletableDeferred<Unit> completableDeferred) {
        Intrinsics.checkNotNullParameter(completableDeferred, "<this>");
        return completableDeferred.complete(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: await-8Mi8wO0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m27240await8Mi8wO0(CompletableDeferred<T> completableDeferred, long j, Continuation<? super T> continuation) throws Throwable {
        InternalUtils4 internalUtils4;
        Object objM28550constructorimpl;
        if (continuation instanceof InternalUtils4) {
            internalUtils4 = (InternalUtils4) continuation;
            int i = internalUtils4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                internalUtils4.label = i - Integer.MIN_VALUE;
            } else {
                internalUtils4 = new InternalUtils4(continuation);
            }
        }
        Object twilioException = internalUtils4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = internalUtils4.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Result.Companion companion2 = Result.INSTANCE;
            InternalUtils5 internalUtils5 = new InternalUtils5(completableDeferred, null);
            internalUtils4.label = 1;
            twilioException = Timeout6.m28789withTimeoutKLykuaI(j, internalUtils5, internalUtils4);
            if (twilioException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(twilioException);
                throw ((Throwable) twilioException);
            }
            ResultKt.throwOnFailure(twilioException);
        }
        objM28550constructorimpl = Result.m28550constructorimpl(twilioException);
        TwilioException2 twilioException2 = TwilioException2.Timeout;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            return objM28550constructorimpl;
        }
        internalUtils4.label = 2;
        twilioException = toTwilioException(thM28553exceptionOrNullimpl, twilioException2, internalUtils4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:33:0x00e1, B:35:0x00e9, B:36:0x00f0), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:33:0x00e1, B:35:0x00e9, B:36:0x00f0), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toTwilioException(Throwable th, TwilioException2 twilioException2, Continuation<? super TwilioException> continuation) {
        C435251 c435251;
        Throwable th2;
        StringBuilder sb;
        TwilioException2 twilioException22;
        TwilioLogger twilioLogger;
        Throwable th3;
        TwilioException2 twilioException23;
        Throwable th4;
        Object objM28550constructorimpl;
        Integer authServiceCode;
        if (continuation instanceof C435251) {
            c435251 = (C435251) continuation;
            int i = c435251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435251.label = i - Integer.MIN_VALUE;
            } else {
                c435251 = new C435251(continuation);
            }
        }
        Object objBodyNullable = c435251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            if (!(th instanceof DefaultResponseValidation4)) {
                return toTwilioExceptionSync(th, twilioException2);
            }
            TwilioLogger logger = TwilioLogger3.getLogger(th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request error with response: ");
            HttpClientCall call = ((DefaultResponseValidation4) th).getResponse().getCall();
            KType kTypeTypeOf = Reflection.typeOf(String.class);
            TypeInfo typeInfoTypeInfoImpl = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(String.class), kTypeTypeOf);
            c435251.L$0 = th;
            c435251.L$1 = twilioException2;
            c435251.L$2 = logger;
            c435251.L$3 = sb2;
            c435251.label = 1;
            Object objBodyNullable2 = call.bodyNullable(typeInfoTypeInfoImpl, c435251);
            if (objBodyNullable2 != coroutine_suspended) {
                th2 = th;
                sb = sb2;
                twilioException22 = twilioException2;
                twilioLogger = logger;
                objBodyNullable = objBodyNullable2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twilioException23 = (TwilioException2) c435251.L$1;
            th4 = (Throwable) c435251.L$0;
            try {
                ResultKt.throwOnFailure(objBodyNullable);
            } catch (Throwable th5) {
                th3 = th5;
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th3));
                TwilioException2 twilioException24 = twilioException23;
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                }
                ErrorResponse internalUtils = (ErrorResponse) objM28550constructorimpl;
                int value = ((DefaultResponseValidation4) th4).getResponse().getStatus().getValue();
                Params params = internalUtils.getParams();
                return new TwilioException(new ErrorInfo(twilioException24, value, (params == null || (authServiceCode = params.getAuthServiceCode()) == null) ? internalUtils.getCode() : authServiceCode.intValue(), internalUtils.getMessage(), (String) null, 16, (DefaultConstructorMarker) null), th4);
            }
            if (objBodyNullable != null) {
                throw new NullPointerException("null cannot be cast to non-null type com.twilio.util.ErrorResponse");
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ErrorResponse) objBodyNullable);
            TwilioException2 twilioException242 = twilioException23;
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                objM28550constructorimpl = new ErrorResponse((String) null, 0, (Params) null, 7, (DefaultConstructorMarker) null);
            }
            ErrorResponse internalUtils2 = (ErrorResponse) objM28550constructorimpl;
            int value2 = ((DefaultResponseValidation4) th4).getResponse().getStatus().getValue();
            Params params2 = internalUtils2.getParams();
            return new TwilioException(new ErrorInfo(twilioException242, value2, (params2 == null || (authServiceCode = params2.getAuthServiceCode()) == null) ? internalUtils2.getCode() : authServiceCode.intValue(), internalUtils2.getMessage(), (String) null, 16, (DefaultConstructorMarker) null), th4);
        }
        sb = (StringBuilder) c435251.L$3;
        twilioLogger = (TwilioLogger) c435251.L$2;
        twilioException22 = (TwilioException2) c435251.L$1;
        th2 = (Throwable) c435251.L$0;
        ResultKt.throwOnFailure(objBodyNullable);
        if (objBodyNullable == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        sb.append((String) objBodyNullable);
        TwilioLogger.e$default(twilioLogger, sb.toString(), (Throwable) null, 2, (Object) null);
        try {
            Result.Companion companion2 = Result.INSTANCE;
            HttpClientCall call2 = ((DefaultResponseValidation4) th2).getResponse().getCall();
            KType kTypeTypeOf2 = Reflection.typeOf(ErrorResponse.class);
            TypeInfo typeInfoTypeInfoImpl2 = TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(ErrorResponse.class), kTypeTypeOf2);
            c435251.L$0 = th2;
            c435251.L$1 = twilioException22;
            c435251.L$2 = null;
            c435251.L$3 = null;
            c435251.label = 2;
            objBodyNullable = call2.bodyNullable(typeInfoTypeInfoImpl2, c435251);
            if (objBodyNullable != coroutine_suspended) {
                twilioException23 = twilioException22;
                th4 = th2;
                if (objBodyNullable != null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th6) {
            th3 = th6;
            twilioException23 = twilioException22;
            th4 = th2;
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th3));
            TwilioException2 twilioException2422 = twilioException23;
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
            }
            ErrorResponse internalUtils22 = (ErrorResponse) objM28550constructorimpl;
            int value22 = ((DefaultResponseValidation4) th4).getResponse().getStatus().getValue();
            Params params22 = internalUtils22.getParams();
            return new TwilioException(new ErrorInfo(twilioException2422, value22, (params22 == null || (authServiceCode = params22.getAuthServiceCode()) == null) ? internalUtils22.getCode() : authServiceCode.intValue(), internalUtils22.getMessage(), (String) null, 16, (DefaultConstructorMarker) null), th4);
        }
    }

    public static final TwilioException toTwilioExceptionSync(Throwable th, TwilioException2 defaultReason) {
        Intrinsics.checkNotNullParameter(defaultReason, "defaultReason");
        return th instanceof TwilioException ? (TwilioException) th : th instanceof CancellationException ? new TwilioException(new ErrorInfo(TwilioException2.Cancelled, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null), th) : new TwilioException(new ErrorInfo(defaultReason, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null), th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object getOrThrowTwilioException(Object obj, TwilioException2 twilioException2, Continuation<? super T> continuation) throws Throwable {
        C435221 c435221;
        if (continuation instanceof C435221) {
            c435221 = (C435221) continuation;
            int i = c435221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435221.label = i - Integer.MIN_VALUE;
            } else {
                c435221 = new C435221(continuation);
            }
        }
        Object twilioException = c435221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
            if (thM28553exceptionOrNullimpl == null) {
                return obj;
            }
            c435221.label = 1;
            twilioException = toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c435221);
            if (twilioException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(twilioException);
        }
        throw ((Throwable) twilioException);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object getOrThrowTwilioException(Object obj, TwilioException2 twilioException2, Function1<? super TwilioException, Unit> function1, Continuation<? super T> continuation) throws Throwable {
        C435233 c435233;
        if (continuation instanceof C435233) {
            c435233 = (C435233) continuation;
            int i = c435233.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435233.label = i - Integer.MIN_VALUE;
            } else {
                c435233 = new C435233(continuation);
            }
        }
        Object twilioException = c435233.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435233.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(twilioException);
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
            if (thM28553exceptionOrNullimpl == null) {
                return obj;
            }
            c435233.L$0 = function1;
            c435233.label = 1;
            twilioException = toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c435233);
            if (twilioException == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) c435233.L$0;
            ResultKt.throwOnFailure(twilioException);
        }
        function1.invoke(twilioException);
        throw ((Throwable) twilioException);
    }

    private static final <T> Object getOrThrowTwilioException$$forInline(Object obj, TwilioException2 twilioException2, Continuation<? super T> continuation) throws Throwable {
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl == null) {
            return obj;
        }
        InlineMarker.mark(3);
        InlineMarker.mark(0);
        Object twilioException = toTwilioException(thM28553exceptionOrNullimpl, twilioException2, null);
        InlineMarker.mark(1);
        Unit unit = Unit.INSTANCE;
        throw ((Throwable) twilioException);
    }

    private static final <T> Object getOrThrowTwilioException$$forInline(Object obj, TwilioException2 twilioException2, Function1<? super TwilioException, Unit> function1, Continuation<? super T> continuation) throws Throwable {
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl == null) {
            return obj;
        }
        InlineMarker.mark(3);
        InlineMarker.mark(0);
        Object twilioException = toTwilioException(thM28553exceptionOrNullimpl, twilioException2, null);
        InlineMarker.mark(1);
        function1.invoke(twilioException);
        throw ((Throwable) twilioException);
    }

    public static /* synthetic */ Object getOrThrowTwilioExceptionSync$default(Object obj, TwilioException2 defaultReason, Function1 doAlso, int i, Object obj2) throws TwilioException {
        if ((i & 2) != 0) {
            doAlso = new Function1<TwilioException, Unit>() { // from class: com.twilio.util.InternalUtilsKt.getOrThrowTwilioExceptionSync.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TwilioException it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TwilioException twilioException) {
                    invoke2(twilioException);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(defaultReason, "defaultReason");
        Intrinsics.checkNotNullParameter(doAlso, "doAlso");
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl == null) {
            return obj;
        }
        TwilioException twilioExceptionSync = toTwilioExceptionSync(thM28553exceptionOrNullimpl, defaultReason);
        doAlso.invoke(twilioExceptionSync);
        throw twilioExceptionSync;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getOrThrowTwilioExceptionSync(Object obj, TwilioException2 defaultReason, Function1<? super TwilioException, Unit> doAlso) throws TwilioException {
        Intrinsics.checkNotNullParameter(defaultReason, "defaultReason");
        Intrinsics.checkNotNullParameter(doAlso, "doAlso");
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj);
        if (thM28553exceptionOrNullimpl == null) {
            return obj;
        }
        TwilioException twilioExceptionSync = toTwilioExceptionSync(thM28553exceptionOrNullimpl, defaultReason);
        doAlso.invoke(twilioExceptionSync);
        throw twilioExceptionSync;
    }

    public static final boolean isClientShutdown(Throwable th) {
        return (th instanceof TwilioException) && ((TwilioException) th).getErrorInfo().getReason() == TwilioException2.ClientShutdown;
    }
}

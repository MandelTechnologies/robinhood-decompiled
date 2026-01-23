package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCall;
import io.ktor.client.plugins.HttpCallValidator;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponse2;
import io.ktor.util.Attributes2;
import io.ktor.util.logging.KtorSimpleLoggerJvm;
import io.ktor.utils.p478io.charsets.CharsetJVM2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/client/HttpClientConfig;", "", "addDefaultResponseValidation", "(Lio/ktor/client/HttpClientConfig;)V", "Lio/ktor/util/AttributeKey;", "ValidateMark", "Lio/ktor/util/AttributeKey;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.DefaultResponseValidationKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class DefaultResponseValidation2 {
    private static final Attributes2<Unit> ValidateMark = new Attributes2<>("ValidateMark");
    private static final Logger LOGGER = KtorSimpleLoggerJvm.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");

    public static final void addDefaultResponseValidation(final HttpClientConfig<?> httpClientConfig) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        HttpCallValidator7.HttpResponseValidator(httpClientConfig, new Function1<HttpCallValidator.Config, Unit>() { // from class: io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpCallValidator.Config config) {
                invoke2(config);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpCallValidator.Config HttpResponseValidator) {
                Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.setExpectSuccess(httpClientConfig.getExpectSuccess());
                HttpResponseValidator.validateResponse(new AnonymousClass1(null));
            }

            /* compiled from: DefaultResponseValidation.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", m3645f = "DefaultResponseValidation.kt", m3646l = {42, 48}, m3647m = "invokeSuspend")
            /* renamed from: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
                int I$0;
                /* synthetic */ Object L$0;
                Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(8:6|54|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(3:21|(1:24)|28)))|25|56|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
                
                    r0 = r1;
                    r3 = r5;
                    r1 = r11;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int value;
                    HttpResponse httpResponse;
                    int i;
                    HttpResponse httpResponse2;
                    HttpResponse httpResponse3;
                    String str;
                    Throwable defaultResponseValidation4;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpResponse httpResponse4 = (HttpResponse) this.L$0;
                        if (!((Boolean) httpResponse4.getCall().getAttributes().get(HttpCallValidator7.getExpectSuccessAttributeKey())).booleanValue()) {
                            DefaultResponseValidation2.LOGGER.trace("Skipping default response validation for " + httpResponse4.getCall().getRequest().getUrl());
                            return Unit.INSTANCE;
                        }
                        value = httpResponse4.getStatus().getValue();
                        HttpClientCall call = httpResponse4.getCall();
                        if (value < 300 || call.getAttributes().contains(DefaultResponseValidation2.ValidateMark)) {
                            return Unit.INSTANCE;
                        }
                        this.L$0 = httpResponse4;
                        this.I$0 = value;
                        this.label = 1;
                        Object objSave = SavedCall.save(call, this);
                        if (objSave != coroutine_suspended) {
                            httpResponse = httpResponse4;
                            obj = objSave;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.I$0;
                        httpResponse3 = (HttpResponse) this.L$1;
                        httpResponse2 = (HttpResponse) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str = (String) obj;
                        } catch (CharsetJVM2 unused) {
                            str = "<body failed decoding>";
                            if (300 > i) {
                            }
                            DefaultResponseValidation2.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + defaultResponseValidation4);
                            throw defaultResponseValidation4;
                        }
                        if (300 > i && i < 400) {
                            defaultResponseValidation4 = new DefaultResponseValidation3(httpResponse3, str);
                        } else if (400 > i && i < 500) {
                            defaultResponseValidation4 = new DefaultResponseValidation(httpResponse3, str);
                        } else if (500 > i && i < 600) {
                            defaultResponseValidation4 = new DefaultResponseValidation5(httpResponse3, str);
                        } else {
                            defaultResponseValidation4 = new DefaultResponseValidation4(httpResponse3, str);
                        }
                        DefaultResponseValidation2.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + defaultResponseValidation4);
                        throw defaultResponseValidation4;
                    }
                    value = this.I$0;
                    httpResponse = (HttpResponse) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    HttpClientCall httpClientCall = (HttpClientCall) obj;
                    httpClientCall.getAttributes().put(DefaultResponseValidation2.ValidateMark, Unit.INSTANCE);
                    HttpResponse response = httpClientCall.getResponse();
                    this.L$0 = httpResponse;
                    this.L$1 = response;
                    this.I$0 = value;
                    this.label = 2;
                    Object objBodyAsText$default = HttpResponse2.bodyAsText$default(response, null, this, 1, null);
                    if (objBodyAsText$default != coroutine_suspended) {
                        i = value;
                        httpResponse3 = response;
                        obj = objBodyAsText$default;
                        httpResponse2 = httpResponse;
                        str = (String) obj;
                        if (300 > i) {
                            if (400 > i) {
                                if (500 > i) {
                                    defaultResponseValidation4 = new DefaultResponseValidation4(httpResponse3, str);
                                }
                            }
                        }
                        DefaultResponseValidation2.LOGGER.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + defaultResponseValidation4);
                        throw defaultResponseValidation4;
                    }
                    return coroutine_suspended;
                }
            }
        });
    }
}

package io.ktor.serialization;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaderValueParser3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent2;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ContentConverter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00060\tj\u0002`\n*\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\tj\u0002`\n\u001a \u0010\u000f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n*\u00020\r2\f\b\u0002\u0010\u000e\u001a\u00060\tj\u0002`\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m3636d2 = {"deserialize", "", "", "Lio/ktor/serialization/ContentConverter;", CarResultComposable2.BODY, "Lio/ktor/utils/io/ByteReadChannel;", "typeInfo", "Lio/ktor/util/reflect/TypeInfo;", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Ljava/util/List;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suitableCharset", "Lio/ktor/http/Headers;", "defaultCharset", "suitableCharsetOrNull", "ktor-serialization"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.serialization.ContentConverterKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ContentConverter3 {

    /* compiled from: ContentConverter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.ContentConverterKt", m3645f = "ContentConverter.kt", m3646l = {123}, m3647m = "deserialize")
    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$1 */
    static final class C455991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C455991(Continuation<? super C455991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentConverter3.deserialize(null, null, null, null, this);
        }
    }

    public static /* synthetic */ Charset suitableCharset$default(Headers headers, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return suitableCharset(headers, charset);
    }

    public static final Charset suitableCharset(Headers headers, Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Charset charsetSuitableCharsetOrNull = suitableCharsetOrNull(headers, defaultCharset);
        return charsetSuitableCharsetOrNull == null ? defaultCharset : charsetSuitableCharsetOrNull;
    }

    public static final Charset suitableCharsetOrNull(Headers headers, Charset defaultCharset) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(defaultCharset, "defaultCharset");
        Iterator<HeaderValue> it = HttpHeaderValueParser3.parseAndSortHeader(headers.get(HttpHeaders.INSTANCE.getAcceptCharset())).iterator();
        while (it.hasNext()) {
            String value = it.next().getValue();
            if (Intrinsics.areEqual(value, "*")) {
                return defaultCharset;
            }
            if (Charset.isSupported(value)) {
                return Charset.forName(value);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deserialize(List<? extends ContentConverter> list, final ByteReadChannelJVM byteReadChannelJVM, final TypeInfo typeInfo, final Charset charset, Continuation<Object> continuation) throws ContentConvertException {
        C455991 c455991;
        if (continuation instanceof C455991) {
            c455991 = (C455991) continuation;
            int i = c455991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455991.label = i - Integer.MIN_VALUE;
            } else {
                c455991 = new C455991(continuation);
            }
        }
        Object objFirstOrNull = c455991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            final Flow flowAsFlow = FlowKt.asFlow(list);
            Flow<Object> flow = new Flow<Object>() { // from class: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation2) {
                    Object objCollect = flowAsFlow.collect(new C455982(flowCollector, charset, typeInfo, byteReadChannelJVM), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
                @SourceDebugExtension
                /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2 */
                public static final class C455982<T> implements FlowCollector {
                    final /* synthetic */ ByteReadChannelJVM $body$inlined;
                    final /* synthetic */ Charset $charset$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ TypeInfo $typeInfo$inlined;

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", m3645f = "ContentConverter.kt", m3646l = {224, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                    @SourceDebugExtension
                    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C455982.this.emit(null, this);
                        }
                    }

                    public C455982(FlowCollector flowCollector, Charset charset, TypeInfo typeInfo, ByteReadChannelJVM byteReadChannelJVM) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$charset$inlined = charset;
                        this.$typeInfo$inlined = typeInfo;
                        this.$body$inlined = byteReadChannelJVM;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                    
                        if (r9.emit(r10, r0) == r1) goto L22;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        FlowCollector flowCollector;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.$this_unsafeFlow;
                            Charset charset = this.$charset$inlined;
                            TypeInfo typeInfo = this.$typeInfo$inlined;
                            ByteReadChannelJVM byteReadChannelJVM = this.$body$inlined;
                            anonymousClass1.L$0 = flowCollector2;
                            anonymousClass1.label = 1;
                            Object objDeserialize = ((ContentConverter) obj).deserialize(charset, typeInfo, byteReadChannelJVM, anonymousClass1);
                            if (objDeserialize != coroutine_suspended) {
                                obj2 = objDeserialize;
                                flowCollector = flowCollector2;
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = flowCollector3;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }
            };
            ContentConverter4 contentConverter4 = new ContentConverter4(byteReadChannelJVM, null);
            c455991.L$0 = byteReadChannelJVM;
            c455991.L$1 = typeInfo;
            c455991.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flow, contentConverter4, c455991);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            typeInfo = (TypeInfo) c455991.L$1;
            byteReadChannelJVM = (ByteReadChannelJVM) c455991.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        if (objFirstOrNull != null) {
            return objFirstOrNull;
        }
        if (!byteReadChannelJVM.isClosedForRead()) {
            return byteReadChannelJVM;
        }
        KType kotlinType = typeInfo.getKotlinType();
        if (kotlinType != null && kotlinType.isMarkedNullable()) {
            return OutgoingContent2.INSTANCE;
        }
        throw new ContentConvertException("No suitable converter found for " + typeInfo, null, 2, null);
    }
}

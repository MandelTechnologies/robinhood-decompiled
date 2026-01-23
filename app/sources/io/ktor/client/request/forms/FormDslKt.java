package io.ktor.client.request.forms;

import io.ktor.http.HeaderValueWithParameters2;
import io.ktor.http.Headers;
import io.ktor.http.Headers3;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.Multipart2;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.ByteReadPacketExtensions2;
import io.ktor.utils.p478io.core.Input;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: formDsl.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, m3636d2 = {"", "Lio/ktor/client/request/forms/FormPart;", "values", "", "Lio/ktor/http/content/PartData;", "formData", "([Lio/ktor/client/request/forms/FormPart;)Ljava/util/List;", "Lkotlin/Function1;", "Lio/ktor/client/request/forms/FormBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FormDslKt {
    public static final List<Multipart2> formData(FormPart<?>... values) {
        Multipart2 binaryChannelItem;
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList();
        for (FormPart<?> formPart : values) {
            String key = formPart.getKey();
            final Object objComponent2 = formPart.component2();
            Headers headers = formPart.getHeaders();
            Headers3 headers3 = new Headers3(0, 1, null);
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            headers3.append(httpHeaders.getContentDisposition(), "form-data; name=" + HeaderValueWithParameters2.escapeIfNeeded(key));
            headers3.appendAll(headers);
            if (objComponent2 instanceof String) {
                binaryChannelItem = new Multipart2.FormItem((String) objComponent2, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headers3.build());
            } else if (objComponent2 instanceof Number) {
                binaryChannelItem = new Multipart2.FormItem(objComponent2.toString(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headers3.build());
            } else if (objComponent2 instanceof Boolean) {
                binaryChannelItem = new Multipart2.FormItem(objComponent2.toString(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headers3.build());
            } else if (objComponent2 instanceof byte[]) {
                headers3.append(httpHeaders.getContentLength(), String.valueOf(((byte[]) objComponent2).length));
                binaryChannelItem = new Multipart2.BinaryItem(new Function0<Input>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Input invoke() {
                        final byte[] bArr = (byte[]) objComponent2;
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
                        return ByteReadPacketExtensions2.ByteReadPacket(byteBufferWrap, new Function1<ByteBuffer, Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$4$invoke$$inlined$ByteReadPacket$default$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ByteBuffer it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
                                invoke2(byteBuffer);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$5
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headers3.build());
            } else if (objComponent2 instanceof ByteReadPacket) {
                headers3.append(httpHeaders.getContentLength(), String.valueOf(((ByteReadPacket) objComponent2).getRemaining()));
                binaryChannelItem = new Multipart2.BinaryItem(new Function0<Input>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Input invoke() {
                        return ((ByteReadPacket) objComponent2).copy();
                    }
                }, new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((ByteReadPacket) objComponent2).close();
                    }
                }, headers3.build());
            } else if (objComponent2 instanceof InputProvider) {
                InputProvider inputProvider = (InputProvider) objComponent2;
                Long size = inputProvider.getSize();
                if (size != null) {
                    headers3.append(httpHeaders.getContentLength(), size.toString());
                }
                binaryChannelItem = new Multipart2.BinaryItem(inputProvider.getBlock(), new Function0<Unit>() { // from class: io.ktor.client.request.forms.FormDslKt$formData$1$part$8
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, headers3.build());
            } else {
                if (!(objComponent2 instanceof ChannelProvider)) {
                    if (!(objComponent2 instanceof Input)) {
                        throw new IllegalStateException(("Unknown form content type: " + objComponent2).toString());
                    }
                    throw new IllegalStateException(("Can't use [Input] as part of form: " + objComponent2 + ". Consider using [InputProvider] instead.").toString());
                }
                ChannelProvider channelProvider = (ChannelProvider) objComponent2;
                Long size2 = channelProvider.getSize();
                if (size2 != null) {
                    headers3.append(httpHeaders.getContentLength(), size2.toString());
                }
                binaryChannelItem = new Multipart2.BinaryChannelItem(channelProvider.getBlock(), headers3.build());
            }
            arrayList.add(binaryChannelItem);
        }
        return arrayList;
    }

    public static final List<Multipart2> formData(Function1<? super FormBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FormBuilder formBuilder = new FormBuilder();
        block.invoke(formBuilder);
        FormPart[] formPartArr = (FormPart[]) formBuilder.build$ktor_client_core().toArray(new FormPart[0]);
        return formData((FormPart<?>[]) Arrays.copyOf(formPartArr, formPartArr.length));
    }
}

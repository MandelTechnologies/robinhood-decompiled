package io.ktor.client.request.forms;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.request.forms.FormDataContent4;
import io.ktor.http.ContentTypes2;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.Multipart2;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p478io.ByteReadChannel2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.ByteWriteChannel2;
import io.ktor.utils.p478io.charsets.CharsetJVM;
import io.ktor.utils.p478io.core.BytePacketBuilder;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.Output2;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: FormDataContent.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m3636d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "<set-?>", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.request.forms.MultiPartFormDataContent, reason: use source file name */
/* loaded from: classes14.dex */
public final class FormDataContent2 extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentTypes2 contentType;
    private final List<FormDataContent4> rawParts;

    /* compiled from: FormDataContent.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.request.forms.MultiPartFormDataContent", m3645f = "FormDataContent.kt", m3646l = {116, 117, 118, 123, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 131, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "writeTo")
    /* renamed from: io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1 */
    static final class C455861 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C455861(Continuation<? super C455861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormDataContent2.this.writeTo(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FormDataContent2(List list, String str, ContentTypes2 contentTypes2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 2) != 0 ? FormDataContent.generateBoundary() : str;
        this(list, str, (i & 4) != 0 ? ContentTypes2.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentTypes2);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentTypes2 getContentType() {
        return this.contentType;
    }

    public FormDataContent2(List<? extends Multipart2> parts, String boundary, ContentTypes2 contentType) {
        byte[] bArrEncodeToByteArray;
        byte[] bArrEncodeToByteArray2;
        FormDataContent4 channelPart;
        Function0<ByteReadPacket> function0;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        String str = "--" + boundary + "\r\n";
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray = StringsKt.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        this.BOUNDARY_BYTES = bArrEncodeToByteArray;
        String str2 = "--" + boundary + "--\r\n";
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray2 = StringsKt.encodeToByteArray(str2);
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrEncodeToByteArray2 = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder2, str2, 0, str2.length());
        }
        this.LAST_BOUNDARY_BYTES = bArrEncodeToByteArray2;
        this.BODY_OVERHEAD_SIZE = bArrEncodeToByteArray2.length;
        this.PART_OVERHEAD_SIZE = (FormDataContent.RN_BYTES.length * 2) + bArrEncodeToByteArray.length;
        List<? extends Multipart2> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.rawParts = arrayList;
                Long lValueOf = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l = lValueOf;
                        break;
                    }
                    Long size = ((FormDataContent4) it2.next()).getSize();
                    if (size == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(lValueOf.longValue() + size.longValue()) : null;
                    }
                }
                this.contentLength = l != null ? Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
                return;
            }
            Multipart2 multipart2 = (Multipart2) it.next();
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            for (Map.Entry<String, List<String>> entry : multipart2.getHeaders().entries()) {
                io.ktor.utils.p478io.core.StringsKt.writeText$default(bytePacketBuilder, entry.getKey() + ": " + CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, null, 14, null);
                Output2.writeFully$default(bytePacketBuilder, FormDataContent.RN_BYTES, 0, 0, 6, null);
            }
            Headers headers = multipart2.getHeaders();
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            String str3 = headers.get(httpHeaders.getContentLength());
            Long lValueOf2 = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
            if (multipart2 instanceof Multipart2.FileItem) {
                channelPart = new FormDataContent4.InputPart(io.ktor.utils.p478io.core.StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((Multipart2.FileItem) multipart2).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
            } else if (multipart2 instanceof Multipart2.BinaryItem) {
                channelPart = new FormDataContent4.InputPart(io.ktor.utils.p478io.core.StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((Multipart2.BinaryItem) multipart2).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
            } else if (multipart2 instanceof Multipart2.FormItem) {
                BytePacketBuilder bytePacketBuilder2 = new BytePacketBuilder(null, 1, null);
                try {
                    io.ktor.utils.p478io.core.StringsKt.writeText$default(bytePacketBuilder2, ((Multipart2.FormItem) multipart2).getValue(), 0, 0, null, 14, null);
                    final byte[] bytes$default = io.ktor.utils.p478io.core.StringsKt.readBytes$default(bytePacketBuilder2.build(), 0, 1, null);
                    Function0<ByteReadPacket> function02 = new Function0<ByteReadPacket>() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$rawParts$1$provider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final ByteReadPacket invoke() {
                            byte[] bArr = bytes$default;
                            BytePacketBuilder bytePacketBuilder3 = new BytePacketBuilder(null, 1, null);
                            try {
                                Output2.writeFully$default(bytePacketBuilder3, bArr, 0, 0, 6, null);
                                return bytePacketBuilder3.build();
                            } catch (Throwable th) {
                                bytePacketBuilder3.release();
                                throw th;
                            }
                        }
                    };
                    if (lValueOf2 == null) {
                        function0 = function02;
                        io.ktor.utils.p478io.core.StringsKt.writeText$default(bytePacketBuilder, httpHeaders.getContentLength() + ": " + bytes$default.length, 0, 0, null, 14, null);
                        Output2.writeFully$default(bytePacketBuilder, FormDataContent.RN_BYTES, 0, 0, 6, null);
                    } else {
                        function0 = function02;
                    }
                    channelPart = new FormDataContent4.InputPart(io.ktor.utils.p478io.core.StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), function0, Long.valueOf(bytes$default.length + this.PART_OVERHEAD_SIZE + r4.length));
                } catch (Throwable th) {
                    bytePacketBuilder2.release();
                    throw th;
                }
            } else if (multipart2 instanceof Multipart2.BinaryChannelItem) {
                channelPart = new FormDataContent4.ChannelPart(io.ktor.utils.p478io.core.StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((Multipart2.BinaryChannelItem) multipart2).getProvider(), lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(channelPart);
        }
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        if (io.ktor.utils.p478io.ByteWriteChannel2.writeFully(r9, r10, r0) == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:80:0x0182, B:84:0x019b, B:43:0x00c3), top: B:97:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: all -> 0x0035, PHI: r2 r4 r5 r9
      0x0104: PHI (r2v19 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>) = 
      (r2v5 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>)
      (r2v20 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>)
     binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r4v21 io.ktor.client.request.forms.PreparedPart) = (r4v6 io.ktor.client.request.forms.PreparedPart), (r4v23 io.ktor.client.request.forms.PreparedPart) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r5v12 io.ktor.client.request.forms.MultiPartFormDataContent) = 
      (r5v3 io.ktor.client.request.forms.MultiPartFormDataContent)
      (r5v13 io.ktor.client.request.forms.MultiPartFormDataContent)
     binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r9v37 io.ktor.utils.io.ByteWriteChannel) = (r9v11 io.ktor.utils.io.ByteWriteChannel), (r9v39 io.ktor.utils.io.ByteWriteChannel) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:80:0x0182, B:84:0x019b, B:43:0x00c3), top: B:97:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:64:0x0149, B:73:0x015a, B:75:0x015e, B:72:0x0159, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:60:0x012e, B:63:0x0147, B:27:0x0071, B:70:0x0157, B:69:0x0154, B:66:0x014f), top: B:97:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:64:0x0149, B:73:0x015a, B:75:0x015e, B:72:0x0159, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:60:0x012e, B:63:0x0147, B:27:0x0071, B:70:0x0157, B:69:0x0154, B:66:0x014f), top: B:97:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:80:0x0182, B:84:0x019b, B:43:0x00c3), top: B:97:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0198 -> B:20:0x0049). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeTo(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        C455861 c455861;
        ByteWriteChannel byteWriteChannel2;
        Iterator<FormDataContent4> it;
        FormDataContent2 formDataContent2;
        Iterator<FormDataContent4> it2;
        FormDataContent2 formDataContent22;
        FormDataContent4 next;
        FormDataContent4 formDataContent4;
        Input inputInvoke;
        Iterator<FormDataContent4> it3;
        ByteWriteChannel byteWriteChannel3;
        FormDataContent2 formDataContent23;
        byte[] bArr;
        byte[] bArr2;
        byte[] headers;
        if (continuation instanceof C455861) {
            c455861 = (C455861) continuation;
            int i = c455861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455861.label = i - Integer.MIN_VALUE;
            } else {
                c455861 = new C455861(continuation);
            }
        }
        Object obj = c455861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c455861.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                    try {
                        byteWriteChannel.close(th);
                        return Unit.INSTANCE;
                    } finally {
                        ByteWriteChannel2.close(byteWriteChannel);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteWriteChannel = r2;
                byteWriteChannel.close(th);
                return Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            th = th3;
            byteWriteChannel = byteWriteChannel2;
            byteWriteChannel.close(th);
            return Unit.INSTANCE;
        }
        switch (r2) {
            case 0:
                ResultKt.throwOnFailure(obj);
                it = this.rawParts.iterator();
                formDataContent2 = this;
                if (it.hasNext()) {
                    next = it.next();
                    byte[] bArr3 = formDataContent2.BOUNDARY_BYTES;
                    c455861.L$0 = formDataContent2;
                    c455861.L$1 = byteWriteChannel;
                    c455861.L$2 = it;
                    c455861.L$3 = next;
                    c455861.label = 1;
                    if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr3, c455861) != coroutine_suspended) {
                        formDataContent22 = formDataContent2;
                        it2 = it;
                        headers = next.getHeaders();
                        c455861.L$0 = formDataContent22;
                        c455861.L$1 = byteWriteChannel;
                        c455861.L$2 = it2;
                        c455861.L$3 = next;
                        c455861.label = 2;
                        if (ByteWriteChannel2.writeFully(byteWriteChannel, headers, c455861) == coroutine_suspended) {
                            bArr2 = FormDataContent.RN_BYTES;
                            c455861.L$0 = formDataContent22;
                            c455861.L$1 = byteWriteChannel;
                            c455861.L$2 = it2;
                            c455861.L$3 = next;
                            c455861.label = 3;
                            if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr2, c455861) != coroutine_suspended) {
                                FormDataContent4 formDataContent42 = next;
                                byteWriteChannel2 = byteWriteChannel;
                                formDataContent4 = formDataContent42;
                                if (formDataContent4 instanceof FormDataContent4.InputPart) {
                                    inputInvoke = ((FormDataContent4.InputPart) formDataContent4).getProvider().invoke();
                                    c455861.L$0 = formDataContent22;
                                    c455861.L$1 = byteWriteChannel2;
                                    c455861.L$2 = it2;
                                    c455861.L$3 = inputInvoke;
                                    c455861.I$0 = 0;
                                    c455861.label = 4;
                                    if (FormDataContent.copyTo(inputInvoke, byteWriteChannel2, c455861) == coroutine_suspended) {
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    inputInvoke.close();
                                    byteWriteChannel = byteWriteChannel2;
                                    formDataContent23 = formDataContent22;
                                    bArr = FormDataContent.RN_BYTES;
                                    c455861.L$0 = formDataContent23;
                                    c455861.L$1 = byteWriteChannel;
                                    c455861.L$2 = it2;
                                    c455861.L$3 = null;
                                    c455861.label = 6;
                                    if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr, c455861) != coroutine_suspended) {
                                    }
                                } else {
                                    if (formDataContent4 instanceof FormDataContent4.ChannelPart) {
                                        ByteReadChannelJVM byteReadChannelJVMInvoke = ((FormDataContent4.ChannelPart) formDataContent4).getProvider().invoke();
                                        c455861.L$0 = formDataContent22;
                                        c455861.L$1 = byteWriteChannel2;
                                        c455861.L$2 = it2;
                                        c455861.L$3 = null;
                                        c455861.label = 5;
                                        if (ByteReadChannel2.copyTo(byteReadChannelJVMInvoke, byteWriteChannel2, c455861) != coroutine_suspended) {
                                            it3 = it2;
                                            byteWriteChannel3 = byteWriteChannel2;
                                            formDataContent23 = formDataContent22;
                                            ByteWriteChannel byteWriteChannel4 = byteWriteChannel3;
                                            it2 = it3;
                                            byteWriteChannel = byteWriteChannel4;
                                            bArr = FormDataContent.RN_BYTES;
                                            c455861.L$0 = formDataContent23;
                                            c455861.L$1 = byteWriteChannel;
                                            c455861.L$2 = it2;
                                            c455861.L$3 = null;
                                            c455861.label = 6;
                                            if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr, c455861) != coroutine_suspended) {
                                                it = it2;
                                                formDataContent2 = formDataContent23;
                                                if (it.hasNext()) {
                                                    byte[] bArr4 = formDataContent2.LAST_BOUNDARY_BYTES;
                                                    c455861.L$0 = byteWriteChannel;
                                                    c455861.L$1 = null;
                                                    c455861.L$2 = null;
                                                    c455861.label = 7;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    byteWriteChannel = byteWriteChannel2;
                                    formDataContent23 = formDataContent22;
                                    bArr = FormDataContent.RN_BYTES;
                                    c455861.L$0 = formDataContent23;
                                    c455861.L$1 = byteWriteChannel;
                                    c455861.L$2 = it2;
                                    c455861.L$3 = null;
                                    c455861.label = 6;
                                    if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr, c455861) != coroutine_suspended) {
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                FormDataContent4 formDataContent43 = (FormDataContent4) c455861.L$3;
                it2 = (Iterator) c455861.L$2;
                ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c455861.L$1;
                formDataContent22 = (FormDataContent2) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                next = formDataContent43;
                byteWriteChannel = byteWriteChannel5;
                headers = next.getHeaders();
                c455861.L$0 = formDataContent22;
                c455861.L$1 = byteWriteChannel;
                c455861.L$2 = it2;
                c455861.L$3 = next;
                c455861.label = 2;
                if (ByteWriteChannel2.writeFully(byteWriteChannel, headers, c455861) == coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                FormDataContent4 formDataContent44 = (FormDataContent4) c455861.L$3;
                it2 = (Iterator) c455861.L$2;
                ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) c455861.L$1;
                formDataContent22 = (FormDataContent2) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                next = formDataContent44;
                byteWriteChannel = byteWriteChannel6;
                bArr2 = FormDataContent.RN_BYTES;
                c455861.L$0 = formDataContent22;
                c455861.L$1 = byteWriteChannel;
                c455861.L$2 = it2;
                c455861.L$3 = next;
                c455861.label = 3;
                if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr2, c455861) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                formDataContent4 = (FormDataContent4) c455861.L$3;
                it2 = (Iterator) c455861.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c455861.L$1;
                formDataContent22 = (FormDataContent2) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                if (formDataContent4 instanceof FormDataContent4.InputPart) {
                }
                return coroutine_suspended;
            case 4:
                inputInvoke = (Closeable) c455861.L$3;
                it2 = (Iterator) c455861.L$2;
                byteWriteChannel2 = (ByteWriteChannel) c455861.L$1;
                formDataContent22 = (FormDataContent2) c455861.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    inputInvoke.close();
                    byteWriteChannel = byteWriteChannel2;
                    formDataContent23 = formDataContent22;
                    bArr = FormDataContent.RN_BYTES;
                    c455861.L$0 = formDataContent23;
                    c455861.L$1 = byteWriteChannel;
                    c455861.L$2 = it2;
                    c455861.L$3 = null;
                    c455861.label = 6;
                    if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr, c455861) != coroutine_suspended) {
                    }
                } finally {
                }
                break;
            case 5:
                it3 = (Iterator) c455861.L$2;
                byteWriteChannel3 = (ByteWriteChannel) c455861.L$1;
                formDataContent23 = (FormDataContent2) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                ByteWriteChannel byteWriteChannel42 = byteWriteChannel3;
                it2 = it3;
                byteWriteChannel = byteWriteChannel42;
                bArr = FormDataContent.RN_BYTES;
                c455861.L$0 = formDataContent23;
                c455861.L$1 = byteWriteChannel;
                c455861.L$2 = it2;
                c455861.L$3 = null;
                c455861.label = 6;
                if (ByteWriteChannel2.writeFully(byteWriteChannel, bArr, c455861) != coroutine_suspended) {
                }
                break;
            case 6:
                Iterator<FormDataContent4> it4 = (Iterator) c455861.L$2;
                ByteWriteChannel byteWriteChannel7 = (ByteWriteChannel) c455861.L$1;
                formDataContent23 = (FormDataContent2) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                it = it4;
                byteWriteChannel = byteWriteChannel7;
                formDataContent2 = formDataContent23;
                if (it.hasNext()) {
                }
                return coroutine_suspended;
            case 7:
                byteWriteChannel = (ByteWriteChannel) c455861.L$0;
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

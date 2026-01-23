package io.ktor.client.request.forms;

import com.plaid.internal.EnumC7081g;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.WriterSession3;
import io.ktor.utils.p478io.charsets.CharsetJVM;
import io.ktor.utils.p478io.core.Buffer;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.core.InputArrays;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: FormDataContent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m3636d2 = {"RN_BYTES", "", "generateBoundary", "", "copyTo", "", "Lio/ktor/utils/io/core/Input;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/core/Input;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.request.forms.FormDataContentKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class FormDataContent {
    private static final byte[] RN_BYTES;

    /* compiled from: FormDataContent.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.request.forms.FormDataContentKt", m3645f = "FormDataContent.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "copyTo")
    /* renamed from: io.ktor.client.request.forms.FormDataContentKt$copyTo$1 */
    static final class C455841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C455841(Continuation<? super C455841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormDataContent.copyTo(null, null, this);
        }
    }

    static {
        byte[] bArrEncodeToByteArray;
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray = StringsKt.encodeToByteArray("\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder, "\r\n", 0, 2);
        }
        RN_BYTES = bArrEncodeToByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateBoundary() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            String string2 = Integer.toString(Random.INSTANCE.nextInt(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
            sb.append(string2);
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
        return StringsKt.take(string3, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r18.writePacket((io.ktor.utils.p478io.core.ByteReadPacket) r0, r2) == r3) goto L46;
     */
    /* JADX WARN: Path cross not found for [B:10:0x002a, B:20:0x006f], limit reached: 50 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d4 -> B:28:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(Input input, ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) throws Throwable {
        C455841 c455841;
        ByteWriteChannel byteWriteChannel2;
        Input input2;
        Object objRequestWriteBuffer;
        ByteWriteChannel byteWriteChannel3;
        Buffer empty;
        int iM28484readAvailableUAd2zVI;
        Input input3 = input;
        if (continuation instanceof C455841) {
            c455841 = (C455841) continuation;
            int i = c455841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455841.label = i - Integer.MIN_VALUE;
            } else {
                c455841 = new C455841(continuation);
            }
        }
        Object obj = c455841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (input3 instanceof ByteReadPacket) {
                c455841.label = 1;
            } else {
                byteWriteChannel2 = byteWriteChannel;
                if (!input3.getEndOfInput()) {
                }
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) c455841.L$2;
                ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) c455841.L$1;
                input2 = (Input) c455841.L$0;
                ResultKt.throwOnFailure(obj);
                byteWriteChannel2 = byteWriteChannel4;
                byteWriteChannel3 = byteWriteChannel5;
                objRequestWriteBuffer = obj;
                empty = (Buffer) objRequestWriteBuffer;
                if (empty == null) {
                }
                iM28484readAvailableUAd2zVI = 0;
                ByteBuffer memory = empty.getMemory();
                long writePosition = empty.getWritePosition();
                iM28484readAvailableUAd2zVI = (int) InputArrays.m28484readAvailableUAd2zVI(input2, memory, writePosition, empty.getLimit() - writePosition);
                empty.commitWritten(iM28484readAvailableUAd2zVI);
                Integer numBoxInt = boxing.boxInt(iM28484readAvailableUAd2zVI);
                c455841.L$0 = input2;
                c455841.L$1 = byteWriteChannel3;
                c455841.L$2 = numBoxInt;
                c455841.label = 3;
                if (WriterSession3.completeWriting(byteWriteChannel2, empty, iM28484readAvailableUAd2zVI, c455841) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) c455841.L$0;
                ResultKt.throwOnFailure(obj);
                throw th;
            }
            ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) c455841.L$1;
            Input input4 = (Input) c455841.L$0;
            ResultKt.throwOnFailure(obj);
            byteWriteChannel2 = byteWriteChannel6;
            input3 = input4;
            if (!input3.getEndOfInput()) {
                c455841.L$0 = input3;
                c455841.L$1 = byteWriteChannel2;
                c455841.L$2 = byteWriteChannel2;
                c455841.label = 2;
                objRequestWriteBuffer = WriterSession3.requestWriteBuffer(byteWriteChannel2, 1, c455841);
                if (objRequestWriteBuffer != coroutine_suspended) {
                    try {
                        input2 = input3;
                        byteWriteChannel3 = byteWriteChannel2;
                        empty = (Buffer) objRequestWriteBuffer;
                        if (empty == null) {
                            empty = Buffer.INSTANCE.getEmpty();
                        }
                        ByteBuffer memory2 = empty.getMemory();
                        long writePosition2 = empty.getWritePosition();
                        iM28484readAvailableUAd2zVI = (int) InputArrays.m28484readAvailableUAd2zVI(input2, memory2, writePosition2, empty.getLimit() - writePosition2);
                        empty.commitWritten(iM28484readAvailableUAd2zVI);
                        Integer numBoxInt2 = boxing.boxInt(iM28484readAvailableUAd2zVI);
                        c455841.L$0 = input2;
                        c455841.L$1 = byteWriteChannel3;
                        c455841.L$2 = numBoxInt2;
                        c455841.label = 3;
                        if (WriterSession3.completeWriting(byteWriteChannel2, empty, iM28484readAvailableUAd2zVI, c455841) != coroutine_suspended) {
                            byteWriteChannel2 = byteWriteChannel3;
                            input3 = input2;
                            if (!input3.getEndOfInput()) {
                                return Unit.INSTANCE;
                            }
                        }
                    } catch (Throwable th2) {
                        c455841.L$0 = th2;
                        c455841.L$1 = null;
                        c455841.L$2 = null;
                        c455841.label = 4;
                        if (WriterSession3.completeWriting(byteWriteChannel2, empty, iM28484readAvailableUAd2zVI, c455841) != coroutine_suspended) {
                            throw th2;
                        }
                    }
                    iM28484readAvailableUAd2zVI = 0;
                }
                return coroutine_suspended;
            }
        }
    }
}

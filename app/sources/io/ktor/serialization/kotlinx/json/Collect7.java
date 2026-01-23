package io.ktor.serialization.kotlinx.json;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import io.ktor.utils.p478io.ByteWriteChannel;
import io.ktor.utils.p478io.ByteWriteChannel2;
import io.ktor.utils.p478io.charsets.CharsetJVM;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.KSerializer;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Collect.kt */
@Metadata(m3635d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m3636d2 = {"io/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "I", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class Collect7<T> implements FlowCollector<T> {
    final /* synthetic */ ByteWriteChannel $channel$inlined;
    final /* synthetic */ Charset $charset$inlined;
    final /* synthetic */ KotlinxSerializationJsonExtensions2 $jsonArraySymbols$inlined;
    final /* synthetic */ KSerializer $serializer$inlined;
    private int index;
    final /* synthetic */ KotlinxSerializationJsonExtensions this$0;

    /* compiled from: Collect.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", m3645f = "KotlinxSerializationJsonExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "emit")
    @SourceDebugExtension
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Collect7.this.emit(null, this);
        }
    }

    public Collect7(ByteWriteChannel byteWriteChannel, KotlinxSerializationJsonExtensions2 kotlinxSerializationJsonExtensions2, KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, KSerializer kSerializer, Charset charset) {
        this.$channel$inlined = byteWriteChannel;
        this.$jsonArraySymbols$inlined = kotlinxSerializationJsonExtensions2;
        this.this$0 = kotlinxSerializationJsonExtensions;
        this.$serializer$inlined = kSerializer;
        this.$charset$inlined = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (io.ktor.utils.p478io.ByteWriteChannel2.writeFully(r2, r9, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        T t2;
        Collect7<T> collect7;
        Collect7<T> collect72;
        byte[] bArrEncodeToByteArray;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = this.index;
            this.index = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            if (i3 <= 0) {
                t2 = t;
                collect7 = this;
                String strEncodeToString = collect7.this$0.format.encodeToString(collect7.$serializer$inlined, t2);
                ByteWriteChannel byteWriteChannel = collect7.$channel$inlined;
                if (Intrinsics.areEqual(collect7.$charset$inlined, Charsets.UTF_8)) {
                    CharsetEncoder charsetEncoderNewEncoder = collect7.$charset$inlined.newEncoder();
                    Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
                    bArrEncodeToByteArray = CharsetJVM.encodeToByteArray(charsetEncoderNewEncoder, strEncodeToString, 0, strEncodeToString.length());
                } else {
                    bArrEncodeToByteArray = StringsKt.encodeToByteArray(strEncodeToString);
                }
                anonymousClass1.L$0 = collect7;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
            } else {
                ByteWriteChannel byteWriteChannel2 = this.$channel$inlined;
                byte[] objectSeparator = this.$jsonArraySymbols$inlined.getObjectSeparator();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = t;
                anonymousClass1.label = 1;
                if (ByteWriteChannel2.writeFully(byteWriteChannel2, objectSeparator, anonymousClass1) != coroutine_suspended) {
                    collect72 = this;
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collect7 = (Collect7) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                collect7.$channel$inlined.flush();
                return Unit.INSTANCE;
            }
            t = (T) anonymousClass1.L$1;
            collect72 = (Collect7) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        t2 = t;
        collect7 = collect72;
        String strEncodeToString2 = collect7.this$0.format.encodeToString(collect7.$serializer$inlined, t2);
        ByteWriteChannel byteWriteChannel3 = collect7.$channel$inlined;
        if (Intrinsics.areEqual(collect7.$charset$inlined, Charsets.UTF_8)) {
        }
        anonymousClass1.L$0 = collect7;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
    }
}

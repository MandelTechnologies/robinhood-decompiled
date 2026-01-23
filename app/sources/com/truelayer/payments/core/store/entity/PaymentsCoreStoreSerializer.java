package com.truelayer.payments.core.store.entity;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.Serializer2;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.truelayer.payments.core.PaymentsCoreStore;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentsCoreStoreSerializer.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/store/entity/PaymentsCoreStoreSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/truelayer/payments/core/PaymentsCoreStore;", "()V", "defaultValue", "getDefaultValue", "()Lcom/truelayer/payments/core/PaymentsCoreStore;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/truelayer/payments/core/PaymentsCoreStore;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PaymentsCoreStoreSerializer implements Serializer<PaymentsCoreStore> {
    public static final PaymentsCoreStoreSerializer INSTANCE = new PaymentsCoreStoreSerializer();
    private static final PaymentsCoreStore defaultValue;

    private PaymentsCoreStoreSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(PaymentsCoreStore paymentsCoreStore, OutputStream outputStream, Continuation continuation) {
        return writeTo2(paymentsCoreStore, outputStream, (Continuation<? super Unit>) continuation);
    }

    static {
        PaymentsCoreStore defaultInstance = PaymentsCoreStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public PaymentsCoreStore getDefaultValue() {
        return defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation<? super PaymentsCoreStore> continuation) throws IOException {
        try {
            PaymentsCoreStore from = PaymentsCoreStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new Serializer2("Cannot read proto.", e);
        }
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(PaymentsCoreStore paymentsCoreStore, OutputStream outputStream, Continuation<? super Unit> continuation) throws IOException {
        paymentsCoreStore.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}

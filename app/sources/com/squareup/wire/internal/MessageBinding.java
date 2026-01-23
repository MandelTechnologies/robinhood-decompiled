package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Syntax;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MessageBinding.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\nH&¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u00028\u0001H&¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H&¢\u0006\u0002\u0010$J/\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00028\u0001H&¢\u0006\u0002\u0010,R\u001a\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/internal/MessageBinding;", "M", "", "B", "messageType", "Lkotlin/reflect/KClass;", "getMessageType", "()Lkotlin/reflect/KClass;", "fields", "", "", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "getFields", "()Ljava/util/Map;", "typeUrl", "", "getTypeUrl", "()Ljava/lang/String;", "syntax", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "unknownFields", "Lokio/ByteString;", "message", "(Ljava/lang/Object;)Lokio/ByteString;", "getCachedSerializedSize", "(Ljava/lang/Object;)I", "setCachedSerializedSize", "", "size", "(Ljava/lang/Object;I)V", "newBuilder", "()Ljava/lang/Object;", "build", "builder", "(Ljava/lang/Object;)Ljava/lang/Object;", "addUnknownField", "tag", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "value", "(Ljava/lang/Object;ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "clearUnknownFields", "(Ljava/lang/Object;)V", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface MessageBinding<M, B> {
    void addUnknownField(B builder, int tag, FieldEncoding fieldEncoding, Object value);

    M build(B builder);

    void clearUnknownFields(B builder);

    int getCachedSerializedSize(M message);

    Map<Integer, FieldOrOneOfBinding<M, B>> getFields();

    KClass<? super M> getMessageType();

    Syntax getSyntax();

    String getTypeUrl();

    B newBuilder();

    void setCachedSerializedSize(M message, int size);

    ByteString unknownFields(M message);
}

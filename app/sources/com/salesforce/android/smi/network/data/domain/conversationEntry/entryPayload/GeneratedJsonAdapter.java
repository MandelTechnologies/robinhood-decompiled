package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EntryPayload_MessagePayloadJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload_MessagePayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload$MessagePayload;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "messageAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "nullableMessageReasonAdapter", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/MessageReason;", "nullableBooleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload_MessagePayloadJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<EntryPayload.MessagePayload> {
    private volatile Constructor<EntryPayload.MessagePayload> constructorRef;
    private final JsonAdapter<Message> messageAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<MessageReason> nullableMessageReasonAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("id", "abstractMessage", "messageReason", "wasRevised");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Message> jsonAdapterAdapter2 = moshi.adapter(Message.class, SetsKt.emptySet(), "abstractMessage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.messageAdapter = jsonAdapterAdapter2;
        JsonAdapter<MessageReason> jsonAdapterAdapter3 = moshi.adapter(MessageReason.class, SetsKt.emptySet(), "messageReason");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableMessageReasonAdapter = jsonAdapterAdapter3;
        JsonAdapter<Boolean> jsonAdapterAdapter4 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "wasRevised");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EntryPayload.MessagePayload");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public EntryPayload.MessagePayload fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        Message messageFromJson = null;
        MessageReason messageReasonFromJson = null;
        Boolean boolFromJson = null;
        int i = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("id", "id", reader);
                }
            } else if (iSelectName == 1) {
                messageFromJson = this.messageAdapter.fromJson(reader);
                if (messageFromJson == null) {
                    throw Util.unexpectedNull("abstractMessage", "abstractMessage", reader);
                }
            } else if (iSelectName == 2) {
                messageReasonFromJson = this.nullableMessageReasonAdapter.fromJson(reader);
                i &= -5;
            } else if (iSelectName == 3) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                i &= -17;
            }
        }
        reader.endObject();
        if (i == -21) {
            MessageReason messageReason = messageReasonFromJson;
            Message message = messageFromJson;
            String str = strFromJson;
            if (str == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            if (message != null) {
                return new EntryPayload.MessagePayload(str, message, messageReason, null, boolFromJson, 8, null);
            }
            throw Util.missingProperty("abstractMessage", "abstractMessage", reader);
        }
        MessageReason messageReason2 = messageReasonFromJson;
        Message message2 = messageFromJson;
        String str2 = strFromJson;
        Constructor<EntryPayload.MessagePayload> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = EntryPayload.MessagePayload.class.getDeclaredConstructor(String.class, Message.class, MessageReason.class, String.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str2 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (message2 == null) {
            throw Util.missingProperty("abstractMessage", "abstractMessage", reader);
        }
        EntryPayload.MessagePayload messagePayloadNewInstance = declaredConstructor.newInstance(str2, message2, messageReason2, null, boolFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(messagePayloadNewInstance, "newInstance(...)");
        return messagePayloadNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, EntryPayload.MessagePayload value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getId());
        writer.name("abstractMessage");
        this.messageAdapter.toJson(writer, (JsonWriter) value_.getAbstractMessage());
        writer.name("messageReason");
        this.nullableMessageReasonAdapter.toJson(writer, (JsonWriter) value_.getMessageReason());
        writer.name("wasRevised");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.getWasRevised());
        writer.endObject();
    }
}

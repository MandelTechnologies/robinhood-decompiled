package com.withpersona.sdk2.inquiry.network.dto.p421ui;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BasicButtonAttributesJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableButtonTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableStringAdapter", "nullableIntAdapter", "", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributesJsonAdapter, reason: from toString */
/* loaded from: classes18.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<BaseButtonAttributes2> {
    private volatile Constructor<BaseButtonAttributes2> constructorRef;
    private final JsonAdapter<Button.ButtonType> nullableButtonTypeAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("text", "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "text");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Button.ButtonType> jsonAdapterAdapter2 = moshi.adapter(Button.ButtonType.class, SetsKt.emptySet(), "buttonType");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableButtonTypeAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "autoSubmitCountdownText");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<Integer> jsonAdapterAdapter4 = moshi.adapter(Integer.class, SetsKt.emptySet(), "autoSubmitIntervalSeconds");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableIntAdapter = jsonAdapterAdapter4;
        JsonAdapter<JsonLogicBoolean> jsonAdapterAdapter5 = moshi.adapter(JsonLogicBoolean.class, SetsKt.emptySet(), "hidden");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BasicButtonAttributes");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public BaseButtonAttributes2 fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i = -1;
        String strFromJson = null;
        Button.ButtonType buttonTypeFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("text", "text", reader);
                    }
                    break;
                case 1:
                    buttonTypeFromJson = this.nullableButtonTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -61) {
            JsonLogicBoolean jsonLogicBoolean = jsonLogicBooleanFromJson2;
            JsonLogicBoolean jsonLogicBoolean2 = jsonLogicBooleanFromJson;
            Integer num = numFromJson;
            String str = strFromJson2;
            Button.ButtonType buttonType = buttonTypeFromJson;
            String str2 = strFromJson;
            if (str2 != null) {
                return new BaseButtonAttributes2(str2, buttonType, str, num, jsonLogicBoolean2, jsonLogicBoolean);
            }
            throw Util.missingProperty("text", "text", reader);
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBooleanFromJson2;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBooleanFromJson;
        Integer num2 = numFromJson;
        String str3 = strFromJson2;
        Button.ButtonType buttonType2 = buttonTypeFromJson;
        String str4 = strFromJson;
        Constructor<BaseButtonAttributes2> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BaseButtonAttributes2.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str4 == null) {
            throw Util.missingProperty("text", "text", reader);
        }
        BaseButtonAttributes2 baseButtonAttributes2NewInstance = declaredConstructor.newInstance(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(baseButtonAttributes2NewInstance, "newInstance(...)");
        return baseButtonAttributes2NewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, BaseButtonAttributes2 value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("text");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getText());
        writer.name("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, (JsonWriter) value_.getButtonType());
        writer.name("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAutoSubmitCountdownText());
        writer.name("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getAutoSubmitIntervalSeconds());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (JsonWriter) value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (JsonWriter) value_.getDisabled());
        writer.endObject();
    }
}

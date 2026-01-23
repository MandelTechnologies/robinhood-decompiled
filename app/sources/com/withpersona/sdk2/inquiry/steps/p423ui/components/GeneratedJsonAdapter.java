package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClickableStackComponentJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfUiComponentAdapter", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableClickableStackComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentJsonAdapter, reason: from toString */
/* loaded from: classes18.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ClickableStackComponent> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ClickableStackComponent> constructorRef;
    private final JsonAdapter<List<UiComponent>> listOfUiComponentAdapter;
    private final JsonAdapter<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;
    private final JsonAdapter<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("name", "children", "hidden", "disabled", "styles", "isActive");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<UiComponent>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, UiComponent.class), SetsKt.emptySet(), "children");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.listOfUiComponentAdapter = jsonAdapterAdapter2;
        JsonAdapter<JsonLogicBoolean> jsonAdapterAdapter3 = moshi.adapter(JsonLogicBoolean.class, SetsKt.emptySet(), "hidden");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = jsonAdapterAdapter3;
        JsonAdapter<ClickableStack.ClickableStackComponentStyle> jsonAdapterAdapter4 = moshi.adapter(ClickableStack.ClickableStackComponentStyle.class, SetsKt.emptySet(), "styles");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableClickableStackComponentStyleAdapter = jsonAdapterAdapter4;
        JsonAdapter<Boolean> jsonAdapterAdapter5 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isActive");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClickableStackComponent");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ClickableStackComponent fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        List<UiComponent> listFromJson = null;
        Boolean boolFromJson = bool;
        String strFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyleFromJson = null;
        int i = -1;
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
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                    break;
                case 1:
                    listFromJson = this.listOfUiComponentAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw Util.unexpectedNull("children", "children", reader);
                    }
                    break;
                case 2:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    clickableStackComponentStyleFromJson = this.nullableClickableStackComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("isActive", "isActive", reader);
                    }
                    i = -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -33) {
            if (strFromJson == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            if (listFromJson != null) {
                return new ClickableStackComponent(strFromJson, listFromJson, jsonLogicBooleanFromJson2, jsonLogicBooleanFromJson, clickableStackComponentStyleFromJson, boolFromJson.booleanValue());
            }
            throw Util.missingProperty("children", "children", reader);
        }
        Constructor<ClickableStackComponent> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        if (listFromJson == null) {
            throw Util.missingProperty("children", "children", reader);
        }
        JsonLogicBoolean jsonLogicBoolean = jsonLogicBooleanFromJson;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = clickableStackComponentStyleFromJson;
        ClickableStackComponent clickableStackComponentNewInstance = declaredConstructor.newInstance(strFromJson, listFromJson, jsonLogicBooleanFromJson2, jsonLogicBoolean, clickableStackComponentStyle, boolFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(clickableStackComponentNewInstance, "newInstance(...)");
        return clickableStackComponentNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ClickableStackComponent value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getName());
        writer.name("children");
        this.listOfUiComponentAdapter.toJson(writer, (JsonWriter) value_.getChildren());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (JsonWriter) value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, (JsonWriter) value_.getDisabled());
        writer.name("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(writer, (JsonWriter) value_.getStyles());
        writer.name("isActive");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.getIsActive()));
        writer.endObject();
    }
}

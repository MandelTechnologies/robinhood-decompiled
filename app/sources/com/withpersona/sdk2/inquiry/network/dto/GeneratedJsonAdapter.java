package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NextStep_Ui_ConfigJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableListOfUiComponentConfigAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableBooleanAdapter", "", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "nullableListOfUiComponentErrorAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep_Ui_ConfigJsonAdapter, reason: from toString */
/* loaded from: classes18.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<NextStep.C43686Ui.Config> {
    private volatile Constructor<NextStep.C43686Ui.Config> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;
    private final JsonAdapter<List<UiComponentError>> nullableListOfUiComponentErrorAdapter;
    private final JsonAdapter<NextStep.C43686Ui.Localizations> nullableLocalizationsAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<List<UiComponentConfig>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, UiComponentConfig.class), SetsKt.emptySet(), "components");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "backStepEnabled");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<NextStep.C43686Ui.Localizations> jsonAdapterAdapter3 = moshi.adapter(NextStep.C43686Ui.Localizations.class, SetsKt.emptySet(), "localizations");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableLocalizationsAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<UiComponentError>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, UiComponentError.class), SetsKt.emptySet(), "serverComponentErrors");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableListOfUiComponentErrorAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Ui.Config");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.C43686Ui.Config fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i = -1;
        List<UiComponentConfig> listFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        NextStep.C43686Ui.Localizations localizationsFromJson = null;
        List<UiComponentError> listFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    listFromJson = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
                    break;
                case 1:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    localizationsFromJson = this.nullableLocalizationsAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    listFromJson2 = this.nullableListOfUiComponentErrorAdapter.fromJson(reader);
                    i &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -63) {
            List<UiComponentError> list = listFromJson2;
            NextStep.C43686Ui.Localizations localizations = localizationsFromJson;
            Boolean bool = boolFromJson3;
            return new NextStep.C43686Ui.Config(listFromJson, boolFromJson, boolFromJson2, bool, localizations, list);
        }
        List<UiComponentError> list2 = listFromJson2;
        NextStep.C43686Ui.Localizations localizations2 = localizationsFromJson;
        Boolean bool2 = boolFromJson3;
        Boolean bool3 = boolFromJson2;
        Boolean bool4 = boolFromJson;
        List<UiComponentConfig> list3 = listFromJson;
        Constructor<NextStep.C43686Ui.Config> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.C43686Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.C43686Ui.Localizations.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        NextStep.C43686Ui.Config configNewInstance = declaredConstructor.newInstance(list3, bool4, bool3, bool2, localizations2, list2, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(configNewInstance, "newInstance(...)");
        return configNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.C43686Ui.Config value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, (JsonWriter) value_.getComponents());
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.getCancelButtonEnabled());
        writer.name("terminal");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.getTerminal());
        writer.name("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, (JsonWriter) value_.getLocalizations());
        writer.name("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(writer, (JsonWriter) value_.getServerComponentErrors());
        writer.endObject();
    }
}

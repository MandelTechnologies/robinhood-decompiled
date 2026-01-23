package com.salesforce.android.smi.network.internal.dto.response.businesshours;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessHoursInfoJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfo;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "booleanAdapter", "", "listOfBusinessHoursAdapter", "", "Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHours;", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.network.internal.dto.response.businesshours.BusinessHoursInfoJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<BusinessHoursInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BusinessHoursInfo> constructorRef;
    private final JsonAdapter<List<BusinessHours>> listOfBusinessHoursAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("name", "isActive", "businessHours", "requestTimestamp");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isActive");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<BusinessHours>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, BusinessHours.class), SetsKt.emptySet(), "businessHours");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfBusinessHoursAdapter = jsonAdapterAdapter3;
        JsonAdapter<Long> jsonAdapterAdapter4 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "requestTimestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BusinessHoursInfo");
        sb.append(')');
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public BusinessHoursInfo fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long lFromJson = 0L;
        String strFromJson = null;
        Boolean boolFromJson = null;
        List<BusinessHours> listFromJson = null;
        int i = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("name", "name", reader);
                }
            } else if (iSelectName == 1) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw Util.unexpectedNull("isActive", "isActive", reader);
                }
            } else if (iSelectName == 2) {
                listFromJson = this.listOfBusinessHoursAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw Util.unexpectedNull("businessHours", "businessHours", reader);
                }
            } else if (iSelectName == 3) {
                lFromJson = this.longAdapter.fromJson(reader);
                if (lFromJson == null) {
                    throw Util.unexpectedNull("requestTimestamp", "requestTimestamp", reader);
                }
                i = -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -9) {
            if (strFromJson == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            if (boolFromJson != null) {
                boolean zBooleanValue = boolFromJson.booleanValue();
                if (listFromJson != null) {
                    return new BusinessHoursInfo(strFromJson, zBooleanValue, listFromJson, lFromJson.longValue());
                }
                throw Util.missingProperty("businessHours", "businessHours", reader);
            }
            throw Util.missingProperty("isActive", "isActive", reader);
        }
        Constructor<BusinessHoursInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BusinessHoursInfo.class.getDeclaredConstructor(String.class, Boolean.TYPE, List.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        if (boolFromJson == null) {
            throw Util.missingProperty("isActive", "isActive", reader);
        }
        if (listFromJson == null) {
            throw Util.missingProperty("businessHours", "businessHours", reader);
        }
        BusinessHoursInfo businessHoursInfoNewInstance = declaredConstructor.newInstance(strFromJson, boolFromJson, listFromJson, lFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(businessHoursInfoNewInstance, "newInstance(...)");
        return businessHoursInfoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, BusinessHoursInfo value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getName());
        writer.name("isActive");
        this.booleanAdapter.toJson(writer, (JsonWriter) Boolean.valueOf(value_.isActive()));
        writer.name("businessHours");
        this.listOfBusinessHoursAdapter.toJson(writer, (JsonWriter) value_.getBusinessHours());
        writer.name("requestTimestamp");
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getRequestTimestamp()));
        writer.endObject();
    }
}

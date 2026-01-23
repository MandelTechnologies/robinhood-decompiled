package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean3;
import defpackage.JsonLogicResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JsonLogicBoolean.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Landroid/os/Parcelable;", "rule", "", "<init>", "(Ljava/lang/String;)V", "getRule", "()Ljava/lang/String;", "parsedRules", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "getParsedRules$annotations", "()V", "getParsedRules", "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "parsedRules$delegate", "Lkotlin/Lazy;", "getValue", "", "formValues", "", "", "thisComponentValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Boolean;", "component1", "copy", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class JsonLogicBoolean implements Parcelable {

    /* renamed from: parsedRules$delegate, reason: from kotlin metadata */
    private final Lazy parsedRules;
    private final String rule;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    /* compiled from: JsonLogicBoolean.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JsonLogicBoolean(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean[] newArray(int i) {
            return new JsonLogicBoolean[i];
        }
    }

    public static /* synthetic */ JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    @Json(ignore = true)
    private static /* synthetic */ void getParsedRules$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final JsonLogicBoolean copy(String rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        return new JsonLogicBoolean(rule);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonLogicBoolean) && Intrinsics.areEqual(this.rule, ((JsonLogicBoolean) other).rule);
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    public String toString() {
        return "JsonLogicBoolean(rule=" + this.rule + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rule);
    }

    public JsonLogicBoolean(String rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.rule = rule;
        this.parsedRules = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonLogicBoolean.parsedRules_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final String getRule() {
        return this.rule;
    }

    private final JsonLogicBoolean3 getParsedRules() {
        return (JsonLogicBoolean3) this.parsedRules.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonLogicBoolean3 parsedRules_delegate$lambda$1(JsonLogicBoolean jsonLogicBoolean) throws IOException {
        Object objFromJson = new Moshi.Builder().build().adapter(Object.class).nullSafe().lenient().fromJson(jsonLogicBoolean.rule);
        if (!(objFromJson instanceof Map)) {
            if (objFromJson instanceof Boolean) {
                return new JsonLogicBoolean3.PrimitiveRule(objFromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            Object key = entry.getKey();
            Tuples2 tuples2M3642to = key instanceof String ? Tuples4.m3642to(key, entry.getValue()) : null;
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return new JsonLogicBoolean3.ComplexRules(MapsKt.toMap(arrayList));
    }

    public final Boolean getValue(Map<String, ? extends Object> formValues, Object thisComponentValue) {
        Intrinsics.checkNotNullParameter(formValues, "formValues");
        JsonLogicBoolean3 parsedRules = getParsedRules();
        if (parsedRules == null) {
            return null;
        }
        if (parsedRules instanceof JsonLogicBoolean3.ComplexRules) {
            JsonLogicResult jsonLogicResultEvaluate = JsonLogicBoolean2.getJsonLogicEngine().evaluate(((JsonLogicBoolean3.ComplexRules) parsedRules).getExpression(), MapsKt.mapOf(Tuples4.m3642to("form", formValues), Tuples4.m3642to("value", thisComponentValue)));
            if (jsonLogicResultEvaluate instanceof JsonLogicResult.Success) {
                Object value = ((JsonLogicResult.Success) jsonLogicResultEvaluate).getValue();
                if (value instanceof Boolean) {
                    return (Boolean) value;
                }
                return null;
            }
            if (Intrinsics.areEqual(jsonLogicResultEvaluate, JsonLogicResult.Failure.NullResult.INSTANCE) || Intrinsics.areEqual(jsonLogicResultEvaluate, JsonLogicResult.Failure.EmptyExpression.INSTANCE) || Intrinsics.areEqual(jsonLogicResultEvaluate, JsonLogicResult.Failure.MissingOperation.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(parsedRules instanceof JsonLogicBoolean3.PrimitiveRule)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonLogicBoolean3.PrimitiveRule primitiveRule = (JsonLogicBoolean3.PrimitiveRule) parsedRules;
        if (primitiveRule.getValue() instanceof Boolean) {
            return (Boolean) primitiveRule.getValue();
        }
        return null;
    }

    /* compiled from: JsonLogicBoolean.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion extends JsonAdapter<JsonLogicBoolean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, JsonLogicBoolean value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public JsonLogicBoolean fromJson(JsonReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return new JsonLogicBoolean(reader.nextSource().readByteString().utf8());
        }
    }
}

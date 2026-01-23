package com.robinhood.android.api.supportchat;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import io.jsonwebtoken.Claims;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JwtClaimJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/JwtClaimJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/api/supportchat/JwtClaim;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "longAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.api.supportchat.JwtClaimJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<JwtClaim> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of(Claims.ISSUER, Claims.SUBJECT, Claims.AUDIENCE, Claims.EXPIRATION);
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "issuer");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<Long> jsonAdapterAdapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "expirationEpochS");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("JwtClaim");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public JwtClaim fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long lFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 2) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
            } else if (iSelectName == 3 && (lFromJson = this.longAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("expirationEpochS", Claims.EXPIRATION, reader);
            }
        }
        reader.endObject();
        if (lFromJson != null) {
            return new JwtClaim(strFromJson, strFromJson2, strFromJson3, lFromJson.longValue());
        }
        throw Util.missingProperty("expirationEpochS", Claims.EXPIRATION, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, JwtClaim value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name(Claims.ISSUER);
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getIssuer());
        writer.name(Claims.SUBJECT);
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getSubject());
        writer.name(Claims.AUDIENCE);
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getAudience());
        writer.name(Claims.EXPIRATION);
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getExpirationEpochS()));
        writer.endObject();
    }
}

package com.withpersona.sdk2.inquiry.network.dto.p421ui.styling;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalImageComponentStyleJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableLocalImageStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;", "nullableLocalImageFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;", "nullableLocalImageHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;", "nullableLocalImageWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;", "nullableLocalImageJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;", "nullableLocalImageMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyleJsonAdapter, reason: from toString */
/* loaded from: classes18.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<LocalImageComponentStyle> {
    private volatile Constructor<LocalImageComponentStyle> constructorRef;
    private final JsonAdapter<AttributeStyles.LocalImageFillColorStyle> nullableLocalImageFillColorStyleAdapter;
    private final JsonAdapter<AttributeStyles.LocalImageHeightStyle> nullableLocalImageHeightStyleAdapter;
    private final JsonAdapter<AttributeStyles.LocalImageJustifyStyle> nullableLocalImageJustifyStyleAdapter;
    private final JsonAdapter<AttributeStyles.LocalImageMarginStyle> nullableLocalImageMarginStyleAdapter;
    private final JsonAdapter<AttributeStyles.LocalImageStrokeColorStyle> nullableLocalImageStrokeColorStyleAdapter;
    private final JsonAdapter<AttributeStyles.LocalImageWidthStyle> nullableLocalImageWidthStyleAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("strokeColor", "fillColor", "height", "width", "justify", GoldFeature.MARGIN);
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<AttributeStyles.LocalImageStrokeColorStyle> jsonAdapterAdapter = moshi.adapter(AttributeStyles.LocalImageStrokeColorStyle.class, SetsKt.emptySet(), "strokeColor");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableLocalImageStrokeColorStyleAdapter = jsonAdapterAdapter;
        JsonAdapter<AttributeStyles.LocalImageFillColorStyle> jsonAdapterAdapter2 = moshi.adapter(AttributeStyles.LocalImageFillColorStyle.class, SetsKt.emptySet(), "fillColor");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableLocalImageFillColorStyleAdapter = jsonAdapterAdapter2;
        JsonAdapter<AttributeStyles.LocalImageHeightStyle> jsonAdapterAdapter3 = moshi.adapter(AttributeStyles.LocalImageHeightStyle.class, SetsKt.emptySet(), "height");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableLocalImageHeightStyleAdapter = jsonAdapterAdapter3;
        JsonAdapter<AttributeStyles.LocalImageWidthStyle> jsonAdapterAdapter4 = moshi.adapter(AttributeStyles.LocalImageWidthStyle.class, SetsKt.emptySet(), "width");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableLocalImageWidthStyleAdapter = jsonAdapterAdapter4;
        JsonAdapter<AttributeStyles.LocalImageJustifyStyle> jsonAdapterAdapter5 = moshi.adapter(AttributeStyles.LocalImageJustifyStyle.class, SetsKt.emptySet(), "justify");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableLocalImageJustifyStyleAdapter = jsonAdapterAdapter5;
        JsonAdapter<AttributeStyles.LocalImageMarginStyle> jsonAdapterAdapter6 = moshi.adapter(AttributeStyles.LocalImageMarginStyle.class, SetsKt.emptySet(), GoldFeature.MARGIN);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.nullableLocalImageMarginStyleAdapter = jsonAdapterAdapter6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LocalImageComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public LocalImageComponentStyle fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i = -1;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyleFromJson = null;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyleFromJson = null;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyleFromJson = null;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyleFromJson = null;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyleFromJson = null;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyleFromJson = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    localImageStrokeColorStyleFromJson = this.nullableLocalImageStrokeColorStyleAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    localImageFillColorStyleFromJson = this.nullableLocalImageFillColorStyleAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    localImageHeightStyleFromJson = this.nullableLocalImageHeightStyleAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    localImageWidthStyleFromJson = this.nullableLocalImageWidthStyleAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    localImageJustifyStyleFromJson = this.nullableLocalImageJustifyStyleAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    localImageMarginStyleFromJson = this.nullableLocalImageMarginStyleAdapter.fromJson(reader);
                    i &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -64) {
            AttributeStyles.LocalImageMarginStyle localImageMarginStyle = localImageMarginStyleFromJson;
            AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = localImageJustifyStyleFromJson;
            AttributeStyles.LocalImageWidthStyle localImageWidthStyle = localImageWidthStyleFromJson;
            return new LocalImageComponentStyle(localImageStrokeColorStyleFromJson, localImageFillColorStyleFromJson, localImageHeightStyleFromJson, localImageWidthStyle, localImageJustifyStyle, localImageMarginStyle);
        }
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle2 = localImageMarginStyleFromJson;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle2 = localImageJustifyStyleFromJson;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle2 = localImageWidthStyleFromJson;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = localImageHeightStyleFromJson;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = localImageFillColorStyleFromJson;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = localImageStrokeColorStyleFromJson;
        Constructor<LocalImageComponentStyle> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = LocalImageComponentStyle.class.getDeclaredConstructor(AttributeStyles.LocalImageStrokeColorStyle.class, AttributeStyles.LocalImageFillColorStyle.class, AttributeStyles.LocalImageHeightStyle.class, AttributeStyles.LocalImageWidthStyle.class, AttributeStyles.LocalImageJustifyStyle.class, AttributeStyles.LocalImageMarginStyle.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        LocalImageComponentStyle localImageComponentStyleNewInstance = declaredConstructor.newInstance(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle2, localImageJustifyStyle2, localImageMarginStyle2, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(localImageComponentStyleNewInstance, "newInstance(...)");
        return localImageComponentStyleNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, LocalImageComponentStyle value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("strokeColor");
        this.nullableLocalImageStrokeColorStyleAdapter.toJson(writer, (JsonWriter) value_.getStrokeColor());
        writer.name("fillColor");
        this.nullableLocalImageFillColorStyleAdapter.toJson(writer, (JsonWriter) value_.getFillColor());
        writer.name("height");
        this.nullableLocalImageHeightStyleAdapter.toJson(writer, (JsonWriter) value_.getHeight());
        writer.name("width");
        this.nullableLocalImageWidthStyleAdapter.toJson(writer, (JsonWriter) value_.getWidth());
        writer.name("justify");
        this.nullableLocalImageJustifyStyleAdapter.toJson(writer, (JsonWriter) value_.getJustify());
        writer.name(GoldFeature.MARGIN);
        this.nullableLocalImageMarginStyleAdapter.toJson(writer, (JsonWriter) value_.getMargin());
        writer.endObject();
    }
}

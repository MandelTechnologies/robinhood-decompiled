package com.robinhood.android.widget.util;

import com.robinhood.android.widget.util.PortfolioWidgetInfo;
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

/* compiled from: PortfolioWidgetInfoJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "updatePeriodAdapter", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$UpdatePeriod;", "displayedSecurityAdapter", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;", "displayedListsAdapter", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedLists;", "viewOptionAdapter", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$ViewOption;", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.widget.util.PortfolioWidgetInfoJsonAdapter, reason: from toString */
/* loaded from: classes20.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<PortfolioWidgetInfo> {
    private volatile Constructor<PortfolioWidgetInfo> constructorRef;
    private final JsonAdapter<PortfolioWidgetInfo.DisplayedLists> displayedListsAdapter;
    private final JsonAdapter<PortfolioWidgetInfo.DisplayedSecurity> displayedSecurityAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<PortfolioWidgetInfo.UpdatePeriod> updatePeriodAdapter;
    private final JsonAdapter<PortfolioWidgetInfo.ViewOption> viewOptionAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("update_period", "displayed_crypto", "displayed_option", "displayed_equity", "displayed_futures", "displayed_lists", "view_option", "min_width", "min_height", "max_width", "max_height");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<PortfolioWidgetInfo.UpdatePeriod> jsonAdapterAdapter = moshi.adapter(PortfolioWidgetInfo.UpdatePeriod.class, SetsKt.emptySet(), "updatePeriod");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.updatePeriodAdapter = jsonAdapterAdapter;
        JsonAdapter<PortfolioWidgetInfo.DisplayedSecurity> jsonAdapterAdapter2 = moshi.adapter(PortfolioWidgetInfo.DisplayedSecurity.class, SetsKt.emptySet(), "displayedCrypto");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.displayedSecurityAdapter = jsonAdapterAdapter2;
        JsonAdapter<PortfolioWidgetInfo.DisplayedLists> jsonAdapterAdapter3 = moshi.adapter(PortfolioWidgetInfo.DisplayedLists.class, SetsKt.emptySet(), "displayedLists");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.displayedListsAdapter = jsonAdapterAdapter3;
        JsonAdapter<PortfolioWidgetInfo.ViewOption> jsonAdapterAdapter4 = moshi.adapter(PortfolioWidgetInfo.ViewOption.class, SetsKt.emptySet(), "viewOption");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.viewOptionAdapter = jsonAdapterAdapter4;
        JsonAdapter<Integer> jsonAdapterAdapter5 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "minWidth");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.intAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PortfolioWidgetInfo");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PortfolioWidgetInfo fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i = -1;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Integer numFromJson3 = null;
        Integer numFromJson4 = null;
        PortfolioWidgetInfo.UpdatePeriod updatePeriodFromJson = null;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurityFromJson = null;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurityFromJson2 = null;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurityFromJson3 = null;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurityFromJson4 = null;
        PortfolioWidgetInfo.DisplayedLists displayedListsFromJson = null;
        PortfolioWidgetInfo.ViewOption viewOptionFromJson = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    updatePeriodFromJson = this.updatePeriodAdapter.fromJson(reader);
                    if (updatePeriodFromJson == null) {
                        throw Util.unexpectedNull("updatePeriod", "update_period", reader);
                    }
                    i &= -2;
                    break;
                case 1:
                    displayedSecurityFromJson = this.displayedSecurityAdapter.fromJson(reader);
                    if (displayedSecurityFromJson == null) {
                        throw Util.unexpectedNull("displayedCrypto", "displayed_crypto", reader);
                    }
                    i &= -3;
                    break;
                case 2:
                    displayedSecurityFromJson2 = this.displayedSecurityAdapter.fromJson(reader);
                    if (displayedSecurityFromJson2 == null) {
                        throw Util.unexpectedNull("displayedOption", "displayed_option", reader);
                    }
                    i &= -5;
                    break;
                case 3:
                    displayedSecurityFromJson3 = this.displayedSecurityAdapter.fromJson(reader);
                    if (displayedSecurityFromJson3 == null) {
                        throw Util.unexpectedNull("displayedEquity", "displayed_equity", reader);
                    }
                    i &= -9;
                    break;
                case 4:
                    displayedSecurityFromJson4 = this.displayedSecurityAdapter.fromJson(reader);
                    if (displayedSecurityFromJson4 == null) {
                        throw Util.unexpectedNull("displayedFutures", "displayed_futures", reader);
                    }
                    i &= -17;
                    break;
                case 5:
                    displayedListsFromJson = this.displayedListsAdapter.fromJson(reader);
                    if (displayedListsFromJson == null) {
                        throw Util.unexpectedNull("displayedLists", "displayed_lists", reader);
                    }
                    i &= -33;
                    break;
                case 6:
                    viewOptionFromJson = this.viewOptionAdapter.fromJson(reader);
                    if (viewOptionFromJson == null) {
                        throw Util.unexpectedNull("viewOption", "view_option", reader);
                    }
                    i &= -65;
                    break;
                case 7:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw Util.unexpectedNull("minWidth", "min_width", reader);
                    }
                    i &= -129;
                    break;
                case 8:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw Util.unexpectedNull("minHeight", "min_height", reader);
                    }
                    i &= -257;
                    break;
                case 9:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw Util.unexpectedNull("maxWidth", "max_width", reader);
                    }
                    i &= -513;
                    break;
                case 10:
                    numFromJson4 = this.intAdapter.fromJson(reader);
                    if (numFromJson4 == null) {
                        throw Util.unexpectedNull("maxHeight", "max_height", reader);
                    }
                    i &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i == -2048) {
            Intrinsics.checkNotNull(updatePeriodFromJson, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.UpdatePeriod");
            Intrinsics.checkNotNull(displayedSecurityFromJson, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity");
            Intrinsics.checkNotNull(displayedSecurityFromJson2, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity");
            Intrinsics.checkNotNull(displayedSecurityFromJson3, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity");
            Intrinsics.checkNotNull(displayedSecurityFromJson4, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity");
            Intrinsics.checkNotNull(displayedListsFromJson, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedLists");
            Intrinsics.checkNotNull(viewOptionFromJson, "null cannot be cast to non-null type com.robinhood.android.widget.util.PortfolioWidgetInfo.ViewOption");
            return new PortfolioWidgetInfo(updatePeriodFromJson, displayedSecurityFromJson, displayedSecurityFromJson2, displayedSecurityFromJson3, displayedSecurityFromJson4, displayedListsFromJson, viewOptionFromJson, numFromJson.intValue(), numFromJson2.intValue(), numFromJson3.intValue(), numFromJson4.intValue());
        }
        PortfolioWidgetInfo.UpdatePeriod updatePeriod = updatePeriodFromJson;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurity = displayedSecurityFromJson;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurity2 = displayedSecurityFromJson2;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurity3 = displayedSecurityFromJson3;
        PortfolioWidgetInfo.DisplayedSecurity displayedSecurity4 = displayedSecurityFromJson4;
        PortfolioWidgetInfo.DisplayedLists displayedLists = displayedListsFromJson;
        PortfolioWidgetInfo.ViewOption viewOption = viewOptionFromJson;
        Constructor<PortfolioWidgetInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = PortfolioWidgetInfo.class.getDeclaredConstructor(PortfolioWidgetInfo.UpdatePeriod.class, PortfolioWidgetInfo.DisplayedSecurity.class, PortfolioWidgetInfo.DisplayedSecurity.class, PortfolioWidgetInfo.DisplayedSecurity.class, PortfolioWidgetInfo.DisplayedSecurity.class, PortfolioWidgetInfo.DisplayedLists.class, PortfolioWidgetInfo.ViewOption.class, cls, cls, cls, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        PortfolioWidgetInfo portfolioWidgetInfoNewInstance = declaredConstructor.newInstance(updatePeriod, displayedSecurity, displayedSecurity2, displayedSecurity3, displayedSecurity4, displayedLists, viewOption, numFromJson, numFromJson2, numFromJson3, numFromJson4, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetInfoNewInstance, "newInstance(...)");
        return portfolioWidgetInfoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, PortfolioWidgetInfo value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("update_period");
        this.updatePeriodAdapter.toJson(writer, (JsonWriter) value_.getUpdatePeriod());
        writer.name("displayed_crypto");
        this.displayedSecurityAdapter.toJson(writer, (JsonWriter) value_.getDisplayedCrypto());
        writer.name("displayed_option");
        this.displayedSecurityAdapter.toJson(writer, (JsonWriter) value_.getDisplayedOption());
        writer.name("displayed_equity");
        this.displayedSecurityAdapter.toJson(writer, (JsonWriter) value_.getDisplayedEquity());
        writer.name("displayed_futures");
        this.displayedSecurityAdapter.toJson(writer, (JsonWriter) value_.getDisplayedFutures());
        writer.name("displayed_lists");
        this.displayedListsAdapter.toJson(writer, (JsonWriter) value_.getDisplayedLists());
        writer.name("view_option");
        this.viewOptionAdapter.toJson(writer, (JsonWriter) value_.getViewOption());
        writer.name("min_width");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMinWidth()));
        writer.name("min_height");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMinHeight()));
        writer.name("max_width");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMaxWidth()));
        writer.name("max_height");
        this.intAdapter.toJson(writer, (JsonWriter) Integer.valueOf(value_.getMaxHeight()));
        writer.endObject();
    }
}

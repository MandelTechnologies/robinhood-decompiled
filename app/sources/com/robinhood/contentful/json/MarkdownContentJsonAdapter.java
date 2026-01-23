package com.robinhood.contentful.json;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.utils.extensions.Moshi3;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarkdownContentJsonAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/contentful/json/MarkdownContentJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "()V", "KEY_RAW", "", "OPTIONS", "Lcom/squareup/moshi/JsonReader$Options;", "kotlin.jvm.PlatformType", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class MarkdownContentJsonAdapter extends NullSafeJsonAdapter<MarkdownContent> {
    private static final String KEY_RAW = "raw";
    public static final MarkdownContentJsonAdapter INSTANCE = new MarkdownContentJsonAdapter();
    private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of("raw");

    /* compiled from: MarkdownContentJsonAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MarkdownContentJsonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public MarkdownContent readFrom(JsonReader reader) throws IOException {
        String strNextString;
        Intrinsics.checkNotNullParameter(reader, "reader");
        JsonReader.Token tokenPeek = reader.peek();
        int i = tokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tokenPeek.ordinal()];
        if (i == 1) {
            strNextString = reader.nextString();
        } else {
            if (i != 2) {
                throw new JsonDataException("Expected STRING or BEGIN_OBJECT but was " + tokenPeek);
            }
            reader.beginObject();
            strNextString = null;
            while (reader.hasNext()) {
                if (reader.selectName(OPTIONS) == 0) {
                    strNextString = reader.nextString();
                } else {
                    Moshi3.skipNameAndValue(reader);
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            if (strNextString == null) {
                throw new JsonDataException("Missing value `raw` at " + reader.getPath());
            }
        }
        Intrinsics.checkNotNull(strNextString);
        return new MarkdownContent(strNextString);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    public void writeTo(JsonWriter writer, MarkdownContent value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.getRaw());
    }
}

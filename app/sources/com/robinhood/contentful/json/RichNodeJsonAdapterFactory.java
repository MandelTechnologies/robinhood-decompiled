package com.robinhood.contentful.json;

import android.net.Uri;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.json.RichNodeJsonAdapterFactory;
import com.robinhood.contentful.model.BlockNode;
import com.robinhood.contentful.model.BlockQuote;
import com.robinhood.contentful.model.Document;
import com.robinhood.contentful.model.EmbedBlock;
import com.robinhood.contentful.model.EmbeddedAsset;
import com.robinhood.contentful.model.EmbeddedEntry;
import com.robinhood.contentful.model.Heading;
import com.robinhood.contentful.model.Hyperlink;
import com.robinhood.contentful.model.LinkBlock;
import com.robinhood.contentful.model.ListBlock;
import com.robinhood.contentful.model.ListItem;
import com.robinhood.contentful.model.OrderedList;
import com.robinhood.contentful.model.Paragraph;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.contentful.model.Text;
import com.robinhood.contentful.model.TextMark;
import com.robinhood.contentful.model.ThematicBreak;
import com.robinhood.contentful.model.UnorderedList;
import com.robinhood.utils.extensions.Moshi3;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: RichNodeJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/contentful/json/RichNodeJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RichNodeJsonAdapterFactory implements JsonAdapter.Factory {
    public static final RichNodeJsonAdapterFactory INSTANCE = new RichNodeJsonAdapterFactory();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RichNodeJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0014J\u001c\u0010\u001e\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u000b\u001a6\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \r*\b\u0012\u0002\b\u0003\u0018\u00010\f0\f \r*\u001a\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \r*\b\u0012\u0002\b\u0003\u0018\u00010\f0\f\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/contentful/json/RichNodeJsonAdapterFactory$Adapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lcom/robinhood/contentful/model/RichNode;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "textMarkSetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/contentful/model/TextMark;", "resourceLinkAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "kotlin.jvm.PlatformType", "nodeDataAdapter", "Lcom/robinhood/contentful/model/RichNode$Data;", "nodeListAdapter", "", "getNodeListAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "nodeListAdapter$delegate", "Lkotlin/Lazy;", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "writeSimpleContent", "node", "Lcom/robinhood/contentful/model/BlockNode;", "nodeType", "", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes15.dex */
    static final class Adapter extends NullSafeJsonAdapter<RichNode> {
        private final JsonAdapter<RichNode.Data> nodeDataAdapter;

        /* renamed from: nodeListAdapter$delegate, reason: from kotlin metadata */
        private final Lazy nodeListAdapter;
        private final JsonAdapter<ResourceLink<?>> resourceLinkAdapter;
        private final JsonAdapter<Set<TextMark>> textMarkSetAdapter;
        private static final Regex PATTERN_HEADING = new Regex("heading-(\\d+)");
        private static final JsonReader.Options OPTIONS = JsonReader.Options.m3152of(WebsocketGatewayConstants.DATA_KEY, "content", "marks", "value", "nodeType");

        /* JADX INFO: Access modifiers changed from: private */
        public static final JsonAdapter nodeListAdapter_delegate$lambda$0(Moshi moshi) {
            Types types = Types.INSTANCE;
            JsonAdapter jsonAdapterAdapter = moshi.adapter(new TypeToken<List<? extends RichNode>>() { // from class: com.robinhood.contentful.json.RichNodeJsonAdapterFactory$Adapter$nodeListAdapter_delegate$lambda$0$$inlined$getAdapter$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            return jsonAdapterAdapter;
        }

        public Adapter(final Moshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Types types = Types.INSTANCE;
            JsonAdapter<Set<TextMark>> jsonAdapterAdapter = moshi.adapter(new TypeToken<Set<? extends TextMark>>() { // from class: com.robinhood.contentful.json.RichNodeJsonAdapterFactory$Adapter$special$$inlined$getAdapter$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
            this.textMarkSetAdapter = jsonAdapterAdapter;
            this.resourceLinkAdapter = moshi.adapter(ResourceLink.class);
            JsonAdapter<RichNode.Data> jsonAdapterAdapter2 = moshi.adapter(new TypeToken<RichNode.Data>() { // from class: com.robinhood.contentful.json.RichNodeJsonAdapterFactory$Adapter$special$$inlined$getAdapter$2
            }.getType());
            Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
            this.nodeDataAdapter = jsonAdapterAdapter2;
            this.nodeListAdapter = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.contentful.json.RichNodeJsonAdapterFactory$Adapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RichNodeJsonAdapterFactory.Adapter.nodeListAdapter_delegate$lambda$0(moshi);
                }
            });
        }

        private final JsonAdapter<List<RichNode>> getNodeListAdapter() {
            return (JsonAdapter) this.nodeListAdapter.getValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public RichNode readFrom(JsonReader reader) throws IOException {
            MatchResult.Destructured destructured;
            Intrinsics.checkNotNullParameter(reader, "reader");
            RichNode.Data data = new RichNode.Data(null, null, 3, null);
            List<RichNode> listEmptyList = CollectionsKt.emptyList();
            Set<TextMark> setEmptySet = SetsKt.emptySet();
            reader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            while (reader.hasNext()) {
                int iSelectName = reader.selectName(OPTIONS);
                if (iSelectName == 0) {
                    data = this.nodeDataAdapter.fromJson(reader);
                    if (data == null) {
                        data = new RichNode.Data(null, null, 3, null);
                    }
                } else if (iSelectName == 1) {
                    listEmptyList = getNodeListAdapter().fromJson(reader);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                } else if (iSelectName == 2) {
                    setEmptySet = this.textMarkSetAdapter.fromJson(reader);
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                } else if (iSelectName == 3) {
                    strNextString2 = reader.nextString();
                } else if (iSelectName != 4) {
                    Moshi3.skipNameAndValue(reader);
                } else {
                    strNextString = reader.nextString();
                }
            }
            Unit unit = Unit.INSTANCE;
            reader.endObject();
            if (strNextString == null) {
                Moshi3.throwRequiredProperty(reader, "nodeType");
                throw new ExceptionsH();
            }
            switch (strNextString.hashCode()) {
                case -1270571294:
                    if (strNextString.equals("list-item")) {
                        return new ListItem(listEmptyList);
                    }
                    break;
                case -389382995:
                    if (strNextString.equals("embedded-asset-block")) {
                        ResourceLink<?> target = data.getTarget();
                        if (target != null) {
                            return new EmbeddedAsset(listEmptyList, target);
                        }
                        Moshi3.throwRequiredProperty(reader, "data.target");
                        throw new ExceptionsH();
                    }
                    break;
                case 3338:
                    if (strNextString.equals("hr")) {
                        return new ThematicBreak(listEmptyList);
                    }
                    break;
                case 3556653:
                    if (strNextString.equals("text")) {
                        if (strNextString2 != null) {
                            return new Text(strNextString2, setEmptySet);
                        }
                        Moshi3.throwRequiredProperty(reader, "value");
                        throw new ExceptionsH();
                    }
                    break;
                case 346359575:
                    if (strNextString.equals("unordered-list")) {
                        return new UnorderedList(listEmptyList);
                    }
                    break;
                case 751294566:
                    if (strNextString.equals("hyperlink")) {
                        Uri uri = data.getUri();
                        if (uri != null) {
                            return new Hyperlink(listEmptyList, uri);
                        }
                        Moshi3.throwRequiredProperty(reader, "data.uri");
                        throw new ExceptionsH();
                    }
                    break;
                case 861720859:
                    if (strNextString.equals("document")) {
                        return new Document(listEmptyList);
                    }
                    break;
                case 1303202319:
                    if (strNextString.equals("blockquote")) {
                        return new BlockQuote(listEmptyList);
                    }
                    break;
                case 1512108207:
                    if (strNextString.equals("embedded-entry-block")) {
                        ResourceLink<?> target2 = data.getTarget();
                        if (target2 != null) {
                            return new EmbeddedEntry(listEmptyList, target2);
                        }
                        Moshi3.throwRequiredProperty(reader, "data.target");
                        throw new ExceptionsH();
                    }
                    break;
                case 1576736254:
                    if (strNextString.equals("ordered-list")) {
                        return new OrderedList(listEmptyList);
                    }
                    break;
                case 1949288814:
                    if (strNextString.equals("paragraph")) {
                        return new Paragraph(listEmptyList);
                    }
                    break;
            }
            MatchResult matchResultMatchEntire = PATTERN_HEADING.matchEntire(strNextString);
            if (matchResultMatchEntire != null && (destructured = matchResultMatchEntire.getDestructured()) != null) {
                return new Heading(listEmptyList, Integer.parseInt(destructured.getMatch().getGroupValues().get(1)));
            }
            throw new JsonDataException("Unsupported node type: " + strNextString);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, RichNode value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginObject();
            if (value instanceof Text) {
                writer.name(WebsocketGatewayConstants.DATA_KEY);
                writer.beginObject();
                writer.endObject();
                writer.name("marks");
                Text text = (Text) value;
                this.textMarkSetAdapter.toJson(writer, (JsonWriter) text.getMarks());
                writer.name("value");
                writer.value(text.getValue());
                writer.name("nodeType");
                writer.value("text");
            } else {
                if (!(value instanceof BlockNode)) {
                    throw new NoWhenBranchMatchedException();
                }
                BlockNode blockNode = (BlockNode) value;
                if (blockNode instanceof Heading) {
                    writeSimpleContent(writer, blockNode, "heading-" + ((Heading) value).getLevel());
                } else if (blockNode instanceof ThematicBreak) {
                    writeSimpleContent(writer, blockNode, "hr");
                } else if (blockNode instanceof ListBlock) {
                    ListBlock listBlock = (ListBlock) value;
                    if (listBlock instanceof OrderedList) {
                        writeSimpleContent(writer, blockNode, "ordered-list");
                    } else {
                        if (!(listBlock instanceof UnorderedList)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        writeSimpleContent(writer, blockNode, "unordered-list");
                    }
                } else if (blockNode instanceof ListItem) {
                    writeSimpleContent(writer, blockNode, "list-item");
                } else if (blockNode instanceof Paragraph) {
                    writeSimpleContent(writer, blockNode, "paragraph");
                } else if (blockNode instanceof BlockQuote) {
                    writeSimpleContent(writer, blockNode, "blockquote");
                } else if (blockNode instanceof Document) {
                    writeSimpleContent(writer, blockNode, "document");
                } else {
                    if (!(blockNode instanceof LinkBlock)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LinkBlock linkBlock = (LinkBlock) value;
                    if (linkBlock instanceof Hyperlink) {
                        JsonWriter jsonWriterName = writer.name(WebsocketGatewayConstants.DATA_KEY);
                        Intrinsics.checkNotNullExpressionValue(jsonWriterName, "name(...)");
                        jsonWriterName.beginObject();
                        jsonWriterName.name("uri");
                        Hyperlink hyperlink = (Hyperlink) value;
                        jsonWriterName.value(hyperlink.getTarget().toString());
                        jsonWriterName.endObject();
                        writer.name("content");
                        getNodeListAdapter().toJson(writer, (JsonWriter) hyperlink.getContent());
                        writer.name("nodeType");
                        writer.value("hyperlink");
                    } else {
                        if (!(linkBlock instanceof EmbedBlock)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        JsonWriter jsonWriterName2 = writer.name(WebsocketGatewayConstants.DATA_KEY);
                        Intrinsics.checkNotNullExpressionValue(jsonWriterName2, "name(...)");
                        jsonWriterName2.beginObject();
                        jsonWriterName2.name("target");
                        EmbedBlock embedBlock = (EmbedBlock) value;
                        this.resourceLinkAdapter.toJson(jsonWriterName2, (JsonWriter) embedBlock.getTarget());
                        jsonWriterName2.endObject();
                        writer.name("content");
                        getNodeListAdapter().toJson(writer, (JsonWriter) embedBlock.getContent());
                        if (embedBlock instanceof EmbeddedEntry) {
                            writer.name("nodeType");
                            writer.value("embedded-entry-block");
                        } else {
                            if (!(embedBlock instanceof EmbeddedAsset)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            writer.name("nodeType");
                            writer.value("embedded-asset-block");
                        }
                    }
                }
            }
            writer.endObject();
        }

        private final void writeSimpleContent(JsonWriter jsonWriter, BlockNode blockNode, String str) throws IOException {
            jsonWriter.name(WebsocketGatewayConstants.DATA_KEY);
            jsonWriter.beginObject();
            jsonWriter.endObject();
            jsonWriter.name("content");
            getNodeListAdapter().toJson(jsonWriter, (JsonWriter) blockNode.getContent());
            jsonWriter.name("nodeType");
            jsonWriter.value(str);
        }
    }

    private RichNodeJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = com.squareup.moshi.Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (RichNode.class.isAssignableFrom(rawType)) {
            return new Adapter(moshi);
        }
        return null;
    }
}

package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.WebViewNavigationData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: WebViewNavigationData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "Lcom/squareup/wire/Message;", "", "url", "", "handling_strategy", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "navigation_type", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "masked_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;Ljava/lang/String;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getHandling_strategy", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "getNavigation_type", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "getMasked_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Strategy", "NavigationType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WebViewNavigationData extends Message {

    @JvmField
    public static final ProtoAdapter<WebViewNavigationData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebViewNavigationData$Strategy#ADAPTER", jsonName = "handlingStrategy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Strategy handling_strategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 1001)
    private final String masked_url;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebViewNavigationData$NavigationType#ADAPTER", jsonName = "navigationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final NavigationType navigation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url;

    public WebViewNavigationData() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ WebViewNavigationData(String str, Strategy strategy, NavigationType navigationType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Strategy.STRATEGY_UNSPECIFIED : strategy, (i & 4) != 0 ? NavigationType.NAVIGATION_UNSPECIFIED : navigationType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24610newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public final Strategy getHandling_strategy() {
        return this.handling_strategy;
    }

    public final NavigationType getNavigation_type() {
        return this.navigation_type;
    }

    public final String getMasked_url() {
        return this.masked_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewNavigationData(String url, Strategy handling_strategy, NavigationType navigation_type, String masked_url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = url;
        this.handling_strategy = handling_strategy;
        this.navigation_type = navigation_type;
        this.masked_url = masked_url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24610newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WebViewNavigationData)) {
            return false;
        }
        WebViewNavigationData webViewNavigationData = (WebViewNavigationData) other;
        return Intrinsics.areEqual(unknownFields(), webViewNavigationData.unknownFields()) && Intrinsics.areEqual(this.url, webViewNavigationData.url) && this.handling_strategy == webViewNavigationData.handling_strategy && this.navigation_type == webViewNavigationData.navigation_type && Intrinsics.areEqual(this.masked_url, webViewNavigationData.masked_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.handling_strategy.hashCode()) * 37) + this.navigation_type.hashCode()) * 37) + this.masked_url.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("handling_strategy=" + this.handling_strategy);
        arrayList.add("navigation_type=" + this.navigation_type);
        arrayList.add("masked_url=" + Internal.sanitize(this.masked_url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebViewNavigationData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WebViewNavigationData copy$default(WebViewNavigationData webViewNavigationData, String str, Strategy strategy, NavigationType navigationType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewNavigationData.url;
        }
        if ((i & 2) != 0) {
            strategy = webViewNavigationData.handling_strategy;
        }
        if ((i & 4) != 0) {
            navigationType = webViewNavigationData.navigation_type;
        }
        if ((i & 8) != 0) {
            str2 = webViewNavigationData.masked_url;
        }
        if ((i & 16) != 0) {
            byteString = webViewNavigationData.unknownFields();
        }
        ByteString byteString2 = byteString;
        NavigationType navigationType2 = navigationType;
        return webViewNavigationData.copy(str, strategy, navigationType2, str2, byteString2);
    }

    public final WebViewNavigationData copy(String url, Strategy handling_strategy, NavigationType navigation_type, String masked_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(handling_strategy, "handling_strategy");
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WebViewNavigationData(url, handling_strategy, navigation_type, masked_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebViewNavigationData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WebViewNavigationData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebViewNavigationData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                }
                if (value.getHandling_strategy() != WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED) {
                    size += WebViewNavigationData.Strategy.ADAPTER.encodedSizeWithTag(2, value.getHandling_strategy());
                }
                if (value.getNavigation_type() != WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED) {
                    size += WebViewNavigationData.NavigationType.ADAPTER.encodedSizeWithTag(3, value.getNavigation_type());
                }
                return !Intrinsics.areEqual(value.getMasked_url(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_url()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebViewNavigationData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
                if (value.getHandling_strategy() != WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED) {
                    WebViewNavigationData.Strategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getHandling_strategy());
                }
                if (value.getNavigation_type() != WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED) {
                    WebViewNavigationData.NavigationType.ADAPTER.encodeWithTag(writer, 3, (int) value.getNavigation_type());
                }
                if (!Intrinsics.areEqual(value.getMasked_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_url());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebViewNavigationData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_url());
                }
                if (value.getNavigation_type() != WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED) {
                    WebViewNavigationData.NavigationType.ADAPTER.encodeWithTag(writer, 3, (int) value.getNavigation_type());
                }
                if (value.getHandling_strategy() != WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED) {
                    WebViewNavigationData.Strategy.ADAPTER.encodeWithTag(writer, 2, (int) value.getHandling_strategy());
                }
                if (Intrinsics.areEqual(value.getUrl(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WebViewNavigationData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                WebViewNavigationData.Strategy strategyDecode = WebViewNavigationData.Strategy.STRATEGY_UNSPECIFIED;
                WebViewNavigationData.NavigationType navigationType = WebViewNavigationData.NavigationType.NAVIGATION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                WebViewNavigationData.NavigationType navigationTypeDecode = navigationType;
                while (true) {
                    WebViewNavigationData.Strategy strategy = strategyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new WebViewNavigationData(strDecode, strategy, navigationTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                strategyDecode = WebViewNavigationData.Strategy.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                navigationTypeDecode = WebViewNavigationData.NavigationType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 1001) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebViewNavigationData redact(WebViewNavigationData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return WebViewNavigationData.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebViewNavigationData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STRATEGY_UNSPECIFIED", "NAVIGATED", "ARTICLE", "DEEP_LINK", "MAIL_TO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Strategy implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Strategy> ADAPTER;
        public static final Strategy ARTICLE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Strategy DEEP_LINK;
        public static final Strategy MAIL_TO;
        public static final Strategy NAVIGATED;
        public static final Strategy STRATEGY_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{STRATEGY_UNSPECIFIED, NAVIGATED, ARTICLE, DEEP_LINK, MAIL_TO};
        }

        @JvmStatic
        public static final Strategy fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Strategy> getEntries() {
            return $ENTRIES;
        }

        private Strategy(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Strategy strategy = new Strategy("STRATEGY_UNSPECIFIED", 0, 0);
            STRATEGY_UNSPECIFIED = strategy;
            NAVIGATED = new Strategy("NAVIGATED", 1, 1);
            ARTICLE = new Strategy("ARTICLE", 2, 2);
            DEEP_LINK = new Strategy("DEEP_LINK", 3, 3);
            MAIL_TO = new Strategy("MAIL_TO", 4, 4);
            Strategy[] strategyArr$values = $values();
            $VALUES = strategyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(strategyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Strategy.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Strategy>(orCreateKotlinClass, syntax, strategy) { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationData$Strategy$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WebViewNavigationData.Strategy fromValue(int value) {
                    return WebViewNavigationData.Strategy.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WebViewNavigationData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Strategy fromValue(int value) {
                if (value == 0) {
                    return Strategy.STRATEGY_UNSPECIFIED;
                }
                if (value == 1) {
                    return Strategy.NAVIGATED;
                }
                if (value == 2) {
                    return Strategy.ARTICLE;
                }
                if (value == 3) {
                    return Strategy.DEEP_LINK;
                }
                if (value != 4) {
                    return null;
                }
                return Strategy.MAIL_TO;
            }
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebViewNavigationData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NAVIGATION_UNSPECIFIED", "OTHER", "LINK_ACTIVATED", "FORM_SUBMITTED", "FORM_RESUBMITTED", "BACK_FOWARD", "RELOAD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigationType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<NavigationType> ADAPTER;
        public static final NavigationType BACK_FOWARD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NavigationType FORM_RESUBMITTED;
        public static final NavigationType FORM_SUBMITTED;
        public static final NavigationType LINK_ACTIVATED;
        public static final NavigationType NAVIGATION_UNSPECIFIED;
        public static final NavigationType OTHER;
        public static final NavigationType RELOAD;
        private final int value;

        private static final /* synthetic */ NavigationType[] $values() {
            return new NavigationType[]{NAVIGATION_UNSPECIFIED, OTHER, LINK_ACTIVATED, FORM_SUBMITTED, FORM_RESUBMITTED, BACK_FOWARD, RELOAD};
        }

        @JvmStatic
        public static final NavigationType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NavigationType> getEntries() {
            return $ENTRIES;
        }

        private NavigationType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NavigationType navigationType = new NavigationType("NAVIGATION_UNSPECIFIED", 0, 0);
            NAVIGATION_UNSPECIFIED = navigationType;
            OTHER = new NavigationType("OTHER", 1, 1);
            LINK_ACTIVATED = new NavigationType("LINK_ACTIVATED", 2, 2);
            FORM_SUBMITTED = new NavigationType("FORM_SUBMITTED", 3, 3);
            FORM_RESUBMITTED = new NavigationType("FORM_RESUBMITTED", 4, 4);
            BACK_FOWARD = new NavigationType("BACK_FOWARD", 5, 5);
            RELOAD = new NavigationType("RELOAD", 6, 6);
            NavigationType[] navigationTypeArr$values = $values();
            $VALUES = navigationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NavigationType>(orCreateKotlinClass, syntax, navigationType) { // from class: com.robinhood.rosetta.eventlogging.WebViewNavigationData$NavigationType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WebViewNavigationData.NavigationType fromValue(int value) {
                    return WebViewNavigationData.NavigationType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WebViewNavigationData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$NavigationType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NavigationType fromValue(int value) {
                switch (value) {
                    case 0:
                        return NavigationType.NAVIGATION_UNSPECIFIED;
                    case 1:
                        return NavigationType.OTHER;
                    case 2:
                        return NavigationType.LINK_ACTIVATED;
                    case 3:
                        return NavigationType.FORM_SUBMITTED;
                    case 4:
                        return NavigationType.FORM_RESUBMITTED;
                    case 5:
                        return NavigationType.BACK_FOWARD;
                    case 6:
                        return NavigationType.RELOAD;
                    default:
                        return null;
                }
            }
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) $VALUES.clone();
        }
    }
}

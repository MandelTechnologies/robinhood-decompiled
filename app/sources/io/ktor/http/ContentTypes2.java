package io.ktor.http;

import com.robinhood.utils.http.ContentEncoding;
import io.jsonwebtoken.Header;
import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ContentTypes.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 #2\u00020\u0001:\u0004$#%&B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006'"}, m3636d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", "", "contentType", "contentSubtype", "existingContent", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "name", "value", "", "hasParameter", "(Ljava/lang/String;Ljava/lang/String;)Z", "withParameter", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/ContentType;", "withoutParameters", "()Lio/ktor/http/ContentType;", "pattern", "match", "(Lio/ktor/http/ContentType;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "getContentSubtype", "Companion", "Application", "MultiPart", "Text", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.http.ContentType, reason: use source file name */
/* loaded from: classes14.dex */
public final class ContentTypes2 extends HeaderValueWithParameters {
    private final String contentSubtype;
    private final String contentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ContentTypes2 Any = new ContentTypes2("*", "*", null, 4, null);

    public final String getContentType() {
        return this.contentType;
    }

    private ContentTypes2(String str, String str2, String str3, List<HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentTypes2(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentTypes2(String contentType, String contentSubtype, List<HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public final ContentTypes2 withParameter(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return hasParameter(name, value) ? this : new ContentTypes2(this.contentType, this.contentSubtype, getContent(), CollectionsKt.plus((Collection<? extends HeaderValueParam>) getParameters(), new HeaderValueParam(name, value)));
    }

    private final boolean hasParameter(String name, String value) {
        int size = getParameters().size();
        if (size != 0) {
            if (size == 1) {
                HeaderValueParam httpHeaderValueParser2 = getParameters().get(0);
                if (StringsKt.equals(httpHeaderValueParser2.getName(), name, true) && StringsKt.equals(httpHeaderValueParser2.getValue(), value, true)) {
                    return true;
                }
            } else {
                List<HeaderValueParam> parameters = getParameters();
                if ((parameters instanceof Collection) && parameters.isEmpty()) {
                    return false;
                }
                for (HeaderValueParam httpHeaderValueParser22 : parameters) {
                    if (StringsKt.equals(httpHeaderValueParser22.getName(), name, true) && StringsKt.equals(httpHeaderValueParser22.getValue(), value, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final ContentTypes2 withoutParameters() {
        if (getParameters().isEmpty()) {
            return this;
        }
        return new ContentTypes2(this.contentType, this.contentSubtype, null, 4, null);
    }

    public final boolean match(ContentTypes2 pattern) {
        boolean zEquals;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!Intrinsics.areEqual(pattern.contentType, "*") && !StringsKt.equals(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern.contentSubtype, "*") && !StringsKt.equals(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (HeaderValueParam httpHeaderValueParser2 : pattern.getParameters()) {
            String strComponent1 = httpHeaderValueParser2.getName();
            String strComponent2 = httpHeaderValueParser2.getValue();
            if (Intrinsics.areEqual(strComponent1, "*")) {
                if (!Intrinsics.areEqual(strComponent2, "*")) {
                    List<HeaderValueParam> parameters = getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.equals(((HeaderValueParam) it.next()).getValue(), strComponent2, true)) {
                            }
                        }
                    }
                    zEquals = false;
                }
                zEquals = true;
                break;
            }
            String strParameter = parameter(strComponent1);
            if (!Intrinsics.areEqual(strComponent2, "*")) {
                zEquals = StringsKt.equals(strParameter, strComponent2, true);
            } else {
                if (strParameter != null) {
                    zEquals = true;
                    break;
                    break;
                }
                zEquals = false;
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ContentTypes2)) {
            return false;
        }
        ContentTypes2 contentTypes2 = (ContentTypes2) other;
        return StringsKt.equals(this.contentType, contentTypes2.contentType, true) && StringsKt.equals(this.contentSubtype, contentTypes2.contentSubtype, true) && Intrinsics.areEqual(getParameters(), contentTypes2.getParameters());
    }

    public int hashCode() {
        String str = this.contentType;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (getParameters().hashCode() * 31);
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lio/ktor/http/ContentType$Companion;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "parse", "value", "", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: io.ktor.http.ContentType$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentTypes2 parse(String value) throws ContentTypes {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.isBlank(value)) {
                return getAny();
            }
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.INSTANCE;
            HeaderValue httpHeaderValueParser = (HeaderValue) CollectionsKt.last((List) HttpHeaderValueParser3.parseHeaderValue(value));
            String value2 = httpHeaderValueParser.getValue();
            List<HeaderValueParam> params = httpHeaderValueParser.getParams();
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) value2, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                if (Intrinsics.areEqual(StringsKt.trim(value2).toString(), "*")) {
                    return ContentTypes2.INSTANCE.getAny();
                }
                throw new ContentTypes(value);
            }
            String strSubstring = value2.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string2 = StringsKt.trim(strSubstring).toString();
            if (string2.length() == 0) {
                throw new ContentTypes(value);
            }
            String strSubstring2 = value2.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string3 = StringsKt.trim(strSubstring2).toString();
            if (StringsKt.contains$default((CharSequence) string2, ' ', false, 2, (Object) null) || StringsKt.contains$default((CharSequence) string3, ' ', false, 2, (Object) null)) {
                throw new ContentTypes(value);
            }
            if (string3.length() == 0 || StringsKt.contains$default((CharSequence) string3, '/', false, 2, (Object) null)) {
                throw new ContentTypes(value);
            }
            return new ContentTypes2(string2, string3, params);
        }

        public final ContentTypes2 getAny() {
            return ContentTypes2.Any;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\b¨\u00061"}, m3636d2 = {"Lio/ktor/http/ContentType$Application;", "", "<init>", "()V", "Lio/ktor/http/ContentType;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "Json", "getJson", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "OctetStream", "getOctetStream", "Rss", "getRss", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Zip", "getZip", "GZip", "getGZip", "FormUrlEncoded", "getFormUrlEncoded", "Pdf", "getPdf", "Xlsx", "getXlsx", "Docx", "getDocx", "Pptx", "getPptx", "ProtoBuf", "getProtoBuf", "Wasm", "getWasm", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.http.ContentType$Application */
    public static final class Application {
        private static final ContentTypes2 FormUrlEncoded;
        private static final ContentTypes2 JavaScript;
        private static final ContentTypes2 ProblemJson;
        public static final Application INSTANCE = new Application();
        private static final ContentTypes2 Any = new ContentTypes2("application", "*", null, 4, null);
        private static final ContentTypes2 Atom = new ContentTypes2("application", "atom+xml", null, 4, null);
        private static final ContentTypes2 Cbor = new ContentTypes2("application", "cbor", null, 4, null);
        private static final ContentTypes2 Json = new ContentTypes2("application", "json", null, 4, null);
        private static final ContentTypes2 HalJson = new ContentTypes2("application", "hal+json", null, 4, null);
        private static final ContentTypes2 OctetStream = new ContentTypes2("application", "octet-stream", null, 4, null);
        private static final ContentTypes2 Rss = new ContentTypes2("application", "rss+xml", null, 4, null);
        private static final ContentTypes2 Xml = new ContentTypes2("application", "xml", null, 4, null);
        private static final ContentTypes2 Xml_Dtd = new ContentTypes2("application", "xml-dtd", null, 4, null);
        private static final ContentTypes2 Zip = new ContentTypes2("application", Header.COMPRESSION_ALGORITHM, null, 4, 0 == true ? 1 : 0);
        private static final ContentTypes2 GZip = new ContentTypes2("application", ContentEncoding.GZIP, null, 4, null);
        private static final ContentTypes2 Pdf = new ContentTypes2("application", "pdf", null, 4, null);
        private static final ContentTypes2 Xlsx = new ContentTypes2("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
        private static final ContentTypes2 Docx = new ContentTypes2("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);
        private static final ContentTypes2 Pptx = new ContentTypes2("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
        private static final ContentTypes2 ProtoBuf = new ContentTypes2("application", "protobuf", null, 4, 0 == true ? 1 : 0);
        private static final ContentTypes2 Wasm = new ContentTypes2("application", "wasm", null, 4, null);
        private static final ContentTypes2 ProblemXml = new ContentTypes2("application", "problem+xml", null, 4, null);

        private Application() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            JavaScript = new ContentTypes2("application", "javascript", null, 4, defaultConstructorMarker);
            FormUrlEncoded = new ContentTypes2("application", "x-www-form-urlencoded", null, 4, defaultConstructorMarker);
            ProblemJson = new ContentTypes2("application", "problem+json", null, 4, defaultConstructorMarker);
        }

        public final ContentTypes2 getJson() {
            return Json;
        }

        public final ContentTypes2 getOctetStream() {
            return OctetStream;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m3636d2 = {"Lio/ktor/http/ContentType$MultiPart;", "", "<init>", "()V", "Lio/ktor/http/ContentType;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Mixed", "getMixed", "Alternative", "getAlternative", "Related", "getRelated", "FormData", "getFormData", "Signed", "getSigned", "Encrypted", "getEncrypted", "ByteRanges", "getByteRanges", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.http.ContentType$MultiPart */
    public static final class MultiPart {
        public static final MultiPart INSTANCE = new MultiPart();
        private static final ContentTypes2 Any = new ContentTypes2("multipart", "*", null, 4, null);
        private static final ContentTypes2 Mixed = new ContentTypes2("multipart", "mixed", null, 4, null);
        private static final ContentTypes2 Alternative = new ContentTypes2("multipart", "alternative", null, 4, null);
        private static final ContentTypes2 Related = new ContentTypes2("multipart", "related", null, 4, null);
        private static final ContentTypes2 FormData = new ContentTypes2("multipart", "form-data", null, 4, null);
        private static final ContentTypes2 Signed = new ContentTypes2("multipart", "signed", null, 4, null);
        private static final ContentTypes2 Encrypted = new ContentTypes2("multipart", "encrypted", null, 4, null);
        private static final ContentTypes2 ByteRanges = new ContentTypes2("multipart", "byteranges", null, 4, null);

        private MultiPart() {
        }

        public final ContentTypes2 getFormData() {
            return FormData;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lio/ktor/http/ContentType$Text;", "", "<init>", "()V", "Lio/ktor/http/ContentType;", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Plain", "getPlain", "CSS", "getCSS", "CSV", "getCSV", "Html", "getHtml", "JavaScript", "getJavaScript", "VCard", "getVCard", "Xml", "getXml", "EventStream", "getEventStream", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.http.ContentType$Text */
    public static final class Text {
        public static final Text INSTANCE = new Text();
        private static final ContentTypes2 Any = new ContentTypes2("text", "*", null, 4, null);
        private static final ContentTypes2 Plain = new ContentTypes2("text", "plain", null, 4, null);
        private static final ContentTypes2 CSS = new ContentTypes2("text", "css", null, 4, null);
        private static final ContentTypes2 CSV = new ContentTypes2("text", "csv", null, 4, null);
        private static final ContentTypes2 Html = new ContentTypes2("text", "html", null, 4, null);
        private static final ContentTypes2 JavaScript = new ContentTypes2("text", "javascript", null, 4, null);
        private static final ContentTypes2 VCard = new ContentTypes2("text", "vcard", null, 4, null);
        private static final ContentTypes2 Xml = new ContentTypes2("text", "xml", null, 4, null);
        private static final ContentTypes2 EventStream = new ContentTypes2("text", "event-stream", null, 4, null);

        private Text() {
        }

        public final ContentTypes2 getPlain() {
            return Plain;
        }
    }
}

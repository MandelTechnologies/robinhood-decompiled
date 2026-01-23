package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: URLBuilder.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 P2\u00020\u0001:\u0001PBk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010$R$\u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010$R\"\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010!\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010$R(\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010@\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\r\u001a\u00020>2\u0006\u0010F\u001a\u00020>8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bG\u0010CR(\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010$R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0017\"\u0004\bK\u0010$R$\u0010\u000e\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0017\"\u0004\bM\u0010$R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010;\"\u0004\bO\u0010=¨\u0006Q"}, m3636d2 = {"Lio/ktor/http/URLBuilder;", "", "Lio/ktor/http/URLProtocol;", "protocol", "", "host", "", "port", "user", "password", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "", "trailingQuery", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Z)V", "", "applyOrigin", "()V", "buildString", "()Ljava/lang/String;", "toString", "Lio/ktor/http/Url;", "build", "()Lio/ktor/http/Url;", "Lio/ktor/http/URLProtocol;", "getProtocol", "()Lio/ktor/http/URLProtocol;", "setProtocol", "(Lio/ktor/http/URLProtocol;)V", "Ljava/lang/String;", "getHost", "setHost", "(Ljava/lang/String;)V", "I", "getPort", "()I", "setPort", "(I)V", "Z", "getTrailingQuery", "()Z", "setTrailingQuery", "(Z)V", "encodedUser", "getEncodedUser", "setEncodedUser", "encodedPassword", "getEncodedPassword", "setEncodedPassword", "encodedFragment", "getEncodedFragment", "setEncodedFragment", "encodedPathSegments", "Ljava/util/List;", "getEncodedPathSegments", "()Ljava/util/List;", "setEncodedPathSegments", "(Ljava/util/List;)V", "Lio/ktor/http/ParametersBuilder;", "value", "encodedParameters", "Lio/ktor/http/ParametersBuilder;", "getEncodedParameters", "()Lio/ktor/http/ParametersBuilder;", "setEncodedParameters", "(Lio/ktor/http/ParametersBuilder;)V", "<set-?>", "getParameters", "getUser", "setUser", "getPassword", "setPassword", "getFragment", "setFragment", "getPathSegments", "setPathSegments", "Companion", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class URLBuilder {
    private static final Url originUrl;
    private String encodedFragment;
    private Parameters3 encodedParameters;
    private String encodedPassword;
    private List<String> encodedPathSegments;
    private String encodedUser;
    private String host;
    private Parameters3 parameters;
    private int port;
    private URLProtocol protocol;
    private boolean trailingQuery;

    public URLBuilder(URLProtocol protocol, String host, int i, String str, String str2, List<String> pathSegments, Parameters parameters, String fragment, boolean z) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.protocol = protocol;
        this.host = host;
        this.port = i;
        this.trailingQuery = z;
        this.encodedUser = str != null ? Codecs2.encodeURLParameter$default(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? Codecs2.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedFragment = Codecs2.encodeURLQueryComponent$default(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Codecs2.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        Parameters3 parameters3EncodeParameters = UrlDecodedParametersBuilder2.encodeParameters(parameters);
        this.encodedParameters = parameters3EncodeParameters;
        this.parameters = new UrlDecodedParametersBuilder(parameters3EncodeParameters);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ URLBuilder(io.ktor.http.URLProtocol r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, java.util.List r9, io.ktor.http.Parameters r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r3 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            io.ktor.http.URLProtocol$Companion r4 = io.ktor.http.URLProtocol.INSTANCE
            io.ktor.http.URLProtocol r4 = r4.getHTTP()
        La:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L11
            r5 = r0
        L11:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L17
            r6 = r1
        L17:
            r14 = r13 & 8
            r2 = 0
            if (r14 == 0) goto L1d
            r7 = r2
        L1d:
            r14 = r13 & 16
            if (r14 == 0) goto L22
            r8 = r2
        L22:
            r14 = r13 & 32
            if (r14 == 0) goto L2a
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L2a:
            r14 = r13 & 64
            if (r14 == 0) goto L34
            io.ktor.http.Parameters$Companion r10 = io.ktor.http.Parameters.INSTANCE
            io.ktor.http.Parameters r10 = r10.getEmpty()
        L34:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L39
            r11 = r0
        L39:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L48
            r14 = r1
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
            goto L52
        L48:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
        L52:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.URLBuilder.<init>(io.ktor.http.URLProtocol, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, io.ktor.http.Parameters, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final void setProtocol(URLProtocol uRLProtocol) {
        Intrinsics.checkNotNullParameter(uRLProtocol, "<set-?>");
        this.protocol = uRLProtocol;
    }

    public final String getHost() {
        return this.host;
    }

    public final void setHost(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final int getPort() {
        return this.port;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final void setTrailingQuery(boolean z) {
        this.trailingQuery = z;
    }

    public final String getEncodedUser() {
        return this.encodedUser;
    }

    public final void setEncodedUser(String str) {
        this.encodedUser = str;
    }

    public final String getUser() {
        String str = this.encodedUser;
        if (str != null) {
            return Codecs2.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setUser(String str) {
        this.encodedUser = str != null ? Codecs2.encodeURLParameter$default(str, false, 1, null) : null;
    }

    public final String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final void setEncodedPassword(String str) {
        this.encodedPassword = str;
    }

    public final String getPassword() {
        String str = this.encodedPassword;
        if (str != null) {
            return Codecs2.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final void setEncodedFragment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encodedFragment = str;
    }

    public final String getFragment() {
        return Codecs2.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final List<String> getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final void setEncodedPathSegments(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    public final List<String> getPathSegments() {
        List<String> list = this.encodedPathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Codecs2.decodeURLPart$default((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final Parameters3 getEncodedParameters() {
        return this.encodedParameters;
    }

    public final void setEncodedParameters(Parameters3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodedParameters = value;
        this.parameters = new UrlDecodedParametersBuilder(value);
    }

    public final Parameters3 getParameters() {
        return this.parameters;
    }

    public final String buildString() {
        applyOrigin();
        String string2 = ((StringBuilder) URLBuilder2.appendTo(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "appendTo(StringBuilder(256)).toString()");
        return string2;
    }

    public String toString() {
        String string2 = ((StringBuilder) URLBuilder2.appendTo(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "appendTo(StringBuilder(256)).toString()");
        return string2;
    }

    public final Url build() {
        applyOrigin();
        return new Url(this.protocol, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    private final void applyOrigin() {
        if (this.host.length() <= 0 && !Intrinsics.areEqual(this.protocol.getName(), "file")) {
            Url url = originUrl;
            this.host = url.getHost();
            if (Intrinsics.areEqual(this.protocol, URLProtocol.INSTANCE.getHTTP())) {
                this.protocol = url.getProtocol();
            }
            if (this.port == 0) {
                this.port = url.getSpecifiedPort();
            }
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        originUrl = URLUtils2.Url(URLBuilderJvm.getOrigin(companion));
    }
}

package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UrlDecodedParametersBuilder.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00130\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\"R\u001a\u0010#\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m3636d2 = {"Lio/ktor/http/UrlDecodedParametersBuilder;", "Lio/ktor/http/ParametersBuilder;", "encodedParametersBuilder", "<init>", "(Lio/ktor/http/ParametersBuilder;)V", "Lio/ktor/http/Parameters;", "build", "()Lio/ktor/http/Parameters;", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "isEmpty", "()Z", "", "entries", "value", "", "append", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/ktor/util/StringValues;", "stringValues", "appendAll", "(Lio/ktor/util/StringValues;)V", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "clear", "()V", "Lio/ktor/http/ParametersBuilder;", "caseInsensitiveName", "Z", "getCaseInsensitiveName", "ktor-http"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UrlDecodedParametersBuilder implements Parameters3 {
    private final boolean caseInsensitiveName;
    private final Parameters3 encodedParametersBuilder;

    public UrlDecodedParametersBuilder(Parameters3 encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.encodedParametersBuilder = encodedParametersBuilder;
        this.caseInsensitiveName = encodedParametersBuilder.getCaseInsensitiveName();
    }

    @Override // io.ktor.http.Parameters3
    public Parameters build() {
        return UrlDecodedParametersBuilder2.decodeParameters(this.encodedParametersBuilder);
    }

    @Override // io.ktor.util.StringValues2
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // io.ktor.util.StringValues2
    public List<String> getAll(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> all = this.encodedParametersBuilder.getAll(Codecs2.encodeURLParameter$default(name, false, 1, null));
        if (all == null) {
            return null;
        }
        List<String> list = all;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Codecs2.decodeURLQueryComponent$default((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // io.ktor.util.StringValues2
    public Set<String> names() {
        Set<String> setNames = this.encodedParametersBuilder.names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(Codecs2.decodeURLQueryComponent$default((String) it.next(), 0, 0, false, null, 15, null));
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // io.ktor.util.StringValues2
    public boolean isEmpty() {
        return this.encodedParametersBuilder.isEmpty();
    }

    @Override // io.ktor.util.StringValues2
    public Set<Map.Entry<String, List<String>>> entries() {
        return UrlDecodedParametersBuilder2.decodeParameters(this.encodedParametersBuilder).entries();
    }

    @Override // io.ktor.util.StringValues2
    public void append(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodedParametersBuilder.append(Codecs2.encodeURLParameter$default(name, false, 1, null), Codecs2.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValues2
    public void appendAll(StringValues stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        UrlDecodedParametersBuilder2.appendAllEncoded(this.encodedParametersBuilder, stringValues);
    }

    @Override // io.ktor.util.StringValues2
    public void appendAll(String name, Iterable<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        Parameters3 parameters3 = this.encodedParametersBuilder;
        String strEncodeURLParameter$default = Codecs2.encodeURLParameter$default(name, false, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Codecs2.encodeURLParameterValue(it.next()));
        }
        parameters3.appendAll(strEncodeURLParameter$default, arrayList);
    }

    @Override // io.ktor.util.StringValues2
    public void clear() {
        this.encodedParametersBuilder.clear();
    }
}

package io.ktor.http;

import io.ktor.util.StringValues;
import io.ktor.util.StringValues2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UrlDecodedParametersBuilder.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¨\u0006\n"}, m3636d2 = {"decodeParameters", "Lio/ktor/http/Parameters;", "parameters", "Lio/ktor/util/StringValuesBuilder;", "encodeParameters", "Lio/ktor/http/ParametersBuilder;", "Lio/ktor/util/StringValues;", "appendAllDecoded", "", "appendAllEncoded", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.http.UrlDecodedParametersBuilderKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UrlDecodedParametersBuilder2 {
    public static final Parameters decodeParameters(StringValues2 parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Parameters3 parameters3ParametersBuilder$default = Parameters6.ParametersBuilder$default(0, 1, null);
        appendAllDecoded(parameters3ParametersBuilder$default, parameters);
        return parameters3ParametersBuilder$default.build();
    }

    public static final Parameters3 encodeParameters(StringValues parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Parameters3 parameters3ParametersBuilder$default = Parameters6.ParametersBuilder$default(0, 1, null);
        appendAllEncoded(parameters3ParametersBuilder$default, parameters);
        return parameters3ParametersBuilder$default;
    }

    private static final void appendAllDecoded(StringValues2 stringValues2, StringValues2 stringValues22) {
        for (String str : stringValues22.names()) {
            List<String> all = stringValues22.getAll(str);
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            String strDecodeURLQueryComponent$default = Codecs2.decodeURLQueryComponent$default(str, 0, 0, false, null, 15, null);
            List<String> list = all;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Codecs2.decodeURLQueryComponent$default((String) it.next(), 0, 0, true, null, 11, null));
            }
            stringValues2.appendAll(strDecodeURLQueryComponent$default, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendAllEncoded(StringValues2 stringValues2, StringValues stringValues) {
        for (String str : stringValues.names()) {
            List<String> all = stringValues.getAll(str);
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            String strEncodeURLParameter$default = Codecs2.encodeURLParameter$default(str, false, 1, null);
            List<String> list = all;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Codecs2.encodeURLParameterValue((String) it.next()));
            }
            stringValues2.appendAll(strEncodeURLParameter$default, arrayList);
        }
    }
}

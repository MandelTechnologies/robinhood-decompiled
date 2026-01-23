package com.plaid.internal;

import com.plaid.internal.C5904M0;
import com.plaid.internal.C5931P0;
import com.plaid.internal.C5953R5;
import com.plaid.link.result.LinkExit;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension
/* renamed from: com.plaid.internal.R0 */
/* loaded from: classes16.dex */
public final class C5948R0 {

    /* renamed from: a */
    public final C5931P0.a f1658a;

    /* renamed from: b */
    public final Json f1659b;

    public C5948R0(C5931P0.a listener, Json json) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f1658a = listener;
        this.f1659b = json;
    }

    /* renamed from: a */
    public final boolean m1297a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("start_link")) {
                if (!jSONObject.has("open_url")) {
                    return false;
                }
                String string2 = jSONObject.getString("open_url");
                C5931P0.a aVar = this.f1658a;
                Intrinsics.checkNotNull(string2);
                aVar.m1292a(string2);
                return true;
            }
            String string3 = jSONObject.getJSONObject("start_link").toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            try {
                Json json = this.f1659b;
                C5904M0.b.m1252a();
                C5892L0 c5892l0M1251a = ((C5904M0) json.decodeFromString(C5904M0.a.f1540a, string3)).m1251a();
                C5953R5.a.m1299a(C5953R5.f1671a, "embeddedLinkSessionInfo: " + c5892l0M1251a);
                this.f1658a.m1290a(c5892l0M1251a);
                return true;
            } catch (SerializationExceptions2 e) {
                C5953R5.a.m1304b(C5953R5.f1671a, "Unable to parse start_link message: " + string3 + PlaceholderUtils.XXShortPlaceholderText + e.getMessage());
                return false;
            }
        } catch (JSONException e2) {
            C5953R5.a.m1304b(C5953R5.f1671a, "Unable to parse internal event: " + str + ", error: " + e2.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final void m1298b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(StringsKt.replace$default(url, "plaidlink://", "https://", false, 4, (Object) null));
        String host = httpUrl.getHost();
        Set<String> setQueryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setQueryParameterNames, 10)), 16));
        Iterator<T> it = setQueryParameterNames.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strQueryParameter = httpUrl.queryParameter((String) next);
            if (strQueryParameter != null) {
                str = strQueryParameter;
            }
            linkedHashMap.put(next, str);
        }
        String str2 = (String) linkedHashMap.get("event");
        if (Intrinsics.areEqual(host, "internal-event") && str2 != null) {
            if (m1297a(str2)) {
                return;
            }
            C5953R5.a.m1304b(C5953R5.f1671a, "failed to handle internal event: " + str2);
            return;
        }
        if (!Intrinsics.areEqual(host, "exit")) {
            C5953R5.a.m1304b(C5953R5.f1671a, "unknown action: " + host + ", parsedUri: " + httpUrl);
            return;
        }
        Set<String> setQueryParameterNames2 = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setQueryParameterNames2, 10)), 16));
        for (Object obj : setQueryParameterNames2) {
            String strQueryParameter2 = httpUrl.queryParameter((String) obj);
            if (strQueryParameter2 == null) {
                strQueryParameter2 = "";
            }
            linkData.put(obj, strQueryParameter2);
        }
        try {
            C5931P0.a aVar = this.f1658a;
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            aVar.m1291a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
        } catch (NoSuchElementException unused) {
            this.f1658a.m1291a(C5876J2.m1228b(new C6020Z0("Failed to parse exit"), null));
        }
    }
}

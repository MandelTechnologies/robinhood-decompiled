package com.plaid.internal;

import com.google.gson.JsonSyntaxException;
import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.C5803B1;
import com.plaid.internal.C5953R5;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

@SourceDebugExtension
/* renamed from: com.plaid.internal.n3 */
/* loaded from: classes16.dex */
public final class C7159n3 {

    /* renamed from: d */
    public static final Locale f3016d = Locale.ENGLISH;

    /* renamed from: a */
    public final a f3017a;

    /* renamed from: b */
    public final Json f3018b;

    /* renamed from: c */
    public String f3019c;

    /* renamed from: com.plaid.internal.n3$a */
    public interface a {
        /* renamed from: a */
        void mo1134a(C6020Z0 c6020z0);

        /* renamed from: a */
        void mo1136a(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2);

        /* renamed from: a */
        void mo1137a(LinkExit linkExit);

        /* renamed from: a */
        void mo1138a(LinkSuccess linkSuccess);

        /* renamed from: a */
        void mo1139a(String str, LinkEventMetadata linkEventMetadata);

        /* renamed from: a */
        void mo1140a(LinkedHashMap linkedHashMap);

        /* renamed from: b */
        void mo1144b(String str);
    }

    /* renamed from: com.plaid.internal.n3$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3020a;

        static {
            int[] iArr = new int[EnumC7127k6.values().length];
            try {
                iArr[EnumC7127k6.ENQUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7127k6.ENQUEUE_AND_FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7127k6.NO_ENQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7127k6.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3020a = iArr;
        }
    }

    public C7159n3(a listener, Json json) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f3017a = listener;
        this.f3018b = json;
    }

    /* renamed from: a */
    public final void m1563a(String url) {
        int i;
        EnumC7127k6 enumC7127k6;
        AbstractC5849G2 aVar;
        Intrinsics.checkNotNullParameter(url, "url");
        int i2 = 0;
        Unit unit = null;
        if (!StringsKt.startsWith$default(url, "plaidlink://", false, 2, (Object) null)) {
            C5953R5.a.m1299a(C5953R5.f1671a, "external link: " + url);
            this.f3017a.mo1144b(url);
            return;
        }
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(StringsKt.replace$default(url, "plaidlink://", "https://", false, 4, (Object) null));
        C5953R5.a.m1299a(C5953R5.f1671a, "plaidcallback " + url);
        String host = httpUrl.getHost();
        Set<String> setQueryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setQueryParameterNames, 10)), 16));
        for (Object obj : setQueryParameterNames) {
            String strQueryParameter = httpUrl.queryParameter((String) obj);
            if (strQueryParameter == null) {
                strQueryParameter = "";
            }
            linkData.put(obj, strQueryParameter);
        }
        this.f3019c = (String) linkData.get("link_session_id");
        int iHashCode = host.hashCode();
        if (iHashCode != -579210487) {
            if (iHashCode != 3127582) {
                if (iHashCode != 96891546) {
                    if (iHashCode == 2091030007 && host.equals("session_handoff")) {
                        C5953R5.a.m1299a(C5953R5.f1671a, "Handoff to out of process");
                        this.f3017a.mo1140a(linkData);
                        return;
                    }
                } else if (host.equals("event")) {
                    C5953R5.a aVar2 = C5953R5.f1671a;
                    String str = "Event name: " + linkData.get("event_name");
                    aVar2.getClass();
                    C5953R5.a.m1303a(str, false);
                    C5953R5.a.m1299a(aVar2, "queue_behavior: " + linkData.get("queue_behavior") + ", delay_ms: " + linkData.get("delay_ms"));
                    C5953R5.a.m1299a(aVar2, httpUrl.getUrl());
                    String str2 = (String) linkData.get("delay_ms");
                    if (str2 != null) {
                        try {
                            i = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i = 0;
                    }
                    String str3 = (String) linkData.get("queue_behavior");
                    EnumC7127k6[] enumC7127k6ArrValues = EnumC7127k6.values();
                    int length = enumC7127k6ArrValues.length;
                    while (true) {
                        if (i2 >= length) {
                            enumC7127k6 = null;
                            break;
                        }
                        enumC7127k6 = enumC7127k6ArrValues[i2];
                        if (Intrinsics.areEqual(enumC7127k6.getProtoString(), str3)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (enumC7127k6 == null) {
                        enumC7127k6 = EnumC7127k6.UNKNOWN;
                    }
                    int i3 = b.f3020a[enumC7127k6.ordinal()];
                    if (i3 == 1) {
                        aVar = AbstractC5849G2.b.f1349a;
                    } else if (i3 == 2) {
                        aVar = AbstractC5849G2.c.f1350a;
                    } else if (i3 == 3) {
                        aVar = AbstractC5849G2.d.f1351a;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = i > 0 ? new AbstractC5849G2.a(i) : AbstractC5849G2.d.f1351a;
                    }
                    String str4 = (String) linkData.get("event_name");
                    if (str4 != null) {
                        Locale SERVER_LOCALE = f3016d;
                        Intrinsics.checkNotNullExpressionValue(SERVER_LOCALE, "SERVER_LOCALE");
                        Intrinsics.checkNotNullExpressionValue(str4.toUpperCase(SERVER_LOCALE), "toUpperCase(...)");
                        if (Intrinsics.areEqual(str4, "OPEN")) {
                        }
                        m1565a(linkData, aVar);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        m1565a(linkData, aVar);
                        return;
                    }
                    return;
                }
            } else if (host.equals("exit")) {
                C5953R5.a aVar3 = C5953R5.f1671a;
                C5953R5.a.m1300a(aVar3, "User status in flow: ", new Object[]{"data: " + linkData.get("status")});
                C5953R5.a.m1300a(aVar3, "Link request ID: ", new Object[]{"data: " + linkData.get("request_id")});
                try {
                    a aVar4 = this.f3017a;
                    Intrinsics.checkNotNullParameter(linkData, "linkData");
                    aVar4.mo1137a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
                    return;
                } catch (NoSuchElementException unused2) {
                    this.f3017a.mo1134a(new C6020Z0("Failed to parse exit"));
                    return;
                }
            }
        } else if (host.equals("connected")) {
            C5953R5.a aVar5 = C5953R5.f1671a;
            C5953R5.a.m1299a(aVar5, "Institution id: " + linkData.get("institution_id"));
            C5953R5.a.m1299a(aVar5, "Institution name:  " + linkData.get("institution_name"));
            m1564a(linkData);
            return;
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Link action detected: " + host);
        this.f3017a.mo1139a(host, LinkEventMetadata.INSTANCE.fromMap(linkData, this.f3019c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* renamed from: a */
    public final void m1564a(LinkedHashMap linkedHashMap) throws JsonSyntaxException {
        List list;
        ?? EmptyList;
        String str = (String) linkedHashMap.get("accounts");
        if (str == null) {
            str = "";
        }
        try {
            try {
                Json json = this.f3018b;
                C5803B1.f1263g.getClass();
                C5803B1.b.m1152a();
                list = (List) json.decodeFromString(BuiltinSerializers.ListSerializer(C5803B1.a.f1270a), str);
            } catch (SerializationExceptions2 unused) {
                C5953R5.a.m1304b(C5953R5.f1671a, "Unable to parse accounts data: " + C5869I4.m1216a(str));
                list = null;
            }
            if (list != null) {
                EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EmptyList.add(C5876J2.m1219a((C5803B1) it.next()));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            this.f3017a.mo1138a(C5876J2.m1224a(linkedHashMap, (List) EmptyList));
        } catch (NoSuchElementException unused2) {
            this.f3017a.mo1134a(new C6020Z0("Failed to parse success"));
        }
    }

    /* renamed from: a */
    public final void m1565a(LinkedHashMap linkData, AbstractC5849G2 abstractC5849G2) {
        try {
            a aVar = this.f3017a;
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            aVar.mo1136a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkData), abstractC5849G2);
        } catch (NoSuchElementException unused) {
            this.f3017a.mo1134a(new C6020Z0("Failed to parse event"));
        }
    }
}

package com.mux.stats.sdk.core.util;

import com.google.common.collect.ImmutableMap;
import com.mux.stats.sdk.core.model.BaseQueryData;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;

/* loaded from: classes27.dex */
public class SessionDataKeys {

    /* renamed from: a */
    private static final ImmutableMap<String, C5733a> f1147a = new ImmutableMap.Builder().put("internal_view_session_id", new C5733a("ivwseid", CustomerViewData.class)).put("internal_video_experiments", new C5733a("iviep", CustomerViewData.class)).put("video_experiments", new C5733a("viep", CustomerVideoData.class)).put("video_id", new C5733a("vid", CustomerVideoData.class)).put("video_title", new C5733a("vtt", CustomerVideoData.class)).put("video_cdn", new C5733a("vdn", CustomerVideoData.class)).put("video_content_type", new C5733a("vctty", CustomerVideoData.class)).put("video_duration", new C5733a("vdu", CustomerVideoData.class)).put("video_encoding_variant", new C5733a("vecva", CustomerVideoData.class)).put("video_is_live", new C5733a("visli", CustomerVideoData.class)).put("video_language_code", new C5733a("vlacd", CustomerVideoData.class)).put("video_producer", new C5733a("vpd", CustomerVideoData.class)).put("video_series", new C5733a("vsr", CustomerVideoData.class)).put("video_stream_type", new C5733a("vsmty", CustomerVideoData.class)).put("video_variant_id", new C5733a("vvaid", CustomerVideoData.class)).put("video_variant_name", new C5733a("vvanm", CustomerVideoData.class)).put("video_source_url", new C5733a("vsour", CustomerVideoData.class)).put("viewer_user_id", new C5733a("uusid", CustomerPlayerData.class)).put("experiment_name", new C5733a("fnm", CustomerPlayerData.class)).put("view_session_id", new C5733a("xseid", CustomerViewData.class)).put("custom_1", new C5733a("c1", CustomData.class)).put("custom_2", new C5733a("c2", CustomData.class)).put("custom_3", new C5733a("c3", CustomData.class)).put("custom_4", new C5733a("c4", CustomData.class)).put("custom_5", new C5733a("c5", CustomData.class)).build();

    /* renamed from: com.mux.stats.sdk.core.util.SessionDataKeys$a */
    private static final class C5733a {

        /* renamed from: a */
        public final String f1148a;

        /* renamed from: b */
        public final Class<? extends BaseQueryData> f1149b;

        public C5733a(String str, Class<? extends BaseQueryData> cls) {
            this.f1148a = str;
            this.f1149b = cls;
        }
    }

    public static String shortCode(String str) {
        ImmutableMap<String, C5733a> immutableMap = f1147a;
        if (immutableMap.containsKey(str)) {
            return immutableMap.get(str).f1148a;
        }
        return null;
    }

    public static Class<? extends BaseQueryData> type(String str) {
        ImmutableMap<String, C5733a> immutableMap = f1147a;
        if (immutableMap.containsKey(str)) {
            return immutableMap.get(str).f1149b;
        }
        return null;
    }
}

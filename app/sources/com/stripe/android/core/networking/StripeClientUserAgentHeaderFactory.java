package com.stripe.android.core.networking;

import android.os.Build;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.AppInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: StripeClientUserAgentHeaderFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "", "systemPropertySupplier", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "createHeaderValue", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class StripeClientUserAgentHeaderFactory {
    private static final Function1<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = new Function1<String, String>() { // from class: com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String property = System.getProperty(name);
            return property == null ? "" : property;
        }
    };
    private final Function1<String, String> systemPropertySupplier;

    /* JADX WARN: Multi-variable type inference failed */
    public StripeClientUserAgentHeaderFactory(Function1<? super String, String> systemPropertySupplier) {
        Intrinsics.checkNotNullParameter(systemPropertySupplier, "systemPropertySupplier");
        this.systemPropertySupplier = systemPropertySupplier;
    }

    public /* synthetic */ StripeClientUserAgentHeaderFactory(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_SYSTEM_PROPERTY_SUPPLIER : function1);
    }

    public final Map<String, String> create(AppInfo appInfo) {
        return MapsKt.mapOf(Tuples4.m3642to("X-Stripe-Client-User-Agent", createHeaderValue(appInfo).toString()));
    }

    public final JSONObject createHeaderValue(AppInfo appInfo) {
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("os.name", "android"), Tuples4.m3642to("os.version", String.valueOf(Build.VERSION.SDK_INT)), Tuples4.m3642to("bindings.version", "20.50.0"), Tuples4.m3642to("lang", "Java"), Tuples4.m3642to("publisher", "Stripe"), Tuples4.m3642to("http.agent", this.systemPropertySupplier.invoke("http.agent")));
        Map<String, Map<String, String>> mapCreateClientHeaders$stripe_core_release = appInfo != null ? appInfo.createClientHeaders$stripe_core_release() : null;
        if (mapCreateClientHeaders$stripe_core_release == null) {
            mapCreateClientHeaders$stripe_core_release = MapsKt.emptyMap();
        }
        return new JSONObject((Map<?, ?>) MapsKt.plus(mapMapOf, mapCreateClientHeaders$stripe_core_release));
    }
}

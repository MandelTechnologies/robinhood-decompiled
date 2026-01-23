package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTimeInForcePref;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceDuxo_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "defaultTimeInForcePref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderTimeInForceDuxo_MembersInjector implements MembersInjector<OrderTimeInForceDuxo> {
    private final Provider<StringPreference> defaultTimeInForcePref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OrderTimeInForceDuxo> create(Provider<StringPreference> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    @DefaultTimeInForcePref
    public static final void injectDefaultTimeInForcePref(OrderTimeInForceDuxo orderTimeInForceDuxo, StringPreference stringPreference) {
        INSTANCE.injectDefaultTimeInForcePref(orderTimeInForceDuxo, stringPreference);
    }

    public OrderTimeInForceDuxo_MembersInjector(Provider<StringPreference> defaultTimeInForcePref) {
        Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
        this.defaultTimeInForcePref = defaultTimeInForcePref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderTimeInForceDuxo instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        StringPreference stringPreference = this.defaultTimeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectDefaultTimeInForcePref(instance, stringPreference);
    }

    /* compiled from: OrderTimeInForceDuxo_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "defaultTimeInForcePref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "injectDefaultTimeInForcePref", "", "instance", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OrderTimeInForceDuxo> create(Provider<StringPreference> defaultTimeInForcePref) {
            Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
            return new OrderTimeInForceDuxo_MembersInjector(defaultTimeInForcePref);
        }

        @JvmStatic
        @DefaultTimeInForcePref
        public final void injectDefaultTimeInForcePref(OrderTimeInForceDuxo instance, StringPreference defaultTimeInForcePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
            instance.setDefaultTimeInForcePref(defaultTimeInForcePref);
        }
    }
}

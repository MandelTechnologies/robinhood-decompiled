package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IncomingWireTransferFormatter_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IncomingWireTransferFormatter_Factory implements Factory<IncomingWireTransferFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Markwon> markwon;
    private final Provider<Resources> resources;

    @JvmStatic
    public static final IncomingWireTransferFormatter_Factory create(Provider<Resources> provider, Provider<Markwon> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final IncomingWireTransferFormatter newInstance(Resources resources, Markwon markwon) {
        return INSTANCE.newInstance(resources, markwon);
    }

    public IncomingWireTransferFormatter_Factory(Provider<Resources> resources, Provider<Markwon> markwon) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.resources = resources;
        this.markwon = markwon;
    }

    @Override // javax.inject.Provider
    public IncomingWireTransferFormatter get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        return companion.newInstance(resources, markwon);
    }

    /* compiled from: IncomingWireTransferFormatter_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter_Factory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "newInstance", "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IncomingWireTransferFormatter_Factory create(Provider<Resources> resources, Provider<Markwon> markwon) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new IncomingWireTransferFormatter_Factory(resources, markwon);
        }

        @JvmStatic
        public final IncomingWireTransferFormatter newInstance(Resources resources, Markwon markwon) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            return new IncomingWireTransferFormatter(resources, markwon);
        }
    }
}

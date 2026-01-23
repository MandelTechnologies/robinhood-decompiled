package com.robinhood.shared.recurring.history;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentScheduleWithAccountTypeFormatter_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "investmentScheduleFormatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InvestmentScheduleWithAccountTypeFormatter_Factory implements Factory<InvestmentScheduleWithAccountTypeFormatter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InvestmentScheduleFormatter> investmentScheduleFormatter;
    private final Provider<Resources> resources;

    @JvmStatic
    public static final InvestmentScheduleWithAccountTypeFormatter_Factory create(Provider<Resources> provider, Provider<InvestmentScheduleFormatter> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final InvestmentScheduleWithAccountTypeFormatter newInstance(Resources resources, InvestmentScheduleFormatter investmentScheduleFormatter) {
        return INSTANCE.newInstance(resources, investmentScheduleFormatter);
    }

    public InvestmentScheduleWithAccountTypeFormatter_Factory(Provider<Resources> resources, Provider<InvestmentScheduleFormatter> investmentScheduleFormatter) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(investmentScheduleFormatter, "investmentScheduleFormatter");
        this.resources = resources;
        this.investmentScheduleFormatter = investmentScheduleFormatter;
    }

    @Override // javax.inject.Provider
    public InvestmentScheduleWithAccountTypeFormatter get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        InvestmentScheduleFormatter investmentScheduleFormatter = this.investmentScheduleFormatter.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleFormatter, "get(...)");
        return companion.newInstance(resources, investmentScheduleFormatter);
    }

    /* compiled from: InvestmentScheduleWithAccountTypeFormatter_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter_Factory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "investmentScheduleFormatter", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleFormatter;", "newInstance", "Lcom/robinhood/shared/recurring/history/InvestmentScheduleWithAccountTypeFormatter;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentScheduleWithAccountTypeFormatter_Factory create(Provider<Resources> resources, Provider<InvestmentScheduleFormatter> investmentScheduleFormatter) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(investmentScheduleFormatter, "investmentScheduleFormatter");
            return new InvestmentScheduleWithAccountTypeFormatter_Factory(resources, investmentScheduleFormatter);
        }

        @JvmStatic
        public final InvestmentScheduleWithAccountTypeFormatter newInstance(Resources resources, InvestmentScheduleFormatter investmentScheduleFormatter) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(investmentScheduleFormatter, "investmentScheduleFormatter");
            return new InvestmentScheduleWithAccountTypeFormatter(resources, investmentScheduleFormatter);
        }
    }
}

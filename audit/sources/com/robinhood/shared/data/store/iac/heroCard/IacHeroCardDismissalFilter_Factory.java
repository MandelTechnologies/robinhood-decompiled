package com.robinhood.shared.data.store.iac.heroCard;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringToLongMapPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: IacHeroCardDismissalFilter_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "iacHeroCardLastDismissMillisPref", "iacHeroCardDismissCountPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "Ljavax/inject/Provider;", "Companion", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IacHeroCardDismissalFilter_Factory implements Factory<IacHeroCardDismissalFilter> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<StringToLongMapPreference> iacHeroCardDismissCountPref;
    private final Provider<StringToLongMapPreference> iacHeroCardLastDismissMillisPref;

    @JvmStatic
    public static final IacHeroCardDismissalFilter_Factory create(Provider<Clock> provider, Provider<StringToLongMapPreference> provider2, Provider<StringToLongMapPreference> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final IacHeroCardDismissalFilter newInstance(Clock clock, StringToLongMapPreference stringToLongMapPreference, StringToLongMapPreference stringToLongMapPreference2) {
        return INSTANCE.newInstance(clock, stringToLongMapPreference, stringToLongMapPreference2);
    }

    public IacHeroCardDismissalFilter_Factory(Provider<Clock> clock, Provider<StringToLongMapPreference> iacHeroCardLastDismissMillisPref, Provider<StringToLongMapPreference> iacHeroCardDismissCountPref) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(iacHeroCardLastDismissMillisPref, "iacHeroCardLastDismissMillisPref");
        Intrinsics.checkNotNullParameter(iacHeroCardDismissCountPref, "iacHeroCardDismissCountPref");
        this.clock = clock;
        this.iacHeroCardLastDismissMillisPref = iacHeroCardLastDismissMillisPref;
        this.iacHeroCardDismissCountPref = iacHeroCardDismissCountPref;
    }

    @Override // javax.inject.Provider
    public IacHeroCardDismissalFilter get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StringToLongMapPreference stringToLongMapPreference = this.iacHeroCardLastDismissMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference2 = this.iacHeroCardDismissCountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference2, "get(...)");
        return companion.newInstance(clock, stringToLongMapPreference, stringToLongMapPreference2);
    }

    /* compiled from: IacHeroCardDismissalFilter_Factory.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringToLongMapPreference;", "iacHeroCardLastDismissMillisPref", "iacHeroCardDismissCountPref", "Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter_Factory;", "Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "newInstance", "(Lj$/time/Clock;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/StringToLongMapPreference;)Lcom/robinhood/shared/data/store/iac/heroCard/IacHeroCardDismissalFilter;", "lib-store-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IacHeroCardDismissalFilter_Factory create(Provider<Clock> clock, Provider<StringToLongMapPreference> iacHeroCardLastDismissMillisPref, Provider<StringToLongMapPreference> iacHeroCardDismissCountPref) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(iacHeroCardLastDismissMillisPref, "iacHeroCardLastDismissMillisPref");
            Intrinsics.checkNotNullParameter(iacHeroCardDismissCountPref, "iacHeroCardDismissCountPref");
            return new IacHeroCardDismissalFilter_Factory(clock, iacHeroCardLastDismissMillisPref, iacHeroCardDismissCountPref);
        }

        @JvmStatic
        public final IacHeroCardDismissalFilter newInstance(Clock clock, StringToLongMapPreference iacHeroCardLastDismissMillisPref, StringToLongMapPreference iacHeroCardDismissCountPref) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(iacHeroCardLastDismissMillisPref, "iacHeroCardLastDismissMillisPref");
            Intrinsics.checkNotNullParameter(iacHeroCardDismissCountPref, "iacHeroCardDismissCountPref");
            return new IacHeroCardDismissalFilter(clock, iacHeroCardLastDismissMillisPref, iacHeroCardDismissCountPref);
        }
    }
}

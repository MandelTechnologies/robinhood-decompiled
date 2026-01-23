package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.OptionOrderEducationShowMarketPref;
import com.robinhood.librobinhood.data.prefs.OptionOrderEducationShowStopMarketPref;
import com.robinhood.librobinhood.data.prefs.OptionOrderMarketGreenDotPref;
import com.robinhood.librobinhood.data.prefs.OptionOrderMarketNewTagPref;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionOrderDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/prefs/StringPreference;", "optionOrderMarketGreenDotPref", "optionOrderMarketNewTagPref", "Lcom/robinhood/prefs/BooleanPreference;", "showOptionMarketEducationPref", "showStopMarketEducationPref", "<init>", "(Lcom/robinhood/store/StoreBundle;Lj$/time/Clock;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;)V", "Lcom/robinhood/models/db/OptionOrderEducationType;", "type", "", "recordOptionOrderEducationNeverShowAgain", "(Lcom/robinhood/models/db/OptionOrderEducationType;)V", "", "shouldShowOptionOrderEducation", "(Lcom/robinhood/models/db/OptionOrderEducationType;)Z", "recordOptionOrderMarketGreenDotSeen", "()V", "recordOptionOrderMarketNewTagSeen", "shouldShowOptionOrderMarketGreenDot", "()Z", "shouldShowOptionOrderMarketNewTag", "Lj$/time/Clock;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionOrderDiscoveryStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int NUM_DAYS_TO_SHOW = 30;
    private final Clock clock;
    private final StringPreference optionOrderMarketGreenDotPref;
    private final StringPreference optionOrderMarketNewTagPref;
    private final BooleanPreference showOptionMarketEducationPref;
    private final BooleanPreference showStopMarketEducationPref;

    /* compiled from: OptionOrderDiscoveryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderEducationType.values().length];
            try {
                iArr[OptionOrderEducationType.STOP_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderEducationType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDiscoveryStore(StoreBundle storeBundle, Clock clock, @OptionOrderMarketGreenDotPref StringPreference optionOrderMarketGreenDotPref, @OptionOrderMarketNewTagPref StringPreference optionOrderMarketNewTagPref, @OptionOrderEducationShowMarketPref BooleanPreference showOptionMarketEducationPref, @OptionOrderEducationShowStopMarketPref BooleanPreference showStopMarketEducationPref) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(optionOrderMarketGreenDotPref, "optionOrderMarketGreenDotPref");
        Intrinsics.checkNotNullParameter(optionOrderMarketNewTagPref, "optionOrderMarketNewTagPref");
        Intrinsics.checkNotNullParameter(showOptionMarketEducationPref, "showOptionMarketEducationPref");
        Intrinsics.checkNotNullParameter(showStopMarketEducationPref, "showStopMarketEducationPref");
        this.clock = clock;
        this.optionOrderMarketGreenDotPref = optionOrderMarketGreenDotPref;
        this.optionOrderMarketNewTagPref = optionOrderMarketNewTagPref;
        this.showOptionMarketEducationPref = showOptionMarketEducationPref;
        this.showStopMarketEducationPref = showStopMarketEducationPref;
    }

    public final void recordOptionOrderEducationNeverShowAgain(OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            this.showStopMarketEducationPref.set(false);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.showOptionMarketEducationPref.set(false);
        }
    }

    public final boolean shouldShowOptionOrderEducation(OptionOrderEducationType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return this.showStopMarketEducationPref.get();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.showOptionMarketEducationPref.get();
    }

    public final void recordOptionOrderMarketGreenDotSeen() {
        String str = this.optionOrderMarketGreenDotPref.get();
        if ((str != null ? INSTANCE.toInstant(str) : null) == null) {
            this.optionOrderMarketGreenDotPref.set(this.clock.instant().toString());
        }
    }

    public final void recordOptionOrderMarketNewTagSeen() {
        String str = this.optionOrderMarketNewTagPref.get();
        if ((str != null ? INSTANCE.toInstant(str) : null) == null) {
            this.optionOrderMarketNewTagPref.set(this.clock.instant().toString());
        }
    }

    public final boolean shouldShowOptionOrderMarketGreenDot() {
        Instant instant;
        String str = this.optionOrderMarketNewTagPref.get();
        if ((str != null ? INSTANCE.toInstant(str) : null) != null) {
            return false;
        }
        String str2 = this.optionOrderMarketGreenDotPref.get();
        if (str2 == null || (instant = INSTANCE.toInstant(str2)) == null) {
            return true;
        }
        Instant instant2 = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
        return instant.until(instant2, ChronoUnit.DAYS) <= 30;
    }

    public final boolean shouldShowOptionOrderMarketNewTag() {
        Instant instant;
        String str = this.optionOrderMarketNewTagPref.get();
        if (str == null || (instant = INSTANCE.toInstant(str)) == null) {
            return true;
        }
        Instant instant2 = this.clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
        return instant.until(instant2, ChronoUnit.DAYS) <= 30;
    }

    /* compiled from: OptionOrderDiscoveryStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0081T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore$Companion;", "", "<init>", "()V", "", "j$/time/Instant", "toInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "", "NUM_DAYS_TO_SHOW", "I", "getNUM_DAYS_TO_SHOW$lib_store_options_externalDebug$annotations", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNUM_DAYS_TO_SHOW$lib_store_options_externalDebug$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Instant toInstant(String str) {
            try {
                return Instant.parse(str);
            } catch (DateTimeParseException unused) {
                return null;
            }
        }
    }
}

package com.robinhood.android.common.recurring.upsell;

import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: RecurringOrderUpsellManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager;", "", "timestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "viewCountPref", "Lcom/robinhood/prefs/IntPreference;", "timeWindowDays", "", "hasSeenTimeWindowDays", "<init>", "(Lcom/robinhood/prefs/LongSetPreference;Lcom/robinhood/prefs/IntPreference;II)V", "upsellViewCount", "getUpsellViewCount$feature_lib_recurring_externalDebug", "()I", "hasSeenWithinWindow", "", "getHasSeenWithinWindow$feature_lib_recurring_externalDebug", "()Z", "markUpsellViewCount", "", "updateTimestamps", "RecurringUpsell", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RecurringOrderUpsellManager {
    private static final int RECURRING_ORDER_UPSELL_HAS_SEEN_TIME_WINDOW_DAYS = 3;
    private static final int RECURRING_ORDER_UPSELL_TIME_WINDOW_DAYS = 7;
    private final int hasSeenTimeWindowDays;
    private final int timeWindowDays;
    private final LongSetPreference timestampsPref;
    private final IntPreference viewCountPref;
    public static final int $stable = 8;

    public RecurringOrderUpsellManager(LongSetPreference timestampsPref, IntPreference viewCountPref, int i, int i2) {
        Intrinsics.checkNotNullParameter(timestampsPref, "timestampsPref");
        Intrinsics.checkNotNullParameter(viewCountPref, "viewCountPref");
        this.timestampsPref = timestampsPref;
        this.viewCountPref = viewCountPref;
        this.timeWindowDays = i;
        this.hasSeenTimeWindowDays = i2;
    }

    public /* synthetic */ RecurringOrderUpsellManager(LongSetPreference longSetPreference, IntPreference intPreference, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(longSetPreference, intPreference, (i3 & 4) != 0 ? 7 : i, (i3 & 8) != 0 ? 3 : i2);
    }

    public final int getUpsellViewCount$feature_lib_recurring_externalDebug() {
        return this.viewCountPref.get();
    }

    public final boolean getHasSeenWithinWindow$feature_lib_recurring_externalDebug() {
        updateTimestamps();
        Instant instantNow = Instant.now();
        Set<Long> values = this.timestampsPref.getValues();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(((Number) it.next()).longValue());
            Intrinsics.checkNotNull(instantOfEpochMilli);
            Instant instantPlus = instantOfEpochMilli.plus((TemporalAmount) Days.m3991of(this.hasSeenTimeWindowDays));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            if (instantPlus.isAfter(instantNow)) {
                return true;
            }
        }
        return false;
    }

    public final void markUpsellViewCount() {
        LongSetPreference longSetPreference = this.timestampsPref;
        longSetPreference.setValues(SetsKt.plus(longSetPreference.getValues(), Long.valueOf(System.currentTimeMillis())));
        IntPreference intPreference = this.viewCountPref;
        intPreference.set(intPreference.get() + 1);
    }

    private final void updateTimestamps() {
        Instant instantNow = Instant.now();
        Set<Long> values = this.timestampsPref.getValues();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(((Number) obj).longValue());
            Intrinsics.checkNotNull(instantOfEpochMilli);
            Instant instantPlus = instantOfEpochMilli.plus((TemporalAmount) Days.m3991of(this.timeWindowDays));
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
            if (instantPlus.isAfter(instantNow)) {
                arrayList.add(obj);
            }
        }
        this.timestampsPref.setValues(CollectionsKt.toSet(arrayList));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringOrderUpsellManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PASSIVE", "AGGRESSIVE", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringUpsell {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecurringUpsell[] $VALUES;
        public static final RecurringUpsell NONE = new RecurringUpsell("NONE", 0);
        public static final RecurringUpsell PASSIVE = new RecurringUpsell("PASSIVE", 1);
        public static final RecurringUpsell AGGRESSIVE = new RecurringUpsell("AGGRESSIVE", 2);

        private static final /* synthetic */ RecurringUpsell[] $values() {
            return new RecurringUpsell[]{NONE, PASSIVE, AGGRESSIVE};
        }

        public static EnumEntries<RecurringUpsell> getEntries() {
            return $ENTRIES;
        }

        private RecurringUpsell(String str, int i) {
        }

        static {
            RecurringUpsell[] recurringUpsellArr$values = $values();
            $VALUES = recurringUpsellArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recurringUpsellArr$values);
        }

        public static RecurringUpsell valueOf(String str) {
            return (RecurringUpsell) Enum.valueOf(RecurringUpsell.class, str);
        }

        public static RecurringUpsell[] values() {
            return (RecurringUpsell[]) $VALUES.clone();
        }
    }
}

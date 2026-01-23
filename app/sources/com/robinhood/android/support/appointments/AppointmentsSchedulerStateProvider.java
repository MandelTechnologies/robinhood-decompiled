package com.robinhood.android.support.appointments;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.support.appointments.AppointmentsSchedulerViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.appointments.AppointmentSlot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.DayOfWeek;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AppointmentsSchedulerStateProvider.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0018\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/support/appointments/AppointmentsSchedulerStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;", "Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/support/appointments/SubScreen;", "screen", "", "hasDisplayPickedAppointment", "", "notes", "decideCanContinue", "(Lcom/robinhood/android/support/appointments/SubScreen;ZLjava/lang/String;)Z", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/support/appointments/AppointmentWeek;", "", "pickedAppointmentWeekIndex", "pickedDayOfWeekIndex", "pickedTimeOfDay", "j$/time/ZoneId", "zoneId", "getPickedDatetimeDisplayText", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lj$/time/ZoneId;)Ljava/lang/String;", "Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "getSelectedAppointment", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/models/ui/appointments/AppointmentSlot;", "hasEnoughContext", "(Ljava/lang/String;)Z", "", "toUiAppointmentSlots", "(Ljava/util/List;Lj$/time/ZoneId;)Lkotlinx/collections/immutable/ImmutableList;", "", "toProgress", "(Lcom/robinhood/android/support/appointments/SubScreen;)F", "dataState", "reduce", "(Lcom/robinhood/android/support/appointments/AppointmentsSchedulerDataState;)Lcom/robinhood/android/support/appointments/AppointmentsSchedulerViewState;", "Lj$/time/Clock;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AppointmentsSchedulerStateProvider implements StateProvider<AppointmentsSchedulerDataState, AppointmentsSchedulerViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    /* compiled from: AppointmentsSchedulerStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppointmentsSchedulerViewState6.values().length];
            try {
                iArr[AppointmentsSchedulerViewState6.DatetimePicker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppointmentsSchedulerViewState6.NotesWriter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppointmentsSchedulerViewState6.Review.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppointmentsSchedulerStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AppointmentsSchedulerViewState reduce(AppointmentsSchedulerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isLoading()) {
            return new AppointmentsSchedulerViewState(AppointmentsSchedulerViewState.LoadingState.Loading.INSTANCE, null, null, null, null, null, null, false, false, dataState.getUseCloseNavButton(), 0.0f, null, null, null, null, null, 63742, null);
        }
        AppointmentsSchedulerViewState6 currentScreen = dataState.getCurrentScreen();
        ImmutableList<AppointmentWeek> uiAppointmentSlots = toUiAppointmentSlots(dataState.getTimeSlots(), dataState.getUserZoneId());
        String pickedDatetimeDisplayText = getPickedDatetimeDisplayText(uiAppointmentSlots, dataState.getSelectedWeekIndex(), dataState.getSelectedDayOfWeekIndex(), dataState.getSelectedTimeOfDayIndex(), dataState.getUserZoneId());
        boolean z = pickedDatetimeDisplayText != null;
        String campaignId = dataState.getCampaignId();
        String agentName = dataState.getAgentName();
        String userNumber = dataState.getUserNumber();
        String userEmail = dataState.getUserEmail();
        Integer selectedWeekIndex = dataState.getSelectedWeekIndex();
        Integer selectedDayOfWeekIndex = dataState.getSelectedDayOfWeekIndex();
        Integer selectedTimeOfDayIndex = dataState.getSelectedTimeOfDayIndex();
        AppointmentSlot selectedAppointment = getSelectedAppointment(uiAppointmentSlots, dataState.getSelectedWeekIndex(), dataState.getSelectedDayOfWeekIndex(), dataState.getSelectedTimeOfDayIndex());
        String notes = dataState.getNotes();
        return new AppointmentsSchedulerViewState(new AppointmentsSchedulerViewState.LoadingState.Loaded(currentScreen), uiAppointmentSlots, pickedDatetimeDisplayText, selectedWeekIndex, selectedDayOfWeekIndex, selectedTimeOfDayIndex, selectedAppointment, currentScreen == AppointmentsSchedulerViewState6.Review && dataState.isCreatingAppointment(), decideCanContinue(dataState.getCurrentScreen(), z, dataState.getNotes()), dataState.getUseCloseNavButton(), toProgress(currentScreen), campaignId, notes, agentName, userNumber, userEmail);
    }

    private final boolean decideCanContinue(AppointmentsSchedulerViewState6 screen, boolean hasDisplayPickedAppointment, String notes) {
        int i = WhenMappings.$EnumSwitchMapping$0[screen.ordinal()];
        if (i == 1) {
            return hasDisplayPickedAppointment;
        }
        if (i == 2) {
            return notes != null && hasEnoughContext(notes);
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    static /* synthetic */ String getPickedDatetimeDisplayText$default(AppointmentsSchedulerStateProvider appointmentsSchedulerStateProvider, ImmutableList immutableList, Integer num, Integer num2, Integer num3, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return appointmentsSchedulerStateProvider.getPickedDatetimeDisplayText(immutableList, num, num2, num3, zoneId);
    }

    private final String getPickedDatetimeDisplayText(ImmutableList<AppointmentWeek> immutableList, Integer num, Integer num2, Integer num3, ZoneId zoneId) {
        if (num == null || num2 == null || num3 == null) {
            return null;
        }
        try {
            AppointmentTimeOfDay appointmentTimeOfDay = immutableList.get(num.intValue()).getDaysOfWeek().get(num2.intValue()).getTimeSlots().get(num3.intValue());
            Instant startTime = appointmentTimeOfDay.getSourceAppointment().getStartTime();
            Instant endTime = appointmentTimeOfDay.getSourceAppointment().getEndTime();
            ZonedDateTime zonedDateTimeAtZone = startTime.atZone(zoneId);
            ZonedDateTime zonedDateTimeAtZone2 = endTime.atZone(zoneId);
            Locale locale = Locale.ENGLISH;
            String str = zonedDateTimeAtZone.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", locale));
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("h:mm a", locale);
            DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("zz", locale);
            String str2 = zonedDateTimeAtZone.format(dateTimeFormatterOfPattern);
            String str3 = zonedDateTimeAtZone2.format(dateTimeFormatterOfPattern);
            String string2 = zonedDateTimeAtZone.format(dateTimeFormatterOfPattern2);
            if (string2.length() > 2) {
                Intrinsics.checkNotNull(string2);
                char cFirst = StringsKt.first(string2);
                char cLast = StringsKt.last(string2);
                StringBuilder sb = new StringBuilder();
                sb.append(cFirst);
                sb.append(cLast);
                string2 = sb.toString();
            }
            return str + "\n" + (str2 + "-" + str3 + PlaceholderUtils.XXShortPlaceholderText + string2);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ AppointmentSlot getSelectedAppointment$default(AppointmentsSchedulerStateProvider appointmentsSchedulerStateProvider, ImmutableList immutableList, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return appointmentsSchedulerStateProvider.getSelectedAppointment(immutableList, num, num2, num3);
    }

    private final AppointmentSlot getSelectedAppointment(ImmutableList<AppointmentWeek> immutableList, Integer num, Integer num2, Integer num3) {
        if (num == null || num2 == null || num3 == null) {
            return null;
        }
        try {
            return immutableList.get(num.intValue()).getDaysOfWeek().get(num2.intValue()).getTimeSlots().get(num3.intValue()).getSourceAppointment();
        } catch (Throwable unused) {
            return null;
        }
    }

    private final ImmutableList<AppointmentWeek> toUiAppointmentSlots(List<AppointmentSlot> list, ZoneId zoneId) {
        int i;
        boolean z = true;
        LocalDate localDateMinusDays = Instant.now(this.clock).atZone(zoneId).mo3459a().minusDays(r2.getDayOfWeek().getValue() - 1);
        List listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerStateProvider$toUiAppointmentSlots$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AppointmentSlot) t).getStartTime(), ((AppointmentSlot) t2).getStartTime());
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listSortedWith.iterator();
        boolean z2 = true;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LocalDate localDateMinusDays2 = ((AppointmentSlot) next).getStartTime().atZone(zoneId).mo3459a().minusDays(r9.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue());
            if (Intrinsics.areEqual(localDateMinusDays2, localDateMinusDays)) {
                z2 = false;
            }
            Object arrayList = linkedHashMap.get(localDateMinusDays2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(localDateMinusDays2, arrayList);
            }
            ((List) arrayList).add(next);
        }
        Set<Map.Entry> setEntrySet = MapsKt.toMutableMap(linkedHashMap).entrySet();
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : list2) {
                LocalDate localDateMo3459a = ((AppointmentSlot) obj).getStartTime().atZone(zoneId).mo3459a();
                Object arrayList3 = linkedHashMap2.get(localDateMo3459a);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(localDateMo3459a, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(i, 4);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, i2));
            Iterator<Integer> it2 = primitiveRanges2.iterator();
            while (it2.hasNext()) {
                LocalDate localDatePlusDays = localDate.plusDays(((PrimitiveIterators6) it2).nextInt());
                List listEmptyList = (List) linkedHashMap2.get(localDatePlusDays);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<AppointmentSlot> list3 = listEmptyList;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, i2));
                for (AppointmentSlot appointmentSlot : list3) {
                    String str = appointmentSlot.getStartTime().atZone(zoneId).format(DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    arrayList5.add(new AppointmentTimeOfDay(true, str, appointmentSlot));
                    z = true;
                }
                boolean z3 = z;
                List listSortedWith2 = CollectionsKt.sortedWith(arrayList5, new Comparator() { // from class: com.robinhood.android.support.appointments.AppointmentsSchedulerStateProvider$toUiAppointmentSlots$lambda$8$lambda$7$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((AppointmentTimeOfDay) t).getSourceAppointment().getStartTime(), ((AppointmentTimeOfDay) t2).getSourceAppointment().getStartTime());
                    }
                });
                arrayList4.add(new AppointmentDayOfWeek(listSortedWith2.isEmpty() ^ z3, localDatePlusDays.getMonthValue(), localDatePlusDays.getDayOfMonth(), extensions2.toPersistentList(listSortedWith2)));
                z = z3;
                i2 = 10;
            }
            arrayList2.add(new AppointmentWeek(extensions2.toPersistentList(arrayList4)));
            z = z;
            i2 = 10;
            i = 0;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        if (z2) {
            PrimitiveRanges2 primitiveRanges22 = new PrimitiveRanges2(0, 4);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges22, 10));
            Iterator<Integer> it3 = primitiveRanges22.iterator();
            while (it3.hasNext()) {
                LocalDate localDatePlusDays2 = localDateMinusDays.plusDays(((PrimitiveIterators6) it3).nextInt());
                arrayList6.add(new AppointmentDayOfWeek(false, localDatePlusDays2.getMonthValue(), localDatePlusDays2.getDayOfMonth(), extensions2.persistentListOf()));
            }
            mutableList.add(0, new AppointmentWeek(extensions2.toPersistentList(arrayList6)));
        }
        return extensions2.toPersistentList(mutableList);
    }

    private final float toProgress(AppointmentsSchedulerViewState6 appointmentsSchedulerViewState6) {
        int i = WhenMappings.$EnumSwitchMapping$0[appointmentsSchedulerViewState6.ordinal()];
        if (i == 1) {
            return 0.25f;
        }
        if (i == 2) {
            return 0.5f;
        }
        if (i == 3) {
            return 0.75f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean hasEnoughContext(String str) throws IOException {
        int length;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!CharsKt.isWhitespace(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            length = string2 != null ? string2.length() : 0;
        }
        return length >= 1;
    }
}

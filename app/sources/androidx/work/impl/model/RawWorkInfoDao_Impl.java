package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p015db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase __db) {
        this.__db = __db;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(final SupportSQLiteQuery query) {
        Data dataFromByteArray;
        boolean z;
        boolean z2;
        boolean z3;
        Set<Constraints.ContentUriTrigger> setByteArrayToSetOfTriggers;
        int i;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, query, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
            int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
            int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
            int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
            int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i2 = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i3 = columnIndex12;
                String string2 = cursorQuery.getString(columnIndex);
                if (map.get(string2) == null) {
                    i = columnIndex11;
                    map.put(string2, new ArrayList<>());
                } else {
                    i = columnIndex11;
                }
                String string3 = cursorQuery.getString(columnIndex);
                if (map2.get(string3) == null) {
                    map2.put(string3, new ArrayList<>());
                }
                columnIndex12 = i3;
                columnIndex11 = i;
            }
            int i4 = columnIndex11;
            int i5 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string4 = (columnIndex == -1 || cursorQuery.isNull(columnIndex)) ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                if (columnIndex3 == -1) {
                    dataFromByteArray = null;
                } else {
                    dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndex3) ? null : cursorQuery.getBlob(columnIndex3));
                }
                long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                boolean z4 = false;
                int i6 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j5 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i7 = i4;
                int i8 = i7 == -1 ? 0 : cursorQuery.getInt(i7);
                i4 = i7;
                int i9 = i5;
                int i10 = i9 == -1 ? 0 : cursorQuery.getInt(i9);
                i5 = i9;
                int i11 = i2;
                long j6 = i11 == -1 ? 0L : cursorQuery.getLong(i11);
                i2 = i11;
                int i12 = columnIndex14;
                int i13 = i12 == -1 ? 0 : cursorQuery.getInt(i12);
                columnIndex14 = i12;
                int i14 = columnIndex15;
                NetworkType networkTypeIntToNetworkType = i14 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i14));
                columnIndex15 = i14;
                int i15 = columnIndex16;
                if (i15 == -1) {
                    z = false;
                } else {
                    z = cursorQuery.getInt(i15) != 0;
                }
                columnIndex16 = i15;
                int i16 = columnIndex17;
                if (i16 == -1) {
                    z2 = false;
                } else {
                    z2 = cursorQuery.getInt(i16) != 0;
                }
                columnIndex17 = i16;
                int i17 = columnIndex18;
                if (i17 == -1) {
                    z3 = false;
                } else {
                    z3 = cursorQuery.getInt(i17) != 0;
                }
                columnIndex18 = i17;
                int i18 = columnIndex19;
                if (i18 != -1 && cursorQuery.getInt(i18) != 0) {
                    z4 = true;
                }
                columnIndex19 = i18;
                int i19 = columnIndex20;
                boolean z5 = z4;
                long j7 = i19 == -1 ? 0L : cursorQuery.getLong(i19);
                columnIndex20 = i19;
                int i20 = columnIndex21;
                long j8 = i20 != -1 ? cursorQuery.getLong(i20) : 0L;
                columnIndex21 = i20;
                int i21 = columnIndex22;
                long j9 = j8;
                if (i21 == -1) {
                    setByteArrayToSetOfTriggers = null;
                } else {
                    setByteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i21) ? null : cursorQuery.getBlob(i21));
                }
                Constraints constraints = new Constraints(networkTypeIntToNetworkType, z, z2, z3, z5, j7, j9, setByteArrayToSetOfTriggers);
                ArrayList<String> arrayList2 = map.get(cursorQuery.getString(columnIndex));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<Data> arrayList3 = map2.get(cursorQuery.getString(columnIndex));
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string4, stateIntToState, dataFromByteArray, j, j2, j3, constraints, i6, backoffPolicyIntToBackoffPolicy, j4, j5, i8, i10, j6, i13, arrayList2, arrayList3));
                columnIndex22 = i21;
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    private void __fetchRelationshipWorkTagAsjavaLangString(final HashMap<String, ArrayList<String>> _map) {
        int i;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<String>> map = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(map);
                map = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(map);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<String> arrayList = _map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    private void __fetchRelationshipWorkProgressAsandroidxWorkData(final HashMap<String, ArrayList<Data>> _map) {
        int i;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<Data>> map = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(map);
                map = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(map);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<Data> arrayList = _map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.isNull(0) ? null : cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }
}

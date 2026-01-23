package com.robinhood.utils.room.dao;

import kotlin.Metadata;

/* compiled from: BaseDaos.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H'¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/utils/room/dao/MultiInsertDao;", "T", "", "insert", "", "items", "", "lib-utils-room_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.room.dao.MultiInsertDao, reason: use source file name */
/* loaded from: classes21.dex */
public interface BaseDaos2<T> {
    void insert(Iterable<? extends T> items);
}

package com.robinhood.android.common.history.p082ui.format;

import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: HistoryFormatterKey.kt */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/format/HistoryFormatterKey;", "", "value", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "()Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "lib-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
/* loaded from: classes2.dex */
public @interface HistoryFormatterKey {
    HistoryTransactionType value();
}

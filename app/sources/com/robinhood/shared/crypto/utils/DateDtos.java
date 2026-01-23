package com.robinhood.shared.crypto.utils;

import com.robinhood.rosetta.common.DateDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: DateDtos.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/rosetta/common/DateDto;", "j$/time/LocalDate", "getLocalDate", "(Lcom/robinhood/rosetta/common/DateDto;)Lj$/time/LocalDate;", "localDate", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.DateDtosKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DateDtos {
    public static final LocalDate getLocalDate(DateDto dateDto) {
        Intrinsics.checkNotNullParameter(dateDto, "<this>");
        LocalDate localDateM3377of = LocalDate.m3377of(dateDto.getYear(), dateDto.getMonth(), dateDto.getDay());
        Intrinsics.checkNotNullExpressionValue(localDateM3377of, "of(...)");
        return localDateM3377of;
    }
}

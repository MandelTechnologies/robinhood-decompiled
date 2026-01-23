package com.robinhood.redesign.provisions.converters;

import com.robinhood.android.redesign.model.HighlightImpression2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImpressionTypeConverter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/redesign/provisions/converters/ImpressionTypeConverter;", "", "<init>", "()V", "toImpressionType", "Lcom/robinhood/android/redesign/model/ImpressionType;", "value", "", "fromImpressionType", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ImpressionTypeConverter {
    public static final ImpressionTypeConverter INSTANCE = new ImpressionTypeConverter();

    private ImpressionTypeConverter() {
    }

    public final HighlightImpression2 toImpressionType(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return HighlightImpression2.valueOf(value);
    }

    public final String fromImpressionType(HighlightImpression2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.name();
    }
}

package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerialFormat3;
import okhttp3.MediaType;
import retrofit2.Converter;

/* compiled from: Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/serialization/StringFormat;", "Lokhttp3/MediaType;", "contentType", "Lretrofit2/Converter$Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lkotlinx/serialization/StringFormat;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;", "asConverterFactory", "retrofit2-kotlinx-serialization-converter"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* renamed from: com.jakewharton.retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory, reason: use source file name */
/* loaded from: classes27.dex */
public final class Factory2 {
    @JvmName
    public static final Converter.Factory create(SerialFormat3 serialFormat3, MediaType contentType) {
        Intrinsics.checkNotNullParameter(serialFormat3, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new Factory(contentType, new Serializer.FromString(serialFormat3));
    }
}

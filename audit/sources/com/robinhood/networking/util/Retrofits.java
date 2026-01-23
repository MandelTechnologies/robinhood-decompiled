package com.robinhood.networking.util;

import dagger.Lazy;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: Retrofits.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a\u0018\u0010\t\u001a\u00020\u0004*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a\u0018\u0010\r\u001a\u00020\u0004*\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m3636d2 = {"Retrofit", "Lretrofit2/Retrofit;", "buildBlock", "Lkotlin/Function1;", "Lretrofit2/Retrofit$Builder;", "", "Lkotlin/ExtensionFunctionType;", "buildWith", "block", "addConverterFactories", "converterFactories", "", "Lretrofit2/Converter$Factory;", "client", "lazyClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "lib-networking_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.networking.util.RetrofitsKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class Retrofits {
    public static final Retrofit Retrofit(Function1<? super Retrofit.Builder, Unit> buildBlock) {
        Intrinsics.checkNotNullParameter(buildBlock, "buildBlock");
        Retrofit.Builder builder = new Retrofit.Builder();
        buildBlock.invoke(builder);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public static final Retrofit buildWith(Retrofit retrofit, Function1<? super Retrofit.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(retrofit, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        block.invoke(builderNewBuilder);
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public static final Retrofit buildWith(Retrofit.Builder builder, Function1<? super Retrofit.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(builder);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public static final Retrofit.Builder client(Retrofit.Builder builder, Lazy<OkHttpClient> lazyClient) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(lazyClient, "lazyClient");
        Retrofit.Builder builderCallFactory = builder.callFactory(OkHttpClients.asCallFactory(lazyClient));
        Intrinsics.checkNotNullExpressionValue(builderCallFactory, "callFactory(...)");
        return builderCallFactory;
    }

    public static final Retrofit.Builder addConverterFactories(Retrofit.Builder builder, Iterable<? extends Converter.Factory> converterFactories) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Iterator<? extends Converter.Factory> it = converterFactories.iterator();
        while (it.hasNext()) {
            builder.addConverterFactory(it.next());
        }
        return builder;
    }
}

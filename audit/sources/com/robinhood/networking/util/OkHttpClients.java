package com.robinhood.networking.util;

import dagger.Lazy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: OkHttpClients.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a\u0018\u0010\t\u001a\u00020\u0004*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a\u0018\u0010\r\u001a\u00020\u0004*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a%\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u0007\u001a\u00020\u000f*\u00020\u00102\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a \u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u001a\u0010\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, m3636d2 = {"OkHttpClient", "Lokhttp3/OkHttpClient;", "buildBlock", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "buildWith", "block", "addInterceptors", "interceptors", "", "Lokhttp3/Interceptor;", "addNetworkInterceptors", "CertificatePinner", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner$Builder;", "add", "pattern", "", "pins", "", "asCallFactory", "Lokhttp3/Call$Factory;", "Ldagger/Lazy;", "lib-networking_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.networking.util.OkHttpClientsKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class OkHttpClients {
    public static final OkHttpClient OkHttpClient(Function1<? super OkHttpClient.Builder, Unit> buildBlock) {
        Intrinsics.checkNotNullParameter(buildBlock, "buildBlock");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        buildBlock.invoke(builder);
        return builder.build();
    }

    public static final OkHttpClient buildWith(OkHttpClient okHttpClient, Function1<? super OkHttpClient.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(okHttpClient, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        block.invoke(builderNewBuilder);
        return builderNewBuilder.build();
    }

    public static final OkHttpClient buildWith(OkHttpClient.Builder builder, Function1<? super OkHttpClient.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(builder);
        return builder.build();
    }

    public static final OkHttpClient.Builder addInterceptors(OkHttpClient.Builder builder, Iterable<? extends Interceptor> interceptors) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Iterator<? extends Interceptor> it = interceptors.iterator();
        while (it.hasNext()) {
            builder.addInterceptor(it.next());
        }
        return builder;
    }

    public static final CertificatePinner CertificatePinner(Function1<? super CertificatePinner.Builder, Unit> buildBlock) {
        Intrinsics.checkNotNullParameter(buildBlock, "buildBlock");
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        buildBlock.invoke(builder);
        return builder.build();
    }

    public static final CertificatePinner.Builder add(CertificatePinner.Builder builder, String pattern, Collection<String> pins) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pins, "pins");
        String[] strArr = (String[]) pins.toArray(new String[0]);
        return builder.add(pattern, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final CertificatePinner buildWith(CertificatePinner.Builder builder, Function1<? super CertificatePinner.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(builder);
        return builder.build();
    }

    public static final Call.Factory asCallFactory(final Lazy<OkHttpClient> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        return new Call.Factory() { // from class: com.robinhood.networking.util.OkHttpClientsKt.asCallFactory.1
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return lazy.get().newCall(it);
            }
        };
    }

    public static final OkHttpClient.Builder addNetworkInterceptors(OkHttpClient.Builder builder, Iterable<? extends Interceptor> interceptors) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Iterator<? extends Interceptor> it = interceptors.iterator();
        while (it.hasNext()) {
            builder.addNetworkInterceptor(it.next());
        }
        return builder;
    }
}
